package org.zkoss.gwt.client.zul.inp;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class ComboWidget extends org.zkoss.gwt.client.zul.inp.InputWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.inp.ComboWidget();
	}-*/;

	
	public native void setButtonVisible(boolean visible)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setButtonVisible(visible);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/ComboWidget.js line:[26]
	
	public native boolean isButtonVisible()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isButtonVisible();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/ComboWidget.js line:[22]
	
	public native void setAutodrop(boolean autodrop)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setAutodrop(autodrop);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/ComboWidget.js line:[56]
	
	public native boolean isAutodrop()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isAutodrop();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/ComboWidget.js line:[51]
	
	public native void setOpen(boolean open, Map opts)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setOpen(open, opts);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/ComboWidget.js line:[114]
	
	public native boolean isOpen()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isOpen();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/ComboWidget.js line:[124]
	
	public native void open(Map opts)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.open(opts);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/ComboWidget.js line:[130]
	
	public native void close(Map opts)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.close(opts);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/ComboWidget.js line:[211]
	
	public native void syncWidth()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.syncWidth();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/ComboWidget.js line:[337]
}
