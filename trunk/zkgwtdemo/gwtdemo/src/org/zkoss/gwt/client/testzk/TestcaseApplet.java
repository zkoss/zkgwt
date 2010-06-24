package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.med.Applet;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseApplet extends TestcaseWrapper {
			
	public Widget getInstance() {	
		Window win = new Window();
		/*
		<applet  code="/res/ticker.class" msg="ZK is Simple and Rich!" width="580px" />
		*/	
		Applet comp = new Applet();
		comp.setCode("/res/ticker.class");
		//comp.setMsg(), no such api
		//comp.setWidth("580px");
		
		win.add(comp);
				
		return win;
	}
}
