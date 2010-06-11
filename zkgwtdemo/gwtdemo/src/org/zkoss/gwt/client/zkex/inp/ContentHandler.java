package org.zkoss.gwt.client.zkex.inp;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class ContentHandler extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zkex.inp.ContentHandler();
	}-*/;

	
	public native boolean isOpen()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isOpen();
	}-*/; //I:/svn/zk5_sf/zkex/src/archive/web/js/zkex/inp/ContentHandler.js line:[95]
	
	public native void setContent(String content)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setContent(content);
	}-*/; //I:/svn/zk5_sf/zkex/src/archive/web/js/zkex/inp/ContentHandler.js line:[177]
	
	public native void destroy()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.destroy();
	}-*/; //I:/svn/zk5_sf/zkex/src/archive/web/js/zkex/inp/ContentHandler.js line:[227]
	
	public native void openContent()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.openContent();
	}-*/; //I:/svn/zk5_sf/zkex/src/archive/web/js/zkex/inp/ContentHandler.js line:[262]
	
	public native void openPalette()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.openPalette();
	}-*/; //I:/svn/zk5_sf/zkex/src/archive/web/js/zkex/inp/ContentHandler.js line:[279]
	
	public native void closePalette()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.closePalette();
	}-*/; //I:/svn/zk5_sf/zkex/src/archive/web/js/zkex/inp/ContentHandler.js line:[305]
	
	public native void openPicker()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.openPicker();
	}-*/; //I:/svn/zk5_sf/zkex/src/archive/web/js/zkex/inp/ContentHandler.js line:[318]
	
	public native void closePicker()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.closePicker();
	}-*/; //I:/svn/zk5_sf/zkex/src/archive/web/js/zkex/inp/ContentHandler.js line:[340]
	
	public native void getPosition()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.getPosition();
	}-*/; //I:/svn/zk5_sf/zkex/src/archive/web/js/zkex/inp/ContentHandler.js line:[353]
}
