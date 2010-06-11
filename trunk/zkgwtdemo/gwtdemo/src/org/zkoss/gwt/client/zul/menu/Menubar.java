package org.zkoss.gwt.client.zul.menu;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Menubar extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.menu.Menubar();
	}-*/;

	
	public native void setOrient(String orient)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setOrient(orient);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/menu/Menubar.js line:[33]
	
	public native String getOrient()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getOrient();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/menu/Menubar.js line:[29]
	
	public native void setScrollable(boolean scrollable)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setScrollable(scrollable);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/menu/Menubar.js line:[43]
	
	public native boolean isScrollable()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isScrollable();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/menu/Menubar.js line:[39]
	
	public native void setAutodrop(boolean autodrop)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setAutodrop(autodrop);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/menu/Menubar.js line:[55]
	
	public native boolean isAutodrop()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isAutodrop();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/menu/Menubar.js line:[50]
	
	public native boolean checkScrollable()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.checkScrollable();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/menu/Menubar.js line:[99]
}
