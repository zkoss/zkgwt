package org.zkoss.gwt.client.zul.utl;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Iframe extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.utl.Iframe();
	}-*/;

	
	public native void setScrolling(String scrolling)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setScrolling(scrolling);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/utl/Iframe.js line:[39]
	
	public native String getScrolling()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getScrolling();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/utl/Iframe.js line:[34]
	
	public native void setAlign(String align)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setAlign(align);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/utl/Iframe.js line:[58]
	
	public native String getAlign()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getAlign();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/utl/Iframe.js line:[54]
	
	public native void setName(String name)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setName(name);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/utl/Iframe.js line:[70]
	
	public native String getName()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getName();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/utl/Iframe.js line:[66]
	
	public native void setAutohide(boolean autohide)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setAutohide(autohide);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/utl/Iframe.js line:[91]
	
	public native boolean isAutohide()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isAutohide();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/utl/Iframe.js line:[77]
}
