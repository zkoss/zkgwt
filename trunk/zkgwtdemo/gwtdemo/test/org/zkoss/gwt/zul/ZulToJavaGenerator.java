package org.zkoss.gwt.zul;

import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.ResourceBundle;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class ZulToJavaGenerator {

	public static void main(String[] args) {

		//genWidgetClassImports();
		translateZul();
		
	}

	static ResourceBundle resource;
	
	//input like "box","window"
	public static String getWidgetClassName(String widget){
		if(resource == null){
			resource = ResourceBundle.getBundle("zkwidgets");	
		}
		
		return resource.getString(widget);
	}

	public static String genWidgetClassImports(){
		String imports = "";
		if(resource == null){
			resource = ResourceBundle.getBundle("zkwidgets");	
		}
		
		Enumeration<String> keys = resource.getKeys();
		for(;keys.hasMoreElements();){
			String key = keys.nextElement();
			System.out.println("import "+ resource.getString(key)+";");
			imports+="import "+ resource.getString(key)+";\n";
		}
		
		return imports;
	}
	
	//input like "box","window"
	public static Class getWidgetClass(String widget){
		if(resource == null){
			resource = ResourceBundle.getBundle("zkwidgets");	
		}
		
		String widgetClassname = resource.getString(widget);
		try {
			Class clazz = Class.forName(widgetClassname,false,Thread.currentThread().getContextClassLoader());
			return clazz;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
		
	}

	public static void translateZul(){
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		String zulFile = "c:/temp.zul";
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(zulFile);
			Element element = document.getDocumentElement();			
			translateRecursively(element,"1","win");
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	//print the element, and tell the children to print
	//breadth first
	public static void printRecursively(Element element){
		System.out.println("tag name = "+element.getTagName());
		NamedNodeMap attrs = element.getAttributes();
		for(int i = 0 ; i < attrs.getLength();i++){
			System.out.println("node name : "+attrs.item(i).getNodeName());
			System.out.println("node value : "+attrs.item(i).getNodeValue());				
		}			

		Node fc = element.getFirstChild();
		Node currentNode = fc;
		while(currentNode != null){
			if(currentNode.getNodeType() == Node.ELEMENT_NODE){
				Element currentElement =  (Element)currentNode;
				printRecursively(currentElement);
			}
			currentNode = currentNode.getNextSibling();
		}
	}
	
	//translate the element, and tell the children to translate
	//breadth first
	public static void translateRecursively(Element element, String treeIndex, String parentId){
		String tag = element.getTagName();
		
		if(tag.equals("zscript") || tag.equals("attribute"))
			return;
		
		String id = tag+"_"+treeIndex;
		Class clazz = getWidgetClass(tag);
		Method[] methods = clazz.getMethods();
		
		String classname = getClassShortName(clazz);
		System.out.println(classname +" "+ id + " = new "+ classname+"();");
		System.out.println(parentId+".add("+id+");");
		
		NamedNodeMap attrs = element.getAttributes();
		for(int i = 0 ; i < attrs.getLength();i++){
			String attr = attrs.item(i).getNodeName().toLowerCase();
			String value = attrs.item(i).getNodeValue();
			boolean found = false;
			for (int j = 0; j < methods.length; j++) {
				if (methods[j].getName().startsWith("set")
						&& methods[j].getName().equalsIgnoreCase("set"+attr)) {
					boolean isNumber = true;
					try{
						Integer.parseInt(value.trim());						
					}catch (NumberFormatException nfe){
						isNumber = false;
				    }

					if(!tag.equalsIgnoreCase("label") && 
							(value.equals("true")||value.equals("false")||isNumber)){
						System.out.println(id+"."+methods[j].getName()+"("+value+");");
					}else{
						System.out.println(id+"."+methods[j].getName()+"(\""+value+"\");");
					}
					found = true;
				}
			}
			if(!found){
				System.out.println("//"+classname+" has no api for set"+attr);
			}
		}			
		
		if(tag.equals("style")){			
			//TODO:but current style doesn't have setContent() 
			//System.out.println(id+".setContent(\""+element.getTextContent().replaceAll("\\s", "")+"\");");
			System.out.println("//style has no api for setContent() in gwt now");
			//should not further process childnodes of style
			return;
		}
		if(tag.equals("html")){			
			String content = element.getTextContent().replaceAll("\\s", "");
			//TODO: strip something like <![CDATA[
			content = content.replaceAll("\"", "\\\\\"");
			System.out.println(id+".setContent(\""+content+"\");");
			
			//should not further process child nodes of html 
			return;
		}
		if(tag.equals("label")){			
			String content = element.getTextContent().replaceAll("\\s", "");
			//TODO: strip something like <![CDATA[
			content = content.replaceAll("\"", "\\\\\"");
			if(content.length()>0)
				System.out.println(id+".setValue(\""+content+"\");");
			
			//should not further process child nodes of html 
			return;
		}

		
		int childIndex = 0;
		Node fc = element.getFirstChild();		
		Node currentNode = fc;
		while(currentNode != null){
			if(currentNode.getNodeType() == Node.ELEMENT_NODE){
				childIndex++;
				Element currentElement =  (Element)currentNode;
				translateRecursively(currentElement,treeIndex+childIndex,id);
			}else if(currentNode.getNodeType() == Node.TEXT_NODE){
				String label = currentNode.getTextContent().replaceAll("\\s", "");
				if(label.length()>0){
					childIndex++;
					String labelId = "label_"+treeIndex + childIndex;
					System.out.println("Label "+ labelId +"= new "+"Label();");
					System.out.println(id+".add("+labelId+");");	
					label = label.replaceAll("\"", "\\\\\"");
					System.out.println(labelId+".setValue(\""+label+"\");");
				}
			}
			
			currentNode = currentNode.getNextSibling();
		}
	}	
	
	public static String getClassShortName(Class clazz){
		String fullname = clazz.getName();
		int idx = fullname.lastIndexOf(".");
		return fullname.substring(idx+1);		
	}
}
