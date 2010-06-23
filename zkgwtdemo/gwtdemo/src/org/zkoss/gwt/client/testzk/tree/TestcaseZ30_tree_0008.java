package org.zkoss.gwt.client.testzk.tree;

import org.zkoss.gwt.client.testzk.TestcaseWrapper;
import org.zkoss.gwt.client.zul.sel.Tree;
import org.zkoss.gwt.client.zul.sel.Treecell;
import org.zkoss.gwt.client.zul.sel.Treechildren;
import org.zkoss.gwt.client.zul.sel.Treecol;
import org.zkoss.gwt.client.zul.sel.Treecols;
import org.zkoss.gwt.client.zul.sel.Treeitem;
import org.zkoss.gwt.client.zul.sel.Treerow;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

public class TestcaseZ30_tree_0008 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
	<tree id="tree" height="100%" zclass="z-dottree" vflex="true">
		<treecols sizable="true">
			<treecol label="Name" />
			<treecol label="Description" />
		</treecols>
		<treechildren>
			<treeitem>
				<treerow>
					<treecell label="Item 1" />
					<treecell label="Item 1 description" />
				</treerow>
			</treeitem>
			<treeitem>
				<treerow>
					<treecell label="Item 2" />
					<treecell label="Item 2 description" />
				</treerow>
				<treechildren>
					<treeitem>
						<treerow>
							<treecell label="Item 2.1" />
						</treerow>
						<treechildren>
							<treeitem>
								<treerow>
									<treecell label="Item 2.1.1" />
								</treerow>
							</treeitem>
							<treeitem>
								<treerow>
									<treecell label="Item 2.1.2" />
								</treerow>
							</treeitem>
						</treechildren>
					</treeitem>
					<treeitem>
						<treerow>
							<treecell label="Item 2.2" />
							<treecell
								label="Item 2.2 is something who cares" />
						</treerow>
					</treeitem>
				</treechildren>
			</treeitem>
			<treeitem>
				<treerow>
					<treecell label="Item 2" />
					<treecell label="Item 2 description" />
				</treerow>
				<treechildren>
					<treeitem>
						<treerow>
							<treecell label="Item 2.1" />
						</treerow>
						<treechildren>
							<treeitem>
								<treerow>
									<treecell label="Item 2.1.1" />
								</treerow>
							</treeitem>
							<treeitem>
								<treerow>
									<treecell label="Item 2.1.2" />
								</treerow>
							</treeitem>
						</treechildren>
					</treeitem>
					<treeitem>
						<treerow>
							<treecell label="Item 2.2" />
							<treecell
								label="Item 2.2 is something who cares" />
						</treerow>
					</treeitem>
				</treechildren>
			</treeitem>
			<treeitem>
				<treerow>
					<treecell label="Item 2" />
					<treecell label="Item 2 description" />
				</treerow>
				<treechildren>
					<treeitem>
						<treerow>
							<treecell label="Item 2.1" />
						</treerow>
						<treechildren>
							<treeitem>
								<treerow>
									<treecell label="Item 2.1.1" />
								</treerow>
							</treeitem>
							<treeitem>
								<treerow>
									<treecell label="Item 2.1.2" />
								</treerow>
							</treeitem>
						</treechildren>
					</treeitem>
					<treeitem>
						<treerow>
							<treecell label="Item 2.2" />
							<treecell
								label="Item 2.2 is something who cares" />
						</treerow>
					</treeitem>
				</treechildren>
			</treeitem>
			<treeitem>
				<treerow>
					<treecell label="Item 2" />
					<treecell label="Item 2 description" />
				</treerow>
				<treechildren>
					<treeitem>
						<treerow>
							<treecell label="Item 2.1" />
						</treerow>
						<treechildren>
							<treeitem>
								<treerow>
									<treecell label="Item 2.1.1" />
								</treerow>
							</treeitem>
							<treeitem>
								<treerow>
									<treecell label="Item 2.1.2" />
								</treerow>
							</treeitem>
						</treechildren>
					</treeitem>
					<treeitem>
						<treerow>
							<treecell label="Item 2.2" />
							<treecell
								label="Item 2.2 is something who cares" />
						</treerow>
					</treeitem>
				</treechildren>
			</treeitem>
			<treeitem label="Item 3" />
		</treechildren>
	</tree>


