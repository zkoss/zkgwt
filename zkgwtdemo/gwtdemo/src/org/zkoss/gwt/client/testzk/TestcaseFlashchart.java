package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.fchart.Flashchart;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseFlashchart extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		
		Window win = new Window();

/*		
		
*/		
		Flashchart comp = new Flashchart();
		comp.setJsonModel("{a:1,b:2}");
		
		win.add(comp);
				
		return win;
	}
}
