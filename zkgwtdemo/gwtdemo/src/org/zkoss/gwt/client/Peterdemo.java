/**
 * 
 */
package org.zkoss.gwt.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.zkoss.gwt.client.testzk.Testcase1;
import org.zkoss.gwt.client.testzk.TestcaseA;
import org.zkoss.gwt.client.testzk.TestcaseApplet;
import org.zkoss.gwt.client.testzk.TestcaseAudio;
import org.zkoss.gwt.client.testzk.TestcaseBandbox;
import org.zkoss.gwt.client.testzk.TestcaseBorderlayout;
import org.zkoss.gwt.client.testzk.TestcaseBox;
import org.zkoss.gwt.client.testzk.TestcaseButton;
import org.zkoss.gwt.client.testzk.TestcaseCalendar;
import org.zkoss.gwt.client.testzk.TestcaseCaptcha;
import org.zkoss.gwt.client.testzk.TestcaseCaption;
import org.zkoss.gwt.client.testzk.TestcaseChart;
import org.zkoss.gwt.client.testzk.TestcaseCheckbox;
import org.zkoss.gwt.client.testzk.TestcaseColorbox;
import org.zkoss.gwt.client.testzk.TestcaseColumnLayout;
import org.zkoss.gwt.client.testzk.TestcaseCombobox;
import org.zkoss.gwt.client.testzk.TestcaseDatebox;
import org.zkoss.gwt.client.testzk.TestcaseDecimalbox;
import org.zkoss.gwt.client.testzk.TestcaseDiv;
import org.zkoss.gwt.client.testzk.TestcaseDoublebox;
import org.zkoss.gwt.client.testzk.TestcaseFileupload;
import org.zkoss.gwt.client.testzk.TestcaseFisheye;
import org.zkoss.gwt.client.testzk.TestcaseFlash;
import org.zkoss.gwt.client.testzk.TestcaseFlashchart;
import org.zkoss.gwt.client.testzk.TestcaseGrid;
import org.zkoss.gwt.client.testzk.TestcaseGridEvent;
import org.zkoss.gwt.client.testzk.TestcaseGridFull;
import org.zkoss.gwt.client.testzk.TestcaseGridFullGened;
import org.zkoss.gwt.client.testzk.TestcaseGroupbox;
import org.zkoss.gwt.client.testzk.TestcaseHbox;
import org.zkoss.gwt.client.testzk.TestcaseHtml;
import org.zkoss.gwt.client.testzk.TestcaseIframe;
import org.zkoss.gwt.client.testzk.TestcaseImage;
import org.zkoss.gwt.client.testzk.TestcaseImagemap;
import org.zkoss.gwt.client.testzk.TestcaseIntbox;
import org.zkoss.gwt.client.testzk.TestcaseLabel;
import org.zkoss.gwt.client.testzk.TestcaseListbox;
import org.zkoss.gwt.client.testzk.TestcaseListboxEvent;
import org.zkoss.gwt.client.testzk.TestcaseListboxSort;
import org.zkoss.gwt.client.testzk.TestcaseLongbox;
import org.zkoss.gwt.client.testzk.TestcaseMenu;
import org.zkoss.gwt.client.testzk.TestcaseMenu2;
import org.zkoss.gwt.client.testzk.TestcasePanel;
import org.zkoss.gwt.client.testzk.TestcasePopup;
import org.zkoss.gwt.client.testzk.TestcasePortalLayout;
import org.zkoss.gwt.client.testzk.TestcaseProgressmeter;
import org.zkoss.gwt.client.testzk.TestcaseRadiogroup;
import org.zkoss.gwt.client.testzk.TestcaseScript;
import org.zkoss.gwt.client.testzk.TestcaseSeparator;
import org.zkoss.gwt.client.testzk.TestcaseSlider;
import org.zkoss.gwt.client.testzk.TestcaseSpace;
import org.zkoss.gwt.client.testzk.TestcaseSpan;
import org.zkoss.gwt.client.testzk.TestcaseSpinner;
import org.zkoss.gwt.client.testzk.TestcaseSplitter;
import org.zkoss.gwt.client.testzk.TestcaseStyle;
import org.zkoss.gwt.client.testzk.TestcaseTabbox;
import org.zkoss.gwt.client.testzk.TestcaseTableLayout;
import org.zkoss.gwt.client.testzk.TestcaseTextbox;
import org.zkoss.gwt.client.testzk.TestcaseTimebox;
import org.zkoss.gwt.client.testzk.TestcaseTimer;
import org.zkoss.gwt.client.testzk.TestcaseToolbar;
import org.zkoss.gwt.client.testzk.TestcaseTree;
import org.zkoss.gwt.client.testzk.TestcaseTree2;
import org.zkoss.gwt.client.testzk.TestcaseVbox;
import org.zkoss.gwt.client.testzk.TestcaseWindow;
import org.zkoss.gwt.client.testzk.TestcaseWrapper;
import org.zkoss.gwt.client.testzk.grid.TestcaseZ30_grid_0006;
import org.zkoss.gwt.client.testzk.grid.TestcaseZ30_grid_0007;
import org.zkoss.gwt.client.testzk.grid.TestcaseZ30_grid_0008;
import org.zkoss.gwt.client.testzk.grid.TestcaseZ30_grid_0009;
import org.zkoss.gwt.client.testzk.grid.TestcaseZ30_grid_0010;
import org.zkoss.gwt.client.testzk.grid.TestcaseZ30_grid_0011;
import org.zkoss.gwt.client.testzk.grid.TestcaseZ30_grid_0012;
import org.zkoss.gwt.client.testzk.grid.TestcaseZ30_grid_0013;
import org.zkoss.gwt.client.testzk.grid.TestcaseZ30_grid_0018;
import org.zkoss.gwt.client.testzk.grid.TestcaseZ30_grid_0019;
import org.zkoss.gwt.client.testzk.grid.TestcaseZ30_grid_0022;
import org.zkoss.gwt.client.testzk.grid.TestcaseZ30_grid_0023;
import org.zkoss.gwt.client.testzk.grid.TestcaseZ30_grid_0024;
import org.zkoss.gwt.client.testzk.listbox.TestcaseF50_2940704_Listbox;
import org.zkoss.gwt.client.testzk.listbox.TestcaseZ30_listbox_0003;
import org.zkoss.gwt.client.testzk.listbox.TestcaseZ30_listbox_0005;
import org.zkoss.gwt.client.testzk.listbox.TestcaseZ30_listbox_0008;
import org.zkoss.gwt.client.testzk.listbox.TestcaseZ30_listbox_0011;
import org.zkoss.gwt.client.testzk.listbox.TestcaseZ30_listbox_0013;
import org.zkoss.gwt.client.testzk.listbox.TestcaseZ35_listbox_0004;
import org.zkoss.gwt.client.testzk.listbox.TestcaseZ50_listbox_0001;
import org.zkoss.gwt.client.testzk.tree.TestcaseF50_2940704_Tree;
import org.zkoss.gwt.client.testzk.tree.TestcaseTree_paging;
import org.zkoss.gwt.client.testzk.tree.TestcaseTree_select;
import org.zkoss.gwt.client.testzk.tree.TestcaseZ30_listbox_0009;
import org.zkoss.gwt.client.testzk.tree.TestcaseZ30_listbox_0010;
import org.zkoss.gwt.client.testzk.tree.TestcaseZ30_tree_0001;
import org.zkoss.gwt.client.testzk.tree.TestcaseZ30_tree_0002;
import org.zkoss.gwt.client.testzk.tree.TestcaseZ30_tree_0003;
import org.zkoss.gwt.client.testzk.tree.TestcaseZ30_tree_0004;
import org.zkoss.gwt.client.testzk.tree.TestcaseZ30_tree_0008;
import org.zkoss.gwt.client.testzk.tree.TestcaseZ30_tree_0015;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HorizontalSplitPanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * @author Peter
 *
 */
