package org.zkoss.gwt.client.zkex.inp;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class PalettePop extends org.zkoss.gwt.client.zk.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zkex.inp.PalettePop();
	}-*/;

	
	public native void setColor(String color)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setColor(color);
	}-*/; //I:/svn/zk5_sf/zkex/src/archive/web/js/zkex/inp/Colorpalette.js line:[82]
}
