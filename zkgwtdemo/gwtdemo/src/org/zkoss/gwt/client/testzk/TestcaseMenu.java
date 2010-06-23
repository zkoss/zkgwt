package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zk.Event;
import org.zkoss.gwt.client.zk.EventListener;
import org.zkoss.gwt.client.zk.Events;
import org.zkoss.gwt.client.zul.menu.Menu;
import org.zkoss.gwt.client.zul.menu.Menubar;
import org.zkoss.gwt.client.zul.menu.Menuitem;
import org.zkoss.gwt.client.zul.menu.Menupopup;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;


public class TestcaseMenu extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();

/*
<menubar>
	<menu label="File">
	     <menupopup>
	         <menuitem label="New" />
	         <menuitem label="Open" />
	     </menupopup>
	 </menu>
</menubar>
*/
		
		Menubar comp = new Menubar();
		
			Menu menu = new Menu();
			comp.add(menu);
			menu.setLabel("File");
				Menupopup mp = new Menupopup();
				menu.add(mp);
					Menuitem mi1 = new Menuitem();
					mp.add(mi1);
					mi1.setLabel("New");
					
					
					
					Menuitem mi2 = new Menuitem();
					mp.add(mi2);
					mi2.setLabel("Open");

					mi1.addEventListener(Events.ON_CLICK, new EventListener() {
						public void onEvent(Event event) {				
							JavaScriptObject nEvent = event.getNativeEvent();				
							System.out.println(">>mi1 ON_CLICK");
							System.out.println("data" + getJSONString(nEvent));			
											
						}
					});

					mi2.addEventListener(Events.ON_CLICK, new EventListener() {
						public void onEvent(Event event) {				
							JavaScriptObject nEvent = event.getNativeEvent();				
							System.out.println(">>mi2 ON_CLICK");
							System.out.println("data" + getJSONString(nEvent));			
											
						}
					});
					
					
		win.add(comp);
				
		return win;
	}
	
	public static final native int getSelectedIndex(JavaScriptObject js) /*-{
		return js.data.items[0].getChildIndex(); 
	}-*/;
	
}
