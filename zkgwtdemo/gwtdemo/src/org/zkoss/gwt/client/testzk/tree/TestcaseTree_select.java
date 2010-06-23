package org.zkoss.gwt.client.testzk.tree;

import org.zkoss.gwt.client.testzk.TestcaseWrapper;
import org.zkoss.gwt.client.zk.Event;
import org.zkoss.gwt.client.zk.EventListener;
import org.zkoss.gwt.client.zk.Events;
import org.zkoss.gwt.client.zul.sel.Tree;
import org.zkoss.gwt.client.zul.sel.Treecell;
import org.zkoss.gwt.client.zul.sel.Treechildren;
import org.zkoss.gwt.client.zul.sel.Treecol;
import org.zkoss.gwt.client.zul.sel.Treecols;
import org.zkoss.gwt.client.zul.sel.Treeitem;
import org.zkoss.gwt.client.zul.sel.Treerow;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

public class TestcaseTree_select extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
<window>
	Resizable header
	<tree id="tree" width="90%" rows="5" multiple="true">
		<treecols id="tcol" sizable="true">
			<treecol label="Name"/>
			<treecol label="Description"/>
		</treecols>
		<treechildren>
			<treeitem>
				<treerow>
					<treecell label="Item 1"/>
					<treecell label="Item 1 description"/>
				</treerow>
			</treeitem>
			<treeitem>
				<treerow>
					<treecell label="Item 2"/>
					<treecell label="Item 2 description"/>
				</treerow>
				<treechildren>
					<treeitem>
						<treerow>
							<treecell label="Item 2.1"/>
						</treerow>
						<treechildren>
							<treeitem>
								<treerow>
									<treecell label="Item 2.1.1"/>
								</treerow>
							</treeitem>
							<treeitem>
								<treerow>
									<treecell label="Item 2.1.2"/>
								</treerow>
							</treeitem>
						</treechildren>
					</treeitem>
					<treeitem>
						<treerow>
							<treecell label="Item 2.2"/>
							<treecell label="Item 2.2 is something who cares"/>
						</treerow>
					</treeitem>
				</treechildren>
			</treeitem>
			<treeitem label="Item 3"/>
		</treechildren>
	</tree>
</window>

