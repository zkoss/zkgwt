package org.zkoss.gwt.client.zul.inp;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Textbox extends org.zkoss.gwt.client.zul.inp.InputWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.inp.Textbox();
	}-*/;

	
	public native void setMultiline(boolean multiline)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMultiline(multiline);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Textbox.js line:[28]
	
	public native boolean isMultiline()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isMultiline();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Textbox.js line:[24]
	
	public native void setTabbable(boolean tabbable)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setTabbable(tabbable);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Textbox.js line:[40]
	
	public native boolean isTabbable()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isTabbable();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Textbox.js line:[34]
	
	public native void setRows(int rows)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setRows(rows);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Textbox.js line:[51]
	
	public native int getRows()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getRows();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Textbox.js line:[47]
	
	public native void setType(String type)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setType(type);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Textbox.js line:[63]
	
	public native String getType()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getType();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Textbox.js line:[59]
}
