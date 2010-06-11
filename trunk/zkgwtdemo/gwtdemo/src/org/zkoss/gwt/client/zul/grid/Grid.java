package org.zkoss.gwt.client.zul.grid;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Grid extends org.zkoss.gwt.client.zul.mesh.MeshWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.grid.Grid();
	}-*/;

	
	public native org.zkoss.gwt.client.zk.Widget getCell(int row, int col)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getCell(row, col);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Grid.js line:[33]
	
	public native String getOddRowSclass()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getOddRowSclass();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Grid.js line:[45]
	
	public native void setOddRowSclass(String scls)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setOddRowSclass(scls);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Grid.js line:[52]
	
	public native org.zkoss.gwt.client.zul.grid.Columns getHeadWidgetClass()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getHeadWidgetClass();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Grid.js line:[159]
}
