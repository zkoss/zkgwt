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

		genWidgetClassImports();
		//translateZul();
		
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
		String id = tag+treeIndex;
		Class clazz = getWidgetClass(tag);
		Method[] methods = clazz.getMethods();
		
		//System.out.println(getClassShortName(clazz));
		String classname = getClassShortName(clazz);
		System.out.println(classname +" "+ id + " = new "+ classname+"();");
		System.out.println(parentId+".add("+id+");");
		
		NamedNodeMap attrs = element.getAttributes();
		for(int i = 0 ; i < attrs.getLength();i++){
//			System.out.println("node name : "+attrs.item(i).getNodeName());
//			System.out.println("node value : "+attrs.item(i).getNodeValue());
			String attr = attrs.item(i).getNodeName().toLowerCase();
			String value = attrs.item(i).getNodeValue();
			boolean found = false;
			for (int j = 0; j < methods.length; j++) {
				if (methods[j].getName().startsWith("set")
						&& methods[j].getName().equalsIgnoreCase("set"+attr)) {
					System.out.println(id+"."+methods[j].getName()+"(\""+attrs.item(i).getNodeValue()+"\");");
					found = true;
				}
			}
			if(!found){
				System.out.println("//"+classname+" has no api for set"+attr);
			}
		}			
		
		int childIndex = 0;
		Node fc = element.getFirstChild();		
		Node currentNode = fc;
		while(currentNode != null){
			if(currentNode.getNodeType() == Node.ELEMENT_NODE){
				childIndex++;
				Element currentElement =  (Element)currentNode;
				translateRecursively(currentElement,treeIndex+childIndex,id);
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
