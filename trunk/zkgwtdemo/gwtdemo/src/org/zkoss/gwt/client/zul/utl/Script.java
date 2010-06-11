package org.zkoss.gwt.client.zul.utl;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Script extends org.zkoss.gwt.client.zk.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.utl.Script();
	}-*/;

	
	public native void setContent(String content)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setContent(content);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/utl/Script.js line:[29]
	
	public native String getContent()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getContent();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/utl/Script.js line:[22]
	
	public native void setSrc(String src)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSrc(src);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/utl/Script.js line:[46]
	
	public native String getSrc()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSrc();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/utl/Script.js line:[42]
	
	public native void setCharset(String charset)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setCharset(charset);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/utl/Script.js line:[68]
	
	public native String getCharset()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getCharset();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/utl/Script.js line:[62]
}
