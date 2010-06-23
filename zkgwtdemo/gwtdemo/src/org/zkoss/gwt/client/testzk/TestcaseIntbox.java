package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zk.Event;
import org.zkoss.gwt.client.zk.EventListener;
import org.zkoss.gwt.client.zk.Events;
import org.zkoss.gwt.client.zul.inp.Intbox;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;


public class TestcaseIntbox extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
		<intbox value="123"/>
*/			
		Intbox comp = new Intbox();
		comp.setValue("123", true);
		
		comp.addEventListener(Events.ON_CHANGE, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>textbox onChange");
				System.out.println("data : " + getJSONString(nEvent));				
				System.out.println("value : " + getValue(nEvent));
			}
		});			
		
		win.add(comp);
				
		return win;
	}
}
