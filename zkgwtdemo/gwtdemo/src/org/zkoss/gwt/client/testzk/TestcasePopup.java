package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wgt.Popup;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcasePopup extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();

/*		
 		<window>
		<label value="Tooptip for Another Popup" tooltip="any" />
		<popup id="any" width="300px">
			ZK simply rich.
		</popup>
		</window>
*/
		
		Window window_1 = new Window();
		win.add(window_1);
		Popup popup_12 = new Popup();
		window_1.add(popup_12);
		//Popup has no api for setid
		popup_12.setWidth("300px");
		Label label_121= new Label();
		popup_12.add(label_121);
		label_121.setValue("ZKsimplyrich.");

		Label label_11 = new Label();
		window_1.add(label_11);		
		label_11.setTooltip(popup_12.getId());
		label_11.setValue("Tooptip for Another Popup");
		

				
		
				
		return win;
	}
}
