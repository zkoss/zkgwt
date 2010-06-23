package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.inp.Slider;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseSlider extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();

/*		
		<slider curpos="5" maxpos="20" />
*/
		Slider comp = new Slider();
		comp.setCurpos(5);
		comp.setMaxpos(20);
		
		
		
		win.add(comp);
				
		return win;
	}
}
