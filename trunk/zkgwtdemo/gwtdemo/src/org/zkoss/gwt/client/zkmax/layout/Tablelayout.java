package org.zkoss.gwt.client.zkmax.layout;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Tablelayout extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zkmax.layout.Tablelayout();
	}-*/;

	
	public native void setColumns(int columns)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setColumns(columns);
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkmax/src/archive/web/js/zkmax/layout//Tablelayout.js line:[29]
	
	public native int getColumns()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getColumns();
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkmax/src/archive/web/js/zkmax/layout//Tablelayout.js line:[25]
}
