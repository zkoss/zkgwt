package org.zkoss.gwt.client.zul.sel;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class ItemWidget extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.sel.ItemWidget();
	}-*/;

	
	public native void setCheckable(boolean checkable)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setCheckable(checkable);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/ItemWidget.js line:[25]
	
	public native boolean isCheckable()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isCheckable();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/ItemWidget.js line:[21]
	
	public native void setDisabled(boolean disabled)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setDisabled(disabled);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/ItemWidget.js line:[37]
	
	public native boolean isDisabled()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isDisabled();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/ItemWidget.js line:[33]
	
	public native void setValue(String value)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setValue(value);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/ItemWidget.js line:[53]
	
	public native String getValue()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getValue();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/ItemWidget.js line:[44]
	
	public native void setSelected(boolean selected)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSelected(selected);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/ItemWidget.js line:[63]
	
	public native String getLabel()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getLabel();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/ItemWidget.js line:[83]
	
	public native boolean isSelected()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isSelected();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/ItemWidget.js line:[90]
	
	public native org.zkoss.gwt.client.zul.mesh.MeshWidget getMeshWidget()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMeshWidget();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/sel/ItemWidget.js line:[105]
}
