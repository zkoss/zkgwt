package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.db.Calendar;
import org.zkoss.gwt.client.zul.sel.Tree;
import org.zkoss.gwt.client.zul.sel.Treecell;
import org.zkoss.gwt.client.zul.sel.Treechildren;
import org.zkoss.gwt.client.zul.sel.Treecol;
import org.zkoss.gwt.client.zul.sel.Treecols;
import org.zkoss.gwt.client.zul.sel.Treeitem;
import org.zkoss.gwt.client.zul.sel.Treerow;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseTree extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
		/*		
	     <tree  rows="5">
	         <treecols sizable="true">
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
	             </treeitem>
	             <treeitem label="Item 3"/>
	         </treechildren>
	         <treefoot>
	             <treefooter label="Count"/>
	             <treefooter label="Summary"/>
	         </treefoot>
	     </tree>
	*/
		
		Tree comp = new Tree();
		Treecols tc = new Treecols();
		comp.add(tc);
		Treecol tc1 = new Treecol();
		tc.add(tc1);
		tc1.setLabel("Name");

		Treecol tc2 = new Treecol();
		tc.add(tc2);
		tc2.setLabel("Description");
		
		Treechildren tchil = new Treechildren();
		comp.add(tchil);
		Treeitem ti1 = new Treeitem();
		tchil.add(ti1);
		Treerow tr1 = new Treerow();
		ti1.add(tr1);
		Treecell tce1 = new Treecell();
		tr1.add(tce1);
		tce1.setLabel("Item 1");
		
		Treecell tce2 = new Treecell();
		tr1.add(tce2);
		tce2.setLabel("Item 1 description");
		
		Treeitem ti2 = new Treeitem();
		tchil.add(ti2);
		Treerow tr2 = new Treerow();
		ti2.add(tr2);
		Treecell tce3 = new Treecell();
		tr2.add(tce3);
		tce3.setLabel("Item 2");
		
		Treecell tce4 = new Treecell();
		tr2.add(tce4);
		tce4.setLabel("Item 2 description");		

		Treeitem ti3 = new Treeitem();
		tchil.add(ti3);
		//this line will cause error
		//ti3.setLabel("Item 3");

		
		win.add(comp);
				
		return win;
	}
}
