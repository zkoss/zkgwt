package org.zkoss.gwt.client.zul.wgt;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Progressmeter extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.wgt.Progressmeter();
	}-*/;

	
	public native void setValue(int value)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setValue(value);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Progressmeter.js line:[27]
	
	public native int getValue()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getValue();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Progressmeter.js line:[24]
}
