package org.zkoss.gwt.client.testzk.grid;

import org.zkoss.gwt.client.testzk.TestcaseWrapper;
import org.zkoss.gwt.client.zul.grid.Foot;
import org.zkoss.gwt.client.zul.grid.Footer;
import org.zkoss.gwt.client.zul.grid.Grid;
import org.zkoss.gwt.client.zul.grid.Row;
import org.zkoss.gwt.client.zul.grid.Rows;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

public class TestcaseZ30_grid_0024 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
<grid>
	<rows>
		<row spans="2,3">
			<label value="(2,3)"/>
			<label value="Item B.5"/><label value="Item B.6"/>
		</row>
		<row spans="3">
			<label value="(3)"/><label value="Item C.4"/>
			<label value="Item C.5"/><label value="Item C.6"/>
		</row>
		<row spans=",,1,2">
			<label value="(,,1,2)"/><label value="Item D.2"/>
			<label value="Item D.3"/><label value="Item D.4"/>
			<label value="Item D.5"/>
		</row>
	</rows>
	<foot>
		<footer width="30%">Left : width 30%</footer>
		<footer>Center</footer>
		<footer width="100px" label="Right : width 100px" />
		<footer>Column 4</footer>
		<footer>Column 5</footer>
		<footer>Column 6</footer>
	</foot>
</grid>

*/		
	
		/*
		 * put generated code here
		 * */
		Grid grid_1 = new Grid();
		win.add(grid_1);
		Rows rows_11 = new Rows();
		grid_1.add(rows_11);
		Row row_111 = new Row();
		rows_11.add(row_111);
		row_111.setSpans("2,3");
		Label label_1111 = new Label();
		row_111.add(label_1111);
		label_1111.setValue("(2,3)");
		Label label_1112 = new Label();
		row_111.add(label_1112);
		label_1112.setValue("Item B.5");
		Label label_1113 = new Label();
		row_111.add(label_1113);
		label_1113.setValue("Item B.6");
		Row row_112 = new Row();
		rows_11.add(row_112);
		row_112.setSpans("3");
		Label label_1121 = new Label();
		row_112.add(label_1121);
		label_1121.setValue("(3)");
		Label label_1122 = new Label();
		row_112.add(label_1122);
		label_1122.setValue("Item C.4");
		Label label_1123 = new Label();
		row_112.add(label_1123);
		label_1123.setValue("Item C.5");
		Label label_1124 = new Label();
		row_112.add(label_1124);
		label_1124.setValue("Item C.6");
		Row row_113 = new Row();
		rows_11.add(row_113);
		row_113.setSpans(",,1,2");
		Label label_1131 = new Label();
		row_113.add(label_1131);
		label_1131.setValue("(,,1,2)");
		Label label_1132 = new Label();
		row_113.add(label_1132);
		label_1132.setValue("Item D.2");
		Label label_1133 = new Label();
		row_113.add(label_1133);
		label_1133.setValue("Item D.3");
		Label label_1134 = new Label();
		row_113.add(label_1134);
		label_1134.setValue("Item D.4");
		Label label_1135 = new Label();
		row_113.add(label_1135);
		label_1135.setValue("Item D.5");
		Foot foot_12 = new Foot();
		grid_1.add(foot_12);
		Footer footer_121 = new Footer();
		foot_12.add(footer_121);
		footer_121.setWidth("30%");
		Label label_1211= new Label();
		footer_121.add(label_1211);
		label_1211.setValue("Left:width30%");
		Footer footer_122 = new Footer();
		foot_12.add(footer_122);
		Label label_1221= new Label();
		footer_122.add(label_1221);
		label_1221.setValue("Center");
		Footer footer_123 = new Footer();
		foot_12.add(footer_123);
		footer_123.setLabel("Right : width 100px");
		footer_123.setWidth("100px");
		Footer footer_124 = new Footer();
		foot_12.add(footer_124);
		Label label_1241= new Label();
		footer_124.add(label_1241);
		label_1241.setValue("Column4");
		Footer footer_125 = new Footer();
		foot_12.add(footer_125);
		Label label_1251= new Label();
		footer_125.add(label_1251);
		label_1251.setValue("Column5");
		Footer footer_126 = new Footer();
		foot_12.add(footer_126);
		Label label_1261= new Label();
		footer_126.add(label_1261);
		label_1261.setValue("Column6");
	

	
			
		
		return win;
	}
	
		
}
