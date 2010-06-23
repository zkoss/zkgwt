package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseLabel extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();

/*		
		<label value="i am label"/>
*/		
		Label comp = new Label();
		comp.setValue("i am label");
		
		win.add(comp);
				
		return win;
	}
}
