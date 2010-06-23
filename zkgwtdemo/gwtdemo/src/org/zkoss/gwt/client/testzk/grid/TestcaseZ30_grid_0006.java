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
import org.zkoss.gwt.client.zul.utl.Style;
import org.zkoss.gwt.client.zul.wgt.Button;
import org.zkoss.gwt.client.zul.wgt.Checkbox;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wgt.Radio;
import org.zkoss.gwt.client.zul.wgt.Radiogroup;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;


public class TestcaseZ30_grid_0006 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
<window title="the odd row's color shall be yellow (controlled by the style component).	test sorting">
	<style>
	tr.z-grid-odd td.z-row-inner, tr.z-grid-odd {
		background: yellow;
	}
	</style>
	<zscript>
	class Comp implements Comparator {
		private boolean _asc;
		public Comp(boolean asc) {
			_asc = asc;
		}
		public int compare(Object o1, Object o2) {
			String s1 = o1.getChildren().get(0).getValue(),
				s2 = o2.getChildren().get(0).getValue();
			int v = s1.compareTo(s2);
			return _asc ? v: -v;
		}
	}
	Comp asc = new Comp(true), dsc = new Comp(false);
	</zscript>
	<grid id="grid" width="500px" height="100px">
		<columns sizable="true">
			<column id="col" label="Order"  sortAscending="${asc}" sortDescending="${dsc}"/>
			<column label="Head 1"/>
			<column label="Head 2" align="center"/>
			<column label="Head 3" align="right"/>
		</columns>
		<rows>
			<row>
				Orange
				<listbox mold="select">
					<listitem label="AB"/>
					<listitem label="CD"/>
				</listbox>
				<datebox/>
				<textbox rows="3"/>
			</row>
			<row>
				Apple
				<label value="A11"/>
				<label value="A12"/>
				<label value="A13"/>
			</row>
			<row>
				Lemon
				<checkbox checked="true" label="Option 1"/>
				<checkbox label="Option 2"/>
				<radiogroup>
					<radio label="Apple"/>
					<radio label="Orange" checked="true"/>
					<radio label="Lemon"/>
				</radiogroup>
			</row>
			<row>
				Tomato
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
	<button label="Change width" onClick="changeWidth()"/>
	<button label="Add row" onClick="addRow()"/>
	<button label="Insert row" onClick="insRow()"/>
	<zscript>
	void changeWidth() {
		col.setWidth("200px");
	}
	void addRow() {
		Row r = new Row();
		new Label("A31").setParent(r);
		new Label("A32").setParent(r);
		grid.getRows().appendChild(r);
	}
	void insRow() {
		Row r = new Row();
		new Label("Ins1").setParent(r);
		new Label("Ins2").setParent(r);
		grid.getRows().insertBefore(r, grid.getRows().getChildren().get(0));
	}
	addRow();
	</zscript>
