package org.zkoss.gwt.client.zul.wnd;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Window extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.wnd.Window();
	}-*/;

	
	public native String getMode()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMode();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[159]
	
	public native void setMode(String name)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMode(name);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[153]
	
	public native String getTitle()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTitle();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[170]
	
	public native void setTitle(String title)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setTitle(title);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[166]
	
	public native String getBorder()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getBorder();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[184]
	
	public native void setBorder(String border)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setBorder(border);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[180]
	
	public native boolean isClosable()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isClosable();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[205]
	
	public native void setClosable(boolean closable)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setClosable(closable);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[195]
	
	public native boolean isSizable()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isSizable();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[215]
	
	public native void setSizable(boolean sizable)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSizable(sizable);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[210]
	
	public native boolean isMaximizable()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isMaximizable();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[238]
	
	public native void setMaximizable(boolean maximizable)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMaximizable(maximizable);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[228]
	
	public native boolean isMinimizable()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isMinimizable();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[256]
	
	public native void setMinimizable(boolean minimizable)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMinimizable(minimizable);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[245]
	
	public native boolean isMaximized()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isMaximized();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[274]
	
	public native void setMaximized(boolean maximized)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMaximized(maximized);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[263]
	
	public native boolean isMinimized()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isMinimized();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[363]
	
	public native void setMinimized(boolean minimized)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMinimized(minimized);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[358]
	
	public native String getContentStyle()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getContentStyle();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[400]
	
	public native void setContentStyle(String contentStyle)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setContentStyle(contentStyle);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[395]
	
	public native String getContentSclass()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getContentSclass();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[409]
	
	public native void setContentSclass(String contentSclass)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setContentSclass(contentSclass);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[405]
	
	public native String getPosition()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getPosition();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[439]
	
	public native void setPosition(String pos)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setPosition(pos);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[414]
	
	public native int getMinheight()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMinheight();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[458]
	
	public native void setMinheight(int minheight)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMinheight(minheight);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[451]
	
	public native int getMinwidth()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMinwidth();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[471]
	
	public native void setMinwidth(int minwidth)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMinwidth(minwidth);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[464]
	
	public native boolean isShadow()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isShadow();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[482]
	
	public native void setShadow(boolean shadow)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setShadow(shadow);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[477]
	
	public native void doOverlapped()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.doOverlapped();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[495]
	
	public native void doPopup()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.doPopup();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[500]
	
	public native void doHighlighted()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.doHighlighted();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[506]
	
	public native void doModal()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.doModal();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[512]
	
	public native void doEmbedded()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.doEmbedded();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[519]
	
	public native void posByParent()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.posByParent();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Window.js line:[592]
}
