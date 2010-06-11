package org.zkoss.gwt.client.zul.med;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Flash extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.med.Flash();
	}-*/;

	
	public native void setVersion(String version)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setVersion(version);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Flash.js line:[32]
	
	public native String getVersion()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getVersion();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Flash.js line:[28]
	
	public native void setSrc(String src)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSrc(src);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Flash.js line:[41]
	
	public native String getSrc()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSrc();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Flash.js line:[38]
	
	public native void setWmode(String wmode)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setWmode(wmode);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Flash.js line:[53]
	
	public native String getWmode()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getWmode();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Flash.js line:[49]
	
	public native void setBgcolor(String bgcolor)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setBgcolor(bgcolor);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Flash.js line:[65]
	
	public native String getBgcolor()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getBgcolor();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Flash.js line:[61]
	
	public native void setQuality(String quality)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setQuality(quality);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Flash.js line:[76]
	
	public native String getQuality()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getQuality();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Flash.js line:[72]
	
	public native void setAutoplay(boolean autoplay)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setAutoplay(autoplay);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Flash.js line:[87]
	
	public native boolean isAutoplay()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isAutoplay();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Flash.js line:[83]
	
	public native void setLoop(boolean loop)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setLoop(loop);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Flash.js line:[98]
	
	public native boolean isLoop()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isLoop();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Flash.js line:[94]
}
