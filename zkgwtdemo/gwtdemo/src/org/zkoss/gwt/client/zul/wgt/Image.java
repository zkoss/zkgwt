package org.zkoss.gwt.client.zul.wgt;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Image extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.wgt.Image();
	}-*/;

	
	public native void setSrc(String src)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSrc(src);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Image.js line:[26]
	
	public native String getSrc()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSrc();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Image.js line:[22]
	
	public native void setHover(String hover)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setHover(hover);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Image.js line:[38]
	
	public native String getHover()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getHover();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Image.js line:[33]
	
	public native void setAlign(String align)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setAlign(align);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Image.js line:[47]
	
	public native String getAlign()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getAlign();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Image.js line:[43]
	
	public native void setBorder(String border)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setBorder(border);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Image.js line:[59]
	
	public native String getBorder()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getBorder();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Image.js line:[55]
	
	public native void setHspace(String hspace)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setHspace(hspace);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Image.js line:[71]
	
	public native String getHspace()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getHspace();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Image.js line:[66]
	
	public native void setVspace(String vspace)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setVspace(vspace);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Image.js line:[84]
	
	public native String getVspace()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getVspace();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Image.js line:[79]
	
	public native com.google.gwt.user.client.Element getImageNode()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getImageNode();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Image.js line:[93]
}
