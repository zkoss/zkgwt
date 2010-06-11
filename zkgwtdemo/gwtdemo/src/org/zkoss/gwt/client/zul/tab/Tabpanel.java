package org.zkoss.gwt.client.zul.tab;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Tabpanel extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.tab.Tabpanel();
	}-*/;

	
	public native Tabbox getTabbox()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTabbox();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tabpanel.js line:[22]
	
	public native Tab getLinkedTab()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getLinkedTab();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tabpanel.js line:[41]
	
	public native int getIndex()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getIndex();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tabpanel.js line:[51]
	
	public native boolean isSelected()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isSelected();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tabpanel.js line:[58]
}
