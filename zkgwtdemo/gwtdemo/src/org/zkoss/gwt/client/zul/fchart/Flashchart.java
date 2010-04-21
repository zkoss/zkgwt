package org.zkoss.gwt.client.zul.fchart;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Flashchart extends org.zkoss.gwt.client.zul.med.Flash{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.fchart.Flashchart();
	}-*/;

	
	public native String getChartStyle()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getChartStyle();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/fchart//Flashchart.js line:[215]
	
	public native void setChartStyle(String chartStyle)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setChartStyle(chartStyle);
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/fchart//Flashchart.js line:[211]
	
	public native String getJsonModel()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getJsonModel();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/fchart//Flashchart.js line:[224]
	
	public native void setJsonModel(String jsonModel)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setJsonModel(jsonModel);
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/fchart//Flashchart.js line:[219]
	
	public native String getJsonSeries()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getJsonSeries();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/fchart//Flashchart.js line:[234]
	
	public native void setJsonSeries(String jsonModel)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setJsonSeries(jsonModel);
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/fchart//Flashchart.js line:[229]
	
	public native String getType()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getType();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/fchart//Flashchart.js line:[244]
	
	public native void setType(String type)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setType(type);
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/fchart//Flashchart.js line:[239]
}
