package org.zkoss.gwt.client.zul.wnd;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Panel extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.wnd.Panel();
	}-*/;

	
	public native int getMinheight()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMinheight();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[57]
	
	public native void setMinheight(int minheight)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMinheight(minheight);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[50]
	
	public native int getMinwidth()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMinwidth();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[70]
	
	public native void setMinwidth(int minwidth)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMinwidth(minwidth);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[63]
	
	public native boolean isSizable()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isSizable();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[81]
	
	public native void setSizable(boolean sizable)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSizable(sizable);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[76]
	
	public native boolean isFramable()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isFramable();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[99]
	
	public native void setFramable(boolean framable)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setFramable(framable);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[94]
	
	public native boolean isMovable()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isMovable();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[114]
	
	public native void setMovable(boolean movable)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMovable(movable);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[107]
	
	public native boolean isFloatable()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isFloatable();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[132]
	
	public native void setFloatable(boolean floatable)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setFloatable(floatable);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[120]
	
	public native boolean isMaximizable()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isMaximizable();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[148]
	
	public native void setMaximizable(boolean maximizable)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMaximizable(maximizable);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[138]
	
	public native boolean isMinimizable()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isMinimizable();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[166]
	
	public native void setMinimizable(boolean minimizable)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMinimizable(minimizable);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[155]
	
	public native boolean isCollapsible()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isCollapsible();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[179]
	
	public native void setCollapsible(boolean collapsible)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setCollapsible(collapsible);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[173]
	
	public native boolean isClosable()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isClosable();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[195]
	
	public native void setClosable(boolean closable)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setClosable(closable);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[185]
	
	public native String getBorder()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getBorder();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[204]
	
	public native void setBorder(String border)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setBorder(border);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[200]
	
	public native String getTitle()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTitle();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[219]
	
	public native void setTitle(String title)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setTitle(title);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[215]
	
	public native boolean isOpen()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isOpen();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[233]
	
	public native void setOpen(boolean open)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setOpen(open);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[229]
	
	public native boolean isMaximized()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isMaximized();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[270]
	
	public native void setMaximized(boolean maximized)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMaximized(maximized);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[259]
	
	public native boolean isMinimized()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isMinimized();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[411]
	
	public native void setMinimized(boolean minimized)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMinimized(minimized);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[406]
	
	public native boolean addToolbar(String name, org.zkoss.gwt.client.zul.wgt.Toolbar toolbar)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.addToolbar(name, toolbar);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panel.js line:[487]
}
