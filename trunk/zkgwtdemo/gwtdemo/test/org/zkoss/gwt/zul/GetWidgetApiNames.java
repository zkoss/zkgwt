/* GetWidgetApiNames.java

	Purpose:
		
	Description:
		
	History:
		Jun 10, 2010, Created by PeterKuo

Copyright (C) 2010 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under Apache license version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package org.zkoss.gwt.zul;

import java.lang.reflect.Method;
import java.util.Set;
import java.util.TreeSet;


public class GetWidgetApiNames {


	public static void main(String[] args) {
		//Grid t;
		String compGwt = "org.zkoss.gwt.client.zul.grid.Grid";		
		String compZk = "org.zkoss.zul.Grid";

		Set<String> zkGetter = getApiWithPrefix(compZk,"get");
		Set<String> zkSetter = getApiWithPrefix(compZk,"set");
		Set<String> zkParentGetter = getApiWithPrefix(getParentClass(compZk),"get");
		Set<String> zkParentSetter = getApiWithPrefix(getParentClass(compZk),"set");

		Set<String> gwtGetter = getApiWithPrefix(compGwt,"get");
		Set<String> gwtSetter = getApiWithPrefix(compGwt,"set");
		Set<String> gwtParentGetter = getApiWithPrefix(getParentClass(compGwt),"get");
		Set<String> gwtParentSetter = getApiWithPrefix(getParentClass(compGwt),"set");

		System.out.println("\n\nsetter api of grid in zk w/o parent and gwt,  :");
		printlnStringSet(joint(subtract(zkSetter,zkParentSetter),gwtSetter));
		
		System.out.println("\n\nsetter api of grid in zk and gwt,  :");
		printlnStringSet(joint(zkSetter,gwtSetter));
		
//case 12		
		System.out.println("\n\nsetter api of grid w/o parent in zk, but not in gwt,  :");		
		printlnStringSet(subtract(subtract(zkSetter,zkParentSetter),gwtSetter));
				
//case 11		
		System.out.println("\n\nsetter api of grid in zk, but not in gwt :");
		printlnStringSet(subtract(zkSetter,gwtSetter));

//case 4		
		System.out.println("\n\ngetter api of grid in zk w/o parent, but not in gwt :");		
		printlnStringSet(subtract(subtract(zkGetter,zkParentGetter),gwtGetter));

//case 3		
		System.out.println("\n\ngetter api of grid in zk, but not in gwt :");
		printlnStringSet(subtract(zkGetter,gwtGetter));
		
		System.out.println("//////////////////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////////////////");
		
//case 1		
		System.out.println("\n\ngetter api of grid in zk:");
		printlnStringSet(zkGetter);

//case 2
		System.out.println("\n\ngetter api of grid w/o parent in zk:");		
		printlnStringSet(subtract(zkGetter,zkParentGetter));		
		
//case 5		
		System.out.println("\n\ngetter api of grid in gwt:");
		printlnStringSet(gwtGetter);

//case 6
		System.out.println("\n\ngetter api of grid w/o parent in gwt:");		
		printlnStringSet(subtract(gwtGetter,gwtParentGetter));

//case 7
		System.out.println("\n\ngetter api of grid in gwt, but not in zk :");
		printlnStringSet(subtract(gwtGetter,zkGetter));
		
//case 8		
		System.out.println("\n\ngetter api of grid in gwt, but not in zk, w/o parent :");		
		printlnStringSet(subtract(subtract(gwtGetter,gwtParentGetter),subtract(zkGetter,zkParentGetter)));
		
//case 9		
		System.out.println("\n\nsetter api of grid in zk:");
		printlnStringSet(zkSetter);

//case 10
		System.out.println("\n\nsetter api of grid w/o parent in zk:");		
		printlnStringSet(subtract(zkSetter,zkParentSetter));

//case 13		
		System.out.println("\n\nsetter api of grid in gwt:");
		printlnStringSet(gwtSetter);

//case 14
		System.out.println("\n\nsetter api of grid w/o parent in gwt:");		
		printlnStringSet(subtract(gwtSetter,gwtParentSetter));

//case 15
		System.out.println("\n\nsetter api of grid in gwt, but not in zk :");
		printlnStringSet(subtract(gwtSetter,zkSetter));

//case 16		
		System.out.println("\n\nsetter api of grid in gwt, but not in zk, w/o parent :");		
		printlnStringSet(subtract(subtract(gwtSetter,gwtParentSetter),subtract(zkSetter,zkParentSetter)));
		
		
	}

	public static Set<String> getApiWithPrefix(String clazzname, String prefix){
		Class clazz;
		try {
			clazz = Class.forName(clazzname,false,Thread.currentThread().getContextClassLoader());
			Set<String> methodNames = new TreeSet<String>();
			Method[] methods = clazz.getMethods();		
			for (int i = 0; i < methods.length; i++) {
				if (methods[i].getName().startsWith(prefix)) {
					methodNames.add(methods[i].getName());
				}
			}

			return methodNames;
		} catch (ClassNotFoundException e) {		
			e.printStackTrace();
			return null;
		}			
	}
	
	public static Set<String> getApiWithPrefix(Class clazz, String prefix){		
		Set<String> methodNames = new TreeSet<String>();
		Method[] methods = clazz.getMethods();		
		for (int i = 0; i < methods.length; i++) {
			if (methods[i].getName().startsWith(prefix)) {
				methodNames.add(methods[i].getName());
			}
		}

		return methodNames;			
	}	

	public static Class getParentClass(String widgetName){
		Class clazz;
		try {
			clazz = Class.forName(widgetName,false,Thread.currentThread().getContextClassLoader());
			return clazz.getSuperclass();
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
		return null;
	}
	
	//set manipulation
	public static Set<String> subtract(Set<String> a, Set<String> b){
		Set<String> cloned = new TreeSet<String>();
		for (String name : a) {
			cloned.add(name);
		}
		cloned.removeAll(b);
		return cloned;				
	}

	public static Set<String> joint(Set<String> a, Set<String> b){
		Set<String> clonedA = new TreeSet<String>();
		Set<String> cloned2 = new TreeSet<String>();
		for (String name : a) {
			clonedA.add(name);
			cloned2.add(name);
		}
		
		cloned2.removeAll(b);
		clonedA.removeAll(cloned2);
		return clonedA;				
	}

	public static void printlnStringSet(Set<String> set){
		String s = "";
		for (String name : set) {
			s += "\t"+name + "\n";
		}
		System.out.println(s);
	}
}
