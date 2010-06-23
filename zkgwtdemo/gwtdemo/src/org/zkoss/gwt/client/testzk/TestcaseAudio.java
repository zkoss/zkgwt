package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.med.Audio;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseAudio extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
		/*
		 <audio id="audio" height="20"/>
		 */		
		Audio comp = new Audio();
		
		
		win.add(comp);
				
		return win;
	}
}
