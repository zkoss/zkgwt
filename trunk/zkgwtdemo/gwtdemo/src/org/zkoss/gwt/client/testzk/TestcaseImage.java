package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.wgt.Captcha;
import org.zkoss.gwt.client.zul.wgt.Image;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseImage {
	public static Widget getInstance() {
		
		Window win = new Window();

/*		
		<image src="/my.png">
*/
		
		Image comp = new Image();
		comp.setSrc("/msn1.gif");
		
		win.add(comp);
				
		return win;
	}
}
