package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zkmax.layout.Portalchildren;
import org.zkoss.gwt.client.zkmax.layout.Portallayout;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Panel;
import org.zkoss.gwt.client.zul.wnd.Panelchildren;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcasePortalLayout extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();

/*		
	<portallayout>
		<portalchildren width="30%">
			<panel height="150px" title="Google Tools">
				<panelchildren>...</panelchildren>
			</panel>
			<panel height="300px" title="LabPixies Clock">
				<panelchildren>...</panelchildren>
			</panel>
		</portalchildren>
		<portalchildren width="30%">
			<panel height="150px" title="Google Tools">
				<panelchildren>...</panelchildren>
			</panel>
		</portalchildren>
	</portallayout>
*/	
		
		Portallayout portallayout_1 = new Portallayout();
		win.add(portallayout_1);
		Portalchildren portalchildren_11 = new Portalchildren();
		portallayout_1.add(portalchildren_11);
		portalchildren_11.setWidth("30%");
		Panel panel_111 = new Panel();
		portalchildren_11.add(panel_111);
		panel_111.setHeight("150px");
		panel_111.setTitle("Google Tools");
		Panelchildren panelchildren_1111 = new Panelchildren();
		panel_111.add(panelchildren_1111);
		Label label_11111= new Label();
		panelchildren_1111.add(label_11111);
		label_11111.setValue("...");
		Panel panel_112 = new Panel();
		portalchildren_11.add(panel_112);
		panel_112.setHeight("300px");
		panel_112.setTitle("LabPixies Clock");
		Panelchildren panelchildren_1121 = new Panelchildren();
		panel_112.add(panelchildren_1121);
		Label label_11211= new Label();
		panelchildren_1121.add(label_11211);
		label_11211.setValue("...");
		Portalchildren portalchildren_12 = new Portalchildren();
		portallayout_1.add(portalchildren_12);
		portalchildren_12.setWidth("30%");
		Panel panel_121 = new Panel();
		portalchildren_12.add(panel_121);
		panel_121.setHeight("150px");
		panel_121.setTitle("Google Tools");
		Panelchildren panelchildren_1211 = new Panelchildren();
		panel_121.add(panelchildren_1211);
		Label label_12111= new Label();
		panelchildren_1211.add(label_12111);
		label_12111.setValue("...");

				
		return win;
	}
}
