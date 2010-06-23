package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wgt.Separator;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseSeparator extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();

/*		
		line 1 by separator
		 <separator />
		 line 2 by separator
*/		
		Label lab1 = new Label();		
		win.add(lab1);
		lab1.setValue("line 1 by separator");
		
		Separator comp = new Separator(); 
		win.add(comp);
		
		Label lab2 = new Label();		
		win.add(lab2);
		lab2.setValue("line 2 by separator");

		
		return win;
	}
}
