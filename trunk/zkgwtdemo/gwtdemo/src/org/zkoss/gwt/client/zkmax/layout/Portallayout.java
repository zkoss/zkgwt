package org.zkoss.gwt.client.zkmax.layout;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Portallayout extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zkmax.layout.Portallayout();
	}-*/;

	
	public native void setMaximizedMode(String mode)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMaximizedMode(mode);
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkmax/src/archive/web/js/zkmax/layout//Portallayout.js line:[40]
	
	public native String getMaximizedMode()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMaximizedMode();
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkmax/src/archive/web/js/zkmax/layout//Portallayout.js line:[35]
	
	public native org.zkoss.gwt.client.zul.wnd.Panel getPanel(int col, int row)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getPanel(col, row);
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkmax/src/archive/web/js/zkmax/layout//Portallayout.js line:[238]
	
	public native boolean setPanel(org.zkoss.gwt.client.zul.wnd.Panel panel, int col, int row)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.setPanel(panel, col, row);
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkmax/src/archive/web/js/zkmax/layout//Portallayout.js line:[252]
	
	public native Widget[] getPosition(org.zkoss.gwt.client.zul.wnd.Panel panel)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getPosition(panel);
	}-*/; //D:/svn_workingcopy/zkcml/releases/5.0.1/zkmax/src/archive/web/js/zkmax/layout//Portallayout.js line:[268]
}
