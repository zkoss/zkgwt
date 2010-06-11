package org.zkoss.gwt.client.zul.sel;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Listfooter extends org.zkoss.gwt.client.zul.LabelImageWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.sel.Listfooter();
	}-*/;

	
	public native void setSpan(int span)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSpan(span);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Listfooter.js line:[31]
	
	public native int getSpan()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSpan();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Listfooter.js line:[27]
	
	public native Listbox getListbox()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getListbox();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Listfooter.js line:[41]
	
	public native Listheader getListheader()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getListheader();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Listfooter.js line:[47]
}
