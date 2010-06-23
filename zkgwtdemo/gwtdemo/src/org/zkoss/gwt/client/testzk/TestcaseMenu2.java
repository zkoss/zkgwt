package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zk.Event;
import org.zkoss.gwt.client.zk.EventListener;
import org.zkoss.gwt.client.zk.Events;
import org.zkoss.gwt.client.zul.menu.Menu;
import org.zkoss.gwt.client.zul.menu.Menubar;
import org.zkoss.gwt.client.zul.menu.Menuitem;
import org.zkoss.gwt.client.zul.menu.Menupopup;
import org.zkoss.gwt.client.zul.menu.Menuseparator;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;


public class TestcaseMenu2 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();

/*
	<window title="Menu Demo" border="normal">
		<menubar id="menubar">
			<menu label="File">
				<menupopup>
					<menuitem label="New" onClick="alert(self.label)"/>
					<menuitem label="Open" onClick="alert(self.label)"/>
					<menuitem label="Save" onClick="alert(self.label)"/>
					<menuseparator/>
					<menuitem label="Exit" onClick="alert(self.label)"/>
				</menupopup>
			</menu>
			<menu label="Help">
				<menupopup>
					<menuitem label="Index" onClick="alert(self.label)"/><menuseparator/>
					<menu label="About">
						<menupopup>
							<menuitem label="About ZK" onClick="alert(self.label)"/>
							<menuitem label="About Potix" onClick="alert(self.label)"/>
						</menupopup>
					</menu>
				</menupopup>
			</menu>
		</menubar>
	</window>
*/
		
		Window window_1 = new Window();
		win.add(window_1);
		window_1.setBorder("normal");
		window_1.setTitle("Menu Demo");
		Menubar menubar_11 = new Menubar();
		window_1.add(menubar_11);
		//Menubar has no api for setid
		Menu menu_111 = new Menu();
		menubar_11.add(menu_111);
		menu_111.setLabel("File");
		Menupopup menupopup_1111 = new Menupopup();
		menu_111.add(menupopup_1111);
		Menuitem menuitem_11111 = new Menuitem();
		menupopup_1111.add(menuitem_11111);
		menuitem_11111.setLabel("New");
		//Menuitem has no api for setonclick
		Menuitem menuitem_11112 = new Menuitem();
		menupopup_1111.add(menuitem_11112);
		menuitem_11112.setLabel("Open");
		//Menuitem has no api for setonclick
		Menuitem menuitem_11113 = new Menuitem();
		menupopup_1111.add(menuitem_11113);
		menuitem_11113.setLabel("Save");
		//Menuitem has no api for setonclick
		Menuseparator menuseparator_11114 = new Menuseparator();
		menupopup_1111.add(menuseparator_11114);
		Menuitem menuitem_11115 = new Menuitem();
		menupopup_1111.add(menuitem_11115);
		menuitem_11115.setLabel("Exit");
		//Menuitem has no api for setonclick
		Menu menu_112 = new Menu();
		menubar_11.add(menu_112);
		menu_112.setLabel("Help");
		Menupopup menupopup_1121 = new Menupopup();
		menu_112.add(menupopup_1121);
		Menuitem menuitem_11211 = new Menuitem();
		menupopup_1121.add(menuitem_11211);
		menuitem_11211.setLabel("Index");
		//Menuitem has no api for setonclick
		Menuseparator menuseparator_11212 = new Menuseparator();
		menupopup_1121.add(menuseparator_11212);
		Menu menu_11213 = new Menu();
		menupopup_1121.add(menu_11213);
		menu_11213.setLabel("About");
		Menupopup menupopup_112131 = new Menupopup();
		menu_11213.add(menupopup_112131);
		Menuitem menuitem_1121311 = new Menuitem();
		menupopup_112131.add(menuitem_1121311);
		menuitem_1121311.setLabel("About ZK");
		//Menuitem has no api for setonclick
		Menuitem menuitem_1121312 = new Menuitem();
		menupopup_112131.add(menuitem_1121312);
		menuitem_1121312.setLabel("About Potix");
		//Menuitem has no api for setonclick

		return win;
	}
	
	public static final native int getSelectedIndex(JavaScriptObject js) /*-{
		return js.data.items[0].getChildIndex(); 
	}-*/;
	
	
}
