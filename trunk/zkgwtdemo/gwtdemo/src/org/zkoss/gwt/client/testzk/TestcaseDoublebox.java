package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.inp.Doublebox;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseDoublebox extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
		<doublebox value="112.5"/>
*/	
		Doublebox comp = new Doublebox();
		comp.setValue("112.5", false);
		
		
		
		win.add(comp);
				
		return win;
	}
}
