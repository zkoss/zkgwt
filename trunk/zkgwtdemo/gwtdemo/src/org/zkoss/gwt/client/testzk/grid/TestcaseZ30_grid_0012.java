package org.zkoss.gwt.client.testzk.grid;

import org.zkoss.gwt.client.testzk.TestcaseWrapper;
import org.zkoss.gwt.client.zul.grid.Grid;
import org.zkoss.gwt.client.zul.grid.Row;
import org.zkoss.gwt.client.zul.grid.Rows;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

public class TestcaseZ30_grid_0012 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
<window title="test row height">
	<grid width="400px">
		<rows>
			<row height="50px">1, height = 50px</row>
			<row height="100px">2, height = 100px</row>
			<row>3</row>
			<row>4</row>
			<row>5</row>
			<row>6</row>
			<row>7</row>
			<row>8</row>
			<row>9</row>
			<row>10</row>
		</rows>
	</grid>
</window>
*/		
	
		/*
		 * put generated code here
		 * */
		Window window_1 = new Window();
		win.add(window_1);
		window_1.setTitle("test row height");
		Grid grid_11 = new Grid();
		window_1.add(grid_11);
		grid_11.setWidth("400px");
		Rows rows_111 = new Rows();
		grid_11.add(rows_111);
		Row row_1111 = new Row();
		rows_111.add(row_1111);
		row_1111.setHeight("50px");
		Label label_11111= new Label();
		row_1111.add(label_11111);
		label_11111.setValue("1,height=50px");
		Row row_1112 = new Row();
		rows_111.add(row_1112);
		row_1112.setHeight("100px");
		Label label_11121= new Label();
		row_1112.add(label_11121);
		label_11121.setValue("2,height=100px");
		Row row_1113 = new Row();
		rows_111.add(row_1113);
		Label label_11131= new Label();
		row_1113.add(label_11131);
		label_11131.setValue("3");
		Row row_1114 = new Row();
		rows_111.add(row_1114);
		Label label_11141= new Label();
		row_1114.add(label_11141);
		label_11141.setValue("4");
		Row row_1115 = new Row();
		rows_111.add(row_1115);
		Label label_11151= new Label();
		row_1115.add(label_11151);
		label_11151.setValue("5");
		Row row_1116 = new Row();
		rows_111.add(row_1116);
		Label label_11161= new Label();
		row_1116.add(label_11161);
		label_11161.setValue("6");
		Row row_1117 = new Row();
		rows_111.add(row_1117);
		Label label_11171= new Label();
		row_1117.add(label_11171);
		label_11171.setValue("7");
		Row row_1118 = new Row();
		rows_111.add(row_1118);
		Label label_11181= new Label();
		row_1118.add(label_11181);
		label_11181.setValue("8");
		Row row_1119 = new Row();
		rows_111.add(row_1119);
		Label label_11191= new Label();
		row_1119.add(label_11191);
		label_11191.setValue("9");
		Row row_11110 = new Row();
		rows_111.add(row_11110);
		Label label_111101= new Label();
		row_11110.add(label_111101);
		label_111101.setValue("10");

	

	
			
		
		return win;
	}
	
	
}
