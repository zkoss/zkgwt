package org.zkoss.gwt.client.zul.sel;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class SelectWidget extends org.zkoss.gwt.client.zul.mesh.MeshWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.sel.SelectWidget();
	}-*/;

	
	public native void setRows(int rows)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setRows(rows);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[64]
	
	public native int getRows()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getRows();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[58]
	
	public native void setCheckmark(boolean checkmark)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setCheckmark(checkmark);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[84]
	
	public native boolean isCheckmark()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isCheckmark();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[78]
	
	public native void setMultiple(boolean multiple)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMultiple(multiple);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[101]
	
	public native boolean isMultiple()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isMultiple();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[95]
	
	public native void setSelectedIndex(int selectedIndex)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSelectedIndex(selectedIndex);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[139]
	
	public native int getSelectedIndex()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSelectedIndex();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[135]
	
	public native void setName(String name)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setName(name);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[176]
	
	public native String getName()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getName();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[163]
	
	public native void setSelectedItem(ItemWidget item)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSelectedItem(item);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[212]
	
	public native ItemWidget getSelectedItem()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSelectedItem();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[226]
	
	public native Widget[] getSelectedItems()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSelectedItems();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[233]
	
	public native int indexOfItem(ItemWidget item)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.indexOfItem(item);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[508]
	
	public native void selectItem(ItemWidget item)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.selectItem(item);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[525]
	
	public native void clearSelection()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.clearSelection();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[563]
}
