package org.zkoss.gwt.client.zul.sel;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Treechildren extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.sel.Treechildren();
	}-*/;

	
	public native Tree getTree()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTree();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treechildren.js line:[19]
	
	public native Treerow getLinkedTreerow()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getLinkedTreerow();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treechildren.js line:[27]
	
	public native Widget[] getItems(Widget[] items)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getItems(items);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treechildren.js line:[112]
	
	public native int getItemCount()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getItemCount();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treechildren.js line:[129]
}
