package org.zkoss.gwt.client.testzk.tree;

import org.zkoss.gwt.client.testzk.TestcaseWrapper;
import org.zkoss.gwt.client.zul.sel.Tree;
import org.zkoss.gwt.client.zul.wgt.Button;
import org.zkoss.gwt.client.zul.wgt.Html;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wgt.Radio;
import org.zkoss.gwt.client.zul.wgt.Radiogroup;
import org.zkoss.gwt.client.zul.wgt.Separator;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

public class TestcaseF50_2940704_Tree extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
<window>
	Auto Paging shall re-calculate the page size every time the tree height is changed.
	<html>
	<![CDATA[
	<ol>
	<li>Click browser's maximize button. The page size shall re-calculate and there should be NO vertical scrollbar appear in tree</li>
	<li>Click browser's restore button. The page size shall re-calculate and there should be NO vertical scrollbar appear in tree</li>
	<li>Drag to change browser's size, and the page size shall re-calculate and there should be NO vertical scrollbar appear in tree</li>
	<li>Click "top" radiobox, the tree shall stay as is, only the paging bar is moved to top</li>
	<li>Click "bottom" radiobox, the tree shall stay as is, only the paging bar is moved back to bottom</li>
	<li>Click "both" radiobox, the page size shall re-calculate and there should be NO vertical scrollbar appear in tree. Both on top and bottom you can see the paging bar.</li>
	<li>Done</li>
	</ol>
	]]>
	</html>
	<radiogroup
		onCheck="tree.pagingPosition = self.selectedItem.label;">
		<radio label="top" />
		<radio label="bottom" checked="true" />
		<radio label="both" />
	</radiogroup>
	<separator/>
	<button label="Change Paging Mold">
		<attribute name="onClick">
		tree.pagingChild.mold = "os".equals(tree.pagingChild.mold) ? "default" : "os";
		</attribute>
	</button>
	<zscript>					
	import org.zkoss.zkdemo.test2.tree.BinaryTreeModel;
	
	BinaryTreeModel btm = new BinaryTreeModel(new ArrayList(new org.zkoss.zkdemo.userguide.BigList(1000)));
	</zscript>
	<tree id="tree" autopaging="true" mold="paging" model="&#36;{btm}" vflex="true" width="50%">
		<attribute name="onCreate">
		tree.renderItemByPath(new int[]{1,1,1,1,1,1,1,1,1,1,1,1});
		tree.renderItemByPath(new int[]{0,0,0,0,0,0,0,0,0,0,0,0});
		</attribute>
	</tree>
</window>

*/		
	
		/*
		 * put generated code here
		 * */
		Window window_1 = new Window();
		win.add(window_1);
		Label label_11= new Label();
		win.add(label_11);
		label_11.setValue("AutoPagingshallre-calculatethepagesizeeverytimethetreeheightischanged.");
		Html html_12 = new Html();
		window_1.add(html_12);
		html_12.setContent("<ol><li>Clickbrowser'smaximizebutton.Thepagesizeshallre-calculateandthereshouldbeNOverticalscrollbarappearintree</li><li>Clickbrowser'srestorebutton.Thepagesizeshallre-calculateandthereshouldbeNOverticalscrollbarappearintree</li><li>Dragtochangebrowser'ssize,andthepagesizeshallre-calculateandthereshouldbeNOverticalscrollbarappearintree</li><li>Click\"top\"radiobox,thetreeshallstayasis,onlythepagingbarismovedtotop</li><li>Click\"bottom\"radiobox,thetreeshallstayasis,onlythepagingbarismovedbacktobottom</li><li>Click\"both\"radiobox,thepagesizeshallre-calculateandthereshouldbeNOverticalscrollbarappearintree.Bothontopandbottomyoucanseethepagingbar.</li><li>Done</li></ol>");
		Radiogroup radiogroup_13 = new Radiogroup();
		window_1.add(radiogroup_13);
		//Radiogroup has no api for setoncheck
		Radio radio_131 = new Radio();
		radiogroup_13.add(radio_131);
		radio_131.setLabel("top");
		Radio radio_132 = new Radio();
		radiogroup_13.add(radio_132);
		radio_132.setChecked(true);
		radio_132.setLabel("bottom");
		Radio radio_133 = new Radio();
		radiogroup_13.add(radio_133);
		radio_133.setLabel("both");
		Separator separator_14 = new Separator();
		window_1.add(separator_14);
		Button button_15 = new Button();
		window_1.add(button_15);
		button_15.setLabel("Change Paging Mold");
		Tree tree_17 = new Tree();
		window_1.add(tree_17);
		tree_17.setAutopaging(true);
		//Tree has no api for setid
		//tree_17.setModel("${btm}");
		tree_17.setMold("paging");
		tree_17.setVflex("true");
		tree_17.setWidth("50%");


	
			
		
		return win;
	}
	
	
}
