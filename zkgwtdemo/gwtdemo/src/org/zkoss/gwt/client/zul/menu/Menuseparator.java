package org.zkoss.gwt.client.zul.menu;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Menuseparator extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.menu.Menuseparator();
	}-*/;

	
	public native boolean isPopup()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isPopup();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/menu/Menuseparator.js line:[21]
	
	public native org.zkoss.gwt.client.zul.menu.Menubar getMenubar()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMenubar();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/menu/Menuseparator.js line:[27]
}
