package org.zkoss.gwt.client.zul.wgt;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Label extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.wgt.Label();
	}-*/;

	
	public native void setValue(String value)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setValue(value);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Label.js line:[31]
	
	public native String getValue()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getValue();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Label.js line:[25]
	
	public native void setMultiline(boolean multiline)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMultiline(multiline);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Label.js line:[42]
	
	public native boolean isMultiline()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isMultiline();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Label.js line:[38]
	
	public native void setPre(boolean pre)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setPre(pre);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Label.js line:[59]
	
	public native boolean isPre()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isPre();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Label.js line:[47]
	
	public native void setMaxlength(int maxlength)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMaxlength(maxlength);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Label.js line:[68]
	
	public native int getMaxlength()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMaxlength();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Label.js line:[64]
	
	public native String getEncodedText()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getEncodedText();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Label.js line:[73]
}