*/		
	
		/*
		 * put generated code here
		 * */
		Tree tree_1 = new Tree();
		win.add(tree_1);
		tree_1.setHeight("100%");
		//Tree has no api for setid
		tree_1.setVflex("true");
		//Tree has no api for setzclass
		Treecols treecols_11 = new Treecols();
		tree_1.add(treecols_11);
		treecols_11.setSizable(true);
		Treecol treecol_111 = new Treecol();
		treecols_11.add(treecol_111);
		treecol_111.setLabel("Name");
		Treecol treecol_112 = new Treecol();
		treecols_11.add(treecol_112);
		treecol_112.setLabel("Description");
		Treechildren treechildren_12 = new Treechildren();
		tree_1.add(treechildren_12);
		Treeitem treeitem_121 = new Treeitem();
		treechildren_12.add(treeitem_121);
		Treerow treerow_1211 = new Treerow();
		treeitem_121.add(treerow_1211);
		Treecell treecell_12111 = new Treecell();
		treerow_1211.add(treecell_12111);
		treecell_12111.setLabel("Item 1");
		Treecell treecell_12112 = new Treecell();
		treerow_1211.add(treecell_12112);
		treecell_12112.setLabel("Item 1 description");
		Treeitem treeitem_122 = new Treeitem();
		treechildren_12.add(treeitem_122);
		Treerow treerow_1221 = new Treerow();
		treeitem_122.add(treerow_1221);
		Treecell treecell_12211 = new Treecell();
		treerow_1221.add(treecell_12211);
		treecell_12211.setLabel("Item 2");
		Treecell treecell_12212 = new Treecell();
		treerow_1221.add(treecell_12212);
		treecell_12212.setLabel("Item 2 description");
		Treechildren treechildren_1222 = new Treechildren();
		treeitem_122.add(treechildren_1222);
		Treeitem treeitem_12221 = new Treeitem();
		treechildren_1222.add(treeitem_12221);
		Treerow treerow_122211 = new Treerow();
		treeitem_12221.add(treerow_122211);
		Treecell treecell_1222111 = new Treecell();
		treerow_122211.add(treecell_1222111);
		treecell_1222111.setLabel("Item 2.1");
		Treechildren treechildren_122212 = new Treechildren();
		treeitem_12221.add(treechildren_122212);
		Treeitem treeitem_1222121 = new Treeitem();
		treechildren_122212.add(treeitem_1222121);
		Treerow treerow_12221211 = new Treerow();
		treeitem_1222121.add(treerow_12221211);
		Treecell treecell_122212111 = new Treecell();
		treerow_12221211.add(treecell_122212111);
		treecell_122212111.setLabel("Item 2.1.1");
		Treeitem treeitem_1222122 = new Treeitem();
		treechildren_122212.add(treeitem_1222122);
		Treerow treerow_12221221 = new Treerow();
		treeitem_1222122.add(treerow_12221221);
		Treecell treecell_122212211 = new Treecell();
		treerow_12221221.add(treecell_122212211);
		treecell_122212211.setLabel("Item 2.1.2");
		Treeitem treeitem_12222 = new Treeitem();
		treechildren_1222.add(treeitem_12222);
		Treerow treerow_122221 = new Treerow();
		treeitem_12222.add(treerow_122221);
		Treecell treecell_1222211 = new Treecell();
		treerow_122221.add(treecell_1222211);
		treecell_1222211.setLabel("Item 2.2");
		Treecell treecell_1222212 = new Treecell();
		treerow_122221.add(treecell_1222212);
		treecell_1222212.setLabel("Item 2.2 is something who cares");
		Treeitem treeitem_123 = new Treeitem();
		treechildren_12.add(treeitem_123);
		Treerow treerow_1231 = new Treerow();
		treeitem_123.add(treerow_1231);
		Treecell treecell_12311 = new Treecell();
		treerow_1231.add(treecell_12311);
		treecell_12311.setLabel("Item 2");
		Treecell treecell_12312 = new Treecell();
		treerow_1231.add(treecell_12312);
		treecell_12312.setLabel("Item 2 description");
		Treechildren treechildren_1232 = new Treechildren();
		treeitem_123.add(treechildren_1232);
		Treeitem treeitem_12321 = new Treeitem();
		treechildren_1232.add(treeitem_12321);
		Treerow treerow_123211 = new Treerow();
		treeitem_12321.add(treerow_123211);
		Treecell treecell_1232111 = new Treecell();
		treerow_123211.add(treecell_1232111);
		treecell_1232111.setLabel("Item 2.1");
		Treechildren treechildren_123212 = new Treechildren();
		treeitem_12321.add(treechildren_123212);
		Treeitem treeitem_1232121 = new Treeitem();
		treechildren_123212.add(treeitem_1232121);
		Treerow treerow_12321211 = new Treerow();
		treeitem_1232121.add(treerow_12321211);
		Treecell treecell_123212111 = new Treecell();
		treerow_12321211.add(treecell_123212111);
		treecell_123212111.setLabel("Item 2.1.1");
		Treeitem treeitem_1232122 = new Treeitem();
		treechildren_123212.add(treeitem_1232122);
		Treerow treerow_12321221 = new Treerow();
		treeitem_1232122.add(treerow_12321221);
		Treecell treecell_123212211 = new Treecell();
		treerow_12321221.add(treecell_123212211);
		treecell_123212211.setLabel("Item 2.1.2");
		Treeitem treeitem_12322 = new Treeitem();
		treechildren_1232.add(treeitem_12322);
		Treerow treerow_123221 = new Treerow();
		treeitem_12322.add(treerow_123221);
		Treecell treecell_1232211 = new Treecell();
		treerow_123221.add(treecell_1232211);
		treecell_1232211.setLabel("Item 2.2");
		Treecell treecell_1232212 = new Treecell();
		treerow_123221.add(treecell_1232212);
		treecell_1232212.setLabel("Item 2.2 is something who cares");
		Treeitem treeitem_124 = new Treeitem();
		treechildren_12.add(treeitem_124);
		Treerow treerow_1241 = new Treerow();
		treeitem_124.add(treerow_1241);
		Treecell treecell_12411 = new Treecell();
		treerow_1241.add(treecell_12411);
		treecell_12411.setLabel("Item 2");
		Treecell treecell_12412 = new Treecell();
		treerow_1241.add(treecell_12412);
		treecell_12412.setLabel("Item 2 description");
		Treechildren treechildren_1242 = new Treechildren();
		treeitem_124.add(treechildren_1242);
		Treeitem treeitem_12421 = new Treeitem();
		treechildren_1242.add(treeitem_12421);
		Treerow treerow_124211 = new Treerow();
		treeitem_12421.add(treerow_124211);
		Treecell treecell_1242111 = new Treecell();
		treerow_124211.add(treecell_1242111);
		treecell_1242111.setLabel("Item 2.1");
		Treechildren treechildren_124212 = new Treechildren();
		treeitem_12421.add(treechildren_124212);
		Treeitem treeitem_1242121 = new Treeitem();
		treechildren_124212.add(treeitem_1242121);
		Treerow treerow_12421211 = new Treerow();
		treeitem_1242121.add(treerow_12421211);
		Treecell treecell_124212111 = new Treecell();
		treerow_12421211.add(treecell_124212111);
		treecell_124212111.setLabel("Item 2.1.1");
		Treeitem treeitem_1242122 = new Treeitem();
		treechildren_124212.add(treeitem_1242122);
		Treerow treerow_12421221 = new Treerow();
		treeitem_1242122.add(treerow_12421221);
		Treecell treecell_124212211 = new Treecell();
		treerow_12421221.add(treecell_124212211);
		treecell_124212211.setLabel("Item 2.1.2");
		Treeitem treeitem_12422 = new Treeitem();
		treechildren_1242.add(treeitem_12422);
		Treerow treerow_124221 = new Treerow();
		treeitem_12422.add(treerow_124221);
		Treecell treecell_1242211 = new Treecell();
		treerow_124221.add(treecell_1242211);
		treecell_1242211.setLabel("Item 2.2");
		Treecell treecell_1242212 = new Treecell();
		treerow_124221.add(treecell_1242212);
		treecell_1242212.setLabel("Item 2.2 is something who cares");
		Treeitem treeitem_125 = new Treeitem();
		treechildren_12.add(treeitem_125);
		Treerow treerow_1251 = new Treerow();
		treeitem_125.add(treerow_1251);
		Treecell treecell_12511 = new Treecell();
		treerow_1251.add(treecell_12511);
		treecell_12511.setLabel("Item 2");
		Treecell treecell_12512 = new Treecell();
		treerow_1251.add(treecell_12512);
		treecell_12512.setLabel("Item 2 description");
		Treechildren treechildren_1252 = new Treechildren();
		treeitem_125.add(treechildren_1252);
		Treeitem treeitem_12521 = new Treeitem();
		treechildren_1252.add(treeitem_12521);
		Treerow treerow_125211 = new Treerow();
		treeitem_12521.add(treerow_125211);
		Treecell treecell_1252111 = new Treecell();
		treerow_125211.add(treecell_1252111);
		treecell_1252111.setLabel("Item 2.1");
		Treechildren treechildren_125212 = new Treechildren();
		treeitem_12521.add(treechildren_125212);
		Treeitem treeitem_1252121 = new Treeitem();
		treechildren_125212.add(treeitem_1252121);
		Treerow treerow_12521211 = new Treerow();
		treeitem_1252121.add(treerow_12521211);
		Treecell treecell_125212111 = new Treecell();
		treerow_12521211.add(treecell_125212111);
		treecell_125212111.setLabel("Item 2.1.1");
		Treeitem treeitem_1252122 = new Treeitem();
		treechildren_125212.add(treeitem_1252122);
		Treerow treerow_12521221 = new Treerow();
		treeitem_1252122.add(treerow_12521221);
		Treecell treecell_125212211 = new Treecell();
		treerow_12521221.add(treecell_125212211);
		treecell_125212211.setLabel("Item 2.1.2");
		Treeitem treeitem_12522 = new Treeitem();
		treechildren_1252.add(treeitem_12522);
		Treerow treerow_125221 = new Treerow();
		treeitem_12522.add(treerow_125221);
		Treecell treecell_1252211 = new Treecell();
		treerow_125221.add(treecell_1252211);
		treecell_1252211.setLabel("Item 2.2");
		Treecell treecell_1252212 = new Treecell();
		treerow_125221.add(treecell_1252212);
		treecell_1252212.setLabel("Item 2.2 is something who cares");
		Treeitem treeitem_126 = new Treeitem();
		treechildren_12.add(treeitem_126);
		treeitem_126.setLabel("Item 3");
	

	
			
		
		return win;
	}
	
	
}
