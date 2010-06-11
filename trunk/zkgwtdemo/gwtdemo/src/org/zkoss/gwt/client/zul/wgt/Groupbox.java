package org.zkoss.gwt.client.zul.wgt;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Groupbox extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.wgt.Groupbox();
	}-*/;

	
	public native void setOpen(boolean open)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setOpen(open);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Groupbox.js line:[32]
	
	public native boolean isOpen()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isOpen();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Groupbox.js line:[28]
	
	public native void setClosable(boolean closable)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setClosable(closable);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Groupbox.js line:[56]
	
	public native boolean isClosable()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isClosable();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Groupbox.js line:[49]
	
	public native void setContentStyle(String contentStyle)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setContentStyle(contentStyle);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Groupbox.js line:[66]
	
	public native String getContentStyle()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getContentStyle();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Groupbox.js line:[62]
	
	public native void setContentSclass(String contentSclass)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setContentSclass(contentSclass);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Groupbox.js line:[77]
	
	public native String getContentSclass()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getContentSclass();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Groupbox.js line:[73]
	
	public native boolean isLegend()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isLegend();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Groupbox.js line:[82]
}
