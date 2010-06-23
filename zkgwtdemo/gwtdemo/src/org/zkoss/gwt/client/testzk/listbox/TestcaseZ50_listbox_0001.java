package org.zkoss.gwt.client.testzk.listbox;

import org.zkoss.gwt.client.testzk.TestcaseWrapper;
import org.zkoss.gwt.client.zkex.sel.Listgroup;
import org.zkoss.gwt.client.zkex.sel.Listgroupfoot;
import org.zkoss.gwt.client.zul.sel.Listbox;
import org.zkoss.gwt.client.zul.sel.Listcell;
import org.zkoss.gwt.client.zul.sel.Listfoot;
import org.zkoss.gwt.client.zul.sel.Listfooter;
import org.zkoss.gwt.client.zul.sel.Listhead;
import org.zkoss.gwt.client.zul.sel.Listheader;
import org.zkoss.gwt.client.zul.sel.Listitem;
import org.zkoss.gwt.client.zul.wgt.Button;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wgt.Separator;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

public class TestcaseZ50_listbox_0001 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
<window>
Follow the order to click button without error
<separator/>
1. Click this only once to <button label="Remove listheader" onClick='listhead.detach();'></button>
<separator/>
2. Click this only once to <button label="Add listhead" onClick='Listhead head = new Listhead(); head.setId("listhead"); head.setParent(listbox);'></button>
<separator/>
3. Click this to <button label="Add listheader" onClick='listhead.appendChild(new Listheader("Added listheader"));'></button>
<separator/>
4. Click this only once to <button label="Remove listgroupfoot" onClick='listgroupfoot1.detach();'></button>
<separator/>
5. Click this only once to <button label="Remove listgroup" onClick='listgroup1.detach();'></button>
<separator/>
6. Click this to <button label="Add listgroup" onClick='Listgroup group = new Listgroup("Added listgroup"); group.setParent(listbox); '></button>
<separator/>
7. Click this to <button label="Add listgroupfoot" onClick='Listgroupfoot footer = new Listgroupfoot("Added listgroupfoot"); footer.setParent(listbox);'></button>
<separator/>
8. Click this only once to <button label="Remove listfoot" onClick='listfoot.detach();'></button>
<separator/>
9. Click this only once to <button label="Add listfoot" onClick='Listfoot listfoot = new Listfoot(); listfoot.setId("listfoot");listfoot.setParent(listbox); '></button>
<separator/>
10. Click to <button label="Add listfooter to listfoot" onClick='listfoot.appendChild(new Listfooter("Added listfooter"));'></button>
<separator height="20px"/>
<listbox id="listbox" width="500px">
	<listhead id="listhead">
		<listheader id="listheader" label="listheader" />
	</listhead>
	<listgroup id="listgroup1" label="listgroup 1"/>
	<listitem>
		<listcell label="cell 1" />
	</listitem>
	<listitem>
		<listcell label="cell 2" />
	</listitem>
	<listitem>
		<listcell label="cell 3" />
	</listitem>
	<listgroupfoot id="listgroupfoot1" label="listfooter 1"/>
	<listgroup id="listgroup2" label="listgroup 2"/>
	<listitem>
		<listcell label="cell 4" />
	</listitem>
	<listitem>
		<listcell label="cell 5" />
	</listitem>
	<listitem>
		<listcell label="cell 6" />
	</listitem>
	<listgroupfoot id="listgroupfoot2" label="listfooter 2"/>
	<listfoot id="listfoot">
		<listfooter id="listfooter" label="listfooter"/>
	</listfoot>
