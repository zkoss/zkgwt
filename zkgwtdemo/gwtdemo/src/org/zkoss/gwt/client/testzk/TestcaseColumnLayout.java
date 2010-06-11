package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zkex.layout.Columnchildren;
import org.zkoss.gwt.client.zkex.layout.Columnlayout;
import org.zkoss.gwt.client.zul.db.Calendar;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Panel;
import org.zkoss.gwt.client.zul.wnd.Panelchildren;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseColumnLayout {
	public static Widget getInstance() {
		
		Window win = new Window();
/*		
	<columnlayout>
		<columnchildren width="30%" style="padding: 5px">
			<panel>
				<panelchildren>Panel</panelchildren>
			</panel>
			<panel>
				<panelchildren>Panel</panelchildren>
			</panel>
		</columnchildren>	
	</columnlayout>
*/		
		Columnlayout comp = new Columnlayout();
			Columnchildren cc1 = new Columnchildren();
			//cause error 
//com.google.gwt.core.client.JavaScriptException: (TypeError): this.parent._initDrag is not a function			
//			cc1.setWidth("30%");
//			cc1.setStyle("padding: 5px");
			comp.add(cc1);
				Panel p1 = new Panel();
				cc1.add(p1);
					Panelchildren pc1 = new Panelchildren();
					p1.add(pc1);
					Label lab1 = new Label();
					pc1.add(lab1);
					lab1.setValue("Panel11");
		
				Panel p2 = new Panel();
				cc1.add(p2);
					Panelchildren pc2 = new Panelchildren();
					p2.add(pc2);
					Label lab2 = new Label();
					pc2.add(lab2);
					lab2.setValue("Panel12");


			Columnchildren cc2 = new Columnchildren();
			comp.add(cc2);
//			cc2.setWidth("30%");
//			cc2.setStyle("padding: 5px");			
				Panel p21 = new Panel();
				cc2.add(p21);
					Panelchildren pc21 = new Panelchildren();
					p21.add(pc21);
					Label lab21 = new Label();
					pc21.add(lab21);
					lab21.setValue("Panel21");
		
				Panel p22 = new Panel();
				cc2.add(p22);
					Panelchildren pc22 = new Panelchildren();
					p22.add(pc22);
					Label lab22 = new Label();
					pc22.add(lab22);
					lab22.setValue("Panel22");
					
		
		win.add(comp);
				
		return win;
	}
}
