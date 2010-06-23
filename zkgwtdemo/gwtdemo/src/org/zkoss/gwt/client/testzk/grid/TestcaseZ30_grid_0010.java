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

public class TestcaseZ30_grid_0010 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
<window title="Column should not show up here">
	<grid>
		<columns>
			<column/>
			<column align="center"/>
			<column align="right"/>
		</columns>
		<rows>
			<row>Testing whether header is visible</row>
		</rows>
	</grid>
</window>
*/		
	
		/*
		 * put generated code here
		 * */
		Window window_1 = new Window();
		win.add(window_1);
		window_1.setTitle("Column should not show up here");
		Grid grid_11 = new Grid();
		window_1.add(grid_11);
		Columns columns_111 = new Columns();
		grid_11.add(columns_111);
		Column column_1111 = new Column();
		columns_111.add(column_1111);
		Column column_1112 = new Column();
		columns_111.add(column_1112);
		column_1112.setAlign("center");
		Column column_1113 = new Column();
		columns_111.add(column_1113);
		column_1113.setAlign("right");
		Rows rows_112 = new Rows();
		grid_11.add(rows_112);
		Row row_1121 = new Row();
		rows_112.add(row_1121);
		Label label_11211= new Label();
		row_1121.add(label_11211);
		label_11211.setValue("Testingwhetherheaderisvisible");

	
			
		
		return win;
	}
	

}
