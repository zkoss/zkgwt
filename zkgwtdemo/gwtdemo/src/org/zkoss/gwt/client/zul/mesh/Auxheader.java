package org.zkoss.gwt.client.zul.mesh;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Auxheader extends org.zkoss.gwt.client.zul.mesh.HeaderWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.mesh.Auxheader();
	}-*/;

	
	public native void setColspan(int colspan)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setColspan(colspan);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/Auxheader.js line:[28]
	
	public native int getColspan()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getColspan();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/Auxheader.js line:[24]
	
	public native void setRowspan(int rowspan)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setRowspan(rowspan);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/Auxheader.js line:[42]
	
	public native int getRowspan()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getRowspan();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/Auxheader.js line:[38]
}
