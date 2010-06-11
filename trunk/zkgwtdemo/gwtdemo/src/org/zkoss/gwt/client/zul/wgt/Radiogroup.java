package org.zkoss.gwt.client.zul.wgt;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Radiogroup extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.wgt.Radiogroup();
	}-*/;

	
	public native void setOrient(String orient)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setOrient(orient);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Radiogroup.js line:[32]
	
	public native String getOrient()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getOrient();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Radiogroup.js line:[28]
	
	public native void setName(String name)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setName(name);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Radiogroup.js line:[45]
	
	public native String getName()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getName();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Radiogroup.js line:[38]
	
	public native Radio getItemAtIndex(int index)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getItemAtIndex(index);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Radiogroup.js line:[56]
	
	public native int getItemCount()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getItemCount();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Radiogroup.js line:[65]
	
	public native Widget[] getItems()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getItems();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Radiogroup.js line:[71]
	
	public native int getSelectedIndex()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSelectedIndex();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Radiogroup.js line:[77]
	
	public native void setSelectedIndex(int selectedIndex)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSelectedIndex(selectedIndex);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Radiogroup.js line:[83]
	
	public native Radio getSelectedItem()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSelectedItem();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Radiogroup.js line:[97]
	
	public native void setSelectedItem(Radio selectedItem)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSelectedItem(selectedItem);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Radiogroup.js line:[103]
	
	public native Radio removeItemAt(int index)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.removeItemAt(index);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Radiogroup.js line:[120]
	
	public native void fixSelectedIndex()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.fixSelectedIndex();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Radiogroup.js line:[131]
}
