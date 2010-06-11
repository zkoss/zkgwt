package org.zkoss.gwt.client.zkex.inp;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class PickerPop extends org.zkoss.gwt.client.zk.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zkex.inp.PickerPop();
	}-*/;

	
	public native void setColor(String hex)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setColor(hex);
	}-*/; //I:/svn/zk5_sf/zkex/src/archive/web/js/zkex/inp/Colorpicker.js line:[108]
	
	public native String getColor()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getColor();
	}-*/; //I:/svn/zk5_sf/zkex/src/archive/web/js/zkex/inp/Colorpicker.js line:[104]
	
	public native org.zkoss.gwt.client.zkex.inp.Color getNewColor()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getNewColor();
	}-*/; //I:/svn/zk5_sf/zkex/src/archive/web/js/zkex/inp/Colorpicker.js line:[116]
}