</window>
*/		
	
		Window window_1 = new Window();
		win.add(window_1);
		window_1.setTitle("the odd row's color shall be yellow (controlled by the style component). test sorting");
		Style style_11 = new Style();
		window_1.add(style_11);
		//style has no api for setContent() in gwt now
		Grid grid_13 = new Grid();
		window_1.add(grid_13);
		grid_13.setHeight("100px");
		//Grid has no api for setid
		grid_13.setWidth("500px");
		Columns columns_131 = new Columns();
		grid_13.add(columns_131);
		columns_131.setSizable(true);
		Column column_1311 = new Column();
		columns_131.add(column_1311);
		//Column has no api for setid
		column_1311.setLabel("Order");
		column_1311.setSortAscending("${asc}");
		column_1311.setSortDescending("${dsc}");
		Column column_1312 = new Column();
		columns_131.add(column_1312);
		column_1312.setLabel("Head 1");
		Column column_1313 = new Column();
		columns_131.add(column_1313);
		column_1313.setAlign("center");
		column_1313.setLabel("Head 2");
		Column column_1314 = new Column();
		columns_131.add(column_1314);
		column_1314.setAlign("right");
		column_1314.setLabel("Head 3");
		Rows rows_132 = new Rows();
		grid_13.add(rows_132);
		Row row_1321 = new Row();
		rows_132.add(row_1321);
		Label label_13211= new Label();
		row_1321.add(label_13211);
		label_13211.setValue("Orange");
		Listbox listbox_13212 = new Listbox();
		row_1321.add(listbox_13212);
		//listbox_13212.setMold("select");
		Listitem listitem_132121 = new Listitem();
		listbox_13212.add(listitem_132121);
		listitem_132121.setLabel("AB");
		Listitem listitem_132122 = new Listitem();
		listbox_13212.add(listitem_132122);
		listitem_132122.setLabel("CD");
		Textbox textbox_13213 = new Textbox();
		row_1321.add(textbox_13213);
		Textbox textbox_13214 = new Textbox();
		row_1321.add(textbox_13214);
		textbox_13214.setRows(3);
		Row row_1322 = new Row();
		rows_132.add(row_1322);
		Label label_13221= new Label();
		row_1322.add(label_13221);
		label_13221.setValue("Apple");
		Label label_13222 = new Label();
		row_1322.add(label_13222);
		label_13222.setValue("A11");
		Label label_13223 = new Label();
		row_1322.add(label_13223);
		label_13223.setValue("A12");
		Label label_13224 = new Label();
		row_1322.add(label_13224);
		label_13224.setValue("A13");
		Row row_1323 = new Row();
		rows_132.add(row_1323);
		Label label_13231= new Label();
		row_1323.add(label_13231);
		label_13231.setValue("Lemon");
		Checkbox checkbox_13232 = new Checkbox();
		row_1323.add(checkbox_13232);
		checkbox_13232.setChecked(true);
		checkbox_13232.setLabel("Option 1");
		Checkbox checkbox_13233 = new Checkbox();
		row_1323.add(checkbox_13233);
		checkbox_13233.setLabel("Option 2");
		Radiogroup radiogroup_13234 = new Radiogroup();
		row_1323.add(radiogroup_13234);
		Radio radio_132341 = new Radio();
		radiogroup_13234.add(radio_132341);
		radio_132341.setLabel("Apple");
		Radio radio_132342 = new Radio();
		radiogroup_13234.add(radio_132342);
		radio_132342.setChecked(true);
		radio_132342.setLabel("Orange");
		Radio radio_132343 = new Radio();
		radiogroup_13234.add(radio_132343);
		radio_132343.setLabel("Lemon");
		Row row_1324 = new Row();
		rows_132.add(row_1324);
		Label label_13241= new Label();
		row_1324.add(label_13241);
		label_13241.setValue("Tomato");
		Checkbox checkbox_13242 = new Checkbox();
		row_1324.add(checkbox_13242);
		checkbox_13242.setChecked(true);
		checkbox_13242.setLabel("Option 1");
		Checkbox checkbox_13243 = new Checkbox();
		row_1324.add(checkbox_13243);
		checkbox_13243.setLabel("Option 2");
		Radiogroup radiogroup_13244 = new Radiogroup();
		row_1324.add(radiogroup_13244);
		radiogroup_13244.setOrient("vertical");
		Radio radio_132441 = new Radio();
		radiogroup_13244.add(radio_132441);
		radio_132441.setLabel("Apple");
		Radio radio_132442 = new Radio();
		radiogroup_13244.add(radio_132442);
		radio_132442.setChecked(true);
		radio_132442.setLabel("Orange");
		Radio radio_132443 = new Radio();
		radiogroup_13244.add(radio_132443);
		radio_132443.setLabel("Lemon");
		Button button_14 = new Button();
		window_1.add(button_14);
		button_14.setLabel("Change width");
		//Button has no api for setonclick
		Button button_15 = new Button();
		window_1.add(button_15);
		button_15.setLabel("Add row");
		//Button has no api for setonclick
		Button button_16 = new Button();
		window_1.add(button_16);
		button_16.setLabel("Insert row");
		//Button has no api for setonclick



	
				
		return win;
	}
	
	
}
