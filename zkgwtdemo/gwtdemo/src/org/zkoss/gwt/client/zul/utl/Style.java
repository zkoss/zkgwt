package org.zkoss.gwt.client.zul.utl;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Style extends org.zkoss.gwt.client.zk.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.utl.Style();
	}-*/;

	
	public native void setSrc(String src)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSrc(src);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/utl/Style.js line:[33]
	
	public native String getSrc()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSrc();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/utl/Style.js line:[26]
	
	public native void setMedia(String media)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMedia(media);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/utl/Style.js line:[48]
	
	public native String getMedia()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMedia();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/utl/Style.js line:[41]
}
