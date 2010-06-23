package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Panel;
import org.zkoss.gwt.client.zul.wnd.Panelchildren;
import org.zkoss.gwt.client.zul.wnd.Window;


import com.google.gwt.user.client.ui.Widget;


public class TestcasePanel extends TestcaseWrapper{
	public  Widget getInstance() {
		
		Window win = new Window();

/*		
		<panel height="100px" width="200px" style="margin-bottom:10px"
		     title="Panel1" border="normal" maximizable="true"
		     collapsible="true">
		     <panelchildren>PanelContent1</panelchildren>
		</panel>
*/
		
		Panel panel_1 = new Panel();
		win.add(panel_1);
		panel_1.setBorder("normal");
		panel_1.setCollapsible(true);
		panel_1.setHeight("100px");
		panel_1.setMaximizable(true);
		panel_1.setStyle("margin-bottom:10px");
		panel_1.setTitle("Panel1");
		panel_1.setWidth("200px");
		Panelchildren panelchildren_11 = new Panelchildren();
		panel_1.add(panelchildren_11);
		Label label_111= new Label();
		panelchildren_11.add(label_111);
		label_111.setValue("PanelContent1");

				
		return win;
	}
}
