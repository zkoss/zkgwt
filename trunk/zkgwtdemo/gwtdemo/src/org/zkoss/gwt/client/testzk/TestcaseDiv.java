package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.inp.Doublebox;
import org.zkoss.gwt.client.zul.wgt.Div;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseDiv extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
	<div align="right" width="300px">
	     <doublebox value="123"/>
	 </div>
*/		
		Div div_1 = new Div();
		win.add(div_1);
		div_1.setAlign("right");
		div_1.setWidth("300px");
		Doublebox doublebox_11 = new Doublebox();
		div_1.add(doublebox_11);
		doublebox_11.setValue("123",false);

				
		return win;
	}
}
