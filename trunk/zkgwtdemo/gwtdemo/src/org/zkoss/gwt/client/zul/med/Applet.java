package org.zkoss.gwt.client.zul.med;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Applet extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.med.Applet();
	}-*/;

	
	public native void setCode(String code)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setCode(code);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Applet.js line:[36]
	
	public native String getCode()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getCode();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Applet.js line:[33]
	
	public native void setCodebase(String codebase)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setCodebase(codebase);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Applet.js line:[45]
	
	public native String getCodebase()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getCodebase();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Applet.js line:[42]
	
	public native String getField(String name)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getField(name);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Applet.js line:[97]
	
	public native void setField(String name, String value)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setField(name, value);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Applet.js line:[105]
	
	public native void setParam(String nm, String val)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setParam(nm, val);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Applet.js line:[119]
	
	public native void invoke()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.invoke();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Applet.js line:[50]
}
