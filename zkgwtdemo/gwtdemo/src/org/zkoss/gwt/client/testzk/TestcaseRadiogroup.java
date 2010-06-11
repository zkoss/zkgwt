package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.wgt.Radio;
import org.zkoss.gwt.client.zul.wgt.Radiogroup;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseRadiogroup {
	public static Widget getInstance() {
		
		Window win = new Window();
/*		
     <radiogroup>
         <radio label="Apple"/>
         <radio label="Orange"/>
         <radio label="Banana"/>
     </radiogroup>
*/
	
		Radiogroup comp = new Radiogroup();		
		Radio r1 = new Radio();
		r1.setLabel("Apple");
		comp.add(r1);

		Radio r2 = new Radio();
		r2.setLabel("Orange");
		comp.add(r2);

		Radio r3 = new Radio();
		r3.setLabel("Banana");
		comp.add(r3);

		
		win.add(comp);
				
		return win;
	}
}
