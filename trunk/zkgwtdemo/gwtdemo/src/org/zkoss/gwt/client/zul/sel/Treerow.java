package org.zkoss.gwt.client.zul.sel;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Treerow extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.sel.Treerow();
	}-*/;

	
	public native Tree getTree()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTree();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treerow.js line:[20]
	
	public native int getLevel()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getLevel();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treerow.js line:[26]
	
	public native Treechildren getLinkedTreechildren()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getLinkedTreechildren();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treerow.js line:[32]
	
	public native boolean isVisible()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isVisible();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treerow.js line:[54]
}
