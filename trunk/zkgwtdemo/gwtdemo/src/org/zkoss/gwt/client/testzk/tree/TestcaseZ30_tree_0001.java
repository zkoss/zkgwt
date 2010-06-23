package org.zkoss.gwt.client.testzk.tree;

import org.zkoss.gwt.client.testzk.TestcaseWrapper;
import org.zkoss.gwt.client.zul.inp.Intbox;
import org.zkoss.gwt.client.zul.mesh.Auxhead;
import org.zkoss.gwt.client.zul.mesh.Auxheader;
import org.zkoss.gwt.client.zul.sel.Tree;
import org.zkoss.gwt.client.zul.sel.Treecell;
import org.zkoss.gwt.client.zul.sel.Treechildren;
import org.zkoss.gwt.client.zul.sel.Treecol;
import org.zkoss.gwt.client.zul.sel.Treecols;
import org.zkoss.gwt.client.zul.sel.Treeitem;
import org.zkoss.gwt.client.zul.sel.Treerow;
import org.zkoss.gwt.client.zul.wgt.Button;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wgt.Separator;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

public class TestcaseZ30_tree_0001 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
<window title="Win" id="win">
Test each button works properly.
	<button label="doModal" onClick="win.doModal()" />
	<button label="doEmbed" onClick="win.doEmbedded()" />
	Nested header
	<tree id="tree2" width="240px">
		<treecols>
			<treecol width="100px" id="tcola" label="A" />
			<treecol label="B" />
			<treecol label="C" />
			<treecol label="D" />
			<treecol label="E" />
			<treecol label="F" />
			<treecol id="tcolg" label="G" />
		</treecols>
		<auxhead>
			<auxheader id="Phi"  label="Phi" colspan="2"/>
			<auxheader id="Pi" label="Pi" colspan="2" />
			<auxheader id="Kroc" label="Kroc" colspan="3"/>
		</auxhead>
		<auxhead id="ABG">
			<auxheader id="Alpha" label="Alpha" colspan="2" />
			<auxheader id="Beta" label="beta" colspan="2" />
			<auxheader id="Gamma" label="gamma" colspan="3" />
		</auxhead>
		<treechildren>
			<treeitem id="ti0" selected="true">
				<treerow>
					<treecell label="A" />
					<treecell label="B" />
					<treecell label="C" />
					<treecell label="D" />
					<treecell label="E" />
					<treecell label="F" />
					<treecell label="G" />
				</treerow>
				<treechildren>
					<treeitem selected="true">
						<treerow>
							<treecell label="A-1" />
							<treecell label="B" />
							<treecell label="C" />
							<treecell label="D" />
							<treecell label="E" />
							<treecell label="F" />
							<treecell label="G" />
						</treerow>
					</treeitem>
					<treeitem>
						<treerow>
							<treecell label="A-2" />
							<treecell label="B" />
							<treecell label="C" />
							<treecell label="D" />
							<treecell label="E" />
							<treecell label="F" />
							<treecell label="G" />
						</treerow>
					</treeitem>
				</treechildren>
			</treeitem>
		</treechildren>
	</tree>
	
	<button label ="Alpha = A+B+C" >
		<attribute name="onClick">
			Alpha.setColspan(3);
		</attribute>
	</button>
	<button label ="Alpha = A" >
		<attribute name="onClick">
			Alpha.setColspan(1);
		</attribute>
	</button>
	<button label ="Add Seta After Gamma">
		<attribute name="onClick">
			Auxheader seta = new Auxheader();
			seta.setLabel("seta");
			seta.setColspan(1);
			seta.setParent(ABG);
		</attribute>
	</button>
	<button label="remove Phi">
		<attribute name="onClick">
			Phi.setParent(null);
		</attribute>
	</button>
	<button label="remove G">
		<attribute name="onClick">
			tcolg.setParent(null);
		</attribute>
	</button>
	<button label="setTreeWidth">
		<attribute name="onClick">
			tree2.setWidth(w.getValue()+"px");
		</attribute>
	</button>
	<intbox id="w" constraint="no empty"/>
             <separator/>
	<button label="expand A">
		<attribute name="onClick">
			tcola.setWidth("400px");
		</attribute>
	</button>
</window>

