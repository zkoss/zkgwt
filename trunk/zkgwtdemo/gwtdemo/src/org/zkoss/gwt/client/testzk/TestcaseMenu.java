package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.menu.Menu;
import org.zkoss.gwt.client.zul.menu.Menubar;
import org.zkoss.gwt.client.zul.menu.Menuitem;
import org.zkoss.gwt.client.zul.menu.Menupopup;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseMenu {
	public static Widget getInstance() {
		
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

		
		win.add(comp);
				
		return win;
	}
}
