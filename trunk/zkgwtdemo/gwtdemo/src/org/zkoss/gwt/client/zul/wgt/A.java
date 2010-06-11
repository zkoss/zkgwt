package org.zkoss.gwt.client.zul.wgt;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class A extends org.zkoss.gwt.client.zul.LabelImageWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.wgt.A();
	}-*/;

	
	public native void setDisabled(boolean disabled)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setDisabled(disabled);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/A.js line:[32]
	
	public native boolean isDisabled()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isDisabled();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/A.js line:[28]
	
	public native void setDir(String dir)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setDir(dir);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/A.js line:[42]
	
	public native String getDir()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getDir();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/A.js line:[38]
	
	public native void setHref(String href)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setHref(href);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/A.js line:[56]
	
	public native String getHref()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getHref();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/A.js line:[49]
	
	public native void setTarget(String target)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setTarget(target);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/A.js line:[71]
	
	public native String getTarget()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTarget();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/A.js line:[63]
	
	public native void setTabindex(int tabindex)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setTabindex(tabindex);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/A.js line:[82]
	
	public native int getTabindex()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTabindex();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/A.js line:[78]
}
