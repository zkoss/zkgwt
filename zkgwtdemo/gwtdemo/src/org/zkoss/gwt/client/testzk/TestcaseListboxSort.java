package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zk.Event;
import org.zkoss.gwt.client.zk.EventListener;
import org.zkoss.gwt.client.zk.Events;
import org.zkoss.gwt.client.zul.sel.Listbox;
import org.zkoss.gwt.client.zul.sel.Listhead;
import org.zkoss.gwt.client.zul.sel.Listheader;
import org.zkoss.gwt.client.zul.sel.Listitem;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;


public class TestcaseListboxSort {
	public static Widget getInstance() {	
		
/*		
		<listbox>
			<listhead>
				<listheader label="Subject" sort="auto"/>
			</listhead>
			
			<listitem label="Inbox"/>
			<listitem label="Received"/>
			<listitem label="Draft"/>
		</listbox>		
*/
		
		Listbox comp = new Listbox();
			Listhead lh = new Listhead();
			comp.add(lh);
				Listheader lher = new Listheader();
				lh.add(lher);
				lher.setLabel("Subject");
				lher.setSort("auto");
		
		
			Listitem li1 = new Listitem();
			comp.add(li1);
			li1.setLabel("Inbox");
			
			Listitem li2 = new Listitem();
			li2.setLabel("Received");
			comp.add(li2);
			
			Listitem li3 = new Listitem();
			li3.setLabel("Draft");
			comp.add(li3);

		comp.addEventListener(Events.ON_SORT, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>listbox onSort");
				System.out.println("data : " + getJSONString(nEvent));		
				
			}
		});				
		return comp;
	}

	public static final native String getValue(JavaScriptObject js) /*-{
		return js.data.value; 
	}-*/;
	
	public static final native String getJSONString(JavaScriptObject js) /*-{				
		return $wnd.jq.toJSON(js.data); 
	}-*/;		
}
