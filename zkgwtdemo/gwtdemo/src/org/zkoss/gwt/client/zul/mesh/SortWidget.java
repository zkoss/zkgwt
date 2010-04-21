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
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/mesh//SortWidget.js line:[28]
	
	public native String getSortDirection()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSortDirection();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/mesh//SortWidget.js line:[24]
	
	public native void setSortAscending(String sortAscending)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSortAscending(sortAscending);
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/mesh//SortWidget.js line:[60]
	
	public native String getSortAscending()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSortAscending();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/mesh//SortWidget.js line:[57]
	
	public native void setSortDescending(String sortDescending)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSortDescending(sortDescending);
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/mesh//SortWidget.js line:[81]
	
	public native String getSortDescending()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSortDescending();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/mesh//SortWidget.js line:[78]
	
	public native void setSort(String type)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSort(type);
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/mesh//SortWidget.js line:[104]
	
	public native int sorting(Object o1, Object o2, boolean isNumber)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.sorting(o1, o2, isNumber);
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/mesh//SortWidget.js line:[193]
}
