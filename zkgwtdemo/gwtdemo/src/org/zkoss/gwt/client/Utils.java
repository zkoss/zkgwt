/* Utils.java

	Purpose:
		
	Description:
		
	History:
		Mon March 29 11:28   2010, Created by Ian Tsai(Zanyking)

Copyright (C) 2010 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under Apache license version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package org.zkoss.gwt.client;

import org.zkoss.gwt.client.zk.Widget;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A utility class for ZK GWT
 * 
 * @author Ian Tsai(Zanyking)
 */
public class Utils {

	/**
	 * 
	 * @param obj
	 */
	public static void alert(Object obj){
		 alert(""+obj);
	}
	/**
	 * 
	 * @param str
	 */
	public static native void alert(String str)/*-{
		alert(str);
	}-*/;
	/**
	 * 
	 * @param mesg
	 */
	public static native void log(String mesg)/*-{
		$wnd.zk.log(mesg);
	}-*/;
	/**
	 * 
	 * @param jsObj
	 */
	public static native void log(JavaScriptObject jsObj)/*-{
		$wnd.zk.log(obj);
	}-*/;
	/**
	 * this method is same as this Javascript code:
	 * jsObj[attr] = value;
	 * 
	 * @param jsObj Javascript Object instance   
	 * @param attr a dynamic value that you want to assigned.
	 * @param value value of this attribute, could be anything(from javascript).
	 */
    public static native void setAttribute(JavaScriptObject jsObj, String attr, Object value) /*-{
	    jsObj[attr] = value;
	}-*/;// add primitive type method if needed.
    /**
     * 
     * @param zkWidget
     * @return
     */
	public native static Widget getGwtWidget(JavaScriptObject zkWidget) /*-{
	    var wgt = zkWidget.__gwtIns;
	    return wgt;
	}-*/;
}
