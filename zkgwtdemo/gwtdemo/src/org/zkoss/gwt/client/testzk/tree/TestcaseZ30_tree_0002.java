package org.zkoss.gwt.client.testzk.tree;

import org.zkoss.gwt.client.testzk.TestcaseWrapper;
import org.zkoss.gwt.client.zul.sel.Tree;
import org.zkoss.gwt.client.zul.sel.Treecell;
import org.zkoss.gwt.client.zul.sel.Treechildren;
import org.zkoss.gwt.client.zul.sel.Treecol;
import org.zkoss.gwt.client.zul.sel.Treecols;
import org.zkoss.gwt.client.zul.sel.Treeitem;
import org.zkoss.gwt.client.zul.sel.Treerow;
import org.zkoss.gwt.client.zul.wgt.Button;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

public class TestcaseZ30_tree_0002 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
<window>
	Resizable header
	<tree id="tree" width="90%" rows="5">
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
	<button label="disable resizable">
		<attribute name="onClick">
			tcol.setSizable(false);
		</attribute>
	</button>
	<button label="enable resizable">
		<attribute name="onClick">
			tcol.setSizable(true);
		</attribute>
	</button>
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
		Button button_13 = new Button();
		window_1.add(button_13);
		button_13.setLabel("disable resizable");
		Button button_14 = new Button();
		window_1.add(button_14);
		button_14.setLabel("enable resizable");






	
			
		
		return win;
	}
	
		
}
