package org.zkoss.gwt.client.zul.wgt;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Area extends org.zkoss.gwt.client.zk.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.wgt.Area();
	}-*/;

	
	public native void setShape(String shape)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setShape(shape);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Area.js line:[24]
	
	public native String getShape()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getShape();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Area.js line:[20]
	
	public native void setCoords(String coords)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setCoords(coords);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Area.js line:[37]
	
	public native String getCoords()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getCoords();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Area.js line:[33]
}
