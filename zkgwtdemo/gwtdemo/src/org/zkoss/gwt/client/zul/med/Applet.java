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
	
	public native void setArchive(String archive)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setArchive(archive);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Applet.js line:[53]
	
	public native String getArchive()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getArchive();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Applet.js line:[49]
	
	public native void setMayscript(boolean myscript)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMayscript(myscript);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Applet.js line:[62]
	
	public native boolean isMayscript()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isMayscript();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Applet.js line:[58]
	
	public native void setAlign(String align)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setAlign(align);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Applet.js line:[75]
	
	public native String getAlign()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getAlign();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Applet.js line:[71]
	
	public native void setHspace(String hspace)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setHspace(hspace);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Applet.js line:[88]
	
	public native String getHspace()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getHspace();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Applet.js line:[84]
	
	public native void setVspace(String vspace)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setVspace(vspace);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Applet.js line:[101]
	
	public native String getVspace()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getVspace();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Applet.js line:[97]
	
	public native String getField(String name)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getField(name);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Applet.js line:[158]
	
	public native void setField(String name, String value)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setField(name, value);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Applet.js line:[166]
	
	public native void setParam(String nm, String val)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setParam(nm, val);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Applet.js line:[180]
	
	public native void invoke()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.invoke();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Applet.js line:[111]
}
