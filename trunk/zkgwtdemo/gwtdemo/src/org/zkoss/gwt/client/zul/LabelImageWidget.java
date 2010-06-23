package org.zkoss.gwt.client.zul;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class LabelImageWidget extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.LabelImageWidget();
	}-*/;

	
	public native String getLabel()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getLabel();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/LabelImageWidget.js line:[27]
	
	public native void setLabel(String label)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setLabel(label);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/LabelImageWidget.js line:[22]
	
	public native String getImage()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getImage();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/LabelImageWidget.js line:[37]
	
	public native void setImage(String image)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setImage(image);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/LabelImageWidget.js line:[34]
	
	public native String getHoverImage()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getHoverImage();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/LabelImageWidget.js line:[51]
	
	public native void setHoverImage(String src)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setHoverImage(src);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/LabelImageWidget.js line:[47]
	
	public native com.google.gwt.user.client.Element getImageNode()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getImageNode();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/LabelImageWidget.js line:[110]
}
