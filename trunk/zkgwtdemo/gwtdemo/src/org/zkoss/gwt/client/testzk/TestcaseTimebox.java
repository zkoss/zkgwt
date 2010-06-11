package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.inp.Timebox;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseTimebox {
	public static Widget getInstance() {
		
		Window win = new Window();

/*		
		<timebox id="tb" cols="14" format="a hh:mm:ss" onCreate="self.value = new Date()" mold="rounded"/>
*/
		
		Timebox comp = new Timebox();
		comp.setCols(14);

		//cause error 
		//comp.setFormat("a hh:mm:ss");
		
		comp.setMold("rounded");
		
		win.add(comp);
				
		return win;
	}
}
