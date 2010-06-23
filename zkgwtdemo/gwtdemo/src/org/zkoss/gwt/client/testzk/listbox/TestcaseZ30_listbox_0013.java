package org.zkoss.gwt.client.testzk.listbox;

import org.zkoss.gwt.client.testzk.TestcaseWrapper;
import org.zkoss.gwt.client.zul.mesh.Auxhead;
import org.zkoss.gwt.client.zul.mesh.Auxheader;
import org.zkoss.gwt.client.zul.sel.Listbox;
import org.zkoss.gwt.client.zul.sel.Listcell;
import org.zkoss.gwt.client.zul.sel.Listhead;
import org.zkoss.gwt.client.zul.sel.Listheader;
import org.zkoss.gwt.client.zul.sel.Listitem;
import org.zkoss.gwt.client.zul.wgt.Button;
import org.zkoss.gwt.client.zul.wgt.Caption;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wgt.Separator;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

public class TestcaseZ30_listbox_0013 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
<window>
 You should see the layout of the complex listbox shows properly.
        <separator/>
        Won,t fixed: The content of auxheader "A+B" is cut to half.(Safari only)
	<window id="win" title="test VFlex!!" sizable="true"
		width="600px" height="350px" border="normal">
		<caption>
			<button label="test Selected Items" onClick="findSelected()"/>
		</caption>
		<zscript><![CDATA[
			import java.util.ArrayList;
			ArrayList list = new ArrayList();
			
			for(int i=1;i<=20;i++)
			{
				list.add(new String[] {"name"+i, i%2==1?"Male":"Female",""+i,"addr"+i});
			}
			
			void findSelected()
			{
				items = libox.getSelectedItems();
				alert("items: "+items.size());
			}
			
		]]></zscript>
		
		<listbox id="libox" width="100%" multiple="true" vflex="true">
			<listhead  sizable="true">
				<listheader label="Name" sort="auto" width="25%" image="/test2/img/coffee.gif"/>
				<listheader label="Gender" sort="auto" width="25%" image="/test2/img/folder.gif"/>
				<listheader label="Age" sort="auto" width="25%" align="center" image="/test2/img/cubfirs.gif"/>
				<listheader label="Description" width="25%" sort="auto" image="/test2/img/home.gif"/>
			</listhead>
			<auxhead>
				<auxheader label="All Header" style="font-weight:bold; color:red;" align="center" colspan="4"/>
			</auxhead>
			<auxhead>
				<auxheader label="A+B" rowspan="2" colspan="2"/>
				<auxheader label="C"/>
				<auxheader label="DE" />
			</auxhead>	
			<auxhead>
				<auxheader label="A"/>
				<auxheader label="B+C+D"/>
			</auxhead>
			<auxhead>
				<auxheader label="A+B+C"  colspan="3"/>
				<auxheader label="D"/>
			</auxhead>
			<listitem forEach="${list}">
				<listcell label="${each[0]}"/>
				<listcell label="${each[1]}"/>
				<listcell label="${each[2]}"/>
				<listcell label="${each[3]}"/>
			</listitem>
		</listbox>
	</window>
