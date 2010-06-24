package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zkex.menu.Fisheye;
import org.zkoss.gwt.client.zkex.menu.Fisheyebar;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseFisheye extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();

/*		
		<fisheyebar>
			<fisheye image="/test2/img/coffee.gif" label="Email"/>
			<fisheye image="/test2/img/folder.gif" label="Email"/>
		</fisheyebar>
*/			
		Fisheyebar comp = new Fisheyebar();		
			Fisheye fe1 = new Fisheye();
			comp.add(fe1);
			fe1.setImage("/test2/img/coffee.gif");
			fe1.setLabel("Email");

			Fisheye fe2 = new Fisheye();
			comp.add(fe2);
			fe2.setImage("/test2/img/folder.gif");
			fe2.setLabel("Email");

		win.add(comp);
				
		return win;
	}
}
