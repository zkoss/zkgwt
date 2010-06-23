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

public class TestcaseZ30_grid_0018 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
<grid width="400px">
	<columns>
		<column label="Name"/>
		<column label="Telephone"/>
		<column label="Function"/>
	</columns>
	<rows>
		<row>
<label value="The Bo$$"/>
<label value="(to be reached through his secretary)"/>
<label value="Our gracious leader, informed, well-spoken, judicious, He Who Guides, Strong Arm of the Business, Offender of the Faithful, Protractor of the Useless, mystical, mythical, arcane, may his working days be long and his wealth increase"/>
		</row>
		<row>
<label value="Dr. Markbrand"/>
<label value="++46.32.191883"/>
<label value="Customer Care Server"/>
		</row>
	</rows>
</grid>

*/		
	
		/*
		 * put generated code here
		 * */
		Grid grid_1 = new Grid();
		win.add(grid_1);
		grid_1.setWidth("400px");
		Columns columns_11 = new Columns();
		grid_1.add(columns_11);
		Column column_111 = new Column();
		columns_11.add(column_111);
		column_111.setLabel("Name");
		Column column_112 = new Column();
		columns_11.add(column_112);
		column_112.setLabel("Telephone");
		Column column_113 = new Column();
		columns_11.add(column_113);
		column_113.setLabel("Function");
		Rows rows_12 = new Rows();
		grid_1.add(rows_12);
		Row row_121 = new Row();
		rows_12.add(row_121);
		Label label_1211 = new Label();
		row_121.add(label_1211);
		label_1211.setValue("The Bo$$");
		Label label_1212 = new Label();
		row_121.add(label_1212);
		label_1212.setValue("(to be reached through his secretary)");
		Label label_1213 = new Label();
		row_121.add(label_1213);
		label_1213.setValue("Our gracious leader, informed, well-spoken, judicious, He Who Guides, Strong Arm of the Business, Offender of the Faithful, Protractor of the Useless, mystical, mythical, arcane, may his working days be long and his wealth increase");
		Row row_122 = new Row();
		rows_12.add(row_122);
		Label label_1221 = new Label();
		row_122.add(label_1221);
		label_1221.setValue("Dr. Markbrand");
		Label label_1222 = new Label();
		row_122.add(label_1222);
		label_1222.setValue("++46.32.191883");
		Label label_1223 = new Label();
		row_122.add(label_1223);
		label_1223.setValue("Customer Care Server");
	

	
			
		
		return win;
	}
	
	
}
