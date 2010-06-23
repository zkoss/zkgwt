package org.zkoss.gwt.client.testzk.tree;

import org.zkoss.gwt.client.testzk.TestcaseWrapper;
import org.zkoss.gwt.client.zul.sel.Tree;
import org.zkoss.gwt.client.zul.sel.Treechildren;
import org.zkoss.gwt.client.zul.sel.Treeitem;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

public class TestcaseZ30_tree_0015 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
	<tree id="tree" width="90%" mold="paging" pageSize="2">
		<treechildren>
			<treeitem label="Item 1" />
			<treeitem label="Item 2" />
			<treeitem label="Item 3" />
			<treeitem label="Item 4" />
			<treeitem label="Item 5" />
			<treeitem label="Item 6" />
			<treeitem label="Item 7" />
			<treeitem label="Item 8" />
			<treeitem label="Item 9" />
			<treeitem label="Item 10" />
			<treeitem label="Item 11" />
			<treeitem label="Item 12" />
			<treeitem label="Item 13" />
			<treeitem label="Item 14" />
			<treeitem label="Item 15">
				<treechildren>
			<treeitem label="Item 15.1" />
			<treeitem label="Item 15.2" />
			<treeitem label="Item 15.3" />
			<treeitem label="Item 15.4" />
			<treeitem label="Item 15.5" />
			<treeitem label="Item 15.6" />
			<treeitem label="Item 15.7" />
			<treeitem label="Item 15.8" />
			<treeitem label="Item 15.9" />
			<treeitem label="Item 15.10" />
			<treeitem label="Item 15.11" />
			<treeitem label="Item 15.12" />
			<treeitem label="Item 15.13" />
			<treeitem label="Item 15.14" />
			<treeitem label="Item 15.15" />
				</treechildren>
			</treeitem>
		</treechildren>
	</tree>

*/		
	
		/*
		 * put generated code here
		 * */
		Tree tree_1 = new Tree();
		win.add(tree_1);
		//Tree has no api for setid
		tree_1.setMold("paging");
		tree_1.setPageSize(2);
		tree_1.setWidth("90%");
		Treechildren treechildren_11 = new Treechildren();
		tree_1.add(treechildren_11);
		Treeitem treeitem_111 = new Treeitem();
		treechildren_11.add(treeitem_111);
		treeitem_111.setLabel("Item 1");
		Treeitem treeitem_112 = new Treeitem();
		treechildren_11.add(treeitem_112);
		treeitem_112.setLabel("Item 2");
		Treeitem treeitem_113 = new Treeitem();
		treechildren_11.add(treeitem_113);
		treeitem_113.setLabel("Item 3");
		Treeitem treeitem_114 = new Treeitem();
		treechildren_11.add(treeitem_114);
		treeitem_114.setLabel("Item 4");
		Treeitem treeitem_115 = new Treeitem();
		treechildren_11.add(treeitem_115);
		treeitem_115.setLabel("Item 5");
		Treeitem treeitem_116 = new Treeitem();
		treechildren_11.add(treeitem_116);
		treeitem_116.setLabel("Item 6");
		Treeitem treeitem_117 = new Treeitem();
		treechildren_11.add(treeitem_117);
		treeitem_117.setLabel("Item 7");
		Treeitem treeitem_118 = new Treeitem();
		treechildren_11.add(treeitem_118);
		treeitem_118.setLabel("Item 8");
		Treeitem treeitem_119 = new Treeitem();
		treechildren_11.add(treeitem_119);
		treeitem_119.setLabel("Item 9");
		Treeitem treeitem_1110 = new Treeitem();
		treechildren_11.add(treeitem_1110);
		treeitem_1110.setLabel("Item 10");
		Treeitem treeitem_1111 = new Treeitem();
		treechildren_11.add(treeitem_1111);
		treeitem_1111.setLabel("Item 11");
		Treeitem treeitem_1112 = new Treeitem();
		treechildren_11.add(treeitem_1112);
		treeitem_1112.setLabel("Item 12");
		Treeitem treeitem_1113 = new Treeitem();
		treechildren_11.add(treeitem_1113);
		treeitem_1113.setLabel("Item 13");
		Treeitem treeitem_1114 = new Treeitem();
		treechildren_11.add(treeitem_1114);
		treeitem_1114.setLabel("Item 14");
		Treeitem treeitem_1115 = new Treeitem();
		treechildren_11.add(treeitem_1115);
		treeitem_1115.setLabel("Item 15");
		Treechildren treechildren_11151 = new Treechildren();
		treeitem_1115.add(treechildren_11151);
		Treeitem treeitem_111511 = new Treeitem();
		treechildren_11151.add(treeitem_111511);
		treeitem_111511.setLabel("Item 15.1");
		Treeitem treeitem_111512 = new Treeitem();
		treechildren_11151.add(treeitem_111512);
		treeitem_111512.setLabel("Item 15.2");
		Treeitem treeitem_111513 = new Treeitem();
		treechildren_11151.add(treeitem_111513);
		treeitem_111513.setLabel("Item 15.3");
		Treeitem treeitem_111514 = new Treeitem();
		treechildren_11151.add(treeitem_111514);
		treeitem_111514.setLabel("Item 15.4");
		Treeitem treeitem_111515 = new Treeitem();
		treechildren_11151.add(treeitem_111515);
		treeitem_111515.setLabel("Item 15.5");
		Treeitem treeitem_111516 = new Treeitem();
		treechildren_11151.add(treeitem_111516);
		treeitem_111516.setLabel("Item 15.6");
		Treeitem treeitem_111517 = new Treeitem();
		treechildren_11151.add(treeitem_111517);
		treeitem_111517.setLabel("Item 15.7");
		Treeitem treeitem_111518 = new Treeitem();
		treechildren_11151.add(treeitem_111518);
		treeitem_111518.setLabel("Item 15.8");
		Treeitem treeitem_111519 = new Treeitem();
		treechildren_11151.add(treeitem_111519);
		treeitem_111519.setLabel("Item 15.9");
		Treeitem treeitem_1115110 = new Treeitem();
		treechildren_11151.add(treeitem_1115110);
		treeitem_1115110.setLabel("Item 15.10");
		Treeitem treeitem_1115111 = new Treeitem();
		treechildren_11151.add(treeitem_1115111);
		treeitem_1115111.setLabel("Item 15.11");
		Treeitem treeitem_1115112 = new Treeitem();
		treechildren_11151.add(treeitem_1115112);
		treeitem_1115112.setLabel("Item 15.12");
		Treeitem treeitem_1115113 = new Treeitem();
		treechildren_11151.add(treeitem_1115113);
		treeitem_1115113.setLabel("Item 15.13");
		Treeitem treeitem_1115114 = new Treeitem();
		treechildren_11151.add(treeitem_1115114);
		treeitem_1115114.setLabel("Item 15.14");
		Treeitem treeitem_1115115 = new Treeitem();
		treechildren_11151.add(treeitem_1115115);
		treeitem_1115115.setLabel("Item 15.15");


	
			
		
		return win;
	}
	
	
}
