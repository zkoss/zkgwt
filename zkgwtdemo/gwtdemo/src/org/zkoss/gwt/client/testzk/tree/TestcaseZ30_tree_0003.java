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

public class TestcaseZ30_tree_0003 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
<window border="normal">
		Test each button works well.
		<tree id="tree" width="400px" height="400px">
			<treecols sizable="true">
				<treecol label="Subject" />
				<treecol label="From" />
				<treecol label="Received" />
			</treecols>
			<treechildren>
				<treeitem id="ti0" selected="true">
					<treerow>
						<treecell label="Intel Snares XML" />
						<treecell label="David Needle" />
						<treecell label="7-12-2005" />
					</treerow>
					<treechildren>
						<treeitem id="ti01">
							<treerow>
								<treecell label="Intel Snares XML" />
								<treecell label="Ria Coen" />
								<treecell label="7-12-2005" />
							</treerow>
						</treeitem>
					</treechildren>
				</treeitem>
				<treeitem label="Unknown chaos" />
				<treeitem>
					<treerow>
						<treecell label="C# versus Java" />
						<treecell label="David Longman" />
						<treecell label="7-1o-2005" />
					</treerow>
					<treechildren>
						<treeitem>
							<treerow>
								<treecell label="Item 3.1" />
							</treerow>
							<treechildren>
								<treeitem>
									<treerow>
										<treecell label="Item 3.1.1" />
									</treerow>
								</treeitem>
							</treechildren>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Power never easy" />
								<treecell label="Michelle Jordan" />
								<treecell label="6-12-2005" />
							</treerow>
						</treeitem>
					</treechildren>
				</treeitem>
				<treeitem label="Item 4" open="false">
					<zscript>item4 = self</zscript>
					<treechildren>
						<treeitem>
							<treerow>
								<treecell label="Item 4.1" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.2" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.3" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.4" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.5" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.6" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.7" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.8" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.9" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.10" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.11" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.12" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.13" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.14" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.15" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.16" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.17" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.18" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.19" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.20" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.21" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.22" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.23" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.24" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.25" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.26" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.27" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.28" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.29" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.30" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.31" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.32" />
							</treerow>
						</treeitem>
						<treeitem>
							<treerow>
								<treecell label="Item 4.33" />
							</treerow>
						</treeitem>
					</treechildren>
				</treeitem>
			</treechildren>
		</tree>

		<button label="Toggle checkmark"
			onClick="tree.checkmark = !tree.checkmark" />
		<button label="Select 2nd" onClick="ti01.selected = true" />
		<button label="Toggle Item 4"
			onClick="item4.setOpen(!item4.isOpen())" />
