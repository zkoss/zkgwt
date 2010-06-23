package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.db.Calendar;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseVbox extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();

/*		
	<vbox>
		<button label="Button 1" />
		<button label="Button 2" />
	</vbox>
	<hbox>
		<button label="Button 3" />
		<button label="Button 4" />
	</hbox>
*/		
		//Vbox.java , Hbox.java not generated.
		//Vbox comp = new Vbox();
		
		//win.add(comp);
				
		return win;
	}
}
