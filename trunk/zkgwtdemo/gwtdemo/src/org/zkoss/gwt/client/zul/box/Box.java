package org.zkoss.gwt.client.zul.box;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Box extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.box.Box();
	}-*/;

	
	public native String getAlign()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getAlign();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/box/Box.js line:[120]
	
	public native void setAlign(String align)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setAlign(align);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/box/Box.js line:[112]
	
	public native String getPack()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getPack();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/box/Box.js line:[162]
	
	public native void setPack(String pack)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setPack(pack);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/box/Box.js line:[155]
	
	public native String getSpacing()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSpacing();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/box/Box.js line:[211]
	
	public native void setSpacing(String spacing)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSpacing(spacing);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/box/Box.js line:[206]
	
	public native boolean isVertical()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isVertical();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/box/Box.js line:[238]
	
	public native String getOrient()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getOrient();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/box/Box.js line:[244]
}
