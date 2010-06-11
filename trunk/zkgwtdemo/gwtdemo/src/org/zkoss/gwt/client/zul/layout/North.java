package org.zkoss.gwt.client.zul.layout;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class North extends org.zkoss.gwt.client.zul.layout.LayoutRegion{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.layout.North();
	}-*/;

	
	public native String getPosition()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getPosition();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/North.js line:[28]
	
	public native void setWidth(String width)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setWidth(width);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/North.js line:[21]
	
	public native String getSize()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSize();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/North.js line:[35]
	
	public native void setSize(String size)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSize(size);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/North.js line:[41]
}
