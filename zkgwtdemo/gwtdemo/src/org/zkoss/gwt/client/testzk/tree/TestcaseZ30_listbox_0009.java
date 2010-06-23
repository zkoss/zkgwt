package org.zkoss.gwt.client.testzk.tree;

import org.zkoss.gwt.client.testzk.TestcaseWrapper;
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

public class TestcaseZ30_listbox_0009 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
<window width="100%">
The complex listbox should show properly.
<listbox width="500px" id="w_list_listbox" multiple="true" checkmark="true">
	<listhead id="w_tr_listhead" >
		<listheader label="account" width="25%" /> 
		<listheader label="name" width="25%" /> 
		<listheader label="email" width="25%" /> 
		<listheader label="edit" /> 
	</listhead>
	<listitem> 
		<listcell label="davidwu" /> 
		<listcell label="David Wu"/> 
		<listcell>
		<label value="davidwu@hotmail.com" onClick="callMe();"/> 
		</listcell>
		<listcell > 
		<image src="/test2/img/coffee.gif" onClick="callMe();" /> 
		</listcell> 
	</listitem> 
	<listitem> 
		<listcell label="davidwu" /> 
		<listcell label="David Wu"/> 
		<listcell>
		<label value="davidwu@hotmail.com" onClick="callMe();"/> 
		</listcell>
		<listcell> 
		<image src="/test2/img/coffee.gif" onClick="callMe();" /> 
		</listcell> 
	</listitem>
