package org.zkoss.gwt.client.testzk.listbox;

import org.zkoss.gwt.client.testzk.TestcaseWrapper;
import org.zkoss.gwt.client.zul.inp.Textbox;
import org.zkoss.gwt.client.zul.sel.Listbox;
import org.zkoss.gwt.client.zul.sel.Listcell;
import org.zkoss.gwt.client.zul.sel.Listhead;
import org.zkoss.gwt.client.zul.sel.Listheader;
import org.zkoss.gwt.client.zul.sel.Listitem;
import org.zkoss.gwt.client.zul.wgt.Button;
import org.zkoss.gwt.client.zul.wgt.Checkbox;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

public class TestcaseZ30_listbox_0008 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
<window>
The complex listbox should show properly.
<listbox>
	<listhead>
		<listheader label="Population"/>
		<listheader label="%"/>
	</listhead>
	<listitem value="A">
		<listcell><textbox value="A. Graduate"/></listcell>
		<listcell label="20%"/>
	</listitem>
	<listitem value="B">
		<listcell><checkbox label="B. College"/></listcell>
		<listcell><button label="23%"/></listcell>
	</listitem>
	<listitem value="C">
		<listcell label="C. High School"/>
		<listcell><textbox cols="8" value="40%"/></listcell>
	</listitem>
</listbox>
<listbox>
	<listhead>
		<listheader/>
		<listheader align="right"/>
	</listhead>
	<listitem value="X">
		<listcell label="X. Graduate"/>
		<listcell label="20%"/>
	</listitem>
	<listitem value="Y">
		<listcell label="Y. College"/>
		<listcell label="23%"/>
	</listitem>
	<listitem value="Z">
		<listcell label="Z. High School"/>
		<listcell label="40%"/>
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
		label_11.setValue("Thecomplexlistboxshouldshowproperly.");
		Listbox listbox_12 = new Listbox();
		window_1.add(listbox_12);
		Listhead listhead_121 = new Listhead();
		listbox_12.add(listhead_121);
		Listheader listheader_1211 = new Listheader();
		listhead_121.add(listheader_1211);
		listheader_1211.setLabel("Population");
		Listheader listheader_1212 = new Listheader();
		listhead_121.add(listheader_1212);
		listheader_1212.setLabel("%");
		Listitem listitem_122 = new Listitem();
		listbox_12.add(listitem_122);
		listitem_122.setValue("A");
		Listcell listcell_1221 = new Listcell();
		listitem_122.add(listcell_1221);
		Textbox textbox_12211 = new Textbox();
		listcell_1221.add(textbox_12211);
		textbox_12211.setValue("A. Graduate",false);
		Listcell listcell_1222 = new Listcell();
		listitem_122.add(listcell_1222);
		listcell_1222.setLabel("20%");
		Listitem listitem_123 = new Listitem();
		listbox_12.add(listitem_123);
		listitem_123.setValue("B");
		Listcell listcell_1231 = new Listcell();
		listitem_123.add(listcell_1231);
		Checkbox checkbox_12311 = new Checkbox();
		listcell_1231.add(checkbox_12311);
		checkbox_12311.setLabel("B. College");
		Listcell listcell_1232 = new Listcell();
		listitem_123.add(listcell_1232);
		Button button_12321 = new Button();
		listcell_1232.add(button_12321);
		button_12321.setLabel("23%");
		Listitem listitem_124 = new Listitem();
		listbox_12.add(listitem_124);
		listitem_124.setValue("C");
		Listcell listcell_1241 = new Listcell();
		listitem_124.add(listcell_1241);
		listcell_1241.setLabel("C. High School");
		Listcell listcell_1242 = new Listcell();
		listitem_124.add(listcell_1242);
		Textbox textbox_12421 = new Textbox();
		listcell_1242.add(textbox_12421);
		textbox_12421.setCols(8);
		textbox_12421.setValue("40%",false);
		Listbox listbox_13 = new Listbox();
		window_1.add(listbox_13);
		Listhead listhead_131 = new Listhead();
		listbox_13.add(listhead_131);
		Listheader listheader_1311 = new Listheader();
		listhead_131.add(listheader_1311);
		Listheader listheader_1312 = new Listheader();
		listhead_131.add(listheader_1312);
		listheader_1312.setAlign("right");
		Listitem listitem_132 = new Listitem();
		listbox_13.add(listitem_132);
		listitem_132.setValue("X");
		Listcell listcell_1321 = new Listcell();
		listitem_132.add(listcell_1321);
		listcell_1321.setLabel("X. Graduate");
		Listcell listcell_1322 = new Listcell();
		listitem_132.add(listcell_1322);
		listcell_1322.setLabel("20%");
		Listitem listitem_133 = new Listitem();
		listbox_13.add(listitem_133);
		listitem_133.setValue("Y");
		Listcell listcell_1331 = new Listcell();
		listitem_133.add(listcell_1331);
		listcell_1331.setLabel("Y. College");
		Listcell listcell_1332 = new Listcell();
		listitem_133.add(listcell_1332);
		listcell_1332.setLabel("23%");
		Listitem listitem_134 = new Listitem();
		listbox_13.add(listitem_134);
		listitem_134.setValue("Z");
		Listcell listcell_1341 = new Listcell();
		listitem_134.add(listcell_1341);
		listcell_1341.setLabel("Z. High School");
		Listcell listcell_1342 = new Listcell();
		listitem_134.add(listcell_1342);
		listcell_1342.setLabel("40%");
	

	
			
		
		return win;
	}
	
	
}
