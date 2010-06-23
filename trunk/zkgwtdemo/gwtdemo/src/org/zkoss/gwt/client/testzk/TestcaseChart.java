package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.fchart.Flashchart;
import org.zkoss.gwt.client.zul.wgt.Chart;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseChart extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
	<chart  title="Pie Chart Demo" width="500" height="250" type="pie" threeD="true" fgAlpha="128"/>
	     <zscript>
         PieModel model = new MyPieModel();
         mychart.setModel(model);
     </zscript>
*/
		//How to set the model?
		Chart comp = new Chart();
		//no setModel()
		
		
		
		win.add(comp);
				
		return win;
	}
}
