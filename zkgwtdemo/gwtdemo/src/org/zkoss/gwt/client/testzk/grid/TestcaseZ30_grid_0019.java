package org.zkoss.gwt.client.testzk.grid;

import org.zkoss.gwt.client.testzk.TestcaseWrapper;
import org.zkoss.gwt.client.zul.grid.Column;
import org.zkoss.gwt.client.zul.grid.Columns;
import org.zkoss.gwt.client.zul.grid.Grid;
import org.zkoss.gwt.client.zul.grid.Row;
import org.zkoss.gwt.client.zul.grid.Rows;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

public class TestcaseZ30_grid_0019 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
<grid>
	<columns sizable="true">
		<column label="Left" align="left"/><column label="Center" align="center"/>
		<column label="Right" align="right"/><column label="Column 4"/>
		<column label="Column 5"/><column label="Column 6"/>
	</columns>
	<rows>
		<row spans="1,2,2">
			<label value="(1,2,2)"/><label value="Item B.2"/>
			<label value="Item B.4"/><label value="Item B.6"/>
		</row>
		<row spans="3">
			<label value="(3)"/><label value="Item C.4"/>
			<label value="Item C.5"/><label value="Item C.6"/>
		</row>
		<row spans=",,2,2">
			<label value="(,,2,2)"/><label value="Item D.2"/>
			<label value="Item D.3"/><label value="Item D.5"/>
		</row>
		<row>
			<label value="()"/><label value="Item A.2"/>
			<label value="Item A.3"/><label value="Item A.4"/>
			<label value="Item A.5"/><label value="Item A.6"/>
		</row>
		<row spans="1,5">
			<label value="(1,)"/><label value="Item X"/>
		</row>
	</rows>
</grid>

*/		
	
		/*
		 * put generated code here
		 * */
		Grid grid_1 = new Grid();
		win.add(grid_1);
		Columns columns_11 = new Columns();
		grid_1.add(columns_11);
		columns_11.setSizable(true);
		Column column_111 = new Column();
		columns_11.add(column_111);
		column_111.setAlign("left");
		column_111.setLabel("Left");
		Column column_112 = new Column();
		columns_11.add(column_112);
		column_112.setAlign("center");
		column_112.setLabel("Center");
		Column column_113 = new Column();
		columns_11.add(column_113);
		column_113.setAlign("right");
		column_113.setLabel("Right");
		Column column_114 = new Column();
		columns_11.add(column_114);
		column_114.setLabel("Column 4");
		Column column_115 = new Column();
		columns_11.add(column_115);
		column_115.setLabel("Column 5");
		Column column_116 = new Column();
		columns_11.add(column_116);
		column_116.setLabel("Column 6");
		Rows rows_12 = new Rows();
		grid_1.add(rows_12);
		Row row_121 = new Row();
		rows_12.add(row_121);
		row_121.setSpans("1,2,2");
		Label label_1211 = new Label();
		row_121.add(label_1211);
		label_1211.setValue("(1,2,2)");
		Label label_1212 = new Label();
		row_121.add(label_1212);
		label_1212.setValue("Item B.2");
		Label label_1213 = new Label();
		row_121.add(label_1213);
		label_1213.setValue("Item B.4");
		Label label_1214 = new Label();
		row_121.add(label_1214);
		label_1214.setValue("Item B.6");
		Row row_122 = new Row();
		rows_12.add(row_122);
		row_122.setSpans("3");
		Label label_1221 = new Label();
		row_122.add(label_1221);
		label_1221.setValue("(3)");
		Label label_1222 = new Label();
		row_122.add(label_1222);
		label_1222.setValue("Item C.4");
		Label label_1223 = new Label();
		row_122.add(label_1223);
		label_1223.setValue("Item C.5");
		Label label_1224 = new Label();
		row_122.add(label_1224);
		label_1224.setValue("Item C.6");
		Row row_123 = new Row();
		rows_12.add(row_123);
		row_123.setSpans(",,2,2");
		Label label_1231 = new Label();
		row_123.add(label_1231);
		label_1231.setValue("(,,2,2)");
		Label label_1232 = new Label();
		row_123.add(label_1232);
		label_1232.setValue("Item D.2");
		Label label_1233 = new Label();
		row_123.add(label_1233);
		label_1233.setValue("Item D.3");
		Label label_1234 = new Label();
		row_123.add(label_1234);
		label_1234.setValue("Item D.5");
		Row row_124 = new Row();
		rows_12.add(row_124);
		Label label_1241 = new Label();
		row_124.add(label_1241);
		label_1241.setValue("()");
		Label label_1242 = new Label();
		row_124.add(label_1242);
		label_1242.setValue("Item A.2");
		Label label_1243 = new Label();
		row_124.add(label_1243);
		label_1243.setValue("Item A.3");
		Label label_1244 = new Label();
		row_124.add(label_1244);
		label_1244.setValue("Item A.4");
		Label label_1245 = new Label();
		row_124.add(label_1245);
		label_1245.setValue("Item A.5");
		Label label_1246 = new Label();
		row_124.add(label_1246);
		label_1246.setValue("Item A.6");
		Row row_125 = new Row();
		rows_12.add(row_125);
		row_125.setSpans("1,5");
		Label label_1251 = new Label();
		row_125.add(label_1251);
		label_1251.setValue("(1,)");
		Label label_1252 = new Label();
		row_125.add(label_1252);
		label_1252.setValue("Item X");
	

	
			
		
		return win;
	}
	
	
}
