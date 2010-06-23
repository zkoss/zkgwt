package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zk.Event;
import org.zkoss.gwt.client.zk.EventListener;
import org.zkoss.gwt.client.zk.Events;
import org.zkoss.gwt.client.zul.utl.Iframe;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;


public class TestcaseIframe extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
		<iframe src="http://www.google.com.tw/" />
*/			
		Iframe comp = new Iframe();
		
		comp.setSrc("http://www.google.com.tw/");
				
		
		
		win.add(comp);
				
		return win;
	}

		
}
