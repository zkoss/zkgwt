package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.box.Box;
import org.zkoss.gwt.client.zul.wgt.Button;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseBox {
	public static Widget getInstance() {
		
		Window win = new Window();
/*	
	 <box orient="vertical">
         <button label="Button 1"/>
         <button label="Button 2"/>
     </box>
     <box  orient="horizontal">
         <button label="Button 3"/>
         <button label="Button 4"/>
     </box>
*/
	 

		Box comp = new Box();		
		//no setOrient()?
		//comp.setOrient("vertical");		
			Button b1 = new Button();
			comp.add(b1);
			b1.setLabel("Button 1");

			Button b2 = new Button();
			comp.add(b2);
			b2.setLabel("Button 2");
			
		win.add(comp);
				
		return win;
	}
}
