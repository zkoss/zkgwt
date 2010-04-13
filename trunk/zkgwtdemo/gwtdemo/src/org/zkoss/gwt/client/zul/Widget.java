/* Widget.java

	Purpose:
		
	Description:
		
	History:
		2010/03/29, Created by Ian Tsai(Zanyking)

Copyright (C) 2010 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under Apache license version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package org.zkoss.gwt.client.zul;

import org.zkoss.gwt.client.zk.Container;

/**
 * Zul Widget is a general basement of most of ZK GWT widget's implementation.  
 * this class is also a reflection of ZK Client Side zul.Widget. 
 * 
 * @author Ian Tsai(Zanyking)
 *
 */
public abstract class Widget extends Container{

	

	
	
	
	
	
//******* SECTION: Wrapper Methods ****/
	
	
	public native void setContext(String id)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setContext(id);
	}-*/;
	
	public native String getContext()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getContext();
	}-*/;
	
	public native void setPopup(String id)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setPopup(id);
	}-*/;
	
	public native String getPopup()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getPopup();
	}-*/;
	
	public native void setTooltip(String id)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setTooltip(id);
	}-*/;
	
	public native String getTooltip()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTooltip();
	}-*/;
	
	public native void setCtrlKeys(String id)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setCtrlKeys(id);
	}-*/;
	
	public native String getCtrlKeys()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getCtrlKeys();
	}-*/;
	
	
	
	
	
//	public native void set(String contextMenuId)/*-{
//		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
//		widget.set(value);
//	}-*/;
//	
//	public native String get()/*-{
//		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
//		return widget.get();
//	}-*/;
}
