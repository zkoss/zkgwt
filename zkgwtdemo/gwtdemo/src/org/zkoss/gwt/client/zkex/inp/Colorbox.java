package org.zkoss.gwt.client.zkex.inp;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Colorbox extends org.zkoss.gwt.client.zk.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zkex.inp.Colorbox();
	}-*/;

	
	public native void setColor(String color)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setColor(color);
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/inp//Colorbox.js line:[35]
	
	public native String getColor()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getColor();
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/inp//Colorbox.js line:[31]
	
	public native void setDisabled(boolean disabled)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setDisabled(disabled);
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/inp//Colorbox.js line:[49]
	
	public native boolean isDisabled()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isDisabled();
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/inp//Colorbox.js line:[45]
	
	public native void setValue(String value)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setValue(value);
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/inp//Colorbox.js line:[62]
	
	public native String getValue()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getValue();
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/inp//Colorbox.js line:[70]
	
	public native void openPalette()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.openPalette();
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/inp//Colorbox.js line:[157]
	
	public native void closePalette()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.closePalette();
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/inp//Colorbox.js line:[182]
	
	public native void openPicker()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.openPicker();
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/inp//Colorbox.js line:[193]
	
	public native void closePicker()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.closePicker();
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/inp//Colorbox.js line:[214]
}
