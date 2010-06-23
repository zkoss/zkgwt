package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.box.Box;
import org.zkoss.gwt.client.zul.box.Splitter;
import org.zkoss.gwt.client.zul.wgt.Button;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseSplitter extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();

/*		
	<box height="200px">
		<button label="Button 1"/>
		<splitter collapse="after" />
		<button label="Button 2"/>
	</box>
*/

		Box comp = new Box();		
			Button b1 = new Button();
			comp.add(b1);
			b1.setLabel("Button 1");

			Splitter s = new Splitter();
			comp.add(s);
			s.setCollapse("after");
			
			Button b2 = new Button();
			comp.add(b2);
			b2.setLabel("Button 2");
			
		win.add(comp);
				
		return win;
	}
}