</window>
*/		
	
		/*
		 * put generated code here
		 * */
		Window window_1 = new Window();
		win.add(window_1);
		Label label_11= new Label();
		window_1.add(label_11);
		label_11.setValue("Youshouldseethelayoutofthecomplexlistboxshowsproperly.");
		Separator separator_12 = new Separator();
		window_1.add(separator_12);
		Label label_13= new Label();
		window_1.add(label_13);
		label_13.setValue("Won,tfixed:Thecontentofauxheader\"A+B\"iscuttohalf.(Safarionly)");
		Window window_14 = new Window();
		window_1.add(window_14);
		window_14.setBorder("normal");
		window_14.setHeight("350px");
		//Window has no api for setid
		window_14.setSizable(true);
		window_14.setTitle("test VFlex!!");
		window_14.setWidth("600px");
		Caption caption_141 = new Caption();
		window_14.add(caption_141);
		Button button_1411 = new Button();
		caption_141.add(button_1411);
		button_1411.setLabel("test Selected Items");
		//Button has no api for setonclick
		Listbox listbox_143 = new Listbox();
		window_14.add(listbox_143);
		//Listbox has no api for setid
		listbox_143.setMultiple(true);
		listbox_143.setVflex("true");
		listbox_143.setWidth("100%");
		Listhead listhead_1431 = new Listhead();
		listbox_143.add(listhead_1431);
		listhead_1431.setSizable(true);
		Listheader listheader_14311 = new Listheader();
		listhead_1431.add(listheader_14311);
		listheader_14311.setImage("/test2/img/coffee.gif");
		listheader_14311.setLabel("Name");
		listheader_14311.setSort("auto");
		listheader_14311.setWidth("25%");
		Listheader listheader_14312 = new Listheader();
		listhead_1431.add(listheader_14312);
		listheader_14312.setImage("/test2/img/folder.gif");
		listheader_14312.setLabel("Gender");
		listheader_14312.setSort("auto");
		listheader_14312.setWidth("25%");
		Listheader listheader_14313 = new Listheader();
		listhead_1431.add(listheader_14313);
		listheader_14313.setAlign("center");
		listheader_14313.setImage("/test2/img/cubfirs.gif");
		listheader_14313.setLabel("Age");
		listheader_14313.setSort("auto");
		listheader_14313.setWidth("25%");
		Listheader listheader_14314 = new Listheader();
		listhead_1431.add(listheader_14314);
		listheader_14314.setImage("/test2/img/home.gif");
		listheader_14314.setLabel("Description");
		listheader_14314.setSort("auto");
		listheader_14314.setWidth("25%");
		Auxhead auxhead_1432 = new Auxhead();
		listbox_143.add(auxhead_1432);
		Auxheader auxheader_14321 = new Auxheader();
		auxhead_1432.add(auxheader_14321);
		auxheader_14321.setAlign("center");
		auxheader_14321.setColspan(4);
		auxheader_14321.setLabel("All Header");
		auxheader_14321.setStyle("font-weight:bold; color:red;");
		Auxhead auxhead_1433 = new Auxhead();
		listbox_143.add(auxhead_1433);
		Auxheader auxheader_14331 = new Auxheader();
		auxhead_1433.add(auxheader_14331);
		auxheader_14331.setColspan(2);
		auxheader_14331.setLabel("A+B");
		auxheader_14331.setRowspan(2);
		Auxheader auxheader_14332 = new Auxheader();
		auxhead_1433.add(auxheader_14332);
		auxheader_14332.setLabel("C");
		Auxheader auxheader_14333 = new Auxheader();
		auxhead_1433.add(auxheader_14333);
		auxheader_14333.setLabel("DE");
		Auxhead auxhead_1434 = new Auxhead();
		listbox_143.add(auxhead_1434);
		Auxheader auxheader_14341 = new Auxheader();
		auxhead_1434.add(auxheader_14341);
		auxheader_14341.setLabel("A");
		Auxheader auxheader_14342 = new Auxheader();
		auxhead_1434.add(auxheader_14342);
		auxheader_14342.setLabel("B+C+D");
		Auxhead auxhead_1435 = new Auxhead();
		listbox_143.add(auxhead_1435);
		Auxheader auxheader_14351 = new Auxheader();
		auxhead_1435.add(auxheader_14351);
		auxheader_14351.setColspan(3);
		auxheader_14351.setLabel("A+B+C");
		Auxheader auxheader_14352 = new Auxheader();
		auxhead_1435.add(auxheader_14352);
		auxheader_14352.setLabel("D");
		Listitem listitem_1436 = new Listitem();
		listbox_143.add(listitem_1436);
		//Listitem has no api for setforeach
		Listcell listcell_14361 = new Listcell();
		listitem_1436.add(listcell_14361);
		listcell_14361.setLabel("${each[0]}");
		Listcell listcell_14362 = new Listcell();
		listitem_1436.add(listcell_14362);
		listcell_14362.setLabel("${each[1]}");
		Listcell listcell_14363 = new Listcell();
		listitem_1436.add(listcell_14363);
		listcell_14363.setLabel("${each[2]}");
		Listcell listcell_14364 = new Listcell();
		listitem_1436.add(listcell_14364);
		listcell_14364.setLabel("${each[3]}");
	

	
			
		
		return win;
	}
			
}
