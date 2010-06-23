package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.inp.Textbox;
import org.zkoss.gwt.client.zul.wgt.Span;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseSpan extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();

/*		
		<span><textbox value="abcd"/></span>
*/
		Span comp = new Span();
			Textbox t = new Textbox();
			comp.add(t);
			t.setValue("abcd", true);
				
		win.add(comp);
				
		return win;
	}
}
