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
public class Label extends Widget{

	
	public native void setValue(String value)/*-{
    	var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
    	widget.setValue(value);
	}-*/;

	
	public native String getValue()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
    	return widget.getValue();
	}-*/;

	protected native JavaScriptObject create() /*-{
    	return new $wnd.zul.wgt.Label();
	}-*/;
	
		
}
