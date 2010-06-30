package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zk.Event;
import org.zkoss.gwt.client.zk.EventListener;
import org.zkoss.gwt.client.zk.Events;
import org.zkoss.gwt.client.zul.inp.Combobox;
import org.zkoss.gwt.client.zul.inp.Comboitem;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

public class TestcaseCombobox extends TestcaseWrapper {
			
	public Widget getInstance() {		
		Window win = new Window();

/*		
		<combobox onSelect="123;">
			<comboitem label="Simple and Rich" />
			<comboitem label="Cool!" />
			<comboitem label="Thumbs Up!" />
		</combobox>
*/
		
		Combobox combobox = new Combobox();
		Comboitem cb1 = new Comboitem();
		cb1.setLabel("Simple and Rich");
		combobox.add(cb1);
		Comboitem cb2 = new Comboitem();
		cb2.setLabel("Cool!");
		combobox.add(cb2);
		Comboitem cb3 = new Comboitem();
		cb3.setLabel("Thumbs Up!");
		combobox.add(cb3);
		
		combobox.addEventListener(Events.ON_SELECT, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>combobox onselect");
				System.out.println("data" + getJSONString(nEvent));			
				System.out.println("selected index = " + getSelectedIndex(nEvent));				
			}
		});

		combobox.addEventListener(Events.ON_OPEN, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>combobox onOpen");
				System.out.println("data" + getJSONString(nEvent));			
								
			}
		});

		win.add(combobox);
				
		return win;
	}

	public static final native int getSelectedIndex(JavaScriptObject js) /*-{
		return js.data.items[0].getChildIndex(); 
	}-*/;
}
