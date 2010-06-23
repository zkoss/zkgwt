package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.utl.Script;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseScript extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
		<script>
			alert("script happen");
		</script>
*/		
		Script comp = new Script();
		comp.setContent("alert('script happen');");
		
		win.add(comp);
				
		return win;
	}
}
