package org.zkoss.gwt.client.zul.grid;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Column extends org.zkoss.gwt.client.zul.mesh.SortWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.grid.Column();
	}-*/;

	
	public native org.zkoss.gwt.client.zul.grid.Rows getMeshBody()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMeshBody();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Column.js line:[37]
	
	public native boolean group(boolean ascending, org.zkoss.gwt.client.zk.Event evt)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.group(ascending, evt);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Column.js line:[44]
	
	public native void onGroup()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.onGroup();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Column.js line:[158]
	
	public native org.zkoss.gwt.client.zul.grid.Grid getGrid()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getGrid();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Column.js line:[28]
}
