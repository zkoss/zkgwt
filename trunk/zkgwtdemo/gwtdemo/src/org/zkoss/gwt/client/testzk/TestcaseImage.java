package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.wgt.Captcha;
import org.zkoss.gwt.client.zul.wgt.Image;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseImage extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();

/*		
		<image src="/test2/img/coffee.gif">
*/
		
		Image comp = new Image();
		comp.setSrc("/test2/img/coffee.gif");
		
		win.add(comp);
				
		return win;
	}
}
