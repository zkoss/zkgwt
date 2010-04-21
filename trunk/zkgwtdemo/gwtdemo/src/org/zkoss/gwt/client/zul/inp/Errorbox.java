package org.zkoss.gwt.client.zul.inp;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Errorbox extends org.zkoss.gwt.client.zul.wgt.Popup{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.inp.Errorbox();
	}-*/;

	
	public native void show(org.zkoss.gwt.client.zk.Widget owner, String msg)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.show(owner, msg);
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/inp//Errorbox.js line:[24]
	
	public native void destroy()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.destroy();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/inp//Errorbox.js line:[37]
	
	public native void onScroll(org.zkoss.gwt.client.zk.Widget wgt)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.onScroll(wgt);
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/inp//Errorbox.js line:[80]
}
