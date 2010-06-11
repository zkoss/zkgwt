package org.zkoss.gwt.client.zkex.sel;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Listgroup extends org.zkoss.gwt.client.zul.sel.Listitem{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zkex.sel.Listgroup();
	}-*/;

	
	public native void setOpen(boolean open)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setOpen(open);
	}-*/; //I:/svn/zk5_sf/zkex/src/archive/web/js/zkex/sel/Listgroup.js line:[38]
	
	public native boolean isOpen()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isOpen();
	}-*/; //I:/svn/zk5_sf/zkex/src/archive/web/js/zkex/sel/Listgroup.js line:[34]
	
	public native Widget[] getItems()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getItems();
	}-*/; //I:/svn/zk5_sf/zkex/src/archive/web/js/zkex/sel/Listgroup.js line:[48]
	
	public native int getItemCount()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getItemCount();
	}-*/; //I:/svn/zk5_sf/zkex/src/archive/web/js/zkex/sel/Listgroup.js line:[58]
	
	public native String getLabel()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getLabel();
	}-*/; //I:/svn/zk5_sf/zkex/src/archive/web/js/zkex/sel/Listgroup.js line:[67]
}
