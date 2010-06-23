package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.utl.Style;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseStyle extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();

/*		
		<style>
		.usestyle {color:red}
		</style>
		<label sclass="usestyle" value="style occur"/>
*/
		
		Style comp = new Style();

		//no java method to set the content of Style tag
		//comp.setContent();
		
		win.add(comp);
				
		return win;
	}
}
