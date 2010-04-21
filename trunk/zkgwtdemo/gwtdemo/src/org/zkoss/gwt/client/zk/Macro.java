package org.zkoss.gwt.client.zk;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Macro extends org.zkoss.gwt.client.zk.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zk.Macro();
	}-*/;

	
	public native void redraw(Widget[] out)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.redraw(out);
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zk/src/archive/web/js/zk//widget.js line:[4036]
}
