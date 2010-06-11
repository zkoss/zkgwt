package org.zkoss.gwt.client.zul.sel;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Treefooter extends org.zkoss.gwt.client.zul.LabelImageWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.sel.Treefooter();
	}-*/;

	
	public native void setSpan(int span)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSpan(span);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treefooter.js line:[31]
	
	public native int getSpan()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSpan();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treefooter.js line:[27]
	
	public native Tree getTree()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTree();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treefooter.js line:[40]
	
	public native Treecol getTreecol()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTreecol();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treefooter.js line:[46]
}
