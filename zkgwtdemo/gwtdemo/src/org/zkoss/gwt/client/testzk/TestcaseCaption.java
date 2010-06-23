package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.wgt.Caption;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseCaption extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*
		<caption label="This is a caption"/>
*/
		Caption comp = new Caption();
		comp.setLabel("This is a caption");
		
		win.add(comp);
				
		return win;
	}
}
