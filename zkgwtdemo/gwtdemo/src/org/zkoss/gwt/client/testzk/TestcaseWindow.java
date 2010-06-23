package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zk.Event;
import org.zkoss.gwt.client.zk.EventListener;
import org.zkoss.gwt.client.zk.Events;
import org.zkoss.gwt.client.zul.wgt.Button;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;


public class TestcaseWindow extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();

/*		
		<window title="Modal Style" sclass="modal" border="normal"
		width="200px"> Hello, Modal! </window>
*/
	
		Window comp = new Window();
		comp.setTitle("Modal Style");
		//comp.setSclass("modal");
		//comp.setBorder("normal");
		
		//error, will cause duplicate window
		comp.setWidth("200px");
			Label l = new Label();
			comp.add(l);
			l.setValue("Hello, Modal! ");
		
		comp.setClosable(true);
		comp.addEventListener(Events.ON_CLOSE, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>window onClose");
				System.out.println("data : " + getJSONString(nEvent));				
			}
		});				

		comp.setMaximizable(true);
		comp.addEventListener(Events.ON_MAXIMIZE, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>window onMaximize");
				System.out.println("data : " + getJSONString(nEvent));				
			}
		});				

		comp.setMinimizable(true);
		comp.addEventListener(Events.ON_MINIMIZE, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>window onMinimize");
				System.out.println("data : " + getJSONString(nEvent));				
			}
		});				
		
		comp.setMode("popup");
		comp.addEventListener(Events.ON_OPEN, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>window onOpen");
				System.out.println("data : " + getJSONString(nEvent));				
			}
		});				

		//comp.setMode("overlapped");
		comp.addEventListener(Events.ON_MOVE, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>window onMove");
				System.out.println("data : " + getJSONString(nEvent));				
			}
		});				
		
		comp.setSizable(true);
		comp.addEventListener(Events.ON_SIZE, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>window onSize");
				System.out.println("data : " + getJSONString(nEvent));				
			}
		});				

		final Window z1 = new Window();
		comp.add(z1);
		z1.setMode("overlapped");
		z1.setTitle("z1");
		z1.setBorder("normal");
		z1.addEventListener(Events.ON_Z_INDEX, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>window onZIndex");
				System.out.println("data : " + getJSONString(nEvent));				
			}
		});				

		z1.addEventListener(Events.ON_MODAL, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>window onModal");
				System.out.println("data : " + getJSONString(nEvent));				
			}
		});				
		
		
		Window z2 = new Window();
		comp.add(z2);
		z2.setMode("overlapped");
		z2.setTitle("z2");
		z2.setBorder("normal");

		Button b1= new Button();
		comp.add(b1);
		b1.setLabel("set modal");
		b1.addEventListener(Events.ON_CLICK, new EventListener() {
			public void onEvent(Event event) {								
				System.out.println(">>button click to setModal");
				z1.setMode("modal");				
			}
		});				
		

		win.addEventListener(Events.ON_PIGGYBACK, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>window onPiggyback");
				System.out.println("data : " + getJSONString(nEvent));				
			}
		});	
		
		win.add(comp);
				
		return win;
	}
	

	
}
