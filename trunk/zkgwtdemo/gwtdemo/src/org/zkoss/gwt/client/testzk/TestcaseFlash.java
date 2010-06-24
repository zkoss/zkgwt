package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.med.Flash;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseFlash extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();

/*		
		<flash src="http://www.zkoss.org/Steps/learn.swf"
			height="300" width="800">
		</flash>
*/		
		Flash comp = new Flash();
		comp.setSrc("/res/learn.swf");
		comp.setHeight("300px");
		comp.setWidth("800px");
		
		win.add(comp);
				
		return win;
	}
}
