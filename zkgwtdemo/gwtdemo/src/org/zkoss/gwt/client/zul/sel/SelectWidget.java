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
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[63]
	
	public native int getRows()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getRows();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[57]
	
	public native void setCheckmark(boolean checkmark)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setCheckmark(checkmark);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[83]
	
	public native boolean isCheckmark()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isCheckmark();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[77]
	
	public native void setMultiple(boolean multiple)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMultiple(multiple);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[100]
	
	public native boolean isMultiple()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isMultiple();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[94]
	
	public native void setSelectedIndex(int selectedIndex)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSelectedIndex(selectedIndex);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[138]
	
	public native int getSelectedIndex()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSelectedIndex();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[134]
	
	public native void setName(String name)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setName(name);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[175]
	
	public native String getName()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getName();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[162]
	
	public native void setSelectedItem(ItemWidget item)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSelectedItem(item);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[211]
	
	public native ItemWidget getSelectedItem()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSelectedItem();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[225]
	
	public native Widget[] getSelectedItems()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSelectedItems();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[232]
	
	public native int indexOfItem(ItemWidget item)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.indexOfItem(item);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[499]
	
	public native void selectItem(ItemWidget item)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.selectItem(item);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[516]
	
	public native void clearSelection()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.clearSelection();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/SelectWidget.js line:[554]
}
