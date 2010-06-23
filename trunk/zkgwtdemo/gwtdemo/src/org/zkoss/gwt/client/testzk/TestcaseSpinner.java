package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.inp.Spinner;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseSpinner extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
		<spinner />
*/		
		Spinner comp = new Spinner();
					
		win.add(comp);
				
		return win;
	}
}
