package org.zkoss.gwt.client.zul.wgt;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Button extends org.zkoss.gwt.client.zul.LabelImageWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.wgt.Button();
	}-*/;

	
	public native void setHref(String href)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setHref(href);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Button.js line:[55]
	
	public native String getHref()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getHref();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Button.js line:[48]
	
	public native void setTarget(String target)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setTarget(target);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Button.js line:[67]
	
	public native String getTarget()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTarget();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Button.js line:[59]
	
	public native void setDir(String dir)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setDir(dir);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Button.js line:[75]
	
	public native String getDir()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getDir();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Button.js line:[71]
	
	public native void setOrient(String orient)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setOrient(orient);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Button.js line:[85]
	
	public native String getOrient()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getOrient();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Button.js line:[81]
	
	public native void setDisabled(boolean disabled)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setDisabled(disabled);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Button.js line:[93]
	
	public native boolean isDisabled()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isDisabled();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Button.js line:[89]
	
	public native void setTabindex(int tabindex)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setTabindex(tabindex);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Button.js line:[117]
	
	public native int getTabindex()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTabindex();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Button.js line:[113]
	
	public native void setAutodisable(String autodisable)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setAutodisable(autodisable);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Button.js line:[162]
	
	public native String getAutodisable()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getAutodisable();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Button.js line:[124]
	
	public native void setUpload(String upload)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setUpload(upload);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Button.js line:[170]
	
	public native String getUpload()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getUpload();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Button.js line:[166]
}
