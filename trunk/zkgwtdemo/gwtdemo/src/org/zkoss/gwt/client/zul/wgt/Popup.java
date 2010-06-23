package org.zkoss.gwt.client.zul.wgt;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Popup extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.wgt.Popup();
	}-*/;

	
	public native boolean isOpen()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isOpen();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Popup.js line:[26]
	
	public native void open(org.zkoss.gwt.client.zk.Widget ref, int[] offset, String position, Map opts)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.open(ref, offset, position, opts);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Popup.js line:[33]
	
	public native void position(org.zkoss.gwt.client.zk.Widget ref, int[] offset, String position, Map opts)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.position(ref, offset, position, opts);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Popup.js line:[114]
	
	public native void close(Map opts)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.close(opts);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Popup.js line:[157]
}
