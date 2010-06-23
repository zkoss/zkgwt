package org.zkoss.gwt.client.testzk.grid;

import org.zkoss.gwt.client.testzk.TestcaseWrapper;
import org.zkoss.gwt.client.zul.grid.Column;
import org.zkoss.gwt.client.zul.grid.Columns;
import org.zkoss.gwt.client.zul.grid.Grid;
import org.zkoss.gwt.client.zul.grid.Row;
import org.zkoss.gwt.client.zul.grid.Rows;
import org.zkoss.gwt.client.zul.inp.Textbox;
import org.zkoss.gwt.client.zul.mesh.Paging;
import org.zkoss.gwt.client.zul.sel.Listbox;
import org.zkoss.gwt.client.zul.sel.Listitem;
import org.zkoss.gwt.client.zul.wgt.Checkbox;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wgt.Radio;
import org.zkoss.gwt.client.zul.wgt.Radiogroup;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

public class TestcaseZ30_grid_0011 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
<window title="Test the paging mold" width="500px">
	<grid mold="paging" pageSize="3">
		<columns>
			<column label="Index"/>
			<column label="Head 1"/>
			<column label="Head 2" align="center"/>
			<column label="Head 3" align="right"/>
		</columns>
		<rows>
			<row>
				1
				<listbox mold="select">
					<listitem label="AB"/>
					<listitem label="CD"/>
				</listbox>
				<datebox/>
				<textbox rows="3"/>
			</row>
			<row>
				2
				<label value="A11"/>
				<label value="A12"/>
				<label value="A13"/>
			</row>
			<row>
				3
				<checkbox checked="true" label="Option 1"/>
				<checkbox label="Option 2"/>
				<radiogroup>
					<radio label="Apple"/>
					<radio label="Orange" checked="true"/>
					<radio label="Lemon"/>
				</radiogroup>
			</row>
			<row>
				4
				<checkbox checked="true" label="Option 1"/>
				<checkbox label="Option 2"/>
				<radiogroup orient="vertical">
					<radio label="Apple"/>
					<radio label="Orange" checked="true"/>
					<radio label="Lemon"/>
				</radiogroup>
			</row>
			<row>
				5
				<listbox mold="select">
					<listitem label="AB"/>
					<listitem label="CD"/>
				</listbox>
				<datebox/>
				<textbox rows="3"/>
			</row>
			<row>
				6
				<label value="A11"/>
				<label value="A12"/>
				<label value="A13"/>
			</row>
			<row>
				7
				<checkbox checked="true" label="Option 1"/>
				<checkbox label="Option 2"/>
				<radiogroup>
					<radio label="Apple"/>
					<radio label="Orange" checked="true"/>
					<radio label="Lemon"/>
				</radiogroup>
			</row>
			<row>
				8
				<checkbox checked="true" label="Option 1"/>
				<checkbox label="Option 2"/>
				<radiogroup orient="vertical">
					<radio label="Apple"/>
					<radio label="Orange" checked="true"/>
					<radio label="Lemon"/>
				</radiogroup>
			</row>
		</rows>
	</grid>
