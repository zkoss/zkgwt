package org.zkoss.gwt.client.zul.db;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Datebox extends org.zkoss.gwt.client.zul.inp.FormatWidget{
	protected native JavaScriptObject create() /*-{
		$wnd.zk.SMON=["一月","二月","三月","四月","五月","六月","七月","八月","九月","十月","十一月","十二月"];	
		$wnd.zk.S2DOW=["日","一","二","三","四","五","六"];
		temp = new $wnd.zul.db.Datebox();
		temp._format="yyyy/MM/dd";
		return temp;		
		//return new $wnd.zul.db.Datebox();
	}-*/;

	
	public native boolean isButtonVisible()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isButtonVisible();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[56]
	
	public native void setButtonVisible(boolean visible)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setButtonVisible(visible);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[52]
	
	public native String getFormat()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getFormat();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[135]
	
	public native void setFormat(String format)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setFormat(format);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[84]
	
	public native void setConstraint(String cst)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setConstraint(cst);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[148]
	
	public native String getTimeZone()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTimeZone();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[170]
	
	public native void setTimeZone(String timezone)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setTimeZone(timezone);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[167]
	
	public native boolean isTimeZonesReadonly()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isTimeZonesReadonly();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[181]
	
	public native void setTimeZonesReadonly(boolean readonly)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setTimeZonesReadonly(readonly);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[177]
	
	public native Widget[] getDisplayedTimeZones()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getDisplayedTimeZones();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[194]
	
	public native void setDisplayedTimeZones(String dtzones)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setDisplayedTimeZones(dtzones);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[189]
	
	public native boolean isLenient()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isLenient();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[212]
	
	public native void setLenient(boolean lenient)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setLenient(lenient);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[202]
	
	public native String getRawText()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getRawText();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[254]
	
	public native String getTimeFormat()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTimeFormat();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[261]
	
	public native String getDateFormat()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getDateFormat();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[290]
	
	public native void setOpen()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setOpen();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[296]
	
	public native void syncWidth()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.syncWidth();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[320]
	
	public native String getTimeZoneLabel()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTimeZoneLabel();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Datebox.js line:[494]
}
