package org.zkoss.gwt.client.zul.inp;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Spinner extends org.zkoss.gwt.client.zul.inp.FormatWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.inp.Spinner();
	}-*/;

	
	public native void setStep(int step)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setStep(step);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Spinner.js line:[28]
	
	public native int getStep()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getStep();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Spinner.js line:[25]
	
	public native void setButtonVisible(boolean visible)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setButtonVisible(visible);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Spinner.js line:[36]
	
	public native boolean isButtonVisible()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isButtonVisible();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Spinner.js line:[32]
	
	public native void setMin(int min)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMin(min);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Spinner.js line:[64]
	
	public native int getMin()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMin();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Spinner.js line:[61]
	
	public native void setMax(int max)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMax(max);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Spinner.js line:[71]
	
	public native int getMax()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMax();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Spinner.js line:[68]
	
	public native int intValue()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.intValue();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Spinner.js line:[83]
	
	public native void checkValue()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.checkValue();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Spinner.js line:[176]
	
	public native void syncWidth()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.syncWidth();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/Spinner.js line:[262]
}
