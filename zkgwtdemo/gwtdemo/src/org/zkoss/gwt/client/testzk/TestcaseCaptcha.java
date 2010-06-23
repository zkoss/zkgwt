package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.wgt.Captcha;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseCaptcha extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
		/*
		<captcha length="5" width="200px" height="50px"/>
		*/
		
		Captcha captcha_1 = new Captcha();
		win.add(captcha_1);
		captcha_1.setHeight("50px");
		//Captcha has no api for setlength
		captcha_1.setWidth("200px");

				
		return win;
	}
}
