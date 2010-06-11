package org.zkoss.gwt.client.zul.grid;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Row extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.grid.Row();
	}-*/;

	
	public native void setAlign(String align)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setAlign(align);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Row.js line:[34]
	
	public native String getAlign()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getAlign();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Row.js line:[30]
	
	public native void setNowrap(boolean nowrap)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setNowrap(nowrap);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Row.js line:[46]
	
	public native boolean isNowrap()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isNowrap();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Row.js line:[42]
	
	public native void setValign(String valign)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setValign(valign);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Row.js line:[58]
	
	public native String getValign()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getValign();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Row.js line:[54]
	
	public native org.zkoss.gwt.client.zul.grid.Grid getGrid()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getGrid();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Row.js line:[67]
	
	public native String getSpans()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSpans();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Row.js line:[80]
	
	public native void setSpans(String spans)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSpans(spans);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Row.js line:[87]
	
	public native org.zkoss.gwt.client.zkex.grid.Group getGroup()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getGroup();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Row.js line:[106]
}
