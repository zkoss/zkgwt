package org.zkoss.gwt.client.zul;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class UploadViewer extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.UploadViewer();
	}-*/;

	
	public native void $init(org.zkoss.gwt.client.zul.Uploader uplder, String flnm)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.$init(uplder, flnm);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/Upload.js line:[508]
	
	public native void update(int sent, int total)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.update(sent, total);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/Upload.js line:[516]
	
	public native void destroy()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.destroy();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/Upload.js line:[529]
}