</listbox>
</window>
*/		
	
		/*
		 * put generated code here
		 * */
		Window window_1 = new Window();
		win.add(window_1);
		Label label_11= new Label();
		window_1.add(label_11);
		label_11.setValue("Followtheordertoclickbuttonwithouterror");
		Separator separator_12 = new Separator();
		window_1.add(separator_12);
		Label label_13= new Label();
		window_1.add(label_13);
		label_13.setValue("1.Clickthisonlyonceto");
		Button button_14 = new Button();
		window_1.add(button_14);
		button_14.setLabel("Remove listheader");
		//Button has no api for setonclick
		Separator separator_15 = new Separator();
		window_1.add(separator_15);
		Label label_16= new Label();
		window_1.add(label_16);
		label_16.setValue("2.Clickthisonlyonceto");
		Button button_17 = new Button();
		window_1.add(button_17);
		button_17.setLabel("Add listhead");
		//Button has no api for setonclick
		Separator separator_18 = new Separator();
		window_1.add(separator_18);
		Label label_19= new Label();
		window_1.add(label_19);
		label_19.setValue("3.Clickthisto");
		Button button_110 = new Button();
		window_1.add(button_110);
		button_110.setLabel("Add listheader");
		//Button has no api for setonclick
		Separator separator_111 = new Separator();
		window_1.add(separator_111);
		Label label_112= new Label();
		window_1.add(label_112);
		label_112.setValue("4.Clickthisonlyonceto");
		Button button_113 = new Button();
		window_1.add(button_113);
		button_113.setLabel("Remove listgroupfoot");
		//Button has no api for setonclick
		Separator separator_114 = new Separator();
		window_1.add(separator_114);
		Label label_115= new Label();
		window_1.add(label_115);
		label_115.setValue("5.Clickthisonlyonceto");
		Button button_116 = new Button();
		window_1.add(button_116);
		button_116.setLabel("Remove listgroup");
		//Button has no api for setonclick
		Separator separator_117 = new Separator();
		window_1.add(separator_117);
		Label label_118= new Label();
		window_1.add(label_118);
		label_118.setValue("6.Clickthisto");
		Button button_119 = new Button();
		window_1.add(button_119);
		button_119.setLabel("Add listgroup");
		//Button has no api for setonclick
		Separator separator_120 = new Separator();
		window_1.add(separator_120);
		Label label_121= new Label();
		window_1.add(label_121);
		label_121.setValue("7.Clickthisto");
		Button button_122 = new Button();
		window_1.add(button_122);
		button_122.setLabel("Add listgroupfoot");
		//Button has no api for setonclick
		Separator separator_123 = new Separator();
		window_1.add(separator_123);
		Label label_124= new Label();
		window_1.add(label_124);
		label_124.setValue("8.Clickthisonlyonceto");
		Button button_125 = new Button();
		window_1.add(button_125);
		button_125.setLabel("Remove listfoot");
		//Button has no api for setonclick
		Separator separator_126 = new Separator();
		window_1.add(separator_126);
		Label label_127= new Label();
		window_1.add(label_127);
		label_127.setValue("9.Clickthisonlyonceto");
		Button button_128 = new Button();
		window_1.add(button_128);
		button_128.setLabel("Add listfoot");
		//Button has no api for setonclick
		Separator separator_129 = new Separator();
		window_1.add(separator_129);
		Label label_130= new Label();
		window_1.add(label_130);
		label_130.setValue("10.Clickto");
		Button button_131 = new Button();
		window_1.add(button_131);
		button_131.setLabel("Add listfooter to listfoot");
		//Button has no api for setonclick
		Separator separator_132 = new Separator();
		window_1.add(separator_132);
		separator_132.setHeight("20px");
		Listbox listbox_133 = new Listbox();
		window_1.add(listbox_133);
		//Listbox has no api for setid
		listbox_133.setWidth("500px");
		Listhead listhead_1331 = new Listhead();
		listbox_133.add(listhead_1331);
		//Listhead has no api for setid
		Listheader listheader_13311 = new Listheader();
		listhead_1331.add(listheader_13311);
		//Listheader has no api for setid
		listheader_13311.setLabel("listheader");
		Listgroup listgroup_1332 = new Listgroup();
		listbox_133.add(listgroup_1332);
		//Listgroup has no api for setid
		listgroup_1332.setLabel("listgroup 1");
		Listitem listitem_1333 = new Listitem();
		listbox_133.add(listitem_1333);
		Listcell listcell_13331 = new Listcell();
		listitem_1333.add(listcell_13331);
		listcell_13331.setLabel("cell 1");
		Listitem listitem_1334 = new Listitem();
		listbox_133.add(listitem_1334);
		Listcell listcell_13341 = new Listcell();
		listitem_1334.add(listcell_13341);
		listcell_13341.setLabel("cell 2");
		Listitem listitem_1335 = new Listitem();
		listbox_133.add(listitem_1335);
		Listcell listcell_13351 = new Listcell();
		listitem_1335.add(listcell_13351);
		listcell_13351.setLabel("cell 3");
		Listgroupfoot listgroupfoot_1336 = new Listgroupfoot();
		listbox_133.add(listgroupfoot_1336);
		//Listgroupfoot has no api for setid
		listgroupfoot_1336.setLabel("listfooter 1");
		Listgroup listgroup_1337 = new Listgroup();
		listbox_133.add(listgroup_1337);
		//Listgroup has no api for setid
		listgroup_1337.setLabel("listgroup 2");
		Listitem listitem_1338 = new Listitem();
		listbox_133.add(listitem_1338);
		Listcell listcell_13381 = new Listcell();
		listitem_1338.add(listcell_13381);
		listcell_13381.setLabel("cell 4");
		Listitem listitem_1339 = new Listitem();
		listbox_133.add(listitem_1339);
		Listcell listcell_13391 = new Listcell();
		listitem_1339.add(listcell_13391);
		listcell_13391.setLabel("cell 5");
		Listitem listitem_13310 = new Listitem();
		listbox_133.add(listitem_13310);
		Listcell listcell_133101 = new Listcell();
		listitem_13310.add(listcell_133101);
		listcell_133101.setLabel("cell 6");
		Listgroupfoot listgroupfoot_13311 = new Listgroupfoot();
		listbox_133.add(listgroupfoot_13311);
		//Listgroupfoot has no api for setid
		listgroupfoot_13311.setLabel("listfooter 2");
		Listfoot listfoot_13312 = new Listfoot();
		listbox_133.add(listfoot_13312);
		//Listfoot has no api for setid
		Listfooter listfooter_133121 = new Listfooter();
		listfoot_13312.add(listfooter_133121);
		//Listfooter has no api for setid
		listfooter_133121.setLabel("listfooter");
	

	
			
		
		return win;
	}
	
}
