package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.box.Box;
import org.zkoss.gwt.client.zul.wgt.Button;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseBox extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*
 <window>	
	 <box orient="vertical">
         <button label="Button 1"/>
         <button label="Button 2"/>
     </box>
     <box  orient="horizontal">
         <button label="Button 3"/>
         <button label="Button 4"/>
     </box>
  </window>
*/
	 

		Window window_1 = new Window();
		win.add(window_1);
		Box box_11 = new Box();
		window_1.add(box_11);
		//Box has no api for setorient
		Button button_111 = new Button();
		box_11.add(button_111);
		button_111.setLabel("Button 1");
		Button button_112 = new Button();
		box_11.add(button_112);
		button_112.setLabel("Button 2");
		Box box_12 = new Box();
		window_1.add(box_12);
		//Box has no api for setorient
		Button button_121 = new Button();
		box_12.add(button_121);
		button_121.setLabel("Button 3");
		Button button_122 = new Button();
		box_12.add(button_122);
		button_122.setLabel("Button 4");
				
		return win;
	}
}
