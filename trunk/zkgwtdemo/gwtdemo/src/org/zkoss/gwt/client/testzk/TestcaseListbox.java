package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.sel.Listbox;
import org.zkoss.gwt.client.zul.sel.Listitem;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseListbox extends TestcaseWrapper {
			
	public Widget getInstance() {		
		
/*		
		<listbox rows="1" mold="select">
			<listitem label="Inbox"/>
			<listitem label="Received"/>
			<listitem label="Draft"/>
		</listbox>		
*/
		
		Listbox comp = new Listbox();
		comp.setRows(1);
		//setMold will cause error
		//listbox.setMold("select");
		Listitem li1 = new Listitem();
		comp.add(li1);
		li1.setLabel("Inbox");
		
		Listitem li2 = new Listitem();
		li2.setLabel("Received");
		comp.add(li2);
		
		Listitem li3 = new Listitem();
		li3.setLabel("Draft");
		comp.add(li3);
				
		return comp;
	}
}
