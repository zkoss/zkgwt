package org.zkoss.gwt.client.zul.tab;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Tab extends org.zkoss.gwt.client.zul.LabelImageWidget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.tab.Tab();
	}-*/;

	
	public native void setClosable(boolean closable)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setClosable(closable);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tab.js line:[35]
	
	public native boolean isClosable()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isClosable();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tab.js line:[28]
	
	public native void setDisabled(boolean disabled)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setDisabled(disabled);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tab.js line:[52]
	
	public native boolean isDisabled()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isDisabled();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tab.js line:[46]
	
	public native void setSelected(boolean selected)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setSelected(selected);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tab.js line:[63]
	
	public native boolean isSelected()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isSelected();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tab.js line:[59]
	
	public native Tabbox getTabbox()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getTabbox();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tab.js line:[72]
	
	public native int getIndex()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getIndex();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tab.js line:[79]
	
	public native Tabpanel getLinkedPanel()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getLinkedPanel();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/tab/Tab.js line:[96]
}
