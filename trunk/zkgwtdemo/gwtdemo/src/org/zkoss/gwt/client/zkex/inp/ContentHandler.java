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
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/inp//ContentHandler.js line:[95]
	
	public native void setContent(String content)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setContent(content);
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/inp//ContentHandler.js line:[177]
	
	public native void destroy()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.destroy();
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/inp//ContentHandler.js line:[222]
	
	public native void openContent()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.openContent();
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/inp//ContentHandler.js line:[257]
	
	public native void openPalette()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.openPalette();
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/inp//ContentHandler.js line:[274]
	
	public native void closePalette()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.closePalette();
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/inp//ContentHandler.js line:[300]
	
	public native void openPicker()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.openPicker();
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/inp//ContentHandler.js line:[313]
	
	public native void closePicker()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.closePicker();
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/inp//ContentHandler.js line:[335]
	
	public native void getPosition()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.getPosition();
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/inp//ContentHandler.js line:[348]
}
