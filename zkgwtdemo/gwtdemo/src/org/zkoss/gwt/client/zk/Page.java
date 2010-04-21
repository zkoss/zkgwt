package org.zkoss.gwt.client.zk;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Page extends org.zkoss.gwt.client.zk.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zk.Page();
	}-*/;

	
	public native void $init(Map props, boolean contained)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.$init(props, contained);
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zk/src/archive/web/js/zk//widget.js line:[3957]
	
	public native void redraw(Widget[] out)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.redraw(out);
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zk/src/archive/web/js/zk//widget.js line:[3971]
}
