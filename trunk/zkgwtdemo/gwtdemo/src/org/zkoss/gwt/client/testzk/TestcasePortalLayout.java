package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zkmax.layout.Portalchildren;
import org.zkoss.gwt.client.zkmax.layout.Portallayout;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Panel;
import org.zkoss.gwt.client.zul.wnd.Panelchildren;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcasePortalLayout {
	public static Widget getInstance() {
		
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
		
		Portallayout comp = new Portallayout();
			Portalchildren pc1 = new Portalchildren();
			pc1.setWidth("30%");
			comp.add(pc1);
				Panel pa11 = new Panel();
				pc1.add(pa11);
				pa11.setHeight("150px");
				pa11.setTitle("Google tools");
					Panelchildren pac111 = new Panelchildren();
					pa11.add(pac111);
						Label lab1111 = new Label();
						pac111.add(lab1111);
						lab1111.setValue("lab1111");

					Panelchildren pac112 = new Panelchildren();
					pa11.add(pac112);
						Label lab1121 = new Label();
						pac112.add(lab1121);
						lab1121.setValue("lab1121");

			Portalchildren pc2 = new Portalchildren();
			comp.add(pc2);
			pc2.setWidth("30%");
				Panel pa21 = new Panel();
				pc2.add(pa21);
					Panelchildren pac211 = new Panelchildren();
					pa21.add(pac211);
						Label lab2111 = new Label();
						pac211.add(lab2111);
						lab2111.setValue("lab2111");
						
		win.add(comp);
				
		return win;
	}
}
