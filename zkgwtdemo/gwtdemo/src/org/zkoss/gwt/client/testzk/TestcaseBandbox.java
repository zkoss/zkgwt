package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.inp.Bandbox;
import org.zkoss.gwt.client.zul.inp.Bandpopup;
import org.zkoss.gwt.client.zul.wgt.Button;
import org.zkoss.gwt.client.zul.wnd.Window;


import com.google.gwt.user.client.ui.Widget;


public class TestcaseBandbox extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
		
/*		
	<bandbox id="bd">
		<bandpopup>
			<button label="option1"/>
			<button label="option2"/>
			<button label="option3"/>
		</bandpopup>
	</bandbox>
*/	
		Bandbox comp = new Bandbox();
		Bandpopup bp = new Bandpopup();
		comp.add(bp);
			Button b1 = new Button();
			bp.add(b1);
			b1.setLabel("Option1");

			Button b2 = new Button();
			bp.add(b2);
			b2.setLabel("Option2");

			Button b3 = new Button();
			bp.add(b3);
			b3.setLabel("Option3");
			
		win.add(comp);
				
		return win;
	}
}
