package org.zkoss.gwt.client.zul.mesh;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Paging extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.mesh.Paging();
	}-*/;

	
	public native void setTotalSize(int totalSize)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setTotalSize(totalSize);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/Paging.js line:[31]
	
	public native int getTotalSize()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTotalSize();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/Paging.js line:[28]
	
	public native void setPageIncrement(int pageIncrement)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setPageIncrement(pageIncrement);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/Paging.js line:[49]
	
	public native int getPageIncrement()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getPageIncrement();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/Paging.js line:[44]
	
	public native void setDetailed(boolean detailed)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setDetailed(detailed);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/Paging.js line:[58]
	
	public native boolean isDetailed()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isDetailed();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/Paging.js line:[55]
	
	public native void setPageCount(int pageCount)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setPageCount(pageCount);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/Paging.js line:[66]
	
	public native int getPageCount()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getPageCount();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/Paging.js line:[62]
	
	public native void setActivePage(int activePage)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setActivePage(activePage);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/Paging.js line:[74]
	
	public native int getActivePage()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getActivePage();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/Paging.js line:[71]
	
	public native void setPageSize(int pageSize)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setPageSize(pageSize);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/Paging.js line:[81]
	
	public native int getPageSize()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getPageSize();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/Paging.js line:[78]
	
	public native void setAutohide(boolean autohide)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setAutohide(autohide);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/Paging.js line:[94]
	
	public native boolean isAutohide()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isAutohide();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/Paging.js line:[87]
	
	public native boolean isBothPaging()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isBothPaging();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/Paging.js line:[144]
}
