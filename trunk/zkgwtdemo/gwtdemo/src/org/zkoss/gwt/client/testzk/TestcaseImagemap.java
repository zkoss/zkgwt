package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.db.Calendar;
import org.zkoss.gwt.client.zul.wgt.Imagemap;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseImagemap {
	public static Widget getInstance() {
		
		Window win = new Window();
/*		
		<imagemap src="/img/sun.jpg" onClick="alert(event.x + &quot;, &quot; +event.y)"/>
*/			
		Imagemap comp = new Imagemap();
		comp.setSrc("msn1.gif");
		//can I get the event data?
		
		win.add(comp);
				
		return win;
	}
}
