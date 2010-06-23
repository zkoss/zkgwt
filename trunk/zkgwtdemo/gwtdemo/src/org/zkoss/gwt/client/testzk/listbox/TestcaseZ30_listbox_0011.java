package org.zkoss.gwt.client.testzk.listbox;

import org.zkoss.gwt.client.testzk.TestcaseWrapper;
import org.zkoss.gwt.client.zul.mesh.Auxhead;
import org.zkoss.gwt.client.zul.mesh.Auxheader;
import org.zkoss.gwt.client.zul.sel.Listbox;
import org.zkoss.gwt.client.zul.sel.Listcell;
import org.zkoss.gwt.client.zul.sel.Listfoot;
import org.zkoss.gwt.client.zul.sel.Listfooter;
import org.zkoss.gwt.client.zul.sel.Listhead;
import org.zkoss.gwt.client.zul.sel.Listheader;
import org.zkoss.gwt.client.zul.sel.Listitem;
import org.zkoss.gwt.client.zul.wgt.Image;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

public class TestcaseZ30_listbox_0011 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
<window>
	The complex listbox should show properly.
	<label value="Aux's rowspan in FF Win lost border"/>
	<listbox id="box" width="700px" multiple="true"  checkmark="true">
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
		<listhead  sizable="true">
			<listheader label="Name" sort="auto" width="25%" image="/test2/img/coffee.gif"/>
			<listheader label="Gender" sort="auto" width="25%" image="/test2/img/folder.gif"/>
			<listheader label="Age" sort="auto" width="25%" align="center" image="/test2/img/cubfirs.gif"/>
			<listheader label="Description" width="25%" sort="auto" image="/test2/img/home.gif"/>
		</listhead>
		<listitem>
			<listcell label="Mary"/>
			<listcell label="FEMALE"/>
			<listcell label="18"/>
			<listcell label="A young lady."/>
		</listitem>
		<listitem>
			<listcell label="John"/>
			<listcell label="MALE"/>
			<listcell label="20"/>
			<listcell label="A college student."/>
		</listitem>
		<listitem>
			<listcell label="Jane"/>
			<listcell label="FEMALE"/>
			<listcell label="32"/>
			<listcell label="A remarkable artist."/>
		</listitem>
		<listitem>
			<listcell label="Henry"/>
			<listcell label="MALE"/>
			<listcell label="29"/>
			<listcell label="A graduate."/>
		</listitem>
		<listitem>
			<listcell label="Ian"/>
			<listcell label="MALE"/>
			<listcell label="27"/>
			<listcell label="Tester."/>
		</listitem>
		<listitem>
			<listcell label="Dennis"/>
			<listcell label="MALE"/>
			<listcell label="32"/>
			<listcell label="Senior Engineer."/>
		</listitem>
		<listfoot >
			<listfooter><image width="80px" height="100px" src="/test2/img/sun.jpg"/></listfooter>
			<listfooter>
					<listbox rows="3" mold="select"  multiple="true">
						<listitem label="option1"/>
						<listitem label="option2"/>
						<listitem label="option3"/>
						<listitem label="option4"/>
						<listitem label="option5"/>
						<listitem label="option6"/>
					</listbox>	
			</listfooter>
			<listfooter><label value="This is footer3"/></listfooter>
			<listfooter><label value="This is footer4"/></listfooter>
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
		label_11.setValue("Thecomplexlistboxshouldshowproperly.");
		Label label_12 = new Label();
		window_1.add(label_12);
		label_12.setValue("Aux's rowspan in FF Win lost border");
		Listbox listbox_13 = new Listbox();
		window_1.add(listbox_13);
		listbox_13.setCheckmark(true);
		//Listbox has no api for setid
		listbox_13.setMultiple(true);
		listbox_13.setWidth("700px");
		Auxhead auxhead_131 = new Auxhead();
		listbox_13.add(auxhead_131);
		Auxheader auxheader_1311 = new Auxheader();
		auxhead_131.add(auxheader_1311);
		auxheader_1311.setAlign("center");
		auxheader_1311.setColspan(4);
		auxheader_1311.setLabel("All Header");
		auxheader_1311.setStyle("font-weight:bold; color:red;");
		Auxhead auxhead_132 = new Auxhead();
		listbox_13.add(auxhead_132);
		Auxheader auxheader_1321 = new Auxheader();
		auxhead_132.add(auxheader_1321);
		auxheader_1321.setColspan(2);
		auxheader_1321.setLabel("A+B");
		auxheader_1321.setRowspan(2);
		Auxheader auxheader_1322 = new Auxheader();
		auxhead_132.add(auxheader_1322);
		auxheader_1322.setLabel("C");
		Auxheader auxheader_1323 = new Auxheader();
		auxhead_132.add(auxheader_1323);
		auxheader_1323.setLabel("DE");
		Auxhead auxhead_133 = new Auxhead();
		listbox_13.add(auxhead_133);
		Auxheader auxheader_1331 = new Auxheader();
		auxhead_133.add(auxheader_1331);
		auxheader_1331.setLabel("A");
		Auxheader auxheader_1332 = new Auxheader();
		auxhead_133.add(auxheader_1332);
		auxheader_1332.setLabel("B+C+D");
		Auxhead auxhead_134 = new Auxhead();
		listbox_13.add(auxhead_134);
		Auxheader auxheader_1341 = new Auxheader();
		auxhead_134.add(auxheader_1341);
		auxheader_1341.setColspan(3);
		auxheader_1341.setLabel("A+B+C");
		Auxheader auxheader_1342 = new Auxheader();
		auxhead_134.add(auxheader_1342);
		auxheader_1342.setLabel("D");
		Listhead listhead_135 = new Listhead();
		listbox_13.add(listhead_135);
		listhead_135.setSizable(true);
		Listheader listheader_1351 = new Listheader();
		listhead_135.add(listheader_1351);
		listheader_1351.setImage("/test2/img/coffee.gif");
		listheader_1351.setLabel("Name");
		listheader_1351.setSort("auto");
		listheader_1351.setWidth("25%");
		Listheader listheader_1352 = new Listheader();
		listhead_135.add(listheader_1352);
		listheader_1352.setImage("/test2/img/folder.gif");
		listheader_1352.setLabel("Gender");
		listheader_1352.setSort("auto");
		listheader_1352.setWidth("25%");
		Listheader listheader_1353 = new Listheader();
		listhead_135.add(listheader_1353);
		listheader_1353.setAlign("center");
		listheader_1353.setImage("/test2/img/cubfirs.gif");
		listheader_1353.setLabel("Age");
		listheader_1353.setSort("auto");
		listheader_1353.setWidth("25%");
		Listheader listheader_1354 = new Listheader();
		listhead_135.add(listheader_1354);
		listheader_1354.setImage("/test2/img/home.gif");
		listheader_1354.setLabel("Description");
		listheader_1354.setSort("auto");
		listheader_1354.setWidth("25%");
		Listitem listitem_136 = new Listitem();
		listbox_13.add(listitem_136);
		Listcell listcell_1361 = new Listcell();
		listitem_136.add(listcell_1361);
		listcell_1361.setLabel("Mary");
		Listcell listcell_1362 = new Listcell();
		listitem_136.add(listcell_1362);
		listcell_1362.setLabel("FEMALE");
		Listcell listcell_1363 = new Listcell();
		listitem_136.add(listcell_1363);
		listcell_1363.setLabel("18");
		Listcell listcell_1364 = new Listcell();
		listitem_136.add(listcell_1364);
		listcell_1364.setLabel("A young lady.");
		Listitem listitem_137 = new Listitem();
		listbox_13.add(listitem_137);
		Listcell listcell_1371 = new Listcell();
		listitem_137.add(listcell_1371);
		listcell_1371.setLabel("John");
		Listcell listcell_1372 = new Listcell();
		listitem_137.add(listcell_1372);
		listcell_1372.setLabel("MALE");
		Listcell listcell_1373 = new Listcell();
		listitem_137.add(listcell_1373);
		listcell_1373.setLabel("20");
		Listcell listcell_1374 = new Listcell();
		listitem_137.add(listcell_1374);
		listcell_1374.setLabel("A college student.");
		Listitem listitem_138 = new Listitem();
		listbox_13.add(listitem_138);
		Listcell listcell_1381 = new Listcell();
		listitem_138.add(listcell_1381);
		listcell_1381.setLabel("Jane");
		Listcell listcell_1382 = new Listcell();
		listitem_138.add(listcell_1382);
		listcell_1382.setLabel("FEMALE");
		Listcell listcell_1383 = new Listcell();
		listitem_138.add(listcell_1383);
		listcell_1383.setLabel("32");
		Listcell listcell_1384 = new Listcell();
		listitem_138.add(listcell_1384);
		listcell_1384.setLabel("A remarkable artist.");
		Listitem listitem_139 = new Listitem();
		listbox_13.add(listitem_139);
		Listcell listcell_1391 = new Listcell();
		listitem_139.add(listcell_1391);
		listcell_1391.setLabel("Henry");
		Listcell listcell_1392 = new Listcell();
		listitem_139.add(listcell_1392);
		listcell_1392.setLabel("MALE");
		Listcell listcell_1393 = new Listcell();
		listitem_139.add(listcell_1393);
		listcell_1393.setLabel("29");
		Listcell listcell_1394 = new Listcell();
		listitem_139.add(listcell_1394);
		listcell_1394.setLabel("A graduate.");
		Listitem listitem_1310 = new Listitem();
		listbox_13.add(listitem_1310);
		Listcell listcell_13101 = new Listcell();
		listitem_1310.add(listcell_13101);
		listcell_13101.setLabel("Ian");
		Listcell listcell_13102 = new Listcell();
		listitem_1310.add(listcell_13102);
		listcell_13102.setLabel("MALE");
		Listcell listcell_13103 = new Listcell();
		listitem_1310.add(listcell_13103);
		listcell_13103.setLabel("27");
		Listcell listcell_13104 = new Listcell();
		listitem_1310.add(listcell_13104);
		listcell_13104.setLabel("Tester.");
		Listitem listitem_1311 = new Listitem();
		listbox_13.add(listitem_1311);
		Listcell listcell_13111 = new Listcell();
		listitem_1311.add(listcell_13111);
		listcell_13111.setLabel("Dennis");
		Listcell listcell_13112 = new Listcell();
		listitem_1311.add(listcell_13112);
		listcell_13112.setLabel("MALE");
		Listcell listcell_13113 = new Listcell();
		listitem_1311.add(listcell_13113);
		listcell_13113.setLabel("32");
		Listcell listcell_13114 = new Listcell();
		listitem_1311.add(listcell_13114);
		listcell_13114.setLabel("Senior Engineer.");
		Listfoot listfoot_1312 = new Listfoot();
		listbox_13.add(listfoot_1312);
		Listfooter listfooter_13121 = new Listfooter();
		listfoot_1312.add(listfooter_13121);
		Image image_131211 = new Image();
		listfooter_13121.add(image_131211);
		image_131211.setHeight("100px");
		image_131211.setSrc("/test2/img/sun.jpg");
		image_131211.setWidth("80px");
		Listfooter listfooter_13122 = new Listfooter();
		listfoot_1312.add(listfooter_13122);
		Listbox listbox_131221 = new Listbox();
		listfooter_13122.add(listbox_131221);
