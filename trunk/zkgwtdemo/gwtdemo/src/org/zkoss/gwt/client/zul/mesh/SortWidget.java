package org.zkoss.gwt.client.zul.mesh;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class SortWidget extends org.zkoss.gwt.client.zul.mesh.HeaderWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.mesh.SortWidget();
	}-*/;

	
	public native void setSortDirection(String sortDir)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSortDirection(sortDir);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/SortWidget.js line:[28]
	
	public native String getSortDirection()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSortDirection();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/SortWidget.js line:[24]
	
	public native void setSortAscending(String sortAscending)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSortAscending(sortAscending);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/SortWidget.js line:[60]
	
	public native String getSortAscending()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSortAscending();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/SortWidget.js line:[57]
	
	public native void setSortDescending(String sortDescending)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSortDescending(sortDescending);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/SortWidget.js line:[81]
	
	public native String getSortDescending()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSortDescending();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/SortWidget.js line:[78]
	
	public native void setSort(String type)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSort(type);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/SortWidget.js line:[104]
	
	public native int sorting(Object o1, Object o2, boolean isNumber)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.sorting(o1, o2, isNumber);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/SortWidget.js line:[194]
}
