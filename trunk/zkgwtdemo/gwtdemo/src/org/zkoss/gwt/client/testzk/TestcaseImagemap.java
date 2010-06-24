package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zk.Event;
import org.zkoss.gwt.client.zk.EventListener;
import org.zkoss.gwt.client.zk.Events;
import org.zkoss.gwt.client.zul.db.Calendar;
import org.zkoss.gwt.client.zul.wgt.Imagemap;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;


public class TestcaseImagemap extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
		<imagemap src="/test2/img/coffee.gif" onClick="alert(event.x + &quot;, &quot; +event.y)"/>
*/			
		Imagemap comp = new Imagemap();
		comp.setSrc("/test2/img/coffee.gif");
		//can I get the event data?
		
		win.add(comp);

		comp.addEventListener(Events.ON_CLICK, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>Imagemap onClick");
				System.out.println("data" + getJSONString(nEvent));			
								
			}
		});		
		
		return win;
	}
	
	public static final native int getSelectedIndex(JavaScriptObject js) /*-{
		return js.data.items[0].getChildIndex(); 
	}-*/;
	

	
}
