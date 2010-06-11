package org.zkoss.gwt.client.zul.sel;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Listcell extends org.zkoss.gwt.client.zul.LabelImageWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.sel.Listcell();
	}-*/;

	
	public native void setColspan(int colspan)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setColspan(colspan);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Listcell.js line:[32]
	
	public native int getColspan()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getColspan();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Listcell.js line:[28]
	
	public native Listbox getListbox()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getListbox();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Listcell.js line:[54]
	
	public native int getMaxlength()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMaxlength();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Listcell.js line:[69]
	
	public native Listheader getListheader()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getListheader();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Listcell.js line:[86]
}
