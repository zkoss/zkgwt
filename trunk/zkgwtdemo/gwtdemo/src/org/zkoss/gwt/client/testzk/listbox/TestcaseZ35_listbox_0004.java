package org.zkoss.gwt.client.testzk.listbox;

import org.zkoss.gwt.client.testzk.TestcaseWrapper;
import org.zkoss.gwt.client.zul.db.Datebox;
import org.zkoss.gwt.client.zul.inp.Textbox;
import org.zkoss.gwt.client.zul.menu.Menu;
import org.zkoss.gwt.client.zul.menu.Menubar;
import org.zkoss.gwt.client.zul.menu.Menuitem;
import org.zkoss.gwt.client.zul.menu.Menupopup;
import org.zkoss.gwt.client.zul.menu.Menuseparator;
import org.zkoss.gwt.client.zul.mesh.Auxhead;
import org.zkoss.gwt.client.zul.mesh.Auxheader;
import org.zkoss.gwt.client.zul.sel.Listbox;
import org.zkoss.gwt.client.zul.sel.Listcell;
import org.zkoss.gwt.client.zul.sel.Listhead;
import org.zkoss.gwt.client.zul.sel.Listheader;
import org.zkoss.gwt.client.zul.sel.Listitem;
import org.zkoss.gwt.client.zul.wgt.Button;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wgt.Toolbarbutton;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

public class TestcaseZ35_listbox_0004 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
<listbox  fixedLayout="true" width="800px">
			<auxhead>
				<auxheader colspan="2">
					<label id="span">ss</label>
					<textbox onChange='span.value = self.value' />
					<datebox />
					Lalalalala i m happy
				</auxheader>
			</auxhead>
			<listhead sizable="true">
				<listheader sort="auto">
					<toolbarbutton label="toobarbutton" onClick='alert(self.label)'/>
					<menubar>
						<menu label="File">
							<menupopup>
								<menuitem label="New"
									onClick="alert(self.label)" />
								<menuitem label="Open"
									onClick="alert(self.label)" />
								<menuitem label="Save"
									onClick="alert(self.label)" />
								<menuseparator />
								<menuitem label="Exit"
									onClick="alert(self.label)" />
							</menupopup>
						</menu>
						<menu label="Help">
							<menupopup>
								<menuitem label="Index"
									onClick="alert(self.label)" />
								<menu label="About">
									<menupopup>
										<menuitem label="About ZK"
											onClick="alert(self.label)" />
										<menuitem label="About Potix"
											onClick="alert(self.label)" />
									</menupopup>
								</menu>
							</menupopup>
						</menu>
					</menubar>
					<button label="lable" onClick='alert("button")' />
					<datebox />
				</listheader>
				<listheader sort="auto">
					<listbox rows="1" mold="select">
						<listitem label="option1" />
						<listitem label="option2" />
						<listitem label="option3" />
					</listbox>
				</listheader>
			</listhead>
			<listitem>
				<listcell label="Maaerlhijeatlhjrnlthjnr'tljhsrl'thnjrl'gjnsr'ltjhsl'krtjhsrnltkjhsr'thry" />
				<listcell label="FEMALE" />
			</listitem>
			<listitem>
				<listcell label="John" />
				<listcell label="MALE" />
			</listitem>
			<listitem>
				<listcell label="Jane" />
				<listcell label="FEMALE" />
			</listitem>
			<listitem>
				<listcell label="WWWWWWWWWWWWWWWWWOOOOWWW" />
				<listcell label="$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" />
			</listitem>
		</listbox>


