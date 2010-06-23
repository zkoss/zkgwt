package org.zkoss.gwt.client.testzk.grid;

import org.zkoss.gwt.client.testzk.TestcaseWrapper;
import org.zkoss.gwt.client.zul.grid.Column;
import org.zkoss.gwt.client.zul.grid.Columns;
import org.zkoss.gwt.client.zul.grid.Grid;
import org.zkoss.gwt.client.zul.grid.Row;
import org.zkoss.gwt.client.zul.grid.Rows;
import org.zkoss.gwt.client.zul.mesh.Auxhead;
import org.zkoss.gwt.client.zul.mesh.Auxheader;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

public class TestcaseZ30_grid_0013 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
<window title="test rowspan and colspan on auxheader">
	<grid SizedByContent="true">
	<auxhead>
		<auxheader label="A" rowspan="2" />
		<auxheader label="B" rowspan="2" />
		<auxheader label="C" colspan="1" />
	</auxhead>

	<auxhead>
		<auxheader label="C" colspan="1" />
	</auxhead>
	<columns sizable="true">
		<column label="AA" />
		<column label="BB" />
		<column label="CC" />
	</columns>
	<rows>
		<row>
			<label value="AA01" />
			<label value="BB01" />
			<label value="CC01" />
		</row>
		<row>
			<label value="AA01" />
			<label value="BB01" />
			<label value="CC01" />
		</row>
		<row>
			<label value="AA01" />
			<label value="BB01" />
			<label value="CC01" />
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
		window_1.setTitle("test rowspan and colspan on auxheader");
		Grid grid_11 = new Grid();
		window_1.add(grid_11);
		grid_11.setSizedByContent(true);
		Auxhead auxhead_111 = new Auxhead();
		grid_11.add(auxhead_111);
		Auxheader auxheader_1111 = new Auxheader();
		auxhead_111.add(auxheader_1111);
		auxheader_1111.setLabel("A");
		auxheader_1111.setRowspan(2);
		Auxheader auxheader_1112 = new Auxheader();
		auxhead_111.add(auxheader_1112);
		auxheader_1112.setLabel("B");
		auxheader_1112.setRowspan(2);
		Auxheader auxheader_1113 = new Auxheader();
		auxhead_111.add(auxheader_1113);
		auxheader_1113.setColspan(1);
		auxheader_1113.setLabel("C");
		Auxhead auxhead_112 = new Auxhead();
		grid_11.add(auxhead_112);
		Auxheader auxheader_1121 = new Auxheader();
		auxhead_112.add(auxheader_1121);
		auxheader_1121.setColspan(1);
		auxheader_1121.setLabel("C");
		Columns columns_113 = new Columns();
		grid_11.add(columns_113);
		columns_113.setSizable(true);
		Column column_1131 = new Column();
		columns_113.add(column_1131);
		column_1131.setLabel("AA");
		Column column_1132 = new Column();
		columns_113.add(column_1132);
		column_1132.setLabel("BB");
		Column column_1133 = new Column();
		columns_113.add(column_1133);
		column_1133.setLabel("CC");
		Rows rows_114 = new Rows();
		grid_11.add(rows_114);
		Row row_1141 = new Row();
		rows_114.add(row_1141);
		Label label_11411 = new Label();
		row_1141.add(label_11411);
		label_11411.setValue("AA01");
		Label label_11412 = new Label();
		row_1141.add(label_11412);
		label_11412.setValue("BB01");
		Label label_11413 = new Label();
		row_1141.add(label_11413);
		label_11413.setValue("CC01");
		Row row_1142 = new Row();
		rows_114.add(row_1142);
		Label label_11421 = new Label();
		row_1142.add(label_11421);
		label_11421.setValue("AA01");
		Label label_11422 = new Label();
		row_1142.add(label_11422);
		label_11422.setValue("BB01");
		Label label_11423 = new Label();
		row_1142.add(label_11423);
		label_11423.setValue("CC01");
		Row row_1143 = new Row();
		rows_114.add(row_1143);
		Label label_11431 = new Label();
		row_1143.add(label_11431);
		label_11431.setValue("AA01");
		Label label_11432 = new Label();
		row_1143.add(label_11432);
		label_11432.setValue("BB01");
		Label label_11433 = new Label();
		row_1143.add(label_11433);
		label_11433.setValue("CC01");
	

	
			
		
		return win;
	}
	
	
}
