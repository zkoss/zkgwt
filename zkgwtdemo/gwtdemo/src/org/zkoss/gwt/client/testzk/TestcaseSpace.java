package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.wgt.Space;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseSpace extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();

/*		
		<space bar="true"/>
*/		
		Space comp = new Space();
		comp.setBar(true);
		
		win.add(comp);
				
		return win;
	}
}