*/		
	
		/*
		 * put generated code here
		 * */
		Window window_1 = new Window();
		win.add(window_1);
		Label label_11= new Label();
		window_1.add(label_11);
		label_11.setValue("Resizableheader");
		Tree tree_12 = new Tree();
		window_1.add(tree_12);
		//Tree has no api for setid
		tree_12.setMultiple(true);
		tree_12.setRows(5);
		tree_12.setWidth("90%");
		Treecols treecols_121 = new Treecols();
		tree_12.add(treecols_121);
		//Treecols has no api for setid
		treecols_121.setSizable(true);
		Treecol treecol_1211 = new Treecol();
		treecols_121.add(treecol_1211);
		treecol_1211.setLabel("Name");
		Treecol treecol_1212 = new Treecol();
		treecols_121.add(treecol_1212);
		treecol_1212.setLabel("Description");
		Treechildren treechildren_122 = new Treechildren();
		tree_12.add(treechildren_122);
		Treeitem treeitem_1221 = new Treeitem();
		treechildren_122.add(treeitem_1221);
		Treerow treerow_12211 = new Treerow();
		treeitem_1221.add(treerow_12211);
		Treecell treecell_122111 = new Treecell();
		treerow_12211.add(treecell_122111);
		treecell_122111.setLabel("Item 1");
		Treecell treecell_122112 = new Treecell();
		treerow_12211.add(treecell_122112);
		treecell_122112.setLabel("Item 1 description");
		Treeitem treeitem_1222 = new Treeitem();
		treechildren_122.add(treeitem_1222);
		Treerow treerow_12221 = new Treerow();
		treeitem_1222.add(treerow_12221);
		Treecell treecell_122211 = new Treecell();
		treerow_12221.add(treecell_122211);
		treecell_122211.setLabel("Item 2");
		Treecell treecell_122212 = new Treecell();
		treerow_12221.add(treecell_122212);
		treecell_122212.setLabel("Item 2 description");
		Treechildren treechildren_12222 = new Treechildren();
		treeitem_1222.add(treechildren_12222);
		Treeitem treeitem_122221 = new Treeitem();
		treechildren_12222.add(treeitem_122221);
		Treerow treerow_1222211 = new Treerow();
		treeitem_122221.add(treerow_1222211);
		Treecell treecell_12222111 = new Treecell();
		treerow_1222211.add(treecell_12222111);
		treecell_12222111.setLabel("Item 2.1");
		Treechildren treechildren_1222212 = new Treechildren();
		treeitem_122221.add(treechildren_1222212);
		Treeitem treeitem_12222121 = new Treeitem();
		treechildren_1222212.add(treeitem_12222121);
		Treerow treerow_122221211 = new Treerow();
		treeitem_12222121.add(treerow_122221211);
		Treecell treecell_1222212111 = new Treecell();
		treerow_122221211.add(treecell_1222212111);
		treecell_1222212111.setLabel("Item 2.1.1");
		Treeitem treeitem_12222122 = new Treeitem();
		treechildren_1222212.add(treeitem_12222122);
		Treerow treerow_122221221 = new Treerow();
		treeitem_12222122.add(treerow_122221221);
		Treecell treecell_1222212211 = new Treecell();
		treerow_122221221.add(treecell_1222212211);
		treecell_1222212211.setLabel("Item 2.1.2");
		Treeitem treeitem_122222 = new Treeitem();
		treechildren_12222.add(treeitem_122222);
		Treerow treerow_1222221 = new Treerow();
		treeitem_122222.add(treerow_1222221);
		Treecell treecell_12222211 = new Treecell();
		treerow_1222221.add(treecell_12222211);
		treecell_12222211.setLabel("Item 2.2");
		Treecell treecell_12222212 = new Treecell();
		treerow_1222221.add(treecell_12222212);
		treecell_12222212.setLabel("Item 2.2 is something who cares");
		Treeitem treeitem_1223 = new Treeitem();
		treechildren_122.add(treeitem_1223);
		treeitem_1223.setLabel("Item 3");

	
		tree_12.addEventListener(Events.ON_SELECT, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>tree_12 ON_SELECT");
				System.out.println("data" + getJSONString(nEvent));								
				System.out.println("selected index:" + getSelectedIndex(nEvent));		

				System.out.println("selected indexes: "+ getSelectedIndexes(nEvent));
				
//				int[] pass = {5,5};
//				pass = getSelectedIndexesArray(nEvent,pass);
//				System.out.println("the length of " + pass.length);
//				for(int i =0;i<pass.length;i++){
//					System.out.println(pass);
//				}				
			}
		});
	
			
		
		return win;
	}
	

	
	public static final native int getSelectedIndex(JavaScriptObject js) /*-{
		return js.data.items[0].getChildIndex(); 
	}-*/;
	
	//
	public static final native String getSelectedIndexes(JavaScriptObject js) /*-{
		$wnd.zk.log(js.data.items.length);
		var result = new Array(js.data.items.length);
		for(var i=0;i<js.data.items.length;i++){
			result[i]=js.data.items[i].getChildIndex();
			$wnd.zk.log(i, result[i]);
		}
		$wnd.zk.log("result", result);
		return result.toString(); 
	}-*/;
	
	//
	public static final native int[] getSelectedIndexesArray(JavaScriptObject js, int[] passback) /*-{
		$wnd.zk.log(js.data.items.length);
		var result = new Array(js.data.items.length);
		for(var i=0;i<js.data.items.length;i++){
			result[i]=js.data.items[i].getChildIndex();
			passback[i] = js.data.items[i].getChildIndex();
			$wnd.zk.log(i, result[i]);
		}
		$wnd.zk.log("result", result);
		return passback; 
	}-*/;
	

}
