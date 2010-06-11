package org.zkoss.gwt.client.zul.sel;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Treecol extends org.zkoss.gwt.client.zul.mesh.HeaderWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.sel.Treecol();
	}-*/;

	
	public native void setMaxlength(int maxlength)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMaxlength(maxlength);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treecol.js line:[28]
	
	public native int getMaxlength()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMaxlength();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treecol.js line:[25]
	
	public native Tree getTree()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTree();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Treecol.js line:[20]
}
