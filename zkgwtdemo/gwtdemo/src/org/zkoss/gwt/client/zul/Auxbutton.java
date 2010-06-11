package org.zkoss.gwt.client.zul;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Auxbutton extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.Auxbutton();
	}-*/;

	
	public native void $init(org.zkoss.gwt.client.zk.Widget wgt, com.google.gwt.user.client.Element btn, com.google.gwt.user.client.Element ref)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.$init(wgt, btn, ref);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/Auxbutton.js line:[19]
	
	public native void cleanup()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.cleanup();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/Auxbutton.js line:[37]
}
