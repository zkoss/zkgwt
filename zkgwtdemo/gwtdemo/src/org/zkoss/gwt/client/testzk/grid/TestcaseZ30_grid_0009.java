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

public class TestcaseZ30_grid_0009 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
<window title="Horz and Vert Scrollbar (200px * 100px)">
	<grid width="200px" height="100px">
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
				<!-- 
				<datebox/>
				-->
				proxy for datebox
				<textbox rows="3"/>
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
		window_1.setTitle("Horz and Vert Scrollbar (200px * 100px)");
		Grid grid_11 = new Grid();
		window_1.add(grid_11);
		grid_11.setHeight("100px");
		grid_11.setWidth("200px");
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
		Label label_11212= new Label();
		row_1121.add(label_11212);
		label_11212.setValue("proxyfordatebox");
		Textbox textbox_11213 = new Textbox();
		row_1121.add(textbox_11213);
		textbox_11213.setRows(3);
		Row row_1122 = new Row();
		rows_112.add(row_1122);
		Label label_11221 = new Label();
		row_1122.add(label_11221);
		label_11221.setValue("A11");
		Label label_11222 = new Label();
		row_1122.add(label_11222);
		label_11222.setValue("A12");
		Label label_11223 = new Label();
		row_1122.add(label_11223);
		label_11223.setValue("A13");
		Row row_1123 = new Row();
		rows_112.add(row_1123);
		Checkbox checkbox_11231 = new Checkbox();
		row_1123.add(checkbox_11231);
		checkbox_11231.setChecked(true);
		checkbox_11231.setLabel("Option 1");
		Checkbox checkbox_11232 = new Checkbox();
		row_1123.add(checkbox_11232);
		checkbox_11232.setLabel("Option 2");
		Radiogroup radiogroup_11233 = new Radiogroup();
		row_1123.add(radiogroup_11233);
		Radio radio_112331 = new Radio();
		radiogroup_11233.add(radio_112331);
		radio_112331.setLabel("Apple");
		Radio radio_112332 = new Radio();
		radiogroup_11233.add(radio_112332);
		radio_112332.setChecked(true);
		radio_112332.setLabel("Orange");
		Radio radio_112333 = new Radio();
		radiogroup_11233.add(radio_112333);
		radio_112333.setLabel("Lemon");
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
		radiogroup_11243.setOrient("vertical");
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



	
			
		
		return win;
	}
	
			
}
