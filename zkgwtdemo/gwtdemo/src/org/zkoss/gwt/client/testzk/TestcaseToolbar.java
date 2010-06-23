package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.wgt.Toolbar;
import org.zkoss.gwt.client.zul.wgt.Toolbarbutton;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseToolbar extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();

/*		
	<toolbar>
		<toolbarbutton label="Left" />
		<toolbarbutton label="Right" image="/img/folder.gif"
			dir="reverse" />
	</toolbar>
*/
		
		Toolbar comp = new Toolbar();
			Toolbarbutton tb1 = new Toolbarbutton();
			comp.add(tb1);
			tb1.setLabel("Left");
			
			Toolbarbutton tb2 = new Toolbarbutton();
			comp.add(tb2);
			tb2.setLabel("Right");	
			
		win.add(comp);
				
		return win;
	}
}
