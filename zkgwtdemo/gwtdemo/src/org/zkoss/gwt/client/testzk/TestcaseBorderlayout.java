package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.layout.Borderlayout;
import org.zkoss.gwt.client.zul.layout.Center;
import org.zkoss.gwt.client.zul.layout.North;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseBorderlayout extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();

/*
	<borderlayout height="500px">
		<north title="North" size="50%">
		</north>
		<center title="center">		
		</center>
	</borderlayout>	
*/
		
		Borderlayout borderlayout_1 = new Borderlayout();
		win.add(borderlayout_1);
		//borderlayout_1.setHeight("500px");
		North north_11 = new North();
		borderlayout_1.add(north_11);
		north_11.setSize("50%");
		north_11.setSize("50%");
		north_11.setTitle("North");
		Center center_12 = new Center();
		borderlayout_1.add(center_12);
		center_12.setTitle("center");
		
				
		return win;
	}
}
