package org.zkoss.gwt.client.testzk;

import java.util.Date;

import org.zkoss.gwt.client.zk.Event;
import org.zkoss.gwt.client.zk.EventListener;
import org.zkoss.gwt.client.zk.Events;
import org.zkoss.gwt.client.zul.db.Datebox;
import org.zkoss.gwt.client.zul.inp.Timebox;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;


public class TestcaseDatebox extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
		
/*		
		<datebox id="db" cols="20" format="yyyy/MM/dd a hh:mm:ss"  onCreate="self.value = new Date()" mold="rounded"/>
*/				
		Datebox comp = new Datebox();
		comp.setCols(20);

		comp.addEventListener(Events.ON_CHANGE, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>textbox onChange");
				System.out.println("data : " + getJSONString(nEvent));				
				System.out.println("value : " + getValue(nEvent));
			}
		});		
		
		//cause error 
		//comp.setFormat("a hh:mm:ss");
		
		//comp.setMold("rounded");
		
		win.add(comp);
				
		return win;
	}


}