*/		
	
		/*
		 * put generated code here
		 * */
		Listbox listbox_1 = new Listbox();
		win.add(listbox_1);
		//Listbox has no api for setfixedlayout
		listbox_1.setWidth("800px");
		Auxhead auxhead_11 = new Auxhead();
		listbox_1.add(auxhead_11);
		Auxheader auxheader_111 = new Auxheader();
		auxhead_11.add(auxheader_111);
		auxheader_111.setColspan(2);
		Label label_1111 = new Label();
		auxheader_111.add(label_1111);
		//Label has no api for setid
		label_1111.setValue("ss");
		Textbox textbox_1112 = new Textbox();
		auxheader_111.add(textbox_1112);
		//Textbox has no api for setonchange
		Datebox datebox_1113 = new Datebox();
		auxheader_111.add(datebox_1113);
		Label label_1114= new Label();
		auxheader_111.add(label_1114);
		label_1114.setValue("Lalalalalaimhappy");
		Listhead listhead_12 = new Listhead();
		listbox_1.add(listhead_12);
		listhead_12.setSizable(true);
		Listheader listheader_121 = new Listheader();
		listhead_12.add(listheader_121);
		listheader_121.setSort("auto");
		Toolbarbutton toolbarbutton_1211 = new Toolbarbutton();
		listheader_121.add(toolbarbutton_1211);
		toolbarbutton_1211.setLabel("toobarbutton");
		//Toolbarbutton has no api for setonclick
		Menubar menubar_1212 = new Menubar();
		listheader_121.add(menubar_1212);
		Menu menu_12121 = new Menu();
		menubar_1212.add(menu_12121);
		menu_12121.setLabel("File");
		Menupopup menupopup_121211 = new Menupopup();
		menu_12121.add(menupopup_121211);
		Menuitem menuitem_1212111 = new Menuitem();
		menupopup_121211.add(menuitem_1212111);
		menuitem_1212111.setLabel("New");
		//Menuitem has no api for setonclick
		Menuitem menuitem_1212112 = new Menuitem();
		menupopup_121211.add(menuitem_1212112);
		menuitem_1212112.setLabel("Open");
		//Menuitem has no api for setonclick
		Menuitem menuitem_1212113 = new Menuitem();
		menupopup_121211.add(menuitem_1212113);
		menuitem_1212113.setLabel("Save");
		//Menuitem has no api for setonclick
		Menuseparator menuseparator_1212114 = new Menuseparator();
		menupopup_121211.add(menuseparator_1212114);
		Menuitem menuitem_1212115 = new Menuitem();
		menupopup_121211.add(menuitem_1212115);
		menuitem_1212115.setLabel("Exit");
		//Menuitem has no api for setonclick
		Menu menu_12122 = new Menu();
		menubar_1212.add(menu_12122);
		menu_12122.setLabel("Help");
		Menupopup menupopup_121221 = new Menupopup();
		menu_12122.add(menupopup_121221);
		Menuitem menuitem_1212211 = new Menuitem();
		menupopup_121221.add(menuitem_1212211);
		menuitem_1212211.setLabel("Index");
		//Menuitem has no api for setonclick
		Menu menu_1212212 = new Menu();
		menupopup_121221.add(menu_1212212);
		menu_1212212.setLabel("About");
		Menupopup menupopup_12122121 = new Menupopup();
		menu_1212212.add(menupopup_12122121);
		Menuitem menuitem_121221211 = new Menuitem();
		menupopup_12122121.add(menuitem_121221211);
		menuitem_121221211.setLabel("About ZK");
		//Menuitem has no api for setonclick
		Menuitem menuitem_121221212 = new Menuitem();
		menupopup_12122121.add(menuitem_121221212);
		menuitem_121221212.setLabel("About Potix");
		//Menuitem has no api for setonclick
		Button button_1213 = new Button();
		listheader_121.add(button_1213);
		button_1213.setLabel("lable");
		//Button has no api for setonclick
		Datebox datebox_1214 = new Datebox();
		listheader_121.add(datebox_1214);
		Listheader listheader_122 = new Listheader();
		listhead_12.add(listheader_122);
		listheader_122.setSort("auto");
		Listbox listbox_1221 = new Listbox();
		listheader_122.add(listbox_1221);
//		listbox_1221.setMold("select");
		listbox_1221.setRows(1);
		Listitem listitem_12211 = new Listitem();
		listbox_1221.add(listitem_12211);
		listitem_12211.setLabel("option1");
		Listitem listitem_12212 = new Listitem();
		listbox_1221.add(listitem_12212);
		listitem_12212.setLabel("option2");
		Listitem listitem_12213 = new Listitem();
		listbox_1221.add(listitem_12213);
		listitem_12213.setLabel("option3");
		Listitem listitem_13 = new Listitem();
		listbox_1.add(listitem_13);
		Listcell listcell_131 = new Listcell();
		listitem_13.add(listcell_131);
		listcell_131.setLabel("Maaerlhijeatlhjrnlthjnr'tljhsrl'thnjrl'gjnsr'ltjhsl'krtjhsrnltkjhsr'thry");
		Listcell listcell_132 = new Listcell();
		listitem_13.add(listcell_132);
		listcell_132.setLabel("FEMALE");
		Listitem listitem_14 = new Listitem();
		listbox_1.add(listitem_14);
		Listcell listcell_141 = new Listcell();
		listitem_14.add(listcell_141);
		listcell_141.setLabel("John");
		Listcell listcell_142 = new Listcell();
		listitem_14.add(listcell_142);
		listcell_142.setLabel("MALE");
		Listitem listitem_15 = new Listitem();
		listbox_1.add(listitem_15);
		Listcell listcell_151 = new Listcell();
		listitem_15.add(listcell_151);
		listcell_151.setLabel("Jane");
		Listcell listcell_152 = new Listcell();
		listitem_15.add(listcell_152);
		listcell_152.setLabel("FEMALE");
		Listitem listitem_16 = new Listitem();
		listbox_1.add(listitem_16);
		Listcell listcell_161 = new Listcell();
		listitem_16.add(listcell_161);
		listcell_161.setLabel("WWWWWWWWWWWWWWWWWOOOOWWW");
		Listcell listcell_162 = new Listcell();
		listitem_16.add(listcell_162);
		listcell_162.setLabel("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


	
			
		
		return win;
	}
	
		
}
