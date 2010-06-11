package org.zkoss.gwt.client.zul.grid;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Foot extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.grid.Foot();
	}-*/;

	
	public native org.zkoss.gwt.client.zul.grid.Grid getGrid()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getGrid();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/grid/Foot.js line:[20]
}
