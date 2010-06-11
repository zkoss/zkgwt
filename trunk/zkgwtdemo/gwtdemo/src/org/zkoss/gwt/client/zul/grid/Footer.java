package org.zkoss.gwt.client.zul.grid;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Footer extends org.zkoss.gwt.client.zul.LabelImageWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.grid.Footer();
	}-*/;

	
	public native void setSpan(int span)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSpan(span);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Footer.js line:[30]
	
	public native int getSpan()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSpan();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Footer.js line:[26]
	
	public native org.zkoss.gwt.client.zul.grid.Grid getGrid()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getGrid();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Footer.js line:[39]
	
	public native org.zkoss.gwt.client.zul.grid.Column getColumn()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getColumn();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Footer.js line:[45]
}
