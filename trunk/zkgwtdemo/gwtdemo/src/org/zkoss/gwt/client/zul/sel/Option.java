package org.zkoss.gwt.client.zul.sel;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Option extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.sel.Option();
	}-*/;

	
	public native void setDisabled(boolean disabled)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setDisabled(disabled);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Option.js line:[26]
	
	public native boolean isDisabled()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isDisabled();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Option.js line:[20]
	
	public native void setValue(String value)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setValue(value);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Option.js line:[43]
	
	public native String getValue()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getValue();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Option.js line:[34]
	
	public native void setSelected(boolean selected)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSelected(selected);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Option.js line:[60]
	
	public native boolean isSelected()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isSelected();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Option.js line:[75]
	
	public native String getLabel()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getLabel();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Option.js line:[82]
	
	public native int getMaxlength()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMaxlength();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/Option.js line:[89]
}
