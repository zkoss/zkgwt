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


public class TestcaseGridFull extends TestcaseWrapper {
			
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
		Grid comp = new Grid();
			Columns columns = new Columns();
			comp.add(columns);
				Column column1 = new Column();
				columns.add(column1);

				Column column2 = new Column();
				columns.add(column2);
				column2.setLabel("column2");

				Column column3 = new Column();
				columns.add(column3);
				column3.setLabel("column3");
				
			Rows rows = new Rows();
			comp.add(rows);
				Group group = new Group();
				rows.add(group);
					Label labelGroup1= new Label();
					group.add(labelGroup1);
					labelGroup1.setValue("labelGroup1");

					Label labelGroup2= new Label();
					group.add(labelGroup2);
					labelGroup2.setValue("labelGroup2");
				
				Row row = new Row();
				rows.add(row);
					//detail must follow its order.
					Detail detail = new Detail();
					row.add(detail);
						Label labelDetail = new Label();
						detail.add(labelDetail);
						labelDetail.setValue("labelDetail");

					Label labelRow = new Label();
					row.add(labelRow);
					labelRow.setValue("labelRow");
					
					Textbox textbox = new Textbox();
					row.add(textbox);
					
						
				Groupfoot groupfoot = new Groupfoot();
				rows.add(groupfoot);
					Label labelGroupfoot = new Label();
					groupfoot.add(labelGroupfoot);
					labelGroupfoot.setValue("labelGroupfoot");
			Foot foot = new Foot();
			comp.add(foot);
				Footer footer = new Footer();
				foot.add(footer);
					Label labelFooter = new Label();
					footer.add(labelFooter);
					labelFooter.setValue("labelFooter");
		
					
//		win.addEventListener(Events.ON_CREATE, new EventListener() {
//			public void onEvent(Event event) {				
//				JavaScriptObject nEvent = event.getNativeEvent();				
//				System.out.println(">>window onCreate");
//				System.out.println("data : " + getJSONString(nEvent));		
//				
//			}
//		});		

		win.add(comp);
				
		return win;
	}
	

}
