package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zk.Event;
import org.zkoss.gwt.client.zk.EventListener;
import org.zkoss.gwt.client.zk.Events;
import org.zkoss.gwt.client.zul.inp.Combobox;
import org.zkoss.gwt.client.zul.inp.Comboitem;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public abstract class TestcaseWrapper extends SimplePanel {
		
	public void show(){
		VerticalPanel panel = new VerticalPanel();
		panel.add(getInstance());
		this.setWidget(panel);
	}
	
	abstract public Widget getInstance();
	
	public static final native String getJSONString(JavaScriptObject js) /*-{				
		return $wnd.jq.toJSON(js.data); 
	}-*/;
	
	public static final native String getValue(JavaScriptObject js) /*-{
		return js.data.value; 
	}-*/;	
}
