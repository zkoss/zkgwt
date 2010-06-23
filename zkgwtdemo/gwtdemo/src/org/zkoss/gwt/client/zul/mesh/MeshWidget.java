package org.zkoss.gwt.client.zul.mesh;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class MeshWidget extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.mesh.MeshWidget();
	}-*/;

	
	public native void setPagingPosition(String pagingPosition)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setPagingPosition(pagingPosition);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/MeshWidget.js line:[47]
	
	public native String getPagingPosition()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getPagingPosition();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/MeshWidget.js line:[42]
	
	public native void setSizedByContent(boolean byContent)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSizedByContent(byContent);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/MeshWidget.js line:[63]
	
	public native boolean isSizedByContent()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isSizedByContent();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/MeshWidget.js line:[56]
	
	public native void setAutopaging(boolean autopaging)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setAutopaging(autopaging);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/MeshWidget.js line:[83]
	
	public native boolean isAutopaging()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isAutopaging();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/MeshWidget.js line:[75]
	
	public native void setModel(boolean inModel)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setModel(inModel);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/MeshWidget.js line:[95]
	
	public native boolean isModel()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isModel();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/MeshWidget.js line:[91]
	
	public native void setInnerWidth(String innerWidth)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setInnerWidth(innerWidth);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/MeshWidget.js line:[107]
	
	public native String getInnerWidth()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getInnerWidth();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/MeshWidget.js line:[100]
	
	public native int getPageSize()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getPageSize();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/MeshWidget.js line:[130]
	
	public native void setPageSize(int pageSize)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setPageSize(pageSize);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/MeshWidget.js line:[137]
	
	public native int getPageCount()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getPageCount();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/MeshWidget.js line:[144]
	
	public native int getActivePage()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getActivePage();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/MeshWidget.js line:[152]
	
	public native void setActivePage(int activePage)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setActivePage(activePage);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/MeshWidget.js line:[159]
	
	public native boolean inPagingMold()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.inPagingMold();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/MeshWidget.js line:[166]
	
	public native void calcSize()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.calcSize();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/MeshWidget.js line:[558]
}
