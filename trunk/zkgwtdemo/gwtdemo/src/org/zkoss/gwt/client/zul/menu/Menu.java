package org.zkoss.gwt.client.zul.menu;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Menu extends org.zkoss.gwt.client.zul.LabelImageWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.menu.Menu();
	}-*/;

	
	public native void setContent(String content)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setContent(content);
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/menu//Menu.js line:[31]
	
	public native String getContent()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getContent();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/menu//Menu.js line:[25]
	
	public native boolean isTopmost()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isTopmost();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/menu//Menu.js line:[67]
	
	public native org.zkoss.gwt.client.zul.menu.Menubar getMenubar()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMenubar();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/menu//Menu.js line:[103]
}
