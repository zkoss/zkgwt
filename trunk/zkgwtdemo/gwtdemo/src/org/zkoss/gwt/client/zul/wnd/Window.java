/**
 * 
 */
package org.zkoss.gwt.client.zul.wnd;

import org.zkoss.gwt.client.zul.Widget;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @author ian
 *
 */
public class Window extends Widget{

	
	@Override
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.wnd.Window();
	}-*/;
	
	
	public native void doModal()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.doModal();
	}-*/;
	
	public native void doOverlapped()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.doOverlapped();
	}-*/;
	
	public native void doPopup()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.doPopup();
	}-*/;
	
	
	public native void setBorder(String value)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setBorder(value);
	}-*/;


	public native String getBorder()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getBorder();
	}-*/;
	
	
	public native void setTitle(String value)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setTitle(value);
	}-*/;


	public native String getTitle()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTitle();
	}-*/;
	
	public native void setSizable(boolean value)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSizable(value);
	}-*/;
	
	
	public native boolean isSizable()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isSizable();
	}-*/;
	
}
