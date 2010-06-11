package org.zkoss.gwt.client.zul.layout;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Center extends org.zkoss.gwt.client.zul.layout.LayoutRegion{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.layout.Center();
	}-*/;

	
	public native String getPosition()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getPosition();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/Center.js line:[90]
	
	public native void setHeight(String height)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setHeight(height);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/Center.js line:[30]
	
	public native void setWidth(String width)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setWidth(width);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/Center.js line:[36]
	
	public native void setVisible(boolean visible)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setVisible(visible);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/Center.js line:[42]
	
	public native String getSize()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSize();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/Center.js line:[47]
	
	public native void setSize(String size)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSize(size);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/Center.js line:[52]
	
	public native void setCmargins(String cmargins)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setCmargins(cmargins);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/Center.js line:[57]
	
	public native void setSplittable(boolean splittable)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSplittable(splittable);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/Center.js line:[62]
	
	public native void setOpen(boolean open)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setOpen(open);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/Center.js line:[67]
	
	public native void setCollapsible(boolean collapsible)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setCollapsible(collapsible);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/Center.js line:[72]
	
	public native void setMaxsize(int maxsize)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMaxsize(maxsize);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/Center.js line:[77]
	
	public native void setMinsize(int minsize)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMinsize(minsize);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/Center.js line:[82]
}
