package org.zkoss.gwt.client.zul.sel;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Treecell extends org.zkoss.gwt.client.zul.LabelImageWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.sel.Treecell();
	}-*/;

	
	public native void setColspan(int colspan)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setColspan(colspan);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treecell.js line:[39]
	
	public native int getColspan()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getColspan();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treecell.js line:[35]
	
	public native Tree getTree()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTree();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treecell.js line:[52]
	
	public native Treecol getTreecol()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTreecol();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treecell.js line:[64]
	
	public native int getLevel()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getLevel();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treecell.js line:[76]
	
	public native int getMaxlength()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMaxlength();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treecell.js line:[82]
	
	public native void setWidth()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setWidth();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treecell.js line:[25]
}
