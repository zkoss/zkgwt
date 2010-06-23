package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zkex.grid.Detail;
import org.zkoss.gwt.client.zkex.grid.Group;
import org.zkoss.gwt.client.zkex.grid.Groupfoot;
import org.zkoss.gwt.client.zul.grid.Column;
import org.zkoss.gwt.client.zul.grid.Columns;
import org.zkoss.gwt.client.zul.grid.Foot;
import org.zkoss.gwt.client.zul.grid.Footer;
import org.zkoss.gwt.client.zul.grid.Grid;
import org.zkoss.gwt.client.zul.grid.Row;
import org.zkoss.gwt.client.zul.grid.Rows;
import org.zkoss.gwt.client.zul.inp.Textbox;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;


public class TestcaseGridFullGened extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
		<grid>
			<columns>
				<column />
				<column label="column2" />
				<column label="column3" />
			</columns>
			<rows>
				<group>
					<label value="labelGroup1" />
					<label value="labelGroup2" />
				</group>
				<row>
					<detail>
						<label value="labelDetail" />
					</detail>
					<label value="labelRow" />
					<textbox />
				</row>
				<groupfoot>
					<label value="labelGroupfoot" />
				</groupfoot>
			</rows>
			<foot>
				<footer>labelFooter</footer>
			</foot>
		</grid>
*/		
	
		Grid grid1 = new Grid();
		win.add(grid1);
		Columns columns11 = new Columns();
		grid1.add(columns11);
		Column column111 = new Column();
		columns11.add(column111);
		Column column112 = new Column();
		columns11.add(column112);
		column112.setLabel("column2");
		Column column113 = new Column();
		columns11.add(column113);
		column113.setLabel("column3");
		Rows rows12 = new Rows();
		grid1.add(rows12);
		Group group121 = new Group();
		rows12.add(group121);
		Label label1211 = new Label();
		group121.add(label1211);
		label1211.setValue("labelGroup1");
		Label label1212 = new Label();
		group121.add(label1212);
		label1212.setValue("labelGroup2");
		Row row122 = new Row();
		rows12.add(row122);
		Label label1221 = new Label();
		row122.add(label1221);
		label1221.setValue("labelRow");
		Textbox textbox1222 = new Textbox();
		row122.add(textbox1222);
		Detail detail1223 = new Detail();
		row122.add(detail1223);
		Label label12231 = new Label();
		detail1223.add(label12231);
		label12231.setValue("labelDetail");
		Groupfoot groupfoot123 = new Groupfoot();
		rows12.add(groupfoot123);
		Label label1231 = new Label();
		groupfoot123.add(label1231);
		label1231.setValue("labelGroupfoot");
		Foot foot13 = new Foot();
		grid1.add(foot13);
		Footer footer131 = new Footer();
		foot13.add(footer131);
				
		return win;
	}
	

}
