package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zk.Event;
import org.zkoss.gwt.client.zk.EventListener;
import org.zkoss.gwt.client.zk.Events;
import org.zkoss.gwt.client.zul.wgt.Button;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;


public class TestcaseButton extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*	
		<button label="Left" image="/img/folder.gif" width="125px"/>
*/
		Button comp = new Button();
		comp.setLabel("Left");
		comp.setImage("/test2/img/folder.gif");
		//comp.setWidth("125px");
		
		comp.setUpload("true");

		comp.addEventListener(Events.ON_UPLOAD, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>button onUpload");
				System.out.println("data : " + getJSONString(nEvent));					
			}
		});		
		
		win.add(comp);
				
		return win;
	}
	



	
	
}
