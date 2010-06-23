package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.inp.Longbox;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseLongbox extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
		<longbox value="123456"/>
*/	
		Longbox comp = new Longbox();
		comp.setValue("123456", true);
		
		
		
		win.add(comp);
				
		return win;
	}
}
