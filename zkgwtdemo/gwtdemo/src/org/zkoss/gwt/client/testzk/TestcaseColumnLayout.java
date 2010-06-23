package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zkex.layout.Columnchildren;
import org.zkoss.gwt.client.zkex.layout.Columnlayout;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Panel;
import org.zkoss.gwt.client.zul.wnd.Panelchildren;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseColumnLayout extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
	<columnlayout>
		<columnchildren width="30%" style="padding: 5px">
			<panel>
				<panelchildren>Panel11</panelchildren>
			</panel>
			<panel>
				<panelchildren>Panel12</panelchildren>
			</panel>
		</columnchildren>	
		<columnchildren width="70%" style="padding: 5px">
			<panel>
				<panelchildren>Panel21</panelchildren>
			</panel>
			<panel>
				<panelchildren>Panel22</panelchildren>
			</panel>
		</columnchildren>	
	</columnlayout>
*/		
		Columnlayout columnlayout_1 = new Columnlayout();
		win.add(columnlayout_1);
		Columnchildren columnchildren_11 = new Columnchildren();
		columnlayout_1.add(columnchildren_11);
		columnchildren_11.setStyle("padding: 5px");
		columnchildren_11.setWidth("30%");
		Panel panel_111 = new Panel();
		columnchildren_11.add(panel_111);
		Panelchildren panelchildren_1111 = new Panelchildren();
		panel_111.add(panelchildren_1111);
		Label label_11111= new Label();
		panelchildren_1111.add(label_11111);
		label_11111.setValue("Panel11");
		Panel panel_112 = new Panel();
		columnchildren_11.add(panel_112);
		Panelchildren panelchildren_1121 = new Panelchildren();
		panel_112.add(panelchildren_1121);
		Label label_11211= new Label();
		panelchildren_1121.add(label_11211);
		label_11211.setValue("Panel12");
		Columnchildren columnchildren_12 = new Columnchildren();
		columnlayout_1.add(columnchildren_12);
		columnchildren_12.setStyle("padding: 5px");
		columnchildren_12.setWidth("70%");
		Panel panel_121 = new Panel();
		columnchildren_12.add(panel_121);
		Panelchildren panelchildren_1211 = new Panelchildren();
		panel_121.add(panelchildren_1211);
		Label label_12111= new Label();
		panelchildren_1211.add(label_12111);
		label_12111.setValue("Panel21");
		Panel panel_122 = new Panel();
		columnchildren_12.add(panel_122);
		Panelchildren panelchildren_1221 = new Panelchildren();
		panel_122.add(panelchildren_1221);
		Label label_12211= new Label();
		panelchildren_1221.add(label_12211);
		label_12211.setValue("Panel22");

				
		return win;
	}
}