//		listbox_131221.setMold("select");
		listbox_131221.setMultiple(true);
		listbox_131221.setRows(3);
		Listitem listitem_1312211 = new Listitem();
		listbox_131221.add(listitem_1312211);
		listitem_1312211.setLabel("option1");
		Listitem listitem_1312212 = new Listitem();
		listbox_131221.add(listitem_1312212);
		listitem_1312212.setLabel("option2");
		Listitem listitem_1312213 = new Listitem();
		listbox_131221.add(listitem_1312213);
		listitem_1312213.setLabel("option3");
		Listitem listitem_1312214 = new Listitem();
		listbox_131221.add(listitem_1312214);
		listitem_1312214.setLabel("option4");
		Listitem listitem_1312215 = new Listitem();
		listbox_131221.add(listitem_1312215);
		listitem_1312215.setLabel("option5");
		Listitem listitem_1312216 = new Listitem();
		listbox_131221.add(listitem_1312216);
		listitem_1312216.setLabel("option6");
		Listfooter listfooter_13123 = new Listfooter();
		listfoot_1312.add(listfooter_13123);
		Label label_131231 = new Label();
		listfooter_13123.add(label_131231);
		label_131231.setValue("This is footer3");
		Listfooter listfooter_13124 = new Listfooter();
		listfoot_1312.add(listfooter_13124);
		Label label_131241 = new Label();
		listfooter_13124.add(label_131241);
		label_131241.setValue("This is footer4");
	

	
			
		
		return win;
	}
	
		
}