*/		
	
		/*
		 * put generated code here
		 * */
		Window window_1 = new Window();
		win.add(window_1);
		//Window has no api for setid
		window_1.setTitle("Win");
		Label label_11= new Label();
		window_1.add(label_11);
		label_11.setValue("Testeachbuttonworksproperly.");
		Button button_12 = new Button();
		window_1.add(button_12);
		button_12.setLabel("doModal");
		//Button has no api for setonclick
		Button button_13 = new Button();
		window_1.add(button_13);
		button_13.setLabel("doEmbed");
		//Button has no api for setonclick
		Label label_14= new Label();
		window_1.add(label_14);
		label_14.setValue("Nestedheader");
		Tree tree_15 = new Tree();
		window_1.add(tree_15);
		//Tree has no api for setid
		tree_15.setWidth("240px");
		Treecols treecols_151 = new Treecols();
		tree_15.add(treecols_151);
		Treecol treecol_1511 = new Treecol();
		treecols_151.add(treecol_1511);
		//Treecol has no api for setid
		treecol_1511.setLabel("A");
		treecol_1511.setWidth("100px");
		Treecol treecol_1512 = new Treecol();
		treecols_151.add(treecol_1512);
		treecol_1512.setLabel("B");
		Treecol treecol_1513 = new Treecol();
		treecols_151.add(treecol_1513);
		treecol_1513.setLabel("C");
		Treecol treecol_1514 = new Treecol();
		treecols_151.add(treecol_1514);
		treecol_1514.setLabel("D");
		Treecol treecol_1515 = new Treecol();
		treecols_151.add(treecol_1515);
		treecol_1515.setLabel("E");
		Treecol treecol_1516 = new Treecol();
		treecols_151.add(treecol_1516);
		treecol_1516.setLabel("F");
		Treecol treecol_1517 = new Treecol();
		treecols_151.add(treecol_1517);
		//Treecol has no api for setid
		treecol_1517.setLabel("G");
		Auxhead auxhead_152 = new Auxhead();
		tree_15.add(auxhead_152);
		Auxheader auxheader_1521 = new Auxheader();
		auxhead_152.add(auxheader_1521);
		auxheader_1521.setColspan(2);
		//Auxheader has no api for setid
		auxheader_1521.setLabel("Phi");
		Auxheader auxheader_1522 = new Auxheader();
		auxhead_152.add(auxheader_1522);
		auxheader_1522.setColspan(2);
		//Auxheader has no api for setid
		auxheader_1522.setLabel("Pi");
		Auxheader auxheader_1523 = new Auxheader();
		auxhead_152.add(auxheader_1523);
		auxheader_1523.setColspan(3);
		//Auxheader has no api for setid
		auxheader_1523.setLabel("Kroc");
		Auxhead auxhead_153 = new Auxhead();
		tree_15.add(auxhead_153);
		//Auxhead has no api for setid
		Auxheader auxheader_1531 = new Auxheader();
		auxhead_153.add(auxheader_1531);
		auxheader_1531.setColspan(2);
		//Auxheader has no api for setid
		auxheader_1531.setLabel("Alpha");
		Auxheader auxheader_1532 = new Auxheader();
		auxhead_153.add(auxheader_1532);
		auxheader_1532.setColspan(2);
		//Auxheader has no api for setid
		auxheader_1532.setLabel("beta");
		Auxheader auxheader_1533 = new Auxheader();
		auxhead_153.add(auxheader_1533);
		auxheader_1533.setColspan(3);
		//Auxheader has no api for setid
		auxheader_1533.setLabel("gamma");
		Treechildren treechildren_154 = new Treechildren();
		tree_15.add(treechildren_154);
		Treeitem treeitem_1541 = new Treeitem();
		treechildren_154.add(treeitem_1541);
		//Treeitem has no api for setid
		treeitem_1541.setSelected(true);
		Treerow treerow_15411 = new Treerow();
		treeitem_1541.add(treerow_15411);
		Treecell treecell_154111 = new Treecell();
		treerow_15411.add(treecell_154111);
		treecell_154111.setLabel("A");
		Treecell treecell_154112 = new Treecell();
		treerow_15411.add(treecell_154112);
		treecell_154112.setLabel("B");
		Treecell treecell_154113 = new Treecell();
		treerow_15411.add(treecell_154113);
		treecell_154113.setLabel("C");
		Treecell treecell_154114 = new Treecell();
		treerow_15411.add(treecell_154114);
		treecell_154114.setLabel("D");
		Treecell treecell_154115 = new Treecell();
		treerow_15411.add(treecell_154115);
		treecell_154115.setLabel("E");
		Treecell treecell_154116 = new Treecell();
		treerow_15411.add(treecell_154116);
		treecell_154116.setLabel("F");
		Treecell treecell_154117 = new Treecell();
		treerow_15411.add(treecell_154117);
		treecell_154117.setLabel("G");
		Treechildren treechildren_15412 = new Treechildren();
		treeitem_1541.add(treechildren_15412);
		Treeitem treeitem_154121 = new Treeitem();
		treechildren_15412.add(treeitem_154121);
		treeitem_154121.setSelected(true);
		Treerow treerow_1541211 = new Treerow();
		treeitem_154121.add(treerow_1541211);
		Treecell treecell_15412111 = new Treecell();
		treerow_1541211.add(treecell_15412111);
		treecell_15412111.setLabel("A-1");
		Treecell treecell_15412112 = new Treecell();
		treerow_1541211.add(treecell_15412112);
		treecell_15412112.setLabel("B");
		Treecell treecell_15412113 = new Treecell();
		treerow_1541211.add(treecell_15412113);
		treecell_15412113.setLabel("C");
		Treecell treecell_15412114 = new Treecell();
		treerow_1541211.add(treecell_15412114);
		treecell_15412114.setLabel("D");
		Treecell treecell_15412115 = new Treecell();
		treerow_1541211.add(treecell_15412115);
		treecell_15412115.setLabel("E");
		Treecell treecell_15412116 = new Treecell();
		treerow_1541211.add(treecell_15412116);
		treecell_15412116.setLabel("F");
		Treecell treecell_15412117 = new Treecell();
		treerow_1541211.add(treecell_15412117);
		treecell_15412117.setLabel("G");
		Treeitem treeitem_154122 = new Treeitem();
		treechildren_15412.add(treeitem_154122);
		Treerow treerow_1541221 = new Treerow();
		treeitem_154122.add(treerow_1541221);
		Treecell treecell_15412211 = new Treecell();
		treerow_1541221.add(treecell_15412211);
		treecell_15412211.setLabel("A-2");
		Treecell treecell_15412212 = new Treecell();
		treerow_1541221.add(treecell_15412212);
		treecell_15412212.setLabel("B");
		Treecell treecell_15412213 = new Treecell();
		treerow_1541221.add(treecell_15412213);
		treecell_15412213.setLabel("C");
		Treecell treecell_15412214 = new Treecell();
		treerow_1541221.add(treecell_15412214);
		treecell_15412214.setLabel("D");
		Treecell treecell_15412215 = new Treecell();
		treerow_1541221.add(treecell_15412215);
		treecell_15412215.setLabel("E");
		Treecell treecell_15412216 = new Treecell();
		treerow_1541221.add(treecell_15412216);
		treecell_15412216.setLabel("F");
		Treecell treecell_15412217 = new Treecell();
		treerow_1541221.add(treecell_15412217);
		treecell_15412217.setLabel("G");
		Button button_16 = new Button();
		window_1.add(button_16);
		button_16.setLabel("Alpha = A+B+C");
		Button button_17 = new Button();
		window_1.add(button_17);
		button_17.setLabel("Alpha = A");
		Button button_18 = new Button();
		window_1.add(button_18);
		button_18.setLabel("Add Seta After Gamma");
		Button button_19 = new Button();
		window_1.add(button_19);
		button_19.setLabel("remove Phi");
		Button button_110 = new Button();
		window_1.add(button_110);
		button_110.setLabel("remove G");
		Button button_111 = new Button();
		window_1.add(button_111);
		button_111.setLabel("setTreeWidth");
		Intbox intbox_112 = new Intbox();
		window_1.add(intbox_112);
		intbox_112.setConstraint("no empty");
		//Intbox has no api for setid
		Separator separator_113 = new Separator();
		window_1.add(separator_113);
		Button button_114 = new Button();
		window_1.add(button_114);
		button_114.setLabel("expand A");

	

	
			
		
		return win;
	}
	
	
}
