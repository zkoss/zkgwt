/**
 * 
 */
package org.zkoss.gwt.client.zul.wgt;


import org.zkoss.gwt.client.zul.Widget;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @author ian
 *
 */
public class Button  extends Widget{

	public native void setLabel(String value)/*-{
    	var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
    	widget.setLabel(value);
	}-*/;

	public native String getLabel()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
    	return widget.getLabel();
	}-*/;

	protected native JavaScriptObject create() /*-{
    	return new $wnd.zul.wgt.Button();
	}-*/;
}
