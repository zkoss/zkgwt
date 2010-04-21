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
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/wgt//Radio.js line:[36]
	
	public native String getValue()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getValue();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/wgt//Radio.js line:[32]
	
	public native Radiogroup getRadiogroup()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getRadiogroup();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/wgt//Radio.js line:[44]
	
	public native String getName()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getName();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/wgt//Radio.js line:[100]
	
	public native Radio setSelected(boolean selected)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.setSelected(selected);
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/wgt//Radio.js line:[87]
	
	public native boolean isSelected()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isSelected();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/wgt//Radio.js line:[94]
}
