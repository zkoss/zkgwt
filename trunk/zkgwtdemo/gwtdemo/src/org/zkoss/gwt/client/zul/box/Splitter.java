package org.zkoss.gwt.client.zul.box;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Splitter extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.box.Splitter();
	}-*/;

	
	public native boolean isOpen()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isOpen();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/box/Splitter.js line:[42]
	
	public native void setOpen(boolean open, int[] opts)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setOpen(open, opts);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/box/Splitter.js line:[37]
	
	public native boolean isVertical()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isVertical();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/box/Splitter.js line:[101]
	
	public native String getOrient()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getOrient();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/box/Splitter.js line:[108]
	
	public native String getCollapse()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getCollapse();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/box/Splitter.js line:[117]
	
	public native void setCollapse(String collapse)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setCollapse(collapse);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/box/Splitter.js line:[123]
}
