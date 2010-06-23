package org.zkoss.gwt.client.zul.sel;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Tree extends org.zkoss.gwt.client.zul.sel.SelectWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.sel.Tree();
	}-*/;

	
	public native void clear()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.clear();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Tree.js line:[27]
	
	public native org.zkoss.gwt.client.zul.sel.Treecols getHeadWidgetClass()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getHeadWidgetClass();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Tree.js line:[183]
	
	public native Widget[] getItems()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getItems();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Tree.js line:[206]
	
	public native int getItemCount()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getItemCount();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Tree.js line:[216]
}