</window>
*/		
	
		/*
		 * put generated code here
		 * */
		Window window_1 = new Window();
		win.add(window_1);
		window_1.setBorder("normal");
		Label label_11= new Label();
		window_1.add(label_11);
		label_11.setValue("Testeachbuttonworkswell.");
		Tree tree_12 = new Tree();
		window_1.add(tree_12);
		tree_12.setHeight("400px");
		//Tree has no api for setid
		tree_12.setWidth("400px");
		Treecols treecols_121 = new Treecols();
		tree_12.add(treecols_121);
		treecols_121.setSizable(true);
		Treecol treecol_1211 = new Treecol();
		treecols_121.add(treecol_1211);
		treecol_1211.setLabel("Subject");
		Treecol treecol_1212 = new Treecol();
		treecols_121.add(treecol_1212);
		treecol_1212.setLabel("From");
		Treecol treecol_1213 = new Treecol();
		treecols_121.add(treecol_1213);
		treecol_1213.setLabel("Received");
		Treechildren treechildren_122 = new Treechildren();
		tree_12.add(treechildren_122);
		Treeitem treeitem_1221 = new Treeitem();
		treechildren_122.add(treeitem_1221);
		//Treeitem has no api for setid
		treeitem_1221.setSelected(true);
		Treerow treerow_12211 = new Treerow();
		treeitem_1221.add(treerow_12211);
		Treecell treecell_122111 = new Treecell();
		treerow_12211.add(treecell_122111);
		treecell_122111.setLabel("Intel Snares XML");
		Treecell treecell_122112 = new Treecell();
		treerow_12211.add(treecell_122112);
		treecell_122112.setLabel("David Needle");
		Treecell treecell_122113 = new Treecell();
		treerow_12211.add(treecell_122113);
		treecell_122113.setLabel("7-12-2005");
		Treechildren treechildren_12212 = new Treechildren();
		treeitem_1221.add(treechildren_12212);
		Treeitem treeitem_122121 = new Treeitem();
		treechildren_12212.add(treeitem_122121);
		//Treeitem has no api for setid
		Treerow treerow_1221211 = new Treerow();
		treeitem_122121.add(treerow_1221211);
		Treecell treecell_12212111 = new Treecell();
		treerow_1221211.add(treecell_12212111);
		treecell_12212111.setLabel("Intel Snares XML");
		Treecell treecell_12212112 = new Treecell();
		treerow_1221211.add(treecell_12212112);
		treecell_12212112.setLabel("Ria Coen");
		Treecell treecell_12212113 = new Treecell();
		treerow_1221211.add(treecell_12212113);
		treecell_12212113.setLabel("7-12-2005");
		Treeitem treeitem_1222 = new Treeitem();
		treechildren_122.add(treeitem_1222);
		treeitem_1222.setLabel("Unknown chaos");
		Treeitem treeitem_1223 = new Treeitem();
		treechildren_122.add(treeitem_1223);
		Treerow treerow_12231 = new Treerow();
		treeitem_1223.add(treerow_12231);
		Treecell treecell_122311 = new Treecell();
		treerow_12231.add(treecell_122311);
		treecell_122311.setLabel("C# versus Java");
		Treecell treecell_122312 = new Treecell();
		treerow_12231.add(treecell_122312);
		treecell_122312.setLabel("David Longman");
		Treecell treecell_122313 = new Treecell();
		treerow_12231.add(treecell_122313);
		treecell_122313.setLabel("7-1o-2005");
		Treechildren treechildren_12232 = new Treechildren();
		treeitem_1223.add(treechildren_12232);
		Treeitem treeitem_122321 = new Treeitem();
		treechildren_12232.add(treeitem_122321);
		Treerow treerow_1223211 = new Treerow();
		treeitem_122321.add(treerow_1223211);
		Treecell treecell_12232111 = new Treecell();
		treerow_1223211.add(treecell_12232111);
		treecell_12232111.setLabel("Item 3.1");
		Treechildren treechildren_1223212 = new Treechildren();
		treeitem_122321.add(treechildren_1223212);
		Treeitem treeitem_12232121 = new Treeitem();
		treechildren_1223212.add(treeitem_12232121);
		Treerow treerow_122321211 = new Treerow();
		treeitem_12232121.add(treerow_122321211);
		Treecell treecell_1223212111 = new Treecell();
		treerow_122321211.add(treecell_1223212111);
		treecell_1223212111.setLabel("Item 3.1.1");
		Treeitem treeitem_122322 = new Treeitem();
		treechildren_12232.add(treeitem_122322);
		Treerow treerow_1223221 = new Treerow();
		treeitem_122322.add(treerow_1223221);
		Treecell treecell_12232211 = new Treecell();
		treerow_1223221.add(treecell_12232211);
		treecell_12232211.setLabel("Power never easy");
		Treecell treecell_12232212 = new Treecell();
		treerow_1223221.add(treecell_12232212);
		treecell_12232212.setLabel("Michelle Jordan");
		Treecell treecell_12232213 = new Treecell();
		treerow_1223221.add(treecell_12232213);
		treecell_12232213.setLabel("6-12-2005");
		Treeitem treeitem_1224 = new Treeitem();
		treechildren_122.add(treeitem_1224);
		treeitem_1224.setLabel("Item 4");
		treeitem_1224.setOpen(false);
		Treechildren treechildren_12242 = new Treechildren();
		treeitem_1224.add(treechildren_12242);
		Treeitem treeitem_122421 = new Treeitem();
		treechildren_12242.add(treeitem_122421);
		Treerow treerow_1224211 = new Treerow();
		treeitem_122421.add(treerow_1224211);
		Treecell treecell_12242111 = new Treecell();
		treerow_1224211.add(treecell_12242111);
		treecell_12242111.setLabel("Item 4.1");
		Treeitem treeitem_122422 = new Treeitem();
		treechildren_12242.add(treeitem_122422);
		Treerow treerow_1224221 = new Treerow();
		treeitem_122422.add(treerow_1224221);
		Treecell treecell_12242211 = new Treecell();
		treerow_1224221.add(treecell_12242211);
		treecell_12242211.setLabel("Item 4.2");
		Treeitem treeitem_122423 = new Treeitem();
		treechildren_12242.add(treeitem_122423);
		Treerow treerow_1224231 = new Treerow();
		treeitem_122423.add(treerow_1224231);
		Treecell treecell_12242311 = new Treecell();
		treerow_1224231.add(treecell_12242311);
		treecell_12242311.setLabel("Item 4.3");
		Treeitem treeitem_122424 = new Treeitem();
		treechildren_12242.add(treeitem_122424);
		Treerow treerow_1224241 = new Treerow();
		treeitem_122424.add(treerow_1224241);
		Treecell treecell_12242411 = new Treecell();
		treerow_1224241.add(treecell_12242411);
		treecell_12242411.setLabel("Item 4.4");
		Treeitem treeitem_122425 = new Treeitem();
		treechildren_12242.add(treeitem_122425);
		Treerow treerow_1224251 = new Treerow();
		treeitem_122425.add(treerow_1224251);
		Treecell treecell_12242511 = new Treecell();
		treerow_1224251.add(treecell_12242511);
		treecell_12242511.setLabel("Item 4.5");
		Treeitem treeitem_122426 = new Treeitem();
		treechildren_12242.add(treeitem_122426);
		Treerow treerow_1224261 = new Treerow();
		treeitem_122426.add(treerow_1224261);
		Treecell treecell_12242611 = new Treecell();
		treerow_1224261.add(treecell_12242611);
		treecell_12242611.setLabel("Item 4.6");
		Treeitem treeitem_122427 = new Treeitem();
		treechildren_12242.add(treeitem_122427);
		Treerow treerow_1224271 = new Treerow();
		treeitem_122427.add(treerow_1224271);
		Treecell treecell_12242711 = new Treecell();
		treerow_1224271.add(treecell_12242711);
		treecell_12242711.setLabel("Item 4.7");
		Treeitem treeitem_122428 = new Treeitem();
		treechildren_12242.add(treeitem_122428);
		Treerow treerow_1224281 = new Treerow();
		treeitem_122428.add(treerow_1224281);
		Treecell treecell_12242811 = new Treecell();
		treerow_1224281.add(treecell_12242811);
		treecell_12242811.setLabel("Item 4.8");
		Treeitem treeitem_122429 = new Treeitem();
		treechildren_12242.add(treeitem_122429);
		Treerow treerow_1224291 = new Treerow();
		treeitem_122429.add(treerow_1224291);
		Treecell treecell_12242911 = new Treecell();
		treerow_1224291.add(treecell_12242911);
		treecell_12242911.setLabel("Item 4.9");
		Treeitem treeitem_1224210 = new Treeitem();
		treechildren_12242.add(treeitem_1224210);
		Treerow treerow_12242101 = new Treerow();
		treeitem_1224210.add(treerow_12242101);
		Treecell treecell_122421011 = new Treecell();
		treerow_12242101.add(treecell_122421011);
		treecell_122421011.setLabel("Item 4.10");
		Treeitem treeitem_1224211 = new Treeitem();
		treechildren_12242.add(treeitem_1224211);
		Treerow treerow_12242111 = new Treerow();
		treeitem_1224211.add(treerow_12242111);
		Treecell treecell_122421111 = new Treecell();
		treerow_12242111.add(treecell_122421111);
		treecell_122421111.setLabel("Item 4.11");
		Treeitem treeitem_1224212 = new Treeitem();
		treechildren_12242.add(treeitem_1224212);
		Treerow treerow_12242121 = new Treerow();
		treeitem_1224212.add(treerow_12242121);
		Treecell treecell_122421211 = new Treecell();
		treerow_12242121.add(treecell_122421211);
		treecell_122421211.setLabel("Item 4.12");
		Treeitem treeitem_1224213 = new Treeitem();
		treechildren_12242.add(treeitem_1224213);
		Treerow treerow_12242131 = new Treerow();
		treeitem_1224213.add(treerow_12242131);
		Treecell treecell_122421311 = new Treecell();
		treerow_12242131.add(treecell_122421311);
		treecell_122421311.setLabel("Item 4.13");
		Treeitem treeitem_1224214 = new Treeitem();
		treechildren_12242.add(treeitem_1224214);
		Treerow treerow_12242141 = new Treerow();
		treeitem_1224214.add(treerow_12242141);
		Treecell treecell_122421411 = new Treecell();
		treerow_12242141.add(treecell_122421411);
		treecell_122421411.setLabel("Item 4.14");
		Treeitem treeitem_1224215 = new Treeitem();
		treechildren_12242.add(treeitem_1224215);
		Treerow treerow_12242151 = new Treerow();
		treeitem_1224215.add(treerow_12242151);
		Treecell treecell_122421511 = new Treecell();
		treerow_12242151.add(treecell_122421511);
		treecell_122421511.setLabel("Item 4.15");
		Treeitem treeitem_1224216 = new Treeitem();
		treechildren_12242.add(treeitem_1224216);
		Treerow treerow_12242161 = new Treerow();
		treeitem_1224216.add(treerow_12242161);
		Treecell treecell_122421611 = new Treecell();
		treerow_12242161.add(treecell_122421611);
		treecell_122421611.setLabel("Item 4.16");
		Treeitem treeitem_1224217 = new Treeitem();
		treechildren_12242.add(treeitem_1224217);
		Treerow treerow_12242171 = new Treerow();
		treeitem_1224217.add(treerow_12242171);
		Treecell treecell_122421711 = new Treecell();
		treerow_12242171.add(treecell_122421711);
		treecell_122421711.setLabel("Item 4.17");
		Treeitem treeitem_1224218 = new Treeitem();
		treechildren_12242.add(treeitem_1224218);
		Treerow treerow_12242181 = new Treerow();
		treeitem_1224218.add(treerow_12242181);
		Treecell treecell_122421811 = new Treecell();
		treerow_12242181.add(treecell_122421811);
		treecell_122421811.setLabel("Item 4.18");
		Treeitem treeitem_1224219 = new Treeitem();
		treechildren_12242.add(treeitem_1224219);
		Treerow treerow_12242191 = new Treerow();
		treeitem_1224219.add(treerow_12242191);
		Treecell treecell_122421911 = new Treecell();
		treerow_12242191.add(treecell_122421911);
		treecell_122421911.setLabel("Item 4.19");
		Treeitem treeitem_1224220 = new Treeitem();
		treechildren_12242.add(treeitem_1224220);
		Treerow treerow_12242201 = new Treerow();
		treeitem_1224220.add(treerow_12242201);
		Treecell treecell_122422011 = new Treecell();
		treerow_12242201.add(treecell_122422011);
		treecell_122422011.setLabel("Item 4.20");
		Treeitem treeitem_1224221 = new Treeitem();
		treechildren_12242.add(treeitem_1224221);
		Treerow treerow_12242211 = new Treerow();
		treeitem_1224221.add(treerow_12242211);
		Treecell treecell_122422111 = new Treecell();
		treerow_12242211.add(treecell_122422111);
		treecell_122422111.setLabel("Item 4.21");
		Treeitem treeitem_1224222 = new Treeitem();
		treechildren_12242.add(treeitem_1224222);
		Treerow treerow_12242221 = new Treerow();
		treeitem_1224222.add(treerow_12242221);
		Treecell treecell_122422211 = new Treecell();
		treerow_12242221.add(treecell_122422211);
		treecell_122422211.setLabel("Item 4.22");
		Treeitem treeitem_1224223 = new Treeitem();
		treechildren_12242.add(treeitem_1224223);
		Treerow treerow_12242231 = new Treerow();
		treeitem_1224223.add(treerow_12242231);
		Treecell treecell_122422311 = new Treecell();
		treerow_12242231.add(treecell_122422311);
		treecell_122422311.setLabel("Item 4.23");
		Treeitem treeitem_1224224 = new Treeitem();
		treechildren_12242.add(treeitem_1224224);
		Treerow treerow_12242241 = new Treerow();
		treeitem_1224224.add(treerow_12242241);
		Treecell treecell_122422411 = new Treecell();
		treerow_12242241.add(treecell_122422411);
		treecell_122422411.setLabel("Item 4.24");
		Treeitem treeitem_1224225 = new Treeitem();
		treechildren_12242.add(treeitem_1224225);
		Treerow treerow_12242251 = new Treerow();
		treeitem_1224225.add(treerow_12242251);
		Treecell treecell_122422511 = new Treecell();
		treerow_12242251.add(treecell_122422511);
		treecell_122422511.setLabel("Item 4.25");
		Treeitem treeitem_1224226 = new Treeitem();
		treechildren_12242.add(treeitem_1224226);
		Treerow treerow_12242261 = new Treerow();
		treeitem_1224226.add(treerow_12242261);
		Treecell treecell_122422611 = new Treecell();
		treerow_12242261.add(treecell_122422611);
		treecell_122422611.setLabel("Item 4.26");
		Treeitem treeitem_1224227 = new Treeitem();
		treechildren_12242.add(treeitem_1224227);
		Treerow treerow_12242271 = new Treerow();
		treeitem_1224227.add(treerow_12242271);
		Treecell treecell_122422711 = new Treecell();
		treerow_12242271.add(treecell_122422711);
		treecell_122422711.setLabel("Item 4.27");
		Treeitem treeitem_1224228 = new Treeitem();
		treechildren_12242.add(treeitem_1224228);
		Treerow treerow_12242281 = new Treerow();
		treeitem_1224228.add(treerow_12242281);
		Treecell treecell_122422811 = new Treecell();
		treerow_12242281.add(treecell_122422811);
		treecell_122422811.setLabel("Item 4.28");
		Treeitem treeitem_1224229 = new Treeitem();
		treechildren_12242.add(treeitem_1224229);
		Treerow treerow_12242291 = new Treerow();
		treeitem_1224229.add(treerow_12242291);
		Treecell treecell_122422911 = new Treecell();
		treerow_12242291.add(treecell_122422911);
		treecell_122422911.setLabel("Item 4.29");
		Treeitem treeitem_1224230 = new Treeitem();
		treechildren_12242.add(treeitem_1224230);
		Treerow treerow_12242301 = new Treerow();
		treeitem_1224230.add(treerow_12242301);
		Treecell treecell_122423011 = new Treecell();
		treerow_12242301.add(treecell_122423011);
		treecell_122423011.setLabel("Item 4.30");
		Treeitem treeitem_1224231 = new Treeitem();
		treechildren_12242.add(treeitem_1224231);
		Treerow treerow_12242311 = new Treerow();
		treeitem_1224231.add(treerow_12242311);
		Treecell treecell_122423111 = new Treecell();
		treerow_12242311.add(treecell_122423111);
		treecell_122423111.setLabel("Item 4.31");
		Treeitem treeitem_1224232 = new Treeitem();
		treechildren_12242.add(treeitem_1224232);
		Treerow treerow_12242321 = new Treerow();
		treeitem_1224232.add(treerow_12242321);
		Treecell treecell_122423211 = new Treecell();
		treerow_12242321.add(treecell_122423211);
		treecell_122423211.setLabel("Item 4.32");
		Treeitem treeitem_1224233 = new Treeitem();
		treechildren_12242.add(treeitem_1224233);
		Treerow treerow_12242331 = new Treerow();
		treeitem_1224233.add(treerow_12242331);
		Treecell treecell_122423311 = new Treecell();
		treerow_12242331.add(treecell_122423311);
		treecell_122423311.setLabel("Item 4.33");
		Button button_13 = new Button();
		window_1.add(button_13);
		button_13.setLabel("Toggle checkmark");
		//Button has no api for setonclick
		Button button_14 = new Button();
		window_1.add(button_14);
		button_14.setLabel("Select 2nd");
		//Button has no api for setonclick
		Button button_15 = new Button();
		window_1.add(button_15);
		button_15.setLabel("Toggle Item 4");
		//Button has no api for setonclick


	

	
			
		
		return win;
	}
	
	
}
