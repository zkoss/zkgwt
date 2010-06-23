package org.zkoss.gwt.client.zk;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Macro extends org.zkoss.gwt.client.zk.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zk.Macro();
	}-*/;

	
	public native void setEnclosingTag(String tag)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setEnclosingTag(tag);
	}-*/; //I:/svn/zk5_sf/zk/src/archive/web/js/zk/widget.js line:[4512]
	
	public native String getEnclosingTag()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getEnclosingTag();
	}-*/; //I:/svn/zk5_sf/zk/src/archive/web/js/zk/widget.js line:[4507]
	
	public native void redraw(Widget[] out)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.redraw(out);
	}-*/; //I:/svn/zk5_sf/zk/src/archive/web/js/zk/widget.js line:[4521]
}
