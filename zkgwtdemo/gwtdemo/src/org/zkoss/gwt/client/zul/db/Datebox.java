package org.zkoss.gwt.client.zul.db;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Datebox extends org.zkoss.gwt.client.zul.inp.FormatWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.db.Datebox();
	}-*/;

	
	public native boolean isButtonVisible()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isButtonVisible();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[54]
	
	public native void setButtonVisible(boolean visible)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setButtonVisible(visible);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[50]
	
	public native String getFormat()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getFormat();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[133]
	
	public native void setFormat(String format)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setFormat(format);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[82]
	
	public native void setConstraint(String cst)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setConstraint(cst);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[146]
	
	public native String getTimeZone()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTimeZone();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[168]
	
	public native void setTimeZone(String timezone)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setTimeZone(timezone);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[165]
	
	public native boolean isTimeZonesReadonly()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isTimeZonesReadonly();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[179]
	
	public native void setTimeZonesReadonly(boolean readonly)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setTimeZonesReadonly(readonly);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[175]
	
	public native Widget[] getDisplayedTimeZones()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getDisplayedTimeZones();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[192]
	
	public native void setDisplayedTimeZones(String dtzones)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setDisplayedTimeZones(dtzones);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[187]
	
	public native boolean isLenient()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isLenient();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[210]
	
	public native void setLenient(boolean lenient)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setLenient(lenient);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[200]
	
	public native String getRawText()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getRawText();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[252]
	
	public native String getTimeFormat()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTimeFormat();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[259]
	
	public native String getDateFormat()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getDateFormat();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[288]
	
	public native void setOpen()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setOpen();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[294]
	
	public native void syncWidth()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.syncWidth();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[318]
	
	public native String getTimeZoneLabel()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTimeZoneLabel();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[492]
}
