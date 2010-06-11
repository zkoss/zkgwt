package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Panel;
import org.zkoss.gwt.client.zul.wnd.Panelchildren;
import org.zkoss.gwt.client.zul.wnd.Window;


import com.google.gwt.user.client.ui.Widget;


public class TestcasePanel {
	public static Widget getInstance() {
		
		Window win = new Window();

/*		
		<panel height="100px" width="200px" style="margin-bottom:10px"
		     title="Panel1" border="normal" maximizable="true"
		     collapsible="true">
		     <panelchildren>PanelContent1</panelchildren>
		</panel>
*/
		
		Panel comp = new Panel();
		//comp.setHeight("100px");
		//comp.setWidth("200px");
		comp.setStyle("margin-bottom:10px");
		comp.setTitle("Panel1");
		comp.setBorder("normal");
		comp.setMaximizable(true);
		comp.setCollapsible(true);
		
		Panelchildren c1 = new Panelchildren();
		Label label = new Label();
		label.setValue("PanelContent1");
		comp.add(c1);
		c1.add(label);
		
		win.add(comp);
				
		return win;
	}
}
