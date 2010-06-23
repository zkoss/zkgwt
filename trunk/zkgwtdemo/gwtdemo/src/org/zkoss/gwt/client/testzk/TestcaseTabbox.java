package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zk.Event;
import org.zkoss.gwt.client.zk.EventListener;
import org.zkoss.gwt.client.zk.Events;
import org.zkoss.gwt.client.zul.tab.Tab;
import org.zkoss.gwt.client.zul.tab.Tabbox;
import org.zkoss.gwt.client.zul.tab.Tabpanel;
import org.zkoss.gwt.client.zul.tab.Tabpanels;
import org.zkoss.gwt.client.zul.tab.Tabs;
import org.zkoss.gwt.client.zul.wgt.Captcha;
import org.zkoss.gwt.client.zul.wgt.Image;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;


public class TestcaseTabbox extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
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
*/
		
		Tabbox tabbox_1 = new Tabbox();

		tabbox_1.addEventListener(Events.ON_SELECT, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>tabbox onSelect");
				System.out.println("data" + getJSONString(nEvent));											
			}
		});

		win.add(tabbox_1);
		tabbox_1.setWidth("400px");
		Tabs tabs_11 = new Tabs();
		tabbox_1.add(tabs_11);
		Tab tab_111 = new Tab();

		tab_111.addEventListener(Events.ON_SELECT, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>tab1 onSelect");
				System.out.println("data" + getJSONString(nEvent));											
			}
		});

		tabs_11.add(tab_111);
		tab_111.setLabel("Tab 1");
		Tab tab_112 = new Tab();
		
		tab_112.addEventListener(Events.ON_SELECT, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>tab2 onSelect");
				System.out.println("data" + getJSONString(nEvent));											
			}
		});
		
		tabs_11.add(tab_112);
		tab_112.setLabel("Tab 2");
		Tabpanels tabpanels_12 = new Tabpanels();
		tabbox_1.add(tabpanels_12);
		Tabpanel tabpanel_121 = new Tabpanel();
		tabpanels_12.add(tabpanel_121);
		Label label_1211= new Label();
		tabpanel_121.add(label_1211);
		label_1211.setValue("Thisispanel1");
		Tabpanel tabpanel_122 = new Tabpanel();
		tabpanels_12.add(tabpanel_122);
		Label label_1221= new Label();
		tabpanel_122.add(label_1221);
		label_1221.setValue("Thisispanel2");

				
		return win;
	}
	
	public static final native int getSelectedIndex(JavaScriptObject js) /*-{
		return js.data.items[0].getChildIndex(); 
	}-*/;
	

	
}
