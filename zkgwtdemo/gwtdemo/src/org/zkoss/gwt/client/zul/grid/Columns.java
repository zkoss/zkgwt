package org.zkoss.gwt.client.zul.grid;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Columns extends org.zkoss.gwt.client.zul.mesh.HeadWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.grid.Columns();
	}-*/;

	
	public native void setColumnshide(boolean columnshide)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setColumnshide(columnshide);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Columns.js line:[30]
	
	public native boolean isColumnshide()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isColumnshide();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Columns.js line:[26]
	
	public native void setColumnsgroup(boolean columnsgroup)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setColumnsgroup(columnsgroup);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Columns.js line:[42]
	
	public native boolean isColumnsgroup()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isColumnsgroup();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Columns.js line:[38]
	
	public native void setMenupopup(String mpop)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMenupopup(mpop);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Columns.js line:[53]
	
	public native String getMenupopup()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMenupopup();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Columns.js line:[47]
	
	public native org.zkoss.gwt.client.zul.grid.Grid getGrid()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getGrid();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Columns.js line:[82]
	
	public native void setPopup(org.zkoss.gwt.client.zul.menu.Menupopup mpop)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setPopup(mpop);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Columns.js line:[97]
	
	public native org.zkoss.gwt.client.zul.grid.Columns syncColMenu()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.syncColMenu();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Columns.js line:[153]
}