</listbox> 
<zscript> void callMe() { alert("AA"); } </zscript> 


	<listbox width="250px" rows="3">
		<listhead sizable="true">
			<listheader label="name" sort="auto"/>
			<listheader label="gender" sort="auto"/>
		</listhead>
		<listitem>
			<listcell label="Mary"/>
			<listcell label="FEMALE"/>
		</listitem>
		<listitem>
			<listcell label="John"/>
			<listcell label="MALE"/>
		</listitem>
		<listitem>
			<listcell label="Jane"/>
			<listcell label="FEMALE"/>
		</listitem>
		<listitem>
			<listcell label="Henry"/>
			<listcell label="MALE"/>
		</listitem>
		<listitem>
			<listcell label="Ian"/>
			<listcell label="MALE"/>
		</listitem>
		<listitem>
			<listcell label="Dennis"/>
			<listcell label="MALE"/>
		</listitem>
		<listitem>
			<listcell label="Jumper"/>
			<listcell label="MALE"/>
		</listitem>
	</listbox>
	

	<listbox id="box" width="700px" multiple="true" rows="4" checkmark="true">
		<listhead>
			<listheader label="Name" image="/test2/img/coffee.gif"/>
			<listheader label="Gender" image="/test2/img/folder.gif"/>
			<listheader label="AgeOf"  image="/test2/img/cubfirs.gif"/>
			<listheader label="Description" image="/test2/img/home.gif"/>
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
		window_1.setWidth("100%");
		Label label_11= new Label();
		window_1.add(label_11);
		label_11.setValue("Thecomplexlistboxshouldshowproperly.");
		Listbox listbox_12 = new Listbox();
		window_1.add(listbox_12);
		listbox_12.setCheckmark(true);
		//Listbox has no api for setid
		listbox_12.setMultiple(true);
		listbox_12.setWidth("500px");
		Listhead listhead_121 = new Listhead();
		listbox_12.add(listhead_121);
		//Listhead has no api for setid
		Listheader listheader_1211 = new Listheader();
		listhead_121.add(listheader_1211);
		listheader_1211.setLabel("account");
		listheader_1211.setWidth("25%");
		Listheader listheader_1212 = new Listheader();
		listhead_121.add(listheader_1212);
		listheader_1212.setLabel("name");
		listheader_1212.setWidth("25%");
		Listheader listheader_1213 = new Listheader();
		listhead_121.add(listheader_1213);
		listheader_1213.setLabel("email");
		listheader_1213.setWidth("25%");
		Listheader listheader_1214 = new Listheader();
		listhead_121.add(listheader_1214);
		listheader_1214.setLabel("edit");
		Listitem listitem_122 = new Listitem();
		listbox_12.add(listitem_122);
		Listcell listcell_1221 = new Listcell();
		listitem_122.add(listcell_1221);
		listcell_1221.setLabel("davidwu");
		Listcell listcell_1222 = new Listcell();
		listitem_122.add(listcell_1222);
		listcell_1222.setLabel("David Wu");
		Listcell listcell_1223 = new Listcell();
		listitem_122.add(listcell_1223);
		Label label_12231 = new Label();
		listcell_1223.add(label_12231);
		//Label has no api for setonclick
		label_12231.setValue("davidwu@hotmail.com");
		Listcell listcell_1224 = new Listcell();
		listitem_122.add(listcell_1224);
		Image image_12241 = new Image();
		listcell_1224.add(image_12241);
		//Image has no api for setonclick
		image_12241.setSrc("/test2/img/coffee.gif");
		Listitem listitem_123 = new Listitem();
		listbox_12.add(listitem_123);
		Listcell listcell_1231 = new Listcell();
		listitem_123.add(listcell_1231);
		listcell_1231.setLabel("davidwu");
		Listcell listcell_1232 = new Listcell();
		listitem_123.add(listcell_1232);
		listcell_1232.setLabel("David Wu");
		Listcell listcell_1233 = new Listcell();
		listitem_123.add(listcell_1233);
		Label label_12331 = new Label();
		listcell_1233.add(label_12331);
		//Label has no api for setonclick
		label_12331.setValue("davidwu@hotmail.com");
		Listcell listcell_1234 = new Listcell();
		listitem_123.add(listcell_1234);
		Image image_12341 = new Image();
		listcell_1234.add(image_12341);
		//Image has no api for setonclick
		image_12341.setSrc("/test2/img/coffee.gif");
		Listbox listbox_14 = new Listbox();
		window_1.add(listbox_14);
		listbox_14.setRows(3);
		listbox_14.setWidth("250px");
		Listhead listhead_141 = new Listhead();
		listbox_14.add(listhead_141);
		listhead_141.setSizable(true);
		Listheader listheader_1411 = new Listheader();
		listhead_141.add(listheader_1411);
		listheader_1411.setLabel("name");
		listheader_1411.setSort("auto");
		Listheader listheader_1412 = new Listheader();
		listhead_141.add(listheader_1412);
		listheader_1412.setLabel("gender");
		listheader_1412.setSort("auto");
		Listitem listitem_142 = new Listitem();
		listbox_14.add(listitem_142);
		Listcell listcell_1421 = new Listcell();
		listitem_142.add(listcell_1421);
		listcell_1421.setLabel("Mary");
		Listcell listcell_1422 = new Listcell();
		listitem_142.add(listcell_1422);
		listcell_1422.setLabel("FEMALE");
		Listitem listitem_143 = new Listitem();
		listbox_14.add(listitem_143);
		Listcell listcell_1431 = new Listcell();
		listitem_143.add(listcell_1431);
		listcell_1431.setLabel("John");
		Listcell listcell_1432 = new Listcell();
		listitem_143.add(listcell_1432);
		listcell_1432.setLabel("MALE");
		Listitem listitem_144 = new Listitem();
		listbox_14.add(listitem_144);
		Listcell listcell_1441 = new Listcell();
		listitem_144.add(listcell_1441);
		listcell_1441.setLabel("Jane");
		Listcell listcell_1442 = new Listcell();
		listitem_144.add(listcell_1442);
		listcell_1442.setLabel("FEMALE");
		Listitem listitem_145 = new Listitem();
		listbox_14.add(listitem_145);
		Listcell listcell_1451 = new Listcell();
		listitem_145.add(listcell_1451);
		listcell_1451.setLabel("Henry");
		Listcell listcell_1452 = new Listcell();
		listitem_145.add(listcell_1452);
		listcell_1452.setLabel("MALE");
		Listitem listitem_146 = new Listitem();
		listbox_14.add(listitem_146);
		Listcell listcell_1461 = new Listcell();
		listitem_146.add(listcell_1461);
		listcell_1461.setLabel("Ian");
		Listcell listcell_1462 = new Listcell();
		listitem_146.add(listcell_1462);
		listcell_1462.setLabel("MALE");
		Listitem listitem_147 = new Listitem();
		listbox_14.add(listitem_147);
		Listcell listcell_1471 = new Listcell();
		listitem_147.add(listcell_1471);
		listcell_1471.setLabel("Dennis");
		Listcell listcell_1472 = new Listcell();
		listitem_147.add(listcell_1472);
		listcell_1472.setLabel("MALE");
		Listitem listitem_148 = new Listitem();
		listbox_14.add(listitem_148);
		Listcell listcell_1481 = new Listcell();
		listitem_148.add(listcell_1481);
		listcell_1481.setLabel("Jumper");
		Listcell listcell_1482 = new Listcell();
		listitem_148.add(listcell_1482);
		listcell_1482.setLabel("MALE");
		Listbox listbox_15 = new Listbox();
		window_1.add(listbox_15);
		listbox_15.setCheckmark(true);
		//Listbox has no api for setid
		listbox_15.setMultiple(true);
		listbox_15.setRows(4);
		listbox_15.setWidth("700px");
		Listhead listhead_151 = new Listhead();
		listbox_15.add(listhead_151);
		Listheader listheader_1511 = new Listheader();
		listhead_151.add(listheader_1511);
		listheader_1511.setImage("/test2/img/coffee.gif");
		listheader_1511.setLabel("Name");
		Listheader listheader_1512 = new Listheader();
		listhead_151.add(listheader_1512);
		listheader_1512.setImage("/test2/img/folder.gif");
		listheader_1512.setLabel("Gender");
		Listheader listheader_1513 = new Listheader();
		listhead_151.add(listheader_1513);
		listheader_1513.setImage("/test2/img/cubfirs.gif");
		listheader_1513.setLabel("AgeOf");
		Listheader listheader_1514 = new Listheader();
		listhead_151.add(listheader_1514);
		listheader_1514.setImage("/test2/img/home.gif");
		listheader_1514.setLabel("Description");
		Listitem listitem_152 = new Listitem();
		listbox_15.add(listitem_152);
		Listcell listcell_1521 = new Listcell();
		listitem_152.add(listcell_1521);
		listcell_1521.setLabel("Mary");
		Listcell listcell_1522 = new Listcell();
		listitem_152.add(listcell_1522);
		listcell_1522.setLabel("FEMALE");
		Listcell listcell_1523 = new Listcell();
		listitem_152.add(listcell_1523);
		listcell_1523.setLabel("18");
		Listcell listcell_1524 = new Listcell();
		listitem_152.add(listcell_1524);
		listcell_1524.setLabel("A young lady.");
		Listitem listitem_153 = new Listitem();
		listbox_15.add(listitem_153);
		Listcell listcell_1531 = new Listcell();
		listitem_153.add(listcell_1531);
		listcell_1531.setLabel("John");
		Listcell listcell_1532 = new Listcell();
		listitem_153.add(listcell_1532);
		listcell_1532.setLabel("MALE");
		Listcell listcell_1533 = new Listcell();
		listitem_153.add(listcell_1533);
		listcell_1533.setLabel("20");
		Listcell listcell_1534 = new Listcell();
		listitem_153.add(listcell_1534);
		listcell_1534.setLabel("A college student.");
		Listitem listitem_154 = new Listitem();
		listbox_15.add(listitem_154);
		Listcell listcell_1541 = new Listcell();
		listitem_154.add(listcell_1541);
		listcell_1541.setLabel("Jane");
		Listcell listcell_1542 = new Listcell();
		listitem_154.add(listcell_1542);
		listcell_1542.setLabel("FEMALE");
		Listcell listcell_1543 = new Listcell();
		listitem_154.add(listcell_1543);
		listcell_1543.setLabel("32");
		Listcell listcell_1544 = new Listcell();
		listitem_154.add(listcell_1544);
		listcell_1544.setLabel("A remarkable artist.");
		Listitem listitem_155 = new Listitem();
		listbox_15.add(listitem_155);
		Listcell listcell_1551 = new Listcell();
		listitem_155.add(listcell_1551);
		listcell_1551.setLabel("Henry");
		Listcell listcell_1552 = new Listcell();
		listitem_155.add(listcell_1552);
		listcell_1552.setLabel("MALE");
		Listcell listcell_1553 = new Listcell();
		listitem_155.add(listcell_1553);
		listcell_1553.setLabel("29");
		Listcell listcell_1554 = new Listcell();
		listitem_155.add(listcell_1554);
		listcell_1554.setLabel("A graduate.");
		Listitem listitem_156 = new Listitem();
		listbox_15.add(listitem_156);
		Listcell listcell_1561 = new Listcell();
		listitem_156.add(listcell_1561);
		listcell_1561.setLabel("Ian");
		Listcell listcell_1562 = new Listcell();
		listitem_156.add(listcell_1562);
		listcell_1562.setLabel("MALE");
		Listcell listcell_1563 = new Listcell();
		listitem_156.add(listcell_1563);
		listcell_1563.setLabel("27");
		Listcell listcell_1564 = new Listcell();
		listitem_156.add(listcell_1564);
		listcell_1564.setLabel("Tester.");
		Listitem listitem_157 = new Listitem();
		listbox_15.add(listitem_157);
		Listcell listcell_1571 = new Listcell();
		listitem_157.add(listcell_1571);
		listcell_1571.setLabel("Dennis");
		Listcell listcell_1572 = new Listcell();
		listitem_157.add(listcell_1572);
		listcell_1572.setLabel("MALE");
		Listcell listcell_1573 = new Listcell();
		listitem_157.add(listcell_1573);
		listcell_1573.setLabel("32");
		Listcell listcell_1574 = new Listcell();
		listitem_157.add(listcell_1574);
		listcell_1574.setLabel("Senior Engineer.");
		Listfoot listfoot_158 = new Listfoot();
		listbox_15.add(listfoot_158);
		Listfooter listfooter_1581 = new Listfooter();
		listfoot_158.add(listfooter_1581);
		Image image_15811 = new Image();
		listfooter_1581.add(image_15811);
		image_15811.setHeight("100px");
		image_15811.setSrc("/test2/img/sun.jpg");
		image_15811.setWidth("80px");
		Listfooter listfooter_1582 = new Listfooter();
		listfoot_158.add(listfooter_1582);
		Listbox listbox_15821 = new Listbox();
		listfooter_1582.add(listbox_15821);
