package org.zkoss.gwt.client.zul.wgt;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Radio extends org.zkoss.gwt.client.zul.wgt.Checkbox{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.wgt.Radio();
	}-*/;

	
	public native void setValue(String value)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setValue(value);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Radio.js line:[36]
	
	public native String getValue()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getValue();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Radio.js line:[32]
	
	public native Radiogroup getRadiogroup()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getRadiogroup();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Radio.js line:[44]
	
	public native String getName()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getName();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Radio.js line:[101]
	
	public native Radio setSelected(boolean selected)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.setSelected(selected);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Radio.js line:[88]
	
	public native boolean isSelected()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isSelected();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/wgt/Radio.js line:[95]
}
