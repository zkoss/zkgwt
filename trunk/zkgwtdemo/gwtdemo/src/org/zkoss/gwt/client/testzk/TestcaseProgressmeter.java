package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.wgt.Progressmeter;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseProgressmeter {
	public static Widget getInstance() {
		
		Window win = new Window();
/*		
		<progressmeter value="10"/>
*/		
		Progressmeter comp = new Progressmeter();
		comp.setValue(50);
		
		win.add(comp);
				
		return win;
	}
}
