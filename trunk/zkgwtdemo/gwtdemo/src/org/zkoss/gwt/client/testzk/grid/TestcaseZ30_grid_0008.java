package org.zkoss.gwt.client.testzk.grid;

import org.zkoss.gwt.client.testzk.TestcaseWrapper;
import org.zkoss.gwt.client.zul.grid.Column;
import org.zkoss.gwt.client.zul.grid.Columns;
import org.zkoss.gwt.client.zul.grid.Grid;
import org.zkoss.gwt.client.zul.grid.Row;
import org.zkoss.gwt.client.zul.grid.Rows;
import org.zkoss.gwt.client.zul.inp.Textbox;
import org.zkoss.gwt.client.zul.sel.Listbox;
import org.zkoss.gwt.client.zul.sel.Listitem;
import org.zkoss.gwt.client.zul.wgt.Checkbox;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wgt.Radio;
import org.zkoss.gwt.client.zul.wgt.Radiogroup;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

public class TestcaseZ30_grid_0008 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
<window title="Horz Scrollbar only (20%)">
	<grid width="20%">
		<columns>
			<column width="200px" label="Head 1"/>
			<column width="200px" label="Head 2" align="center"/>
			<column width="200px" label="Head 3" align="right"/>
		</columns>
		<rows>
			<row>
				<listbox mold="select">
					<listitem label="AB"/>
					<listitem label="CD"/>
				</listbox>
				<datebox/>
				<textbox rows="3"/>
			</row>
			<row spans="1,2">
				The following cell is span2
				<radiogroup>
					<radio label="Apple"/>
					<radio label="Orange" checked="true"/>
					<radio label="Lemon"/>
				</radiogroup>
			</row>
			<row>
				<label value="A11"/>
				<label value="A12"/>
				<label value="A13"/>
			</row>
			<row>
				<checkbox checked="true" label="Option 1"/>
				<checkbox label="Option 2"/>
				<radiogroup>
					<radio label="Apple"/>
					<radio label="Orange" checked="true"/>
					<radio label="Lemon"/>
				</radiogroup>
			</row>
			<row>
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
		window_1.setTitle("Horz Scrollbar only (20%)");
		Grid grid_11 = new Grid();
		window_1.add(grid_11);
		grid_11.setWidth("20%");
		Columns columns_111 = new Columns();
		grid_11.add(columns_111);
		Column column_1111 = new Column();
		columns_111.add(column_1111);
		column_1111.setLabel("Head 1");
		column_1111.setWidth("200px");
		Column column_1112 = new Column();
		columns_111.add(column_1112);
		column_1112.setAlign("center");
		column_1112.setLabel("Head 2");
		column_1112.setWidth("200px");
		Column column_1113 = new Column();
		columns_111.add(column_1113);
		column_1113.setAlign("right");
		column_1113.setLabel("Head 3");
		column_1113.setWidth("200px");
		Rows rows_112 = new Rows();
		grid_11.add(rows_112);
		Row row_1121 = new Row();
		rows_112.add(row_1121);
		Listbox listbox_11211 = new Listbox();
		row_1121.add(listbox_11211);
		//listbox_11211.setMold("select");
		Listitem listitem_112111 = new Listitem();
		listbox_11211.add(listitem_112111);
		listitem_112111.setLabel("AB");
		Listitem listitem_112112 = new Listitem();
		listbox_11211.add(listitem_112112);
		listitem_112112.setLabel("CD");
		Textbox datebox_11212 = new Textbox();
		row_1121.add(datebox_11212);
		Textbox textbox_11213 = new Textbox();
		row_1121.add(textbox_11213);
		textbox_11213.setRows(3);
		Row row_1122 = new Row();
		rows_112.add(row_1122);
		row_1122.setSpans("1,2");
		Label label_11221= new Label();
		row_1122.add(label_11221);
		label_11221.setValue("Thefollowingcellisspan2");
		Radiogroup radiogroup_11222 = new Radiogroup();
		row_1122.add(radiogroup_11222);
		Radio radio_112221 = new Radio();
		radiogroup_11222.add(radio_112221);
		radio_112221.setLabel("Apple");
		Radio radio_112222 = new Radio();
		radiogroup_11222.add(radio_112222);
		radio_112222.setChecked(true);
		radio_112222.setLabel("Orange");
		Radio radio_112223 = new Radio();
		radiogroup_11222.add(radio_112223);
		radio_112223.setLabel("Lemon");
		Row row_1123 = new Row();
		rows_112.add(row_1123);
		Label label_11231 = new Label();
		row_1123.add(label_11231);
		label_11231.setValue("A11");
		Label label_11232 = new Label();
		row_1123.add(label_11232);
		label_11232.setValue("A12");
		Label label_11233 = new Label();
		row_1123.add(label_11233);
		label_11233.setValue("A13");
		Row row_1124 = new Row();
		rows_112.add(row_1124);
		Checkbox checkbox_11241 = new Checkbox();
		row_1124.add(checkbox_11241);
		checkbox_11241.setChecked(true);
		checkbox_11241.setLabel("Option 1");
		Checkbox checkbox_11242 = new Checkbox();
		row_1124.add(checkbox_11242);
		checkbox_11242.setLabel("Option 2");
		Radiogroup radiogroup_11243 = new Radiogroup();
		row_1124.add(radiogroup_11243);
		Radio radio_112431 = new Radio();
		radiogroup_11243.add(radio_112431);
		radio_112431.setLabel("Apple");
		Radio radio_112432 = new Radio();
		radiogroup_11243.add(radio_112432);
		radio_112432.setChecked(true);
		radio_112432.setLabel("Orange");
		Radio radio_112433 = new Radio();
		radiogroup_11243.add(radio_112433);
		radio_112433.setLabel("Lemon");
		Row row_1125 = new Row();
		rows_112.add(row_1125);
		Checkbox checkbox_11251 = new Checkbox();
		row_1125.add(checkbox_11251);
		checkbox_11251.setChecked(true);
		checkbox_11251.setLabel("Option 1");
		Checkbox checkbox_11252 = new Checkbox();
		row_1125.add(checkbox_11252);
		checkbox_11252.setLabel("Option 2");
		Radiogroup radiogroup_11253 = new Radiogroup();
		row_1125.add(radiogroup_11253);
		radiogroup_11253.setOrient("vertical");
		Radio radio_112531 = new Radio();
		radiogroup_11253.add(radio_112531);
		radio_112531.setLabel("Apple");
		Radio radio_112532 = new Radio();
		radiogroup_11253.add(radio_112532);
		radio_112532.setChecked(true);
		radio_112532.setLabel("Orange");
		Radio radio_112533 = new Radio();
		radiogroup_11253.add(radio_112533);
		radio_112533.setLabel("Lemon");



	
			
		
		return win;
	}
	
		
}
