package org.zkoss.gwt.client.zul.mesh;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Frozen extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.mesh.Frozen();
	}-*/;

	
	public native void setColumns(int columns)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setColumns(columns);
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/mesh//Frozen.js line:[28]
	
	public native int getColumns()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getColumns();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/mesh//Frozen.js line:[23]
	
	public native void setStart(int start)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setStart(start);
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/mesh//Frozen.js line:[47]
	
	public native int getStart()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getStart();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/mesh//Frozen.js line:[42]
	
	public native void syncScorll()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.syncScorll();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/mesh//Frozen.js line:[56]
}
