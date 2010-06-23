package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zk.Event;
import org.zkoss.gwt.client.zk.EventListener;
import org.zkoss.gwt.client.zk.Events;
import org.zkoss.gwt.client.zul.wgt.Radio;
import org.zkoss.gwt.client.zul.wgt.Radiogroup;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;


public class TestcaseRadiogroup extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
     <radiogroup>
         <radio label="Apple"/>
         <radio label="Orange"/>
         <radio label="Banana"/>
     </radiogroup>
*/
	
		Radiogroup comp = new Radiogroup();		
		Radio r1 = new Radio();
		r1.setLabel("Apple");
		comp.add(r1);

		Radio r2 = new Radio();
		r2.setLabel("Orange");
		comp.add(r2);

		Radio r3 = new Radio();
		r3.setLabel("Banana");
		comp.add(r3);

		
		win.add(comp);

		comp.addEventListener(Events.ON_CHECK, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>Radiogroup ON_CHECK");
				System.out.println("data" + getJSONString(nEvent));										
			}
		});
		

		r1.addEventListener(Events.ON_CHECK, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>r1 ON_CHECK");
				System.out.println("data" + getJSONString(nEvent));										
			}
		});
		

		r2.addEventListener(Events.ON_CHECK, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>r2 ON_CHECK");
				System.out.println("data" + getJSONString(nEvent));										
			}
		});
				
		return win;
	}
	
	public static final native int getSelectedIndex(JavaScriptObject js) /*-{
		return js.data.items[0].getChildIndex(); 
	}-*/;
	
	
}
