package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.wgt.A;
import org.zkoss.gwt.client.zul.wgt.Html;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseHtml extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();

		/*
		<html><![CDATA[<h1> hello </h1>]]></html>
		*/		
		Html comp = new Html();
		comp.setContent("<h1> hello </h1>");

		
		win.add(comp);
				
		return win;
	}
}
