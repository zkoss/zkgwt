package org.zkoss.gwt.client.zul.inp;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Comboitem extends org.zkoss.gwt.client.zul.LabelImageWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.inp.Comboitem();
	}-*/;

	
	public native void setDisabled(boolean disabled)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setDisabled(disabled);
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/inp//Comboitem.js line:[30]
	
	public native boolean isDisabled()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isDisabled();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/inp//Comboitem.js line:[26]
	
	public native void setDescription(String desc)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setDescription(desc);
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/inp//Comboitem.js line:[48]
	
	public native String getDescription()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getDescription();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/inp//Comboitem.js line:[40]
	
	public native void setContent(String content)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setContent(content);
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/inp//Comboitem.js line:[66]
	
	public native String getContent()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getContent();
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zul/src/archive/web/js/zul/inp//Comboitem.js line:[54]
}
