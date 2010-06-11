package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.tab.Tab;
import org.zkoss.gwt.client.zul.tab.Tabbox;
import org.zkoss.gwt.client.zul.tab.Tabpanel;
import org.zkoss.gwt.client.zul.tab.Tabpanels;
import org.zkoss.gwt.client.zul.tab.Tabs;
import org.zkoss.gwt.client.zul.wgt.Captcha;
import org.zkoss.gwt.client.zul.wgt.Image;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseTabbox {
	public static Widget getInstance() {
		
		Window win = new Window();

/*		
	<tabbox width="400px">
		<tabs>
			<tab label="Tab 1" />
			<tab label="Tab 2" />
		</tabs>
		<tabpanels>
			<tabpanel>This is panel 1</tabpanel>
			<tabpanel>This is panel 2</tabpanel>
		</tabpanels>
	</tabbox>
	<space />
	<tabbox width="400px" mold="accordion">
		<tabs>
			<tab label="Tab 3" />
			<tab label="Tab 4" />
		</tabs>
		<tabpanels>
			<tabpanel>This is panel 3</tabpanel>
			<tabpanel>This is panel 4</tabpanel>
		</tabpanels>
	</tabbox>
*/
		
		Tabbox comp = new Tabbox();
		Tabs tabs = new Tabs();
		comp.add(tabs);
		Tab tab1 = new Tab();
		tab1.setLabel("Tab 1");
		tabs.add(tab1);
		Tab tab2 = new Tab();
		tab2.setLabel("Tab 2");
		tabs.add(tab2);
		Tabpanels tps = new Tabpanels();
		tabs.add(tps);
		Tabpanel tp1 = new Tabpanel();
		tps.add(tp1);
		Label lab1= new Label();
		tp1.add(lab1);
		lab1.setValue("This is panel 1");
		Tabpanel tp2 = new Tabpanel();
		tps.add(tp2);		
		Label lab2= new Label();
		tp2.add(lab2);
		lab2.setValue("This is panel 2");
		
		
		win.add(comp);
				
		return win;
	}
}