public class Peterdemo implements EntryPoint {

	private HorizontalSplitPanel mainPanel = new HorizontalSplitPanel();
	private ListBox listbox = new ListBox();
	private VerticalPanel panel = new VerticalPanel();
		
	final Map<String, TestcaseWrapper> map = new HashMap<String,TestcaseWrapper>();
	
	@Override
	public void onModuleLoad() {
		addList();
						
		mainPanel.setLeftWidget(listbox);
		setListitems();
		listbox.setWidth("100%");
		listbox.setHeight("100%");
		
		listbox.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				String testcaseName = listbox.getItemText(listbox.getSelectedIndex()); 
				TestcaseWrapper widget = map.get(testcaseName);
				widget.show();
				panel.clear();
				panel.add(widget);
						
			}
		});
		
		
		mainPanel.setSplitPosition("300px");
		mainPanel.setRightWidget(panel);
		
		RootPanel.get().add(mainPanel);		
	}

	
	private void setListitems(){		
		Set<String> keys = map.keySet();
		Set<String> cloned = new TreeSet<String>();
		for (String name : keys) {
			cloned.add(name);
		}
		for(String key: cloned){
			listbox.addItem(key);	
		}
		
		listbox.setVisibleItemCount(5);		
	}
	
	private void addList(){
		map.put("TestcaseZ30_grid_0006", new TestcaseZ30_grid_0006());
		map.put("TestcaseZ30_grid_0007", new TestcaseZ30_grid_0007());
		map.put("TestcaseZ30_grid_0008", new TestcaseZ30_grid_0008());
		map.put("TestcaseZ30_grid_0009", new TestcaseZ30_grid_0009());
		map.put("TestcaseZ30_grid_0010", new TestcaseZ30_grid_0010());
		map.put("TestcaseZ30_grid_0011", new TestcaseZ30_grid_0011());
		map.put("TestcaseZ30_grid_0012", new TestcaseZ30_grid_0012());
		map.put("TestcaseZ30_grid_0013", new TestcaseZ30_grid_0013());
		map.put("TestcaseZ30_grid_0018", new TestcaseZ30_grid_0018());
		map.put("TestcaseZ30_grid_0019", new TestcaseZ30_grid_0019());
		map.put("TestcaseZ30_grid_0022", new TestcaseZ30_grid_0022());
		map.put("TestcaseZ30_grid_0023", new TestcaseZ30_grid_0023());
		map.put("TestcaseZ30_grid_0024", new TestcaseZ30_grid_0024());
		map.put("TestcaseF50_2940704_Listbox", new TestcaseF50_2940704_Listbox());
		map.put("TestcaseZ30_listbox_0003", new TestcaseZ30_listbox_0003());
		map.put("TestcaseZ30_listbox_0005", new TestcaseZ30_listbox_0005());
		map.put("TestcaseZ30_listbox_0008", new TestcaseZ30_listbox_0008());
		map.put("TestcaseZ30_listbox_0011", new TestcaseZ30_listbox_0011());
		map.put("TestcaseZ30_listbox_0013", new TestcaseZ30_listbox_0013());
		map.put("TestcaseZ35_listbox_0004", new TestcaseZ35_listbox_0004());
		map.put("TestcaseZ50_listbox_0001", new TestcaseZ50_listbox_0001());
		map.put("Testcase1", new Testcase1());
		map.put("TestcaseA", new TestcaseA());
		map.put("TestcaseApplet", new TestcaseApplet());
		map.put("TestcaseAudio", new TestcaseAudio());
		map.put("TestcaseBandbox", new TestcaseBandbox());
		map.put("TestcaseBorderlayout", new TestcaseBorderlayout());
		map.put("TestcaseBox", new TestcaseBox());
		map.put("TestcaseButton", new TestcaseButton());
		map.put("TestcaseCalendar", new TestcaseCalendar());
		map.put("TestcaseCaptcha", new TestcaseCaptcha());
		map.put("TestcaseCaption", new TestcaseCaption());
		map.put("TestcaseChart", new TestcaseChart());
		map.put("TestcaseCheckbox", new TestcaseCheckbox());
		map.put("TestcaseColorbox", new TestcaseColorbox());
		map.put("TestcaseColumnLayout", new TestcaseColumnLayout());
		map.put("TestcaseCombobox", new TestcaseCombobox());
		map.put("TestcaseDatebox", new TestcaseDatebox());
		map.put("TestcaseDecimalbox", new TestcaseDecimalbox());
		map.put("TestcaseDiv", new TestcaseDiv());
		map.put("TestcaseDoublebox", new TestcaseDoublebox());
		map.put("TestcaseFileupload", new TestcaseFileupload());
		map.put("TestcaseFisheye", new TestcaseFisheye());
		map.put("TestcaseFlash", new TestcaseFlash());
		map.put("TestcaseFlashchart", new TestcaseFlashchart());
		map.put("TestcaseGrid", new TestcaseGrid());
		map.put("TestcaseGridEvent", new TestcaseGridEvent());
		map.put("TestcaseGridFull", new TestcaseGridFull());
		map.put("TestcaseGridFullGened", new TestcaseGridFullGened());
		map.put("TestcaseGroupbox", new TestcaseGroupbox());
		map.put("TestcaseHbox", new TestcaseHbox());
		map.put("TestcaseHtml", new TestcaseHtml());
		map.put("TestcaseIframe", new TestcaseIframe());
		map.put("TestcaseImage", new TestcaseImage());
		map.put("TestcaseImagemap", new TestcaseImagemap());
		map.put("TestcaseIntbox", new TestcaseIntbox());
		map.put("TestcaseLabel", new TestcaseLabel());
		map.put("TestcaseListbox", new TestcaseListbox());
		map.put("TestcaseListboxEvent", new TestcaseListboxEvent());
		map.put("TestcaseListboxSort", new TestcaseListboxSort());
		map.put("TestcaseLongbox", new TestcaseLongbox());
		map.put("TestcaseMenu", new TestcaseMenu());
		map.put("TestcaseMenu2", new TestcaseMenu2());
		map.put("TestcasePanel", new TestcasePanel());
		map.put("TestcasePopup", new TestcasePopup());
		map.put("TestcasePortalLayout", new TestcasePortalLayout());
		map.put("TestcaseProgressmeter", new TestcaseProgressmeter());
		map.put("TestcaseRadiogroup", new TestcaseRadiogroup());
		map.put("TestcaseScript", new TestcaseScript());
		map.put("TestcaseSeparator", new TestcaseSeparator());
		map.put("TestcaseSlider", new TestcaseSlider());
		map.put("TestcaseSpace", new TestcaseSpace());
		map.put("TestcaseSpan", new TestcaseSpan());
		map.put("TestcaseSpinner", new TestcaseSpinner());
		map.put("TestcaseSplitter", new TestcaseSplitter());
		map.put("TestcaseStyle", new TestcaseStyle());
		map.put("TestcaseTabbox", new TestcaseTabbox());
		map.put("TestcaseTableLayout", new TestcaseTableLayout());
		map.put("TestcaseTextbox", new TestcaseTextbox());
		map.put("TestcaseTimebox", new TestcaseTimebox());
		map.put("TestcaseTimer", new TestcaseTimer());
		map.put("TestcaseToolbar", new TestcaseToolbar());
		map.put("TestcaseTree", new TestcaseTree());
		map.put("TestcaseTree2", new TestcaseTree2());
		map.put("TestcaseVbox", new TestcaseVbox());
		map.put("TestcaseWindow", new TestcaseWindow());
		
		map.put("TestcaseF50_2940704_Tree", new TestcaseF50_2940704_Tree());
		map.put("TestcaseTree_paging", new TestcaseTree_paging());
		map.put("TestcaseTree_select", new TestcaseTree_select());
		map.put("TestcaseZ30_listbox_0009", new TestcaseZ30_listbox_0009());
		map.put("TestcaseZ30_listbox_0010", new TestcaseZ30_listbox_0010());
		map.put("TestcaseZ30_tree_0001", new TestcaseZ30_tree_0001());
		map.put("TestcaseZ30_tree_0002", new TestcaseZ30_tree_0002());
		map.put("TestcaseZ30_tree_0003", new TestcaseZ30_tree_0003());
		map.put("TestcaseZ30_tree_0004", new TestcaseZ30_tree_0004());
		map.put("TestcaseZ30_tree_0008", new TestcaseZ30_tree_0008());
		map.put("TestcaseZ30_tree_0015", new TestcaseZ30_tree_0015());

		
	}

}
