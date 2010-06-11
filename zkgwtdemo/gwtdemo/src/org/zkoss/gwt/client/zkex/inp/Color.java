package org.zkoss.gwt.client.zkex.inp;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Color extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zkex.inp.Color();
	}-*/;

	
	public native void $init(String hex)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.$init(hex);
	}-*/; //I:/svn/zk5_sf/zkex/src/archive/web/js/zkex/inp/Color.js line:[120]
	
	public native void setRGB(int r, int g, int b)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setRGB(r, g, b);
	}-*/; //I:/svn/zk5_sf/zkex/src/archive/web/js/zkex/inp/Color.js line:[129]
	
	public native Widget[] getRGB()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getRGB();
	}-*/; //I:/svn/zk5_sf/zkex/src/archive/web/js/zkex/inp/Color.js line:[146]
	
	public native int getHue()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getHue();
	}-*/; //I:/svn/zk5_sf/zkex/src/archive/web/js/zkex/inp/Color.js line:[152]
	
	public native int getSaturation()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSaturation();
	}-*/; //I:/svn/zk5_sf/zkex/src/archive/web/js/zkex/inp/Color.js line:[158]
	
	public native int getValue()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getValue();
	}-*/; //I:/svn/zk5_sf/zkex/src/archive/web/js/zkex/inp/Color.js line:[164]
	
	public native boolean setHex(String color)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.setHex(color);
	}-*/; //I:/svn/zk5_sf/zkex/src/archive/web/js/zkex/inp/Color.js line:[170]
	
	public native String getHex()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getHex();
	}-*/; //I:/svn/zk5_sf/zkex/src/archive/web/js/zkex/inp/Color.js line:[186]
	
	public native boolean setHSV(int h, int s, int v)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.setHSV(h, s, v);
	}-*/; //I:/svn/zk5_sf/zkex/src/archive/web/js/zkex/inp/Color.js line:[194]
}
