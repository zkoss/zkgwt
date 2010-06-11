package org.zkoss.gwt.client.zul.inp;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Timebox extends org.zkoss.gwt.client.zul.inp.FormatWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.inp.Timebox();
	}-*/;

	
	public native void setButtonVisible(boolean buttonVisible)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setButtonVisible(buttonVisible);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Timebox.js line:[65]
	
	public native boolean isButtonVisible()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isButtonVisible();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Timebox.js line:[61]
	
	public native String getRawText()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getRawText();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Timebox.js line:[111]
	
	public native void syncWidth()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.syncWidth();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Timebox.js line:[626]
}
