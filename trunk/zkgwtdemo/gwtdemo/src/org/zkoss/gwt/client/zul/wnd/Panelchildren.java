package org.zkoss.gwt.client.zul.wnd;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Panelchildren extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.wnd.Panelchildren();
	}-*/;

	
	public native void setHeight(String height)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setHeight(height);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panelchildren.js line:[24]
	
	public native void setWidth(String width)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setWidth(width);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wnd/Panelchildren.js line:[29]
}
