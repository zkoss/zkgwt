package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.wgt.Captcha;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseCaptcha {
	public static Widget getInstance() {
		
		Window win = new Window();
		/*
		<captcha id="cpa" length="5" width="200px" height="50px"/>
		*/
		
		Captcha comp = new Captcha();
		
		
		win.add(comp);
				
		return win;
	}
}
