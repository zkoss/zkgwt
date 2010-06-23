package org.zkoss.gwt.client.testzk.grid;

import org.zkoss.gwt.client.testzk.TestcaseWrapper;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

import org.zkoss.gwt.client.zul.med.Flash;
import org.zkoss.gwt.client.zul.inp.Combobox;
import org.zkoss.gwt.client.zkex.sel.Listgroup;
import org.zkoss.gwt.client.zkex.layout.Columnlayout;
import org.zkoss.gwt.client.zul.grid.Columns;
import org.zkoss.gwt.client.zul.tab.Tab;
import org.zkoss.gwt.client.zul.sel.Treecols;
import org.zkoss.gwt.client.zul.layout.Center;
import org.zkoss.gwt.client.zul.wgt.Radiogroup;
import org.zkoss.gwt.client.zul.mesh.SortWidget;
import org.zkoss.gwt.client.zul.wgt.Toolbarbutton;
import org.zkoss.gwt.client.zul.sel.Tree;
import org.zkoss.gwt.client.zul.wgt.Button;
import org.zkoss.gwt.client.zul.sel.Listcell;
import org.zkoss.gwt.client.zul.Auxbutton;
import org.zkoss.gwt.client.zul.sel.Option;
import org.zkoss.gwt.client.zul.grid.ColumnMenupopup;
import org.zkoss.gwt.client.zul.mesh.Paging;
import org.zkoss.gwt.client.zul.sel.Listfoot;
import org.zkoss.gwt.client.zkex.menu.Fisheye;
import org.zkoss.gwt.client.zkmax.layout.Portalchildren;
import org.zkoss.gwt.client.zul.mesh.Auxheader;
import org.zkoss.gwt.client.zul.Uploader;
import org.zkoss.gwt.client.zul.wgt.Cell;
import org.zkoss.gwt.client.zul.menu.Menu;
import org.zkoss.gwt.client.zul.wgt.Image;
import org.zkoss.gwt.client.zul.db.Datebox;
import org.zkoss.gwt.client.zkex.grid.Groupfoot;
import org.zkoss.gwt.client.zul.tab.Tabpanels;
import org.zkoss.gwt.client.zul.grid.Row;
import org.zkoss.gwt.client.zul.wgt.Include;
import org.zkoss.gwt.client.zul.wgt.Groupbox;
import org.zkoss.gwt.client.zul.wgt.Separator;
import org.zkoss.gwt.client.zul.inp.Doublebox;
import org.zkoss.gwt.client.zul.inp.FormatWidget;
import org.zkoss.gwt.client.zul.LabelImageWidget;
import org.zkoss.gwt.client.zul.sel.Listfooter;
import org.zkoss.gwt.client.zul.wgt.Progressmeter;
import org.zkoss.gwt.client.zul.wgt.Space;
import org.zkoss.gwt.client.zul.Upload;
import org.zkoss.gwt.client.zul.mesh.HeaderWidget;
import org.zkoss.gwt.client.zul.layout.Borderlayout;
import org.zkoss.gwt.client.zul.wgt.Fileupload;
import org.zkoss.gwt.client.zkex.layout.Columnchildren;
import org.zkoss.gwt.client.zul.sel.ItemWidget;
import org.zkoss.gwt.client.zul.wgt.Popup;
import org.zkoss.gwt.client.zul.utl.Timer;
import org.zkoss.gwt.client.zul.mesh.HeadWidget;
import org.zkoss.gwt.client.zkex.inp.PalettePop;
import org.zkoss.gwt.client.zkex.inp.Colorbox;
import org.zkoss.gwt.client.zkmax.layout.Tablechildren;
import org.zkoss.gwt.client.zul.sel.Treefooter;
import org.zkoss.gwt.client.zul.UploadViewer;
import org.zkoss.gwt.client.zul.sel.Treerow;
import org.zkoss.gwt.client.zkex.inp.PickerPop;
import org.zkoss.gwt.client.zul.layout.LayoutRegion;
import org.zkoss.gwt.client.zul.wgt.A;
import org.zkoss.gwt.client.zul.wgt.Caption;
import org.zkoss.gwt.client.zkmax.layout.Portallayout;
import org.zkoss.gwt.client.zul.inp.Textbox;
import org.zkoss.gwt.client.zul.grid.Footer;
import org.zkoss.gwt.client.zul.inp.InputWidget;
import org.zkoss.gwt.client.zul.sel.Listheader;
import org.zkoss.gwt.client.zul.mesh.Auxhead;
import org.zkoss.gwt.client.zul.inp.Errorbox;
import org.zkoss.gwt.client.zul.wgt.Chart;
import org.zkoss.gwt.client.zul.wgt.Captcha;
import org.zkoss.gwt.client.zul.wgt.Radio;
import org.zkoss.gwt.client.zul.layout.South;
import org.zkoss.gwt.client.zul.tab.Tabs;
import org.zkoss.gwt.client.zul.tab.Tabpanel;
import org.zkoss.gwt.client.zkex.grid.Detail;
import org.zkoss.gwt.client.zul.inp.Timebox;
import org.zkoss.gwt.client.zul.wgt.Toolbar;
import org.zkoss.gwt.client.zul.sel.Listbox;
import org.zkoss.gwt.client.zul.sel.TreeItemIter;
import org.zkoss.gwt.client.zul.grid.Foot;
import org.zkoss.gwt.client.zul.menu.Menupopup;
import org.zkoss.gwt.client.zul.fchart.Flashchart;
import org.zkoss.gwt.client.zul.tab.Tabbox;
import org.zkoss.gwt.client.zul.menu.Menubar;
import org.zkoss.gwt.client.zul.wgt.Imagemap;
import org.zkoss.gwt.client.zul.inp.Bandbox;
import org.zkoss.gwt.client.zul.sel.Treeitem;
import org.zkoss.gwt.client.zkex.inp.ContentHandler;
import org.zkoss.gwt.client.zul.wnd.Panelchildren;
import org.zkoss.gwt.client.zul.sel.Select;
import org.zkoss.gwt.client.zkex.menu.Fisheyebar;
import org.zkoss.gwt.client.zul.inp.Longbox;
import org.zkoss.gwt.client.zul.sel.Listitem;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.menu.Menuitem;
import org.zkoss.gwt.client.zul.utl.Script;
import org.zkoss.gwt.client.zul.grid.Rows;
import org.zkoss.gwt.client.zul.inp.Spinner;
import org.zkoss.gwt.client.zul.utl.Iframe;
import org.zkoss.gwt.client.zul.wnd.Window;
import org.zkoss.gwt.client.zul.grid.Column;
import org.zkoss.gwt.client.zul.layout.West;
import org.zkoss.gwt.client.zul.wgt.Span;
import org.zkoss.gwt.client.zul.sel.Treecell;
import org.zkoss.gwt.client.zul.inp.Slider;
import org.zkoss.gwt.client.zul.wnd.Panel;
import org.zkoss.gwt.client.zul.menu.Menuseparator;
import org.zkoss.gwt.client.zul.wgt.Div;
import org.zkoss.gwt.client.zul.sel.Treecol;
import org.zkoss.gwt.client.zkmax.layout.Tablelayout;
import org.zkoss.gwt.client.zul.layout.North;
import org.zkoss.gwt.client.zul.sel.Listhead;
import org.zkoss.gwt.client.zul.mesh.Frozen;
import org.zkoss.gwt.client.zkex.sel.Listgroupfoot;
import org.zkoss.gwt.client.zul.wgt.Area;
import org.zkoss.gwt.client.zul.utl.Style;
import org.zkoss.gwt.client.zkex.utl.Jasperreport;
import org.zkoss.gwt.client.zul.sel.SelectWidget;
import org.zkoss.gwt.client.zul.med.Applet;
import org.zkoss.gwt.client.zul.grid.Grid;
import org.zkoss.gwt.client.zul.layout.East;
import org.zkoss.gwt.client.zul.inp.ComboWidget;
import org.zkoss.gwt.client.zul.db.Calendar;
import org.zkoss.gwt.client.zul.inp.Decimalbox;
import org.zkoss.gwt.client.zul.sel.Treechildren;
import org.zkoss.gwt.client.zul.med.Audio;
import org.zkoss.gwt.client.zul.sel.Treefoot;
import org.zkoss.gwt.client.zul.inp.Intbox;
import org.zkoss.gwt.client.zul.UploadManager;
import org.zkoss.gwt.client.zul.box.Splitter;
import org.zkoss.gwt.client.zul.inp.Comboitem;
import org.zkoss.gwt.client.zul.mesh.MeshWidget;
import org.zkoss.gwt.client.zkex.inp.Color;
import org.zkoss.gwt.client.zul.wgt.Checkbox;
import org.zkoss.gwt.client.zul.wgt.Html;
import org.zkoss.gwt.client.zul.box.Box;
import org.zkoss.gwt.client.zkex.grid.Group;
import org.zkoss.gwt.client.zul.inp.Bandpopup;

public class TestcaseTemplate extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
<window >

</window>
*/		
	
		/*
		 * put generated code here
		 * */
		Window window_1 = new Window();
		win.add(window_1);
	

	
			
		
		return win;
	}
	
	
}
