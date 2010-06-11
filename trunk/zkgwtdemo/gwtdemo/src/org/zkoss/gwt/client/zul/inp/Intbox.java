package org.zkoss.gwt.client.zul.inp;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Intbox extends org.zkoss.gwt.client.zul.inp.FormatWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.inp.Intbox();
	}-*/;

	
	public native int intValue()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.intValue();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Intbox.js line:[21]
}
