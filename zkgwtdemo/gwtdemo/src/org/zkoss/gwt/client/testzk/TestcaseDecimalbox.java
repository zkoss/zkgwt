package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.inp.Decimalbox;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseDecimalbox extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();

/*		
		<decimalbox value="155.5"/>
*/	
		Decimalbox comp = new Decimalbox();
		comp.setValue("155.5", true);
		
		
		
		win.add(comp);
				
		return win;
	}
}
