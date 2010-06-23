package org.zkoss.gwt.client.testzk.listbox;

import org.zkoss.gwt.client.testzk.TestcaseWrapper;
import org.zkoss.gwt.client.zul.sel.Listbox;
import org.zkoss.gwt.client.zul.sel.Listcell;
import org.zkoss.gwt.client.zul.sel.Listhead;
import org.zkoss.gwt.client.zul.sel.Listheader;
import org.zkoss.gwt.client.zul.sel.Listitem;
import org.zkoss.gwt.client.zul.wgt.Button;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

public class TestcaseZ30_listbox_0003 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
<window>
Test dynamically select the second listitem.
<listbox rows="3" width="400px">
	<listhead>
		<listheader label="Population"/>
		<listheader label="Percentage"/>
		<listheader label="Description"/>
	</listhead>
	<listitem id="li0" value="A">
		<listcell label="A. Graduate"/>
		<listcell label="20%"/>
		<listcell label="More or less"/>
	</listitem>
	<listitem id="li1" value="B">
		<listcell label="B. College"/>
		<listcell label="23%"/>
		<listcell label="More or less"/>
	</listitem>
	<listitem value="C" selected="true">
		<listcell label="C. High School"/>
		<listcell label="40%"/>
		<listcell label="More or less"/>
	</listitem>
	<listitem value="D">
		<listcell label="D. Junior High School"/>
		<listcell label="10%"/>
		<listcell label="More or less"/>
	</listitem>
	<listitem value="E">
		<listcell label="F. Others"/>
		<listcell label="17%"/>
		<listcell label="More or less"/>
	</listitem>
</listbox>
<button label="Select 2nd" onClick="li1.selected = true"/>
</window>
*/		
	
		/*
		 * put generated code here
		 * */
		Window window_1 = new Window();
		win.add(window_1);
		Label label_11= new Label();
		win.add(label_11);
		label_11.setValue("Testdynamicallyselectthesecondlistitem.");
		Listbox listbox_12 = new Listbox();
		window_1.add(listbox_12);
		listbox_12.setRows(3);
		listbox_12.setWidth("400px");
		Listhead listhead_121 = new Listhead();
		listbox_12.add(listhead_121);
		Listheader listheader_1211 = new Listheader();
		listhead_121.add(listheader_1211);
		listheader_1211.setLabel("Population");
		Listheader listheader_1212 = new Listheader();
		listhead_121.add(listheader_1212);
		listheader_1212.setLabel("Percentage");
		Listheader listheader_1213 = new Listheader();
		listhead_121.add(listheader_1213);
		listheader_1213.setLabel("Description");
		Listitem listitem_122 = new Listitem();
		listbox_12.add(listitem_122);
		//Listitem has no api for setid
		listitem_122.setValue("A");
		Listcell listcell_1221 = new Listcell();
		listitem_122.add(listcell_1221);
		listcell_1221.setLabel("A. Graduate");
		Listcell listcell_1222 = new Listcell();
		listitem_122.add(listcell_1222);
		listcell_1222.setLabel("20%");
		Listcell listcell_1223 = new Listcell();
		listitem_122.add(listcell_1223);
		listcell_1223.setLabel("More or less");
		Listitem listitem_123 = new Listitem();
		listbox_12.add(listitem_123);
		//Listitem has no api for setid
		listitem_123.setValue("B");
		Listcell listcell_1231 = new Listcell();
		listitem_123.add(listcell_1231);
		listcell_1231.setLabel("B. College");
		Listcell listcell_1232 = new Listcell();
		listitem_123.add(listcell_1232);
		listcell_1232.setLabel("23%");
		Listcell listcell_1233 = new Listcell();
		listitem_123.add(listcell_1233);
		listcell_1233.setLabel("More or less");
		Listitem listitem_124 = new Listitem();
		listbox_12.add(listitem_124);
		listitem_124.setSelected(true);
		listitem_124.setValue("C");
		Listcell listcell_1241 = new Listcell();
		listitem_124.add(listcell_1241);
		listcell_1241.setLabel("C. High School");
		Listcell listcell_1242 = new Listcell();
		listitem_124.add(listcell_1242);
		listcell_1242.setLabel("40%");
		Listcell listcell_1243 = new Listcell();
		listitem_124.add(listcell_1243);
		listcell_1243.setLabel("More or less");
		Listitem listitem_125 = new Listitem();
		listbox_12.add(listitem_125);
		listitem_125.setValue("D");
		Listcell listcell_1251 = new Listcell();
		listitem_125.add(listcell_1251);
		listcell_1251.setLabel("D. Junior High School");
		Listcell listcell_1252 = new Listcell();
		listitem_125.add(listcell_1252);
		listcell_1252.setLabel("10%");
		Listcell listcell_1253 = new Listcell();
		listitem_125.add(listcell_1253);
		listcell_1253.setLabel("More or less");
		Listitem listitem_126 = new Listitem();
		listbox_12.add(listitem_126);
		listitem_126.setValue("E");
		Listcell listcell_1261 = new Listcell();
		listitem_126.add(listcell_1261);
		listcell_1261.setLabel("F. Others");
		Listcell listcell_1262 = new Listcell();
		listitem_126.add(listcell_1262);
		listcell_1262.setLabel("17%");
		Listcell listcell_1263 = new Listcell();
		listitem_126.add(listcell_1263);
		listcell_1263.setLabel("More or less");
		Button button_13 = new Button();
		window_1.add(button_13);
		button_13.setLabel("Select 2nd");
		//Button has no api for setonclick

	

	
			
		
		return win;
	}
	

}
