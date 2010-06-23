package org.zkoss.gwt.client.zul.sel;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Listbox extends org.zkoss.gwt.client.zul.sel.SelectWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.sel.Listbox();
	}-*/;

	
	public native int getGroupCount()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getGroupCount();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Listbox.js line:[46]
	
	public native Widget[] getGroups()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getGroups();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Listbox.js line:[53]
	
	public native boolean hasGroup()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.hasGroup();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Listbox.js line:[60]
	
	public native Listitem nextItem(org.zkoss.gwt.client.zk.Widget item)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.nextItem(item);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Listbox.js line:[67]
	
	public native Listitem previousItem(org.zkoss.gwt.client.zk.Widget item)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.previousItem(item);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Listbox.js line:[79]
	
	public native String getOddRowSclass()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getOddRowSclass();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Listbox.js line:[91]
	
	public native Listbox setOddRowSclass(String oddRowSclass)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.setOddRowSclass(oddRowSclass);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Listbox.js line:[100]
	
	public native boolean inSelectMold()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.inSelectMold();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Listbox.js line:[117]
	
	public native Listbox stripe()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.stripe();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Listbox.js line:[146]
	
	public native org.zkoss.gwt.client.zul.sel.Listhead getHeadWidgetClass()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getHeadWidgetClass();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Listbox.js line:[277]
}
