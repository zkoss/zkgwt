package org.zkoss.gwt.client.zul.tab;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Tabs extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.tab.Tabs();
	}-*/;

	
	public native Tabbox getTabbox()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTabbox();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tabs.js line:[23]
}
