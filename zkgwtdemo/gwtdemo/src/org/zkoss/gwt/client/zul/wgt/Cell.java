package org.zkoss.gwt.client.zul.wgt;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Cell extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.wgt.Cell();
	}-*/;

	
	public native void setColspan(int colspan)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setColspan(colspan);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Cell.js line:[34]
	
	public native int getColspan()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getColspan();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Cell.js line:[30]
	
	public native void setRowspan(int rowspan)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setRowspan(rowspan);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Cell.js line:[47]
	
	public native int getRowspan()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getRowspan();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Cell.js line:[43]
	
	public native void setAlign(String align)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setAlign(align);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Cell.js line:[60]
	
	public native String getAlign()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getAlign();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Cell.js line:[56]
	
	public native void setValign(String valign)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setValign(valign);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Cell.js line:[72]
	
	public native String getValign()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getValign();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Cell.js line:[68]
}
