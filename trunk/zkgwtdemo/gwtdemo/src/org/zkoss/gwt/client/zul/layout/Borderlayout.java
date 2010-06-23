package org.zkoss.gwt.client.zul.layout;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Borderlayout extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.layout.Borderlayout();
	}-*/;

	
	public native void resize()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.resize();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/layout/Borderlayout.js line:[120]
}