</window>
*/		
	
		/*
		 * put generated code here
		 * */
		Window window_1 = new Window();
		win.add(window_1);
		window_1.setTitle("Test the paging mold");
		window_1.setWidth("500px");
		Grid grid_11 = new Grid();
		window_1.add(grid_11);
		grid_11.setMold("paging");		

		//TODO: manually add paging child
		Paging paging = new Paging();
		paging.setPageSize(3);
		paging.setAutohide(true);
		paging.setDetailed(true);
		paging.setTotalSize(8);
		
		paging.setActivePage(0);
		paging.setPageCount(3);
		paging.setPageIncrement(1);
		
		
		grid_11.add(paging);
		
		
		
		//mgrid_11.setMold("paging");
		grid_11.setPageSize(3);
		//no setPaginal ?
		
		Columns columns_111 = new Columns();
		grid_11.add(columns_111);
		Column column_1111 = new Column();
		columns_111.add(column_1111);
		column_1111.setLabel("Index");
		Column column_1112 = new Column();
		columns_111.add(column_1112);
		column_1112.setLabel("Head 1");
		Column column_1113 = new Column();
		columns_111.add(column_1113);
		column_1113.setAlign("center");
		column_1113.setLabel("Head 2");
		Column column_1114 = new Column();
		columns_111.add(column_1114);
		column_1114.setAlign("right");
		column_1114.setLabel("Head 3");
		Rows rows_112 = new Rows();
		grid_11.add(rows_112);
		Row row_1121 = new Row();
		rows_112.add(row_1121);
		Label label_11211= new Label();
		row_1121.add(label_11211);
		label_11211.setValue("1");
		Listbox listbox_11212 = new Listbox();
		row_1121.add(listbox_11212);
		//listbox_11212.setMold("select");
		Listitem listitem_112121 = new Listitem();
		listbox_11212.add(listitem_112121);
		listitem_112121.setLabel("AB");
		Listitem listitem_112122 = new Listitem();
		listbox_11212.add(listitem_112122);
		listitem_112122.setLabel("CD");
		//Datebox datebox_11213 = new Datebox();
		//row_1121.add(datebox_11213);
		Textbox textbox_11214 = new Textbox();
		row_1121.add(textbox_11214);
		textbox_11214.setRows(3);
		Row row_1122 = new Row();
		rows_112.add(row_1122);
		Label label_11221= new Label();
		row_1122.add(label_11221);
		label_11221.setValue("2");
		Label label_11222 = new Label();
		row_1122.add(label_11222);
		label_11222.setValue("A11");
		Label label_11223 = new Label();
		row_1122.add(label_11223);
		label_11223.setValue("A12");
		Label label_11224 = new Label();
		row_1122.add(label_11224);
		label_11224.setValue("A13");
		Row row_1123 = new Row();
		rows_112.add(row_1123);
		Label label_11231= new Label();
		row_1123.add(label_11231);
		label_11231.setValue("3");
		Checkbox checkbox_11232 = new Checkbox();
		row_1123.add(checkbox_11232);
		checkbox_11232.setChecked(true);
		checkbox_11232.setLabel("Option 1");
		Checkbox checkbox_11233 = new Checkbox();
		row_1123.add(checkbox_11233);
		checkbox_11233.setLabel("Option 2");
		Radiogroup radiogroup_11234 = new Radiogroup();
		row_1123.add(radiogroup_11234);
		Radio radio_112341 = new Radio();
		radiogroup_11234.add(radio_112341);
		radio_112341.setLabel("Apple");
		Radio radio_112342 = new Radio();
		radiogroup_11234.add(radio_112342);
		radio_112342.setChecked(true);
		radio_112342.setLabel("Orange");
		Radio radio_112343 = new Radio();
		radiogroup_11234.add(radio_112343);
		radio_112343.setLabel("Lemon");
		Row row_1124 = new Row();
		rows_112.add(row_1124);
		Label label_11241= new Label();
		row_1124.add(label_11241);
		label_11241.setValue("4");
		Checkbox checkbox_11242 = new Checkbox();
		row_1124.add(checkbox_11242);
		checkbox_11242.setChecked(true);
		checkbox_11242.setLabel("Option 1");
		Checkbox checkbox_11243 = new Checkbox();
		row_1124.add(checkbox_11243);
		checkbox_11243.setLabel("Option 2");
		Radiogroup radiogroup_11244 = new Radiogroup();
		row_1124.add(radiogroup_11244);
		radiogroup_11244.setOrient("vertical");
		Radio radio_112441 = new Radio();
		radiogroup_11244.add(radio_112441);
		radio_112441.setLabel("Apple");
		Radio radio_112442 = new Radio();
		radiogroup_11244.add(radio_112442);
		radio_112442.setChecked(true);
		radio_112442.setLabel("Orange");
		Radio radio_112443 = new Radio();
		radiogroup_11244.add(radio_112443);
		radio_112443.setLabel("Lemon");
		Row row_1125 = new Row();
		rows_112.add(row_1125);
		Label label_11251= new Label();
		row_1125.add(label_11251);
		label_11251.setValue("5");
		Listbox listbox_11252 = new Listbox();
		row_1125.add(listbox_11252);
		//listbox_11252.setMold("select");
		Listitem listitem_112521 = new Listitem();
		listbox_11252.add(listitem_112521);
		listitem_112521.setLabel("AB");
		Listitem listitem_112522 = new Listitem();
		listbox_11252.add(listitem_112522);
		listitem_112522.setLabel("CD");
		//Datebox datebox_11253 = new Datebox();
		//row_1125.add(datebox_11253);
		Textbox textbox_11254 = new Textbox();
		row_1125.add(textbox_11254);
		textbox_11254.setRows(3);
		Row row_1126 = new Row();
		rows_112.add(row_1126);
		Label label_11261= new Label();
		row_1126.add(label_11261);
		label_11261.setValue("6");
		Label label_11262 = new Label();
		row_1126.add(label_11262);
		label_11262.setValue("A11");
		Label label_11263 = new Label();
		row_1126.add(label_11263);
		label_11263.setValue("A12");
		Label label_11264 = new Label();
		row_1126.add(label_11264);
		label_11264.setValue("A13");
		Row row_1127 = new Row();
		rows_112.add(row_1127);
		Label label_11271= new Label();
		row_1127.add(label_11271);
		label_11271.setValue("7");
		Checkbox checkbox_11272 = new Checkbox();
		row_1127.add(checkbox_11272);
		checkbox_11272.setChecked(true);
		checkbox_11272.setLabel("Option 1");
		Checkbox checkbox_11273 = new Checkbox();
		row_1127.add(checkbox_11273);
		checkbox_11273.setLabel("Option 2");
		Radiogroup radiogroup_11274 = new Radiogroup();
		row_1127.add(radiogroup_11274);
		Radio radio_112741 = new Radio();
		radiogroup_11274.add(radio_112741);
		radio_112741.setLabel("Apple");
		Radio radio_112742 = new Radio();
		radiogroup_11274.add(radio_112742);
		radio_112742.setChecked(true);
		radio_112742.setLabel("Orange");
		Radio radio_112743 = new Radio();
		radiogroup_11274.add(radio_112743);
		radio_112743.setLabel("Lemon");
		Row row_1128 = new Row();
		rows_112.add(row_1128);
		Label label_11281= new Label();
		row_1128.add(label_11281);
		label_11281.setValue("8");
		Checkbox checkbox_11282 = new Checkbox();
		row_1128.add(checkbox_11282);
		checkbox_11282.setChecked(true);
		checkbox_11282.setLabel("Option 1");
		Checkbox checkbox_11283 = new Checkbox();
		row_1128.add(checkbox_11283);
		checkbox_11283.setLabel("Option 2");
		Radiogroup radiogroup_11284 = new Radiogroup();
		row_1128.add(radiogroup_11284);
		radiogroup_11284.setOrient("vertical");
		Radio radio_112841 = new Radio();
		radiogroup_11284.add(radio_112841);
		radio_112841.setLabel("Apple");
		Radio radio_112842 = new Radio();
		radiogroup_11284.add(radio_112842);
		radio_112842.setChecked(true);
		radio_112842.setLabel("Orange");
		Radio radio_112843 = new Radio();
		radiogroup_11284.add(radio_112843);
		radio_112843.setLabel("Lemon");


	
			
		
		return win;
	}
	

}
