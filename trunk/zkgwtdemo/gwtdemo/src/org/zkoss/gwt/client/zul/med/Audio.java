package org.zkoss.gwt.client.zul.med;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Audio extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.med.Audio();
	}-*/;

	
	public native void setSrc(String src)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSrc(src);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Audio.js line:[54]
	
	public native String getSrc()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getSrc();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Audio.js line:[50]
	
	public native void setAlign(String align)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setAlign(align);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Audio.js line:[64]
	
	public native String getAlign()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getAlign();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Audio.js line:[60]
	
	public native void setBorder(String border)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setBorder(border);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Audio.js line:[76]
	
	public native String getBorder()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getBorder();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Audio.js line:[72]
	
	public native void setAutostart(boolean autostart)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setAutostart(autostart);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Audio.js line:[87]
	
	public native boolean isAutostart()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isAutostart();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Audio.js line:[83]
	
	public native void setLoop(boolean loop)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setLoop(loop);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Audio.js line:[98]
	
	public native boolean isLoop()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isLoop();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Audio.js line:[94]
	
	public native void play()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.play();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Audio.js line:[106]
	
	public native void stop()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.stop();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Audio.js line:[111]
	
	public native void pause()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.pause();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/med/Audio.js line:[116]
}
