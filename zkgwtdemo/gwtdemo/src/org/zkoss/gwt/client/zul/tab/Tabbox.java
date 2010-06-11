package org.zkoss.gwt.client.zul.tab;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Tabbox extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.tab.Tabbox();
	}-*/;

	
	public native void setTabscroll(boolean tabscroll)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setTabscroll(tabscroll);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tabbox.js line:[54]
	
	public native boolean isTabscroll()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isTabscroll();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tabbox.js line:[49]
	
	public native void setOrient(String orient)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setOrient(orient);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tabbox.js line:[71]
	
	public native String getOrient()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getOrient();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tabbox.js line:[61]
	
	public native void setPanelSpacing(String panelSpacing)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setPanelSpacing(panelSpacing);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tabbox.js line:[85]
	
	public native String getPanelSpacing()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getPanelSpacing();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tabbox.js line:[78]
	
	public native Tabs getTabs()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTabs();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tabbox.js line:[92]
	
	public native Tabpanels getTabpanels()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTabpanels();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tabbox.js line:[99]
	
	public native org.zkoss.gwt.client.zul.wgt.Toolbar getToolbar()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getToolbar();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tabbox.js line:[106]
	
	public native boolean isHorizontal()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isHorizontal();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tabbox.js line:[117]
	
	public native boolean isVertical()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isVertical();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tabbox.js line:[124]
	
	public native boolean inAccordionMold()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.inAccordionMold();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tabbox.js line:[131]
	
	public native int getSelectedIndex()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSelectedIndex();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tabbox.js line:[138]
	
	public native void setSelectedIndex(int index)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSelectedIndex(index);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tabbox.js line:[145]
	
	public native Tabpanel getSelectedPanel()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSelectedPanel();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tabbox.js line:[153]
	
	public native void setSelectedPanel(Tabpanel panel)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSelectedPanel(panel);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tabbox.js line:[160]
	
	public native Tab getSelectedTab()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSelectedTab();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tabbox.js line:[171]
	
	public native void setSelectedTab(Tab tab)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSelectedTab(tab);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tabbox.js line:[178]
}
