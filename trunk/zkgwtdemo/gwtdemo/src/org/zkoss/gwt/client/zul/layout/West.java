package org.zkoss.gwt.client.zul.layout;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class West extends org.zkoss.gwt.client.zul.layout.LayoutRegion{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.layout.West();
	}-*/;

	
	public native String getPosition()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getPosition();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/West.js line:[37]
	
	public native void setHeight(String height)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setHeight(height);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/West.js line:[25]
	
	public native String getSize()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSize();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/West.js line:[44]
	
	public native void setSize(String size)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSize(size);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/West.js line:[50]
}
