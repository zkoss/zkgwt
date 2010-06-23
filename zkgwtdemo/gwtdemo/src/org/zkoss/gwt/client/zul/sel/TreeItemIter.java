package org.zkoss.gwt.client.zul.sel;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class TreeItemIter extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.sel.TreeItemIter();
	}-*/;

	
	public native void $init(Tree tree)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.$init(tree);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Tree.js line:[250]
	
	public native boolean hasNext()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.hasNext();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Tree.js line:[264]
	
	public native Treeitem next()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.next();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Tree.js line:[272]
}
