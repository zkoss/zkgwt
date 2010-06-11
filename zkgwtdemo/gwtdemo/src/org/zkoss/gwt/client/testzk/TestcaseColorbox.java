package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zkex.inp.Colorbox;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseColorbox {
	public static Widget getInstance() {
		
		Window win = new Window();
		/*
		<colorbox color="#FFFFFF" />
		*/
		Colorbox comp = new Colorbox();
		comp.setColor("#FFFFFF");
		
		win.add(comp);
				
		return win;
	}
}
