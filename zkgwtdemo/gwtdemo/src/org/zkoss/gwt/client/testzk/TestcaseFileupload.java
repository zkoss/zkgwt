package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.wgt.Fileupload;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseFileupload extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();

/*		
		<fileupload label="upload"/>
*/				
		Fileupload comp = new Fileupload();
		comp.setLabel("upload");
		
		win.add(comp);
				
		return win;
	}
}
