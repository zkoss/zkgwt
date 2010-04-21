package org.zkoss.gwt.client.zul.layout;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class South extends org.zkoss.gwt.client.zul.layout.LayoutRegion{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.layout.South();
	}-*/;

	
	public native String getPosition()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getPosition();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/layout//South.js line:[28]
	
	public native void setWidth(String width)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setWidth(width);
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/layout//South.js line:[21]
	
	public native String getSize()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSize();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/layout//South.js line:[35]
	
	public native void setSize(String size)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSize(size);
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/layout//South.js line:[41]
}
