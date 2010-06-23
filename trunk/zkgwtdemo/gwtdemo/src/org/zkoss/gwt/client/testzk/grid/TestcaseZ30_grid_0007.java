package org.zkoss.gwt.client.testzk.grid;

import org.zkoss.gwt.client.testzk.TestcaseWrapper;
import org.zkoss.gwt.client.zul.grid.Grid;
import org.zkoss.gwt.client.zul.grid.Row;
import org.zkoss.gwt.client.zul.grid.Rows;
import org.zkoss.gwt.client.zul.inp.Textbox;
import org.zkoss.gwt.client.zul.utl.Style;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

public class TestcaseZ30_grid_0007 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
<window title="oddRow should has no color.">
	<style>
	tr.odd td.gc {
		background: yellow;
	}
	</style>
	<grid oddRowSclass="none">
		<rows>
			<row>
				Another with full width and no striping
				<textbox cols="30" rows="5"/>
			</row>
			<row>
				Second row
				<label value="cell 2"/>
			</row>
			<row>
				Third row
				<label value="cell 3"/>
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
		window_1.setTitle("oddRow should has no color.");
		Style style_11 = new Style();
		window_1.add(style_11);
		//style has no api for setContent() in gwt now
		Grid grid_12 = new Grid();
		window_1.add(grid_12);
		grid_12.setOddRowSclass("none");
		Rows rows_121 = new Rows();
		grid_12.add(rows_121);
		Row row_1211 = new Row();
		rows_121.add(row_1211);
		Label label_12111= new Label();
		row_1211.add(label_12111);
		label_12111.setValue("Anotherwithfullwidthandnostriping");
		Textbox textbox_12112 = new Textbox();
		row_1211.add(textbox_12112);
		textbox_12112.setCols(30);
		textbox_12112.setRows(5);
		Row row_1212 = new Row();
		rows_121.add(row_1212);
		Label label_12121= new Label();
		row_1212.add(label_12121);
		label_12121.setValue("Secondrow");
		Label label_12122 = new Label();
		row_1212.add(label_12122);
		label_12122.setValue("cell 2");
		Row row_1213 = new Row();
		rows_121.add(row_1213);
		Label label_12131= new Label();
		row_1213.add(label_12131);
		label_12131.setValue("Thirdrow");
		Label label_12132 = new Label();
		row_1213.add(label_12132);
		label_12132.setValue("cell 3");

	

	
			
		
		return win;
	}
	
	
}
