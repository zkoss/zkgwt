package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zkmax.layout.Tablechildren;
import org.zkoss.gwt.client.zkmax.layout.Tablelayout;
import org.zkoss.gwt.client.zul.db.Calendar;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Panel;
import org.zkoss.gwt.client.zul.wnd.Panelchildren;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseTableLayout extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();

/*		
	<tablelayout id="tbl" columns="3">
		<tablechildren id="tc1" colspan="2">
			<panel title="table1" border="normal" maximizable="true"
				collapsible="true">
				<panelchildren>Panel</panelchildren>
			</panel>
		</tablechildren>
		<tablechildren>
			<panel title="table2" border="normal" maximizable="true"
				collapsible="true">
				<panelchildren>Panel</panelchildren>
			</panel>
		</tablechildren>
	</tablelayout>
*/
		
		Tablelayout comp = new Tablelayout();
		comp.setColumns(3);
			Tablechildren tc1 = new  Tablechildren();
			comp.add(tc1);
			tc1.setColspan(2);
				Panel pa11 = new Panel();
				tc1.add(pa11);
				pa11.setTitle("table1");
				
					Panelchildren pc111 = new Panelchildren();
					pa11.add(pc111);
						Label lab1111 = new Label();
						pc111.add(lab1111);
						lab1111.setValue("lab1111");
					
			Tablechildren tc2 = new  Tablechildren();
			comp.add(tc2);
				Panel pa21 = new Panel();
				tc2.add(pa21);
				pa21.setTitle("table2");
					Panelchildren pc211 = new Panelchildren();
					pa21.add(pc211);
						Label lab2111 = new Label();
						pc211.add(lab2111);
						lab2111.setValue("lab2111");

						
		win.add(comp);
				
		return win;
	}
}
