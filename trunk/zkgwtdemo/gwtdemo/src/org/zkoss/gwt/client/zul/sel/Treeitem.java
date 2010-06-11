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
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treeitem.js line:[93]
	
	public native boolean isEmpty()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isEmpty();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treeitem.js line:[100]
	
	public native int getLevel()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getLevel();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treeitem.js line:[106]
	
	public native String getLabel()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getLabel();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treeitem.js line:[121]
	
	public native void setLabel(String label)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setLabel(label);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treeitem.js line:[129]
	
	public native Treecell getFirstCell()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getFirstCell();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treeitem.js line:[137]
	
	public native String getImage()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getImage();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treeitem.js line:[155]
	
	public native Treeitem setImage(String image)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.setImage(image);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treeitem.js line:[162]
	
	public native Treeitem getParentItem()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getParentItem();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treeitem.js line:[172]
	
	public native Tree getMeshWidget()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMeshWidget();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treeitem.js line:[69]
	
	public native Tree getTree()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTree();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treeitem.js line:[78]
}
