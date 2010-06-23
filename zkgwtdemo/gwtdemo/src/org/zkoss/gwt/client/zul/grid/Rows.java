package org.zkoss.gwt.client.zul.grid;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Rows extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.grid.Rows();
	}-*/;

	
	public native int getVisibleItemCount()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getVisibleItemCount();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Rows.js line:[35]
	
	public native org.zkoss.gwt.client.zul.grid.Grid getGrid()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getGrid();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Rows.js line:[40]
	
	public native int getGroupCount()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getGroupCount();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Rows.js line:[46]
	
	public native Widget[] getGroups()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getGroups();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Rows.js line:[52]
	
	public native boolean hasGroup()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.hasGroup();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Rows.js line:[58]
	
	public native void stripe()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.stripe();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Rows.js line:[87]
}
