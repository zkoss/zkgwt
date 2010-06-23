package org.zkoss.gwt.client.zul.mesh;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class HeaderWidget extends org.zkoss.gwt.client.zul.LabelImageWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.mesh.HeaderWidget();
	}-*/;

	
	public native void setAlign(String align)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setAlign(align);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/HeaderWidget.js line:[24]
	
	public native String getAlign()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getAlign();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/HeaderWidget.js line:[20]
	
	public native void setValign(String valign)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setValign(valign);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/HeaderWidget.js line:[34]
	
	public native String getValign()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getValign();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/HeaderWidget.js line:[30]
	
	public native org.zkoss.gwt.client.zul.mesh.MeshWidget getMeshWidget()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMeshWidget();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/HeaderWidget.js line:[107]
	
	public native String getColAttrs()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getColAttrs();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/mesh/HeaderWidget.js line:[122]
}
