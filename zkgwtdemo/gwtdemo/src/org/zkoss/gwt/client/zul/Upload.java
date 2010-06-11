package org.zkoss.gwt.client.zul;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Upload extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.Upload();
	}-*/;

	
	public native void $init(org.zkoss.gwt.client.zk.Widget wgt, com.google.gwt.user.client.Element parent, String clsnm)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.$init(wgt, parent, clsnm);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/Upload.js line:[60]
	
	public native void sync()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.sync();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/Upload.js line:[75]
	
	public native void destroy()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.destroy();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/Upload.js line:[116]
	
	public native String getKey()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getKey();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/Upload.js line:[130]
	
	public native void cancel(int sid)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.cancel(sid);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/Upload.js line:[137]
	
	public native void finish(int sid)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.finish(sid);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/Upload.js line:[144]
}
