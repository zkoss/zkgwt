package org.zkoss.gwt.client.zul;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class UploadManager extends org.zkoss.gwt.client.zul.wgt.Popup{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.UploadManager();
	}-*/;

	
	public native org.zkoss.gwt.client.zul.wgt.Div getFileItem(String id)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getFileItem(id);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/Upload.js line:[409]
	
	public native org.zkoss.gwt.client.zul.wgt.Div addFile(org.zkoss.gwt.client.zul.Uploader uplder)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.addFile(uplder);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/Upload.js line:[417]
	
	public native void updateFile(org.zkoss.gwt.client.zul.Uploader uplder, int val, int total)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.updateFile(uplder, val, total);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/Upload.js line:[458]
	
	public native void removeFile(org.zkoss.gwt.client.zul.Uploader uplder)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.removeFile(uplder);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/Upload.js line:[471]
	
	public native void open(org.zkoss.gwt.client.zk.Widget wgt, String position)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.open(wgt, position);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/Upload.js line:[489]
}
