package org.zkoss.gwt.client.zul.inp;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Slider extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.inp.Slider();
	}-*/;

	
	public native void setOrient(String orient)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setOrient(orient);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Slider.js line:[35]
	
	public native String getOrient()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getOrient();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Slider.js line:[31]
	
	public native void setCurpos(int curpos)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setCurpos(curpos);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Slider.js line:[53]
	
	public native int getCurpos()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getCurpos();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Slider.js line:[49]
	
	public native void setMaxpos(int maxpos)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMaxpos(maxpos);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Slider.js line:[66]
	
	public native int getMaxpos()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMaxpos();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Slider.js line:[62]
	
	public native void setSlidingtext(String slidingtext)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSlidingtext(slidingtext);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Slider.js line:[80]
	
	public native String getSlidingtext()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSlidingtext();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Slider.js line:[76]
	
	public native void setPageIncrement(int pginc)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setPageIncrement(pginc);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Slider.js line:[90]
	
	public native int getPageIncrement()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getPageIncrement();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Slider.js line:[85]
	
	public native void setName(String name)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setName(name);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Slider.js line:[105]
	
	public native String getName()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getName();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Slider.js line:[95]
	
	public native boolean inScaleMold()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.inScaleMold();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Slider.js line:[259]
	
	public native boolean inSphereMold()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.inSphereMold();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Slider.js line:[265]
	
	public native boolean isVertical()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isVertical();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Slider.js line:[271]
}