//		listbox_15821.setMold("select");
		listbox_15821.setMultiple(true);
		listbox_15821.setRows(3);
		Listitem listitem_158211 = new Listitem();
		listbox_15821.add(listitem_158211);
		listitem_158211.setLabel("option1");
		Listitem listitem_158212 = new Listitem();
		listbox_15821.add(listitem_158212);
		listitem_158212.setLabel("option2");
		Listitem listitem_158213 = new Listitem();
		listbox_15821.add(listitem_158213);
		listitem_158213.setLabel("option3");
		Listitem listitem_158214 = new Listitem();
		listbox_15821.add(listitem_158214);
		listitem_158214.setLabel("option4");
		Listitem listitem_158215 = new Listitem();
		listbox_15821.add(listitem_158215);
		listitem_158215.setLabel("option5");
		Listitem listitem_158216 = new Listitem();
		listbox_15821.add(listitem_158216);
		listitem_158216.setLabel("option6");
		Listfooter listfooter_1583 = new Listfooter();
		listfoot_158.add(listfooter_1583);
		Label label_15831 = new Label();
		listfooter_1583.add(label_15831);
		label_15831.setValue("This is footer3");
		Listfooter listfooter_1584 = new Listfooter();
		listfoot_158.add(listfooter_1584);
		Label label_15841 = new Label();
		listfooter_1584.add(label_15841);
		label_15841.setValue("This is footer4");

	

	
			
		
		return win;
	}
	
	
}
