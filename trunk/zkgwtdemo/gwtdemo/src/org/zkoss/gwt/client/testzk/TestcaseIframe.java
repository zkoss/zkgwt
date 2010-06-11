package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zk.Event;
import org.zkoss.gwt.client.zk.EventListener;
import org.zkoss.gwt.client.zk.Events;
import org.zkoss.gwt.client.zul.utl.Iframe;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;


public class TestcaseIframe {
	public static Widget getInstance() {
		
		Window win = new Window();
/*		
		<iframe src="http://www.google.com.tw/" />
*/			
		Iframe comp = new Iframe();
		//no setSrc() available
		//comp.setSrc();
		
		comp.addEventListener(Events.ON_URI_CHANGE, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>Iframe onURIChange");
				System.out.println("data : " + getJSONString(nEvent));							
			}
		});			
		
		
		win.add(comp);
				
		return win;
	}

	public static final native int getValue(JavaScriptObject js) /*-{
		return parseInt(js.data.value); 
	}-*/;
	
	public static final native String getJSONString(JavaScriptObject js) /*-{				
		return $wnd.jq.toJSON(js.data); 
	}-*/;		
}
