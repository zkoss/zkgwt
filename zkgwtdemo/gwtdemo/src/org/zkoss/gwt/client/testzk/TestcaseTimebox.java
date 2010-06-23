package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.inp.Timebox;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseTimebox extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();

/*		
		<timebox cols="14" format="a hh:mm:ss"/>
*/
		
		Timebox comp = new Timebox();
		comp.setCols(14);

		//cause error 
		comp.setFormat("hh:mm:ss");		
		
		win.add(comp);
				
		return win;
	}
}
