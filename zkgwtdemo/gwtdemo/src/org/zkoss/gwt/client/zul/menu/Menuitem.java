package org.zkoss.gwt.client.zul.menu;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Menuitem extends org.zkoss.gwt.client.zul.LabelImageWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.menu.Menuitem();
	}-*/;

	
	public native void setCheckmark(boolean checkmark)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setCheckmark(checkmark);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/menu/Menuitem.js line:[30]
	
	public native boolean isCheckmark()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isCheckmark();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/menu/Menuitem.js line:[25]
	
	public native void setDisabled(boolean disabled)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setDisabled(disabled);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/menu/Menuitem.js line:[41]
	
	public native boolean isDisabled()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isDisabled();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/menu/Menuitem.js line:[37]
	
	public native void setHref(String href)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setHref(href);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/menu/Menuitem.js line:[50]
	
	public native String getHref()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getHref();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/menu/Menuitem.js line:[45]
	
	public native void setValue(String value)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setValue(value);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/menu/Menuitem.js line:[58]
	
	public native String getValue()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getValue();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/menu/Menuitem.js line:[54]
	
	public native void setChecked(boolean checked)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setChecked(checked);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/menu/Menuitem.js line:[66]
	
	public native boolean isChecked()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isChecked();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/menu/Menuitem.js line:[62]
	
	public native void setAutocheck(boolean autocheck)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setAutocheck(autocheck);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/menu/Menuitem.js line:[88]
	
	public native boolean isAutocheck()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isAutocheck();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/menu/Menuitem.js line:[83]
	
	public native void setTarget(String target)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setTarget(target);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/menu/Menuitem.js line:[100]
	
	public native String getTarget()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTarget();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/menu/Menuitem.js line:[94]
	
	public native void setUpload(String upload)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setUpload(upload);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/menu/Menuitem.js line:[115]
	
	public native String getUpload()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getUpload();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/menu/Menuitem.js line:[111]
	
	public native boolean isTopmost()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isTopmost();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/menu/Menuitem.js line:[132]
	
	public native org.zkoss.gwt.client.zul.menu.Menubar getMenubar()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMenubar();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/menu/Menuitem.js line:[166]
}
