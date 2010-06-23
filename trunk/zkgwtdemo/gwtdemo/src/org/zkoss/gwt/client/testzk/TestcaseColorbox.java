package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zkex.inp.Colorbox;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseColorbox extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
		/*
		<colorbox color="#FFFFFF" />
		*/
		Colorbox colorbox_1 = new Colorbox();
		win.add(colorbox_1);
		colorbox_1.setColor("#FFFFFF");

				
		return win;
	}
}
