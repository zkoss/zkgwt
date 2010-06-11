package org.zkoss.gwt.client.zul;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Uploader extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.Uploader();
	}-*/;

	
	public native void $init(org.zkoss.gwt.client.zul.Upload upload, String id, com.google.gwt.user.client.Element form, String flnm)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.$init(upload, id, form, flnm);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/Upload.js line:[236]
	
	public native org.zkoss.gwt.client.zk.Widget getWidget()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getWidget();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/Upload.js line:[260]
	
	public native void destroy(boolean finish)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.destroy(finish);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/Upload.js line:[267]
	
	public native void start()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.start();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/Upload.js line:[279]
	
	public native void cancel()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.cancel();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/Upload.js line:[343]
	
	public native boolean update(int sent, int total)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.update(sent, total);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/Upload.js line:[351]
	
	public native void end(boolean finish)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.end(finish);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/Upload.js line:[367]
}
