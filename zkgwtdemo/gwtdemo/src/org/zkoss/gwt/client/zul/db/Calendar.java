package org.zkoss.gwt.client.zul.db;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Calendar extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.db.Calendar();
	}-*/;

	
	public native Date getValue()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getValue();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Calendar.js line:[112]
	
	public native void setValue(Date value)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setValue(value);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Calendar.js line:[109]
	
	public native String getConstraint()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getConstraint();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Calendar.js line:[130]
	
	public native void setConstraint(String constraint)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setConstraint(constraint);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Calendar.js line:[118]
	
	public native String getName()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getName();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Calendar.js line:[181]
	
	public native void setName(String name)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setName(name);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Calendar.js line:[171]
	
	public native String getFormat()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getFormat();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Calendar.js line:[256]
	
	public native Date getTime()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTime();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/db/Calendar.js line:[367]
}
