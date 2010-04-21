package org.zkoss.gwt.client.zkex.grid;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Detail extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zkex.grid.Detail();
	}-*/;

	
	public native void setOpen(boolean open)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setOpen(open);
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/grid//Detail.js line:[42]
	
	public native boolean isOpen()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isOpen();
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/grid//Detail.js line:[39]
	
	public native void setContentStyle(String style)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setContentStyle(style);
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/grid//Detail.js line:[51]
	
	public native String getContentStyle()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getContentStyle();
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/grid//Detail.js line:[48]
	
	public native void setContentSclass(String scls)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setContentSclass(scls);
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/grid//Detail.js line:[64]
	
	public native String getContentSclass()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getContentSclass();
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/grid//Detail.js line:[61]
	
	public native void onStripe(org.zkoss.gwt.client.zk.Event evt)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.onStripe(evt);
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/grid//Detail.js line:[97]
	
	public native void open(boolean open, boolean silent)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.open(open, silent);
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/grid//Detail.js line:[114]
}
