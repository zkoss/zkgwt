package org.zkoss.gwt.client.zul.wgt;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Include extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.wgt.Include();
	}-*/;

	
	public native void setContent(String content)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setContent(content);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Include.js line:[26]
	
	public native String getContent()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getContent();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Include.js line:[22]
	
	public native void setComment(boolean comment)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setComment(comment);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Include.js line:[44]
	
	public native boolean isComment()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isComment();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Include.js line:[38]
}
