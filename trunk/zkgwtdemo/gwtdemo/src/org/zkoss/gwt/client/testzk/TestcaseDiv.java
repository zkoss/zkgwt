package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.inp.Doublebox;
import org.zkoss.gwt.client.zul.wgt.Div;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseDiv {
	public static Widget getInstance() {
		
		Window win = new Window();
/*		
	<div align="right" width="300px">
	     <doublebox value="123"/>
	 </div>
*/		
		Div comp = new Div();
		comp.setAlign("right");
		comp.setWidth("300px");
		Doublebox d = new Doublebox();
		comp.add(d);
		d.setValue("123", true);
		
		win.add(comp);
				
		return win;
	}
}
