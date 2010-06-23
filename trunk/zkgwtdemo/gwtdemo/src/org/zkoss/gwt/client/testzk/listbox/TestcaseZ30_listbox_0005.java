package org.zkoss.gwt.client.testzk.listbox;

import org.zkoss.gwt.client.testzk.TestcaseWrapper;
import org.zkoss.gwt.client.zul.sel.Listbox;
import org.zkoss.gwt.client.zul.sel.Listcell;
import org.zkoss.gwt.client.zul.sel.Listhead;
import org.zkoss.gwt.client.zul.sel.Listheader;
import org.zkoss.gwt.client.zul.sel.Listitem;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

public class TestcaseZ30_listbox_0005 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
<window>
H scroll only
<listbox width="80px">
	<listhead>
		<listheader width="50px" label="Population"/>
		<listheader width="50px" label="%"/>
	</listhead>
	<listitem value="A">
		<listcell label="A. Graduate"/>
		<listcell label="20%"/>
	</listitem>
	<listitem value="B">
		<listcell label="B. College"/>
		<listcell label="23%"/>
	</listitem>
	<listitem value="C">
		<listcell label="C. High School"/>
		<listcell label="40%"/>
	</listitem>
	<listitem value="D">
		<listcell label="D. Junior High School"/>
		<listcell label="10%"/>
	</listitem>
	<listitem value="E">
		<listcell label="F. Others"/>
		<listcell label="17%"/>
	</listitem>
</listbox>
</window>
*/		
	
		/*
		 * put generated code here
		 * */
		Window window_1 = new Window();
		win.add(window_1);
		Label label_11= new Label();
		win.add(label_11);
		label_11.setValue("Hscrollonly");
		Listbox listbox_12 = new Listbox();
		window_1.add(listbox_12);
		listbox_12.setWidth("80px");
		Listhead listhead_121 = new Listhead();
		listbox_12.add(listhead_121);
		Listheader listheader_1211 = new Listheader();
		listhead_121.add(listheader_1211);
		listheader_1211.setLabel("Population");
		listheader_1211.setWidth("50px");
		Listheader listheader_1212 = new Listheader();
		listhead_121.add(listheader_1212);
		listheader_1212.setLabel("%");
		listheader_1212.setWidth("50px");
		Listitem listitem_122 = new Listitem();
		listbox_12.add(listitem_122);
		listitem_122.setValue("A");
		Listcell listcell_1221 = new Listcell();
		listitem_122.add(listcell_1221);
		listcell_1221.setLabel("A. Graduate");
		Listcell listcell_1222 = new Listcell();
		listitem_122.add(listcell_1222);
		listcell_1222.setLabel("20%");
		Listitem listitem_123 = new Listitem();
		listbox_12.add(listitem_123);
		listitem_123.setValue("B");
		Listcell listcell_1231 = new Listcell();
		listitem_123.add(listcell_1231);
		listcell_1231.setLabel("B. College");
		Listcell listcell_1232 = new Listcell();
		listitem_123.add(listcell_1232);
		listcell_1232.setLabel("23%");
		Listitem listitem_124 = new Listitem();
		listbox_12.add(listitem_124);
		listitem_124.setValue("C");
		Listcell listcell_1241 = new Listcell();
		listitem_124.add(listcell_1241);
		listcell_1241.setLabel("C. High School");
		Listcell listcell_1242 = new Listcell();
		listitem_124.add(listcell_1242);
		listcell_1242.setLabel("40%");
		Listitem listitem_125 = new Listitem();
		listbox_12.add(listitem_125);
		listitem_125.setValue("D");
		Listcell listcell_1251 = new Listcell();
		listitem_125.add(listcell_1251);
		listcell_1251.setLabel("D. Junior High School");
		Listcell listcell_1252 = new Listcell();
		listitem_125.add(listcell_1252);
		listcell_1252.setLabel("10%");
		Listitem listitem_126 = new Listitem();
		listbox_12.add(listitem_126);
		listitem_126.setValue("E");
		Listcell listcell_1261 = new Listcell();
		listitem_126.add(listcell_1261);
		listcell_1261.setLabel("F. Others");
		Listcell listcell_1262 = new Listcell();
		listitem_126.add(listcell_1262);
		listcell_1262.setLabel("17%");
	

	
			
		
		return win;
	}
	
	
}
