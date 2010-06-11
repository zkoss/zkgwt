package org.zkoss.gwt.client.zul.inp;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class FormatWidget extends org.zkoss.gwt.client.zul.inp.InputWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.inp.FormatWidget();
	}-*/;

	
	public native void setFormat(String format)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setFormat(format);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/FormatWidget.js line:[24]
	
	public native String getFormat()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getFormat();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/FormatWidget.js line:[20]
}
