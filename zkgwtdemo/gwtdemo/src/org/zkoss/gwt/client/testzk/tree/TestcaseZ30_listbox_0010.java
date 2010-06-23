package org.zkoss.gwt.client.testzk.tree;

import org.zkoss.gwt.client.testzk.TestcaseWrapper;
import org.zkoss.gwt.client.zul.sel.Listbox;
import org.zkoss.gwt.client.zul.sel.Listcell;
import org.zkoss.gwt.client.zul.sel.Listhead;
import org.zkoss.gwt.client.zul.sel.Listheader;
import org.zkoss.gwt.client.zul.sel.Listitem;
import org.zkoss.gwt.client.zul.wgt.Image;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

public class TestcaseZ30_listbox_0010 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
	<listbox width="500px" id="w_list_listbox" multiple="true" checkmark="true">
		<listhead  >
			<listheader label="account" width="25%" /> 
			<listheader label="name" width="25%" /> 
			<listheader label="email" width="25%" /> 
			<listheader label="edit" width="35%" /> 
		</listhead>
		<listitem> 
			<listcell label="davidwu" style="border-top: 2px solid blue" /> 
			<listcell label="David Wu" style="border-left:4px solid green;border-bottom: 4px solid green"/> 
			<listcell  style="border-bottom: 2px solid blue">
			<label  value="davidwu@hotmail.com" onClick="callMe();"/> 
			</listcell>
			<listcell style="border-right:4px solid green;border-top: 4px solid green"> 
			<image src="/test2/img/coffee.gif" onClick="callMe();" /> 
			</listcell> 
		</listitem> 
		<listitem> 
			<listcell label="davidwu" /> 
			<listcell label="David Wu"/> 
			<listcell  style="border:4px solid green">
			<label value="davidwu@hotmail.com" onClick="callMe();"/> 
			</listcell>
			<listcell> 
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

	<listbox width="500px" id="w_list_listbox2" multiple="true" checkmark="true">
		<listhead id="w_tr_listhead" >
			<listheader label="account" width="25%" /> 
			<listheader label="name" width="25%" /> 
			<listheader label="email" width="25%" /> 
			<listheader label="edit" width="35%" /> 
		</listhead>
		<listitem> 
			<listcell label="davidwu"/> 
			<listcell label="David Wu" /> 
			<listcell>
			<label  value="davidwu@hotmail.com" onClick="callMe();"/> 
			</listcell>
			<listcell > 
			<image src="/test2/img/coffee.gif" onClick="callMe();" /> 
			</listcell> 
		</listitem> 
		<listitem> 
			<listcell label="davidwu" /> 
			<listcell label="David Wu"/> 
			<listcell  >
			<label value="davidwu@hotmail.com" onClick="callMe();"/> 
			</listcell>
			<listcell> 
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


