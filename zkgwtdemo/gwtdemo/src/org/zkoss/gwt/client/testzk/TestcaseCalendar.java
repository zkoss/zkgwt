package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.db.Calendar;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseCalendar extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
		/*
		<calendar/>
		*/		
		Calendar comp = new Calendar();
		
		win.add(comp);
				
		return win;
	}
}
