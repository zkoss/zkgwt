package org.zkoss.gwt.client.zul.sel;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Listitem extends org.zkoss.gwt.client.zul.sel.ItemWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.sel.Listitem();
	}-*/;

	
	public native org.zkoss.gwt.client.zkex.sel.Listgroup getListgroup()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getListgroup();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Listitem.js line:[30]
	
	public native void setLabel(String label)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setLabel(label);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Listitem.js line:[42]
	
	public native void setImage(String image)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setImage(image);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Listitem.js line:[50]
	
	public native Listbox getListbox()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getListbox();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Listitem.js line:[26]
}
