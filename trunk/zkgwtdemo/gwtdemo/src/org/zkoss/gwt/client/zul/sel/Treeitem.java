package org.zkoss.gwt.client.zul.sel;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Treeitem extends org.zkoss.gwt.client.zul.sel.ItemWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.sel.Treeitem();
	}-*/;

	
	public native void setOpen(boolean open)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setOpen(open);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treeitem.js line:[34]
	
	public native boolean isOpen()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isOpen();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treeitem.js line:[30]
	
	public native boolean isContainer()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isContainer();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treeitem.js line:[92]
	
	public native boolean isEmpty()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isEmpty();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treeitem.js line:[99]
	
	public native int getLevel()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getLevel();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treeitem.js line:[105]
	
	public native String getLabel()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getLabel();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treeitem.js line:[120]
	
	public native void setLabel(String label)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setLabel(label);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treeitem.js line:[128]
	
	public native Treecell getFirstCell()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getFirstCell();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treeitem.js line:[136]
	
	public native String getImage()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getImage();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treeitem.js line:[154]
	
	public native Treeitem setImage(String image)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.setImage(image);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treeitem.js line:[161]
	
	public native Treeitem getParentItem()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getParentItem();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treeitem.js line:[171]
	
	public native Tree getMeshWidget()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMeshWidget();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treeitem.js line:[68]
	
	public native Tree getTree()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTree();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treeitem.js line:[77]
}
