package org.zkoss.gwt.client.zul.layout;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class LayoutRegion extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.layout.LayoutRegion();
	}-*/;

	
	public native boolean isFlex()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isFlex();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/LayoutRegion.js line:[38]
	
	public native void setFlex(boolean flex)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setFlex(flex);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/LayoutRegion.js line:[33]
	
	public native String getBorder()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getBorder();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/LayoutRegion.js line:[54]
	
	public native void setBorder(String border)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setBorder(border);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/LayoutRegion.js line:[49]
	
	public native String getTitle()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTitle();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/LayoutRegion.js line:[81]
	
	public native void setTitle(String title)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setTitle(title);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/LayoutRegion.js line:[77]
	
	public native boolean isSplittable()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isSplittable();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/LayoutRegion.js line:[93]
	
	public native void setSplittable(boolean splittable)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSplittable(splittable);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/LayoutRegion.js line:[89]
	
	public native int getMaxsize()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMaxsize();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/LayoutRegion.js line:[107]
	
	public native void setMaxsize(int maxsize)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMaxsize(maxsize);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/LayoutRegion.js line:[103]
	
	public native int getMinsize()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMinsize();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/LayoutRegion.js line:[118]
	
	public native void setMinsize(int minsize)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMinsize(minsize);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/LayoutRegion.js line:[114]
	
	public native boolean isCollapsible()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isCollapsible();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/LayoutRegion.js line:[131]
	
	public native void setCollapsible(boolean collapsible)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setCollapsible(collapsible);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/LayoutRegion.js line:[125]
	
	public native boolean isAutoscroll()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isAutoscroll();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/LayoutRegion.js line:[146]
	
	public native void setAutoscroll(boolean autoscroll)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setAutoscroll(autoscroll);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/LayoutRegion.js line:[142]
	
	public native boolean isOpen()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isOpen();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/LayoutRegion.js line:[173]
	
	public native void setOpen(boolean open)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setOpen(open);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/LayoutRegion.js line:[168]
	
	public native String getCmargins()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getCmargins();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/LayoutRegion.js line:[246]
	
	public native void setCmargins(String cmargins)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setCmargins(cmargins);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/LayoutRegion.js line:[256]
	
	public native String getMargins()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMargins();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/LayoutRegion.js line:[275]
	
	public native void setMargins(String margins)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMargins(margins);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/LayoutRegion.js line:[284]
}
