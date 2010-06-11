package org.zkoss.gwt.client.zul.inp;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class InputWidget extends org.zkoss.gwt.client.zul.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.inp.InputWidget();
	}-*/;

	
	public native void setName(String name)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setName(name);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/InputWidget.js line:[81]
	
	public native String getName()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getName();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/InputWidget.js line:[71]
	
	public native void setDisabled(boolean disabled)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setDisabled(disabled);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/InputWidget.js line:[100]
	
	public native boolean isDisabled()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isDisabled();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/InputWidget.js line:[96]
	
	public native void setReadonly(boolean readonly)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setReadonly(readonly);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/InputWidget.js line:[117]
	
	public native boolean isReadonly()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isReadonly();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/InputWidget.js line:[113]
	
	public native void setCols(int cols)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setCols(cols);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/InputWidget.js line:[143]
	
	public native int getCols()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getCols();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/InputWidget.js line:[139]
	
	public native void setMaxlength(int maxlength)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setMaxlength(maxlength);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/InputWidget.js line:[156]
	
	public native int getMaxlength()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getMaxlength();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/InputWidget.js line:[152]
	
	public native void setTabindex(int tabindex)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setTabindex(tabindex);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/InputWidget.js line:[168]
	
	public native int getTabindex()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTabindex();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/InputWidget.js line:[164]
	
	public native void setInplace(boolean inplace)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setInplace(inplace);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/InputWidget.js line:[180]
	
	public native boolean isInplace()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isInplace();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/InputWidget.js line:[176]
	
	public native String getInplaceCSS()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getInplaceCSS();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/InputWidget.js line:[188]
	
	public native void select(int start, int end)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.select(start, end);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/InputWidget.js line:[194]
	
	public native String getType()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getType();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/InputWidget.js line:[202]
	
	public native boolean isMultiline()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isMultiline();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/InputWidget.js line:[209]
	
	public native boolean inRoundedMold()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.inRoundedMold();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/InputWidget.js line:[216]
	
	public native String getValue()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getValue();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/InputWidget.js line:[223]
	
	public native void setValue(String value, boolean fromServer)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setValue(value, fromServer);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/InputWidget.js line:[229]
	
	public native void setConstraint(String cst)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setConstraint(cst);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/InputWidget.js line:[300]
	
	public native String getErrorMesssage()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getErrorMesssage();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/InputWidget.js line:[381]
	
	public native void setErrorMessage(String msg)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setErrorMessage(msg);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/InputWidget.js line:[396]
	
	public native void clearErrorMessage(boolean revalidate, boolean remainError)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.clearErrorMessage(revalidate, remainError);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/InputWidget.js line:[404]
	
	public native com.google.gwt.user.client.Element getInputNode()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getInputNode();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/inp/InputWidget.js line:[253]
}
