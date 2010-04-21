package org.zkoss.gwt.client.zkex.grid;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Group extends org.zkoss.gwt.client.zul.grid.Row{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zkex.grid.Group();
	}-*/;

	
	public native void setOpen(boolean open)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setOpen(open);
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/grid//Group.js line:[33]
	
	public native boolean isOpen()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isOpen();
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/grid//Group.js line:[29]
	
	public native Widget[] getItems()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getItems();
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/grid//Group.js line:[42]
	
	public native int getItemCount()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getItemCount();
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/grid//Group.js line:[51]
	
	public native org.zkoss.gwt.client.zul.wgt.Label getLabel()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getLabel();
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkex/src/archive/web/js/zkex/grid//Group.js line:[60]
}
