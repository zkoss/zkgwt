package org.zkoss.gwt.client.testzk.tree;

import org.zkoss.gwt.client.testzk.TestcaseWrapper;
import org.zkoss.gwt.client.zul.sel.Tree;
import org.zkoss.gwt.client.zul.sel.Treechildren;
import org.zkoss.gwt.client.zul.sel.Treeitem;
import org.zkoss.gwt.client.zul.wgt.Button;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

public class TestcaseZ30_tree_0004 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
<window title="test case" border="normal">
First of all, click "Add item", then click "replace 1-3", it should not show any error.
		<tree id="tree" width="400px" height="300px" vflex="true">
			<treechildren>
				<treeitem label="A"/>
				<treeitem id="item" label="B">
					<treechildren>
						
					</treechildren>
				</treeitem>
			</treechildren>
		</tree>
		<button label="Add item">
			<attribute name="onClick">
			for(int i =0; i &lt; 3; i++ ){
				Treechildren tc_ = (Treechildren)item.getTreechildren();
				Treeitem ti_ = new Treeitem();
				Treerow tr_ = new Treerow();
				Treecell tcl_ = new Treecell();
				tcl_.setLabel("N");
				tcl_.setParent(tr_);
				tr_.setParent(ti_);
				ti_.setParent(tc_);
			}
			</attribute>
		</button>
		<button label="replace 1-3">
			<attribute name="onClick">
				Treechildren tc = (Treechildren)item.getTreechildren();
				List l = tc.getChildren();
				for(int i =0; i &lt; 3; i++ ){
					Treeitem _item = (Treeitem)l.get(i);
					Treecell _tc = new Treecell("replace"+i);
					Treerow _tr = null;
					if(_item.getTreerow()==null){
						System.out.println("null");
						_tr = new Treerow();
						_tr.setParent(_item);
					}else{
						System.out.println("notnull");
						_tr = _item.getTreerow(); 
						_tr.getChildren().clear();
					}		
					_tc.setParent(_tr);
				}
		
			</attribute>
		</button>

</window>

*/		
	
		/*
		 * put generated code here
		 * */
		Window window_1 = new Window();
		win.add(window_1);
		window_1.setBorder("normal");
		window_1.setTitle("test case");
		Label label_11= new Label();
		window_1.add(label_11);
		label_11.setValue("Firstofall,click\"Additem\",thenclick\"replace1-3\",itshouldnotshowanyerror.");
		Tree tree_12 = new Tree();
		window_1.add(tree_12);
		tree_12.setHeight("300px");
		//Tree has no api for setid
		tree_12.setVflex("true");
		tree_12.setWidth("400px");
		Treechildren treechildren_121 = new Treechildren();
		tree_12.add(treechildren_121);
		Treeitem treeitem_1211 = new Treeitem();
		treechildren_121.add(treeitem_1211);
		treeitem_1211.setLabel("A");
		Treeitem treeitem_1212 = new Treeitem();
		treechildren_121.add(treeitem_1212);
		//Treeitem has no api for setid
		treeitem_1212.setLabel("B");
		Treechildren treechildren_12121 = new Treechildren();
		treeitem_1212.add(treechildren_12121);
		Button button_13 = new Button();
		window_1.add(button_13);
		button_13.setLabel("Add item");
		Button button_14 = new Button();
		window_1.add(button_14);
		button_14.setLabel("replace 1-3");


	
			
		
		return win;
	}
	
	
}
