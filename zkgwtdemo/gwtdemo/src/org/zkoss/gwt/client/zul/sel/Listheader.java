package org.zkoss.gwt.client.zul.sel;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Listheader extends org.zkoss.gwt.client.zul.mesh.SortWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.sel.Listheader();
	}-*/;

	
	public native void setMaxlength(int maxlength)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMaxlength(maxlength);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Listheader.js line:[42]
	
	public native int getMaxlength()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMaxlength();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Listheader.js line:[38]
	
	public native Listbox getListbox()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getListbox();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Listheader.js line:[28]
	
	public native Listbox getMeshBody()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMeshBody();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Listheader.js line:[32]
}
