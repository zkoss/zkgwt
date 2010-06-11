package org.zkoss.gwt.client.zul.grid;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class ColumnMenupopup extends org.zkoss.gwt.client.zul.menu.Menupopup{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.grid.ColumnMenupopup();
	}-*/;

	
	public native void $init()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.$init();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Columns.js line:[206]
	
	public native org.zkoss.gwt.client.zul.menu.Menuitem getAscitem()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getAscitem();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Columns.js line:[212]
	
	public native org.zkoss.gwt.client.zul.menu.Menuitem getDescitem()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getDescitem();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Columns.js line:[218]
	
	public native org.zkoss.gwt.client.zul.menu.Menuitem getGroupitem()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getGroupitem();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Columns.js line:[224]
	
	public native void syncColMenu()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.syncColMenu();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Columns.js line:[259]
}
