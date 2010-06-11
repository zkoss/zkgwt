package org.zkoss.gwt.client.zul.wgt;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Separator extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.wgt.Separator();
	}-*/;

	
	public native void setOrient(String orient)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setOrient(orient);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Separator.js line:[33]
	
	public native String getOrient()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getOrient();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Separator.js line:[29]
	
	public native void setBar(boolean bar)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setBar(bar);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Separator.js line:[43]
	
	public native boolean isBar()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isBar();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Separator.js line:[39]
	
	public native void setSpacing(String spacing)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSpacing(spacing);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Separator.js line:[51]
	
	public native String getSpacing()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSpacing();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Separator.js line:[47]
	
	public native boolean isVertical()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isVertical();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Separator.js line:[59]
}