*/		
	
		/*
		 * put generated code here
		 * */
		Window window_1 = new Window();
		win.add(window_1);
		Listbox listbox_11 = new Listbox();
		window_1.add(listbox_11);
		listbox_11.setCheckmark(true);
		//Listbox has no api for setid
		listbox_11.setMultiple(true);
		listbox_11.setWidth("500px");
		Listhead listhead_111 = new Listhead();
		listbox_11.add(listhead_111);
		Listheader listheader_1111 = new Listheader();
		listhead_111.add(listheader_1111);
		listheader_1111.setLabel("account");
		listheader_1111.setWidth("25%");
		Listheader listheader_1112 = new Listheader();
		listhead_111.add(listheader_1112);
		listheader_1112.setLabel("name");
		listheader_1112.setWidth("25%");
		Listheader listheader_1113 = new Listheader();
		listhead_111.add(listheader_1113);
		listheader_1113.setLabel("email");
		listheader_1113.setWidth("25%");
		Listheader listheader_1114 = new Listheader();
		listhead_111.add(listheader_1114);
		listheader_1114.setLabel("edit");
		listheader_1114.setWidth("35%");
		Listitem listitem_112 = new Listitem();
		listbox_11.add(listitem_112);
		Listcell listcell_1121 = new Listcell();
		listitem_112.add(listcell_1121);
		listcell_1121.setLabel("davidwu");
		listcell_1121.setStyle("border-top: 2px solid blue");
		Listcell listcell_1122 = new Listcell();
		listitem_112.add(listcell_1122);
		listcell_1122.setLabel("David Wu");
		listcell_1122.setStyle("border-left:4px solid green;border-bottom: 4px solid green");
		Listcell listcell_1123 = new Listcell();
		listitem_112.add(listcell_1123);
		listcell_1123.setStyle("border-bottom: 2px solid blue");
		Label label_11231 = new Label();
		listcell_1123.add(label_11231);
		//Label has no api for setonclick
		label_11231.setValue("davidwu@hotmail.com");
		Listcell listcell_1124 = new Listcell();
		listitem_112.add(listcell_1124);
		listcell_1124.setStyle("border-right:4px solid green;border-top: 4px solid green");
		Image image_11241 = new Image();
		listcell_1124.add(image_11241);
		//Image has no api for setonclick
		image_11241.setSrc("/test2/img/coffee.gif");
		Listitem listitem_113 = new Listitem();
		listbox_11.add(listitem_113);
		Listcell listcell_1131 = new Listcell();
		listitem_113.add(listcell_1131);
		listcell_1131.setLabel("davidwu");
		Listcell listcell_1132 = new Listcell();
		listitem_113.add(listcell_1132);
		listcell_1132.setLabel("David Wu");
		Listcell listcell_1133 = new Listcell();
		listitem_113.add(listcell_1133);
		listcell_1133.setStyle("border:4px solid green");
		Label label_11331 = new Label();
		listcell_1133.add(label_11331);
		//Label has no api for setonclick
		label_11331.setValue("davidwu@hotmail.com");
		Listcell listcell_1134 = new Listcell();
		listitem_113.add(listcell_1134);
		Image image_11341 = new Image();
		listcell_1134.add(image_11341);
		//Image has no api for setonclick
		image_11341.setSrc("/test2/img/coffee.gif");
		Listitem listitem_114 = new Listitem();
		listbox_11.add(listitem_114);
		Listcell listcell_1141 = new Listcell();
		listitem_114.add(listcell_1141);
		listcell_1141.setLabel("davidwu");
		Listcell listcell_1142 = new Listcell();
		listitem_114.add(listcell_1142);
		listcell_1142.setLabel("David Wu");
		Listcell listcell_1143 = new Listcell();
		listitem_114.add(listcell_1143);
		Label label_11431 = new Label();
		listcell_1143.add(label_11431);
		//Label has no api for setonclick
		label_11431.setValue("davidwu@hotmail.com");
		Listcell listcell_1144 = new Listcell();
		listitem_114.add(listcell_1144);
		Image image_11441 = new Image();
		listcell_1144.add(image_11441);
		//Image has no api for setonclick
		image_11441.setSrc("/test2/img/coffee.gif");
		Listitem listitem_115 = new Listitem();
		listbox_11.add(listitem_115);
		Listcell listcell_1151 = new Listcell();
		listitem_115.add(listcell_1151);
		listcell_1151.setLabel("davidwu");
		Listcell listcell_1152 = new Listcell();
		listitem_115.add(listcell_1152);
		listcell_1152.setLabel("David Wu");
		Listcell listcell_1153 = new Listcell();
		listitem_115.add(listcell_1153);
		Label label_11531 = new Label();
		listcell_1153.add(label_11531);
		//Label has no api for setonclick
		label_11531.setValue("davidwu@hotmail.com");
		Listcell listcell_1154 = new Listcell();
		listitem_115.add(listcell_1154);
		Image image_11541 = new Image();
		listcell_1154.add(image_11541);
		//Image has no api for setonclick
		image_11541.setSrc("/test2/img/coffee.gif");
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
		listheader_1214.setWidth("35%");
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
		Listitem listitem_124 = new Listitem();
		listbox_12.add(listitem_124);
		Listcell listcell_1241 = new Listcell();
		listitem_124.add(listcell_1241);
		listcell_1241.setLabel("davidwu");
		Listcell listcell_1242 = new Listcell();
		listitem_124.add(listcell_1242);
		listcell_1242.setLabel("David Wu");
		Listcell listcell_1243 = new Listcell();
		listitem_124.add(listcell_1243);
		Label label_12431 = new Label();
		listcell_1243.add(label_12431);
		//Label has no api for setonclick
		label_12431.setValue("davidwu@hotmail.com");
		Listcell listcell_1244 = new Listcell();
		listitem_124.add(listcell_1244);
		Image image_12441 = new Image();
		listcell_1244.add(image_12441);
		//Image has no api for setonclick
		image_12441.setSrc("/test2/img/coffee.gif");
		Listitem listitem_125 = new Listitem();
		listbox_12.add(listitem_125);
		Listcell listcell_1251 = new Listcell();
		listitem_125.add(listcell_1251);
		listcell_1251.setLabel("davidwu");
		Listcell listcell_1252 = new Listcell();
		listitem_125.add(listcell_1252);
		listcell_1252.setLabel("David Wu");
		Listcell listcell_1253 = new Listcell();
		listitem_125.add(listcell_1253);
		Label label_12531 = new Label();
		listcell_1253.add(label_12531);
		//Label has no api for setonclick
		label_12531.setValue("davidwu@hotmail.com");
		Listcell listcell_1254 = new Listcell();
		listitem_125.add(listcell_1254);
		Image image_12541 = new Image();
		listcell_1254.add(image_12541);
		//Image has no api for setonclick
		image_12541.setSrc("/test2/img/coffee.gif");
	

	
			
		
		return win;
	}
	
		
}
