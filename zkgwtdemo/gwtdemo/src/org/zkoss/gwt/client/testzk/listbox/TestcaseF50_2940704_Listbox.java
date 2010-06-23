package org.zkoss.gwt.client.testzk.listbox;

import org.zkoss.gwt.client.testzk.TestcaseWrapper;
import org.zkoss.gwt.client.zul.sel.Listbox;
import org.zkoss.gwt.client.zul.sel.Listhead;
import org.zkoss.gwt.client.zul.sel.Listheader;
import org.zkoss.gwt.client.zul.sel.Listitem;
import org.zkoss.gwt.client.zul.wgt.Button;
import org.zkoss.gwt.client.zul.wgt.Html;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wgt.Radio;
import org.zkoss.gwt.client.zul.wgt.Radiogroup;
import org.zkoss.gwt.client.zul.wgt.Separator;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

public class TestcaseF50_2940704_Listbox extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
<window>
	Auto Paging shall re-calculate the page size every time the listbox height is changed.
	<html>
	<![CDATA[
	<ol>
	<li>Click browser's maximize button. The page size shall re-calculate and there should be NO vertical scrollbar appear in listbox</li>
	<li>Click browser's restore button. The page size shall re-calculate and there should be NO vertical scrollbar appear in listbox</li>
	<li>Drag to change browser's size, and the page size shall re-calculate and there should be NO vertical scrollbar appear in listbox</li>
	<li>Click "top" radiobox, the listbox shall stay as is, only the paging bar is moved to top</li>
	<li>Click "bottom" radiobox, the listbox shall stay as is, only the paging bar is moved back to bottom</li>
	<li>Click "both" radiobox, the page size shall re-calculate and there should be NO vertical scrollbar appear in listbox. Both on top and bottom you can see the paging bar.</li>
	<li>Done</li>
	</ol>
	]]>
	</html>
	<radiogroup
		onCheck="tree.pagingPosition = self.selectedItem.label;listbox.pagingPosition = self.selectedItem.label">
		<radio label="top" />
		<radio label="bottom" checked="true" />
		<radio label="both" />
	</radiogroup>
	<separator/>
	<button label="Change Paging Mold">
		<attribute name="onClick">
		listbox.pagingChild.mold = "os".equals(listbox.pagingChild.mold) ? "default" : "os";
		</attribute>
	</button>
	<zscript>
		List items = new org.zkoss.zkdemo.userguide.BigList(1000); //a big list of Integer
	</zscript>
	<listbox id="listbox" autopaging="true" mold="paging" vflex="true">
		<listhead>
			<listheader label="column1"/>
		</listhead>
		<listitem forEach="&#36;{items}" label="${each}"/>
	</listbox>
</window>

*/		
	
		/*
		 * put generated code here
		 * */
		Window window_1 = new Window();
		win.add(window_1);
		Label label_11= new Label();
		win.add(label_11);
		label_11.setValue("AutoPagingshallre-calculatethepagesizeeverytimethelistboxheightischanged.");
		Html html_12 = new Html();
		window_1.add(html_12);
		html_12.setContent("<ol><li>Clickbrowser'smaximizebutton.Thepagesizeshallre-calculateandthereshouldbeNOverticalscrollbarappearinlistbox</li><li>Clickbrowser'srestorebutton.Thepagesizeshallre-calculateandthereshouldbeNOverticalscrollbarappearinlistbox</li><li>Dragtochangebrowser'ssize,andthepagesizeshallre-calculateandthereshouldbeNOverticalscrollbarappearinlistbox</li><li>Click\"top\"radiobox,thelistboxshallstayasis,onlythepagingbarismovedtotop</li><li>Click\"bottom\"radiobox,thelistboxshallstayasis,onlythepagingbarismovedbacktobottom</li><li>Click\"both\"radiobox,thepagesizeshallre-calculateandthereshouldbeNOverticalscrollbarappearinlistbox.Bothontopandbottomyoucanseethepagingbar.</li><li>Done</li></ol>");
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
		Listbox listbox_17 = new Listbox();
		window_1.add(listbox_17);
		listbox_17.setAutopaging(true);
		//Listbox has no api for setid
		listbox_17.setMold("paging");
		listbox_17.setVflex("true");
		Listhead listhead_171 = new Listhead();
		listbox_17.add(listhead_171);
		Listheader listheader_1711 = new Listheader();
		listhead_171.add(listheader_1711);
		listheader_1711.setLabel("column1");
		Listitem listitem_172 = new Listitem();
		listbox_17.add(listitem_172);
		//Listitem has no api for setforeach
		listitem_172.setLabel("${each}");
	

	
			
		
		return win;
	}
	
		
}
