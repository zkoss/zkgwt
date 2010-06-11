package org.zkoss.gwt.client.zul.wgt;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Caption extends org.zkoss.gwt.client.zul.LabelImageWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.wgt.Caption();
	}-*/;

	
	public native void isCollapsibleVisible()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.isCollapsibleVisible();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Caption.js line:[53]
	
	public native void isCloseVisible()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.isCloseVisible();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Caption.js line:[58]
	
	public native void isMinimizeVisible()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.isMinimizeVisible();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Caption.js line:[63]
	
	public native void isMaximizeVisible()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.isMaximizeVisible();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Caption.js line:[68]
}
