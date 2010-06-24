package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zk.Event;
import org.zkoss.gwt.client.zk.EventListener;
import org.zkoss.gwt.client.zk.Events;
import org.zkoss.gwt.client.zul.sel.Listbox;
import org.zkoss.gwt.client.zul.sel.Listcell;
import org.zkoss.gwt.client.zul.sel.Listhead;
import org.zkoss.gwt.client.zul.sel.Listheader;
import org.zkoss.gwt.client.zul.sel.Listitem;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.user.client.ui.Widget;


public class TestcaseListboxEvent extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
/*		
<listbox id="dst" checkmark="true" multiple="true" width="250px">
	<listhead>
		<listheader label="Population"/>
		<listheader label="%"/>
	</listhead>
	<listitem id="e" value="E">
		<listcell label="E. Supermen"/>
		<listcell label="21%"/>
	</listitem>
	<listitem id="f" value="F">
		<listcell label="F. Junior High Scroll"/>
		<listcell label="12%"/>
	</listitem>
</listbox>	
*/
		
		Window win = new Window();
		
		Listbox listbox_1 = new Listbox();
		win.add(listbox_1);
		listbox_1.setCheckmark(true);
		//Listbox has no api for setid
		listbox_1.setMultiple(true);
		listbox_1.setWidth("250px");
		Listhead listhead_11 = new Listhead();
		listbox_1.add(listhead_11);
		Listheader listheader_111 = new Listheader();
		listhead_11.add(listheader_111);
		listheader_111.setLabel("Population");
		Listheader listheader_112 = new Listheader();
		listhead_11.add(listheader_112);
		listheader_112.setLabel("%");
		Listitem listitem_12 = new Listitem();
		listbox_1.add(listitem_12);
		//Listitem has no api for setid
		listitem_12.setValue("E");
		Listcell listcell_121 = new Listcell();
		listitem_12.add(listcell_121);
		listcell_121.setLabel("E. Supermen");
		Listcell listcell_122 = new Listcell();
		listitem_12.add(listcell_122);
		listcell_122.setLabel("21%");
		Listitem listitem_13 = new Listitem();
		listbox_1.add(listitem_13);
		//Listitem has no api for setid
		listitem_13.setValue("F");
		Listcell listcell_131 = new Listcell();
		listitem_13.add(listcell_131);
		listcell_131.setLabel("F. Junior High Scroll");
		Listcell listcell_132 = new Listcell();
		listitem_13.add(listcell_132);
		listcell_132.setLabel("12%");

		
		listbox_1.addEventListener(Events.ON_SELECT, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>listbox_1 ON_SELECT");
				System.out.println("data" + getJSONString(nEvent));								
				System.out.println("selected index:" + getSelectedIndex(nEvent));		

				JsArrayInteger result = getSelectedIndexes(nEvent);
				for(int i=0;i<result.length();i++){
					System.out.println("select : "+i+" : "+result.get(i));	
				}								
			}
		});
		
		return win;
	}
	
	public static final native int getSelectedIndex(JavaScriptObject js) /*-{
		return js.data.items[0].getChildIndex(); 
	}-*/;
		
	
	public static final native JsArrayInteger getSelectedIndexes(JavaScriptObject js) /*-{
		var result = new Array(js.data.items.length);
		for(var i=0;i<js.data.items.length;i++){
			result[i]=js.data.items[i].getChildIndex();
		}
		return result; 
	}-*/;		
}
