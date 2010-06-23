package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.wgt.Caption;
import org.zkoss.gwt.client.zul.wgt.Groupbox;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wgt.Radio;
import org.zkoss.gwt.client.zul.wgt.Radiogroup;
import org.zkoss.gwt.client.zul.wnd.Panel;
import org.zkoss.gwt.client.zul.wnd.Panelchildren;
import org.zkoss.gwt.client.zul.wnd.Window;


import com.google.gwt.user.client.ui.Widget;


public class TestcaseGroupbox extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
		 <groupbox width="250px">
		     <caption label="Fruits"/>
		     <radiogroup>
		         <radio label="Apple"/>
		         <radio label="Orange"/>
		         <radio label="Banana"/>
		     </radiogroup>
	     </groupbox>
*/	 

		Groupbox comp = new Groupbox();
		Caption cap = new Caption();
		cap.setLabel("Fruits");
		comp.add(cap);
		Radiogroup rg = new Radiogroup();
		comp.add(rg);
		Radio r1 = new Radio();
		r1.setLabel("Apple");
		rg.add(r1);

		Radio r2 = new Radio();
		r2.setLabel("Orange");
		rg.add(r2);

		Radio r3 = new Radio();
		r3.setLabel("Banana");
		rg.add(r3);

		
		win.add(comp);
				
		return win;
	}
}
