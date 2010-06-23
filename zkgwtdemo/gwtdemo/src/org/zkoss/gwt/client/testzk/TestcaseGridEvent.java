package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zk.Event;
import org.zkoss.gwt.client.zk.EventListener;
import org.zkoss.gwt.client.zk.Events;
import org.zkoss.gwt.client.zul.grid.Column;
import org.zkoss.gwt.client.zul.grid.Columns;
import org.zkoss.gwt.client.zul.grid.Grid;
import org.zkoss.gwt.client.zul.grid.Row;
import org.zkoss.gwt.client.zul.grid.Rows;
import org.zkoss.gwt.client.zul.inp.Textbox;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;


public class TestcaseGridEvent extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
	 <grid>
         <columns sizable="true">
             <column label="Type"/>
             <column label="Content"/>
         </columns>
         <rows>
             <row>
                 <label value="File:"/>
                 <textbox />
             </row>
             <row>
                 <label value="Options:"/>
                 <textbox />
             </row>
         </rows>
     </grid>
*/		
		Grid comp = new Grid();
			Columns columns = new Columns();
			comp.add(columns);
			columns.setSizable(true);
				Column column1 = new Column();
				columns.add(column1);
				column1.setLabel("column1");

				Column column2 = new Column();
				columns.add(column2);
				column2.setLabel("column2");
			Rows rows = new Rows();
			comp.add(rows);
				Row row1= new Row();
				rows.add(row1);
					Label labelRow1 = new Label();
					row1.add(labelRow1);
					labelRow1.setValue("labelRow1");
					Textbox textbox1 = new Textbox();
					row1.add(textbox1);
				
				Row row2= new Row();
				rows.add(row2);
					Label labelRow2 = new Label();
					row2.add(labelRow2);
					labelRow2.setValue("labelRow2");
					Textbox textbox2 = new Textbox();
					row2.add(textbox2);
					
		//The onClientInfo event is meaningful only to the root component (aka., a component without any parent).
		win.addEventListener(Events.ON_CLIENT_INFO, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>window onClientInfo");
				System.out.println("data : " + getJSONString(nEvent));		
				
			}
		});		

		win.addEventListener(Events.ON_CREATE, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>window onCreate");
				System.out.println("data : " + getJSONString(nEvent));		
				
			}
		});		

		win.add(comp);
				
		return win;
	}
	
	
}
