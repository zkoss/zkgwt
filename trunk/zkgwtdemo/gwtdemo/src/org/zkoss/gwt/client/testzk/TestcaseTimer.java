package org.zkoss.gwt.client.testzk;

import java.util.Date;

import org.zkoss.gwt.client.zk.Event;
import org.zkoss.gwt.client.zk.EventListener;
import org.zkoss.gwt.client.zk.Events;
import org.zkoss.gwt.client.zul.utl.Timer;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;


public class TestcaseTimer extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();

/*		
		<label id="now" />
		<timer id="timer" delay="1000" repeats="true"
			onTimer="now.setValue(new Date().toString())" />
*/
		
		final Label lab = new Label();
		win.add(lab);
		Timer comp = new Timer();
		comp.setDelay(1000);
		comp.setRepeats(true);
		comp.addEventListener(Events.ON_TIMER, new EventListener() {
			@Override
			public void onEvent(Event event) {
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>timer onTimer");
				System.out.println("data : " + getJSONString(nEvent));		
				
				lab.setValue(new Date().toString());			
			}
		});
		
		win.add(comp);
				
		return win;
	}

}
