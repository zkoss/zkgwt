package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zk.Event;
import org.zkoss.gwt.client.zk.EventListener;
import org.zkoss.gwt.client.zk.Events;
import org.zkoss.gwt.client.zul.wgt.Checkbox;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;


public class TestcaseCheckbox extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
		
		/*
		<checkbox  label="Apple" onCheck="doChecked()" />
		*/
		
		Checkbox comp = new Checkbox();
		comp.setLabel("Apple");

		comp.addEventListener(Events.ON_CHECK, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>checkbox onCheck");
				System.out.println("data : " + getJSONString(nEvent));		
				
			}
		});		
		
		win.add(comp);
				
		return win;
	}
	

}
