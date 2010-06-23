package org.zkoss.gwt.client.testzk.tree;

import org.zkoss.gwt.client.testzk.TestcaseWrapper;
import org.zkoss.gwt.client.zul.mesh.Paging;
import org.zkoss.gwt.client.zul.sel.Tree;
import org.zkoss.gwt.client.zul.sel.Treechildren;
import org.zkoss.gwt.client.zul.sel.Treeitem;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

public class TestcaseTree_paging extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
	<tree  mold="paging" pageSize="2">
		<treechildren>
			<treeitem label="Item 1" />
			<treeitem label="Item 2" />
			<treeitem label="Item 3" />
		</treechildren>
	</tree>
*/		
	
		/*
		 * put generated code here
		 * */
		Tree tree_1 = new Tree();
		win.add(tree_1);
		//tree_1.setMold("paging");
		//tree_1.setPageSize(2);
		Paging paging = new Paging();
		tree_1.add(paging);
		paging.setPageSize(2);
		
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
	

	
			
		
		return win;
	}
	
	
}
