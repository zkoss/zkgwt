package org.zkoss.gwt.client.zul.wgt;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Toolbarbutton extends org.zkoss.gwt.client.zul.LabelImageWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.wgt.Toolbarbutton();
	}-*/;

	
	public native void setDisabled(boolean disabled)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setDisabled(disabled);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Toolbarbutton.js line:[34]
	
	public native boolean isDisabled()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isDisabled();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Toolbarbutton.js line:[30]
	
	public native void setHref(String href)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setHref(href);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Toolbarbutton.js line:[47]
	
	public native String getHref()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getHref();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Toolbarbutton.js line:[40]
	
	public native void setTarget(String target)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setTarget(target);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Toolbarbutton.js line:[59]
	
	public native String getTarget()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTarget();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Toolbarbutton.js line:[51]
	
	public native void setDir(String dir)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setDir(dir);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Toolbarbutton.js line:[67]
	
	public native String getDir()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getDir();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Toolbarbutton.js line:[63]
	
	public native void setOrient(String orient)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setOrient(orient);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Toolbarbutton.js line:[77]
	
	public native String getOrient()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getOrient();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Toolbarbutton.js line:[73]
	
	public native void setTabindex(int tabindex)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setTabindex(tabindex);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Toolbarbutton.js line:[85]
	
	public native int getTabindex()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTabindex();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Toolbarbutton.js line:[81]
	
	public native void setUpload(String upload)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setUpload(upload);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Toolbarbutton.js line:[96]
	
	public native String getUpload()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getUpload();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Toolbarbutton.js line:[92]
}
