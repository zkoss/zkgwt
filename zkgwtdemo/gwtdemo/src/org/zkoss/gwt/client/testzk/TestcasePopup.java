package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wgt.Popup;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcasePopup {
	public static Widget getInstance() {
		
		Window win = new Window();

/*		
		<label value="Tooptip for Another Popup" tooltip="any" />
		<popup id="any" width="300px">
			ZK simply rich.
		</popup>
*/
		
		Popup comp = new Popup();
		win.add(comp);
		
		Label lab = new Label();
		win.add(lab);
		lab.setValue("Tooptip for Another Popup");
		lab.setTooltip(comp.getId());
				
		
				
		return win;
	}
}
