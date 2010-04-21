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
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/sel//Tree.js line:[27]
	
	public native org.zkoss.gwt.client.zul.sel.Treecols getHeadWidgetClass()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getHeadWidgetClass();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/sel//Tree.js line:[181]
	
	public native Widget[] getItems()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getItems();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/sel//Tree.js line:[202]
	
	public native int getItemCount()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getItemCount();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/sel//Tree.js line:[212]
}
