package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.wgt.A;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseA extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();

		/*
		<a href="http://www.zkoss.org">Visit ZK!</a>
		*/		
		A comp = new A();
		comp.setHref("http://www.zkoss.org");
		comp.setLabel("Visit ZK!");
		
		win.add(comp);
				
		return win;
	}
}
