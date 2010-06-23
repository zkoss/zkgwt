package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zk.Event;
import org.zkoss.gwt.client.zk.EventListener;
import org.zkoss.gwt.client.zk.Events;
import org.zkoss.gwt.client.zul.sel.Listbox;
import org.zkoss.gwt.client.zul.sel.Listhead;
import org.zkoss.gwt.client.zul.sel.Listheader;
import org.zkoss.gwt.client.zul.sel.Listitem;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;


public class TestcaseListboxSort extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
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
		
		Listbox listbox_1 = new Listbox();
		win.add(listbox_1);
		Listhead listhead_11 = new Listhead();
		listbox_1.add(listhead_11);
		Listheader listheader_111 = new Listheader();
		listhead_11.add(listheader_111);
		listheader_111.setLabel("Subject");
		listheader_111.setSort("auto");
		Listitem listitem_12 = new Listitem();
		listbox_1.add(listitem_12);
		listitem_12.setLabel("Inbox");
		Listitem listitem_13 = new Listitem();
		listbox_1.add(listitem_13);
		listitem_13.setLabel("Received");
		Listitem listitem_14 = new Listitem();
		listbox_1.add(listitem_14);
		listitem_14.setLabel("Draft");

		return win;
	}


	
	public static final native int getSelectedIndex(JavaScriptObject js) /*-{
	return js.data.items[0].getChildIndex(); 
}-*/;

//
public static final native String getSelectedIndexes(JavaScriptObject js) /*-{
//	$wnd.zk.log(js.data.items.length);
	var result = new Array(js.data.items.length);
	for(var i=0;i<js.data.items.length;i++){
		result[i]=js.data.items[i].getChildIndex();
//		$wnd.zk.log(i, result[i]);
	}
//	$wnd.zk.log("result", result);
	return result.toString(); 
}-*/;

//
public static final native int[] getSelectedIndexesArray(JavaScriptObject js, int[] passback) /*-{
//	$wnd.zk.log(js.data.items.length);
	var result = new Array(js.data.items.length);
	for(var i=0;i<js.data.items.length;i++){
		result[i]=js.data.items[i].getChildIndex();
		passback[i] = js.data.items[i].getChildIndex();
//		$wnd.zk.log(i, result[i]);
	}
//	$wnd.zk.log("result", result);
	return passback; 
}-*/;


}
