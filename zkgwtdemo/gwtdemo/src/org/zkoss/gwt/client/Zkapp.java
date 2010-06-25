/**
 * 
 */
package org.zkoss.gwt.client;

import org.zkoss.gwt.client.zk.Event;
import org.zkoss.gwt.client.zk.EventListener;
import org.zkoss.gwt.client.zk.Events;
import org.zkoss.gwt.client.zkex.grid.Detail;
import org.zkoss.gwt.client.zkex.grid.Group;
import org.zkoss.gwt.client.zkex.layout.Columnchildren;
import org.zkoss.gwt.client.zkex.layout.Columnlayout;
import org.zkoss.gwt.client.zul.grid.Column;
import org.zkoss.gwt.client.zul.grid.Columns;
import org.zkoss.gwt.client.zul.grid.Grid;
import org.zkoss.gwt.client.zul.grid.Row;
import org.zkoss.gwt.client.zul.grid.Rows;
import org.zkoss.gwt.client.zul.inp.Bandbox;
import org.zkoss.gwt.client.zul.inp.Bandpopup;
import org.zkoss.gwt.client.zul.inp.Textbox;
import org.zkoss.gwt.client.zul.layout.Borderlayout;
import org.zkoss.gwt.client.zul.layout.Center;
import org.zkoss.gwt.client.zul.layout.North;
import org.zkoss.gwt.client.zul.layout.South;
import org.zkoss.gwt.client.zul.menu.Menu;
import org.zkoss.gwt.client.zul.menu.Menubar;
import org.zkoss.gwt.client.zul.menu.Menuitem;
import org.zkoss.gwt.client.zul.menu.Menupopup;
import org.zkoss.gwt.client.zul.menu.Menuseparator;
import org.zkoss.gwt.client.zul.wgt.Button;
import org.zkoss.gwt.client.zul.wgt.Cell;
import org.zkoss.gwt.client.zul.wgt.Div;
import org.zkoss.gwt.client.zul.wgt.Image;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wgt.Toolbar;
import org.zkoss.gwt.client.zul.wnd.Panel;
import org.zkoss.gwt.client.zul.wnd.Panelchildren;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author Peter
 *
 */
public class Zkapp implements EntryPoint {

	
	private VerticalPanel panel = new VerticalPanel();
		
		
	@Override
	public void onModuleLoad() {
		panel.add(genWidget());		
		RootPanel.get().add(panel);		
	}
	
	public Widget genWidget(){
		
		Panel panelChat = new Panel();
		
		panelChat.setBorder("normal");
		panelChat.setCollapsible(true);
		panelChat.setFramable(true);
		panelChat.setHeight("400px");
		panelChat.setTitle("Chat");
		panelChat.setWidth("500px");
		
		Toolbar toolbarContact = (Toolbar) addContactToolbar();
		panelChat.add(toolbarContact);
			
		Panelchildren panelchildren = (Panelchildren) addPanelChildren();
		panelChat.add(panelchildren);

		Toolbar toolbarMenu = (Toolbar) addMenuToolBar();
		panelChat.add(toolbarMenu);

		Toolbar toolbarButton = (Toolbar) addButtonToolBar();
		panelChat.add(toolbarButton);
				
		return panelChat;
	}
	
	private Widget addContactToolbar(){
		Toolbar toolbarContact = new Toolbar();
		Label labelContact= new Label();
		toolbarContact.add(labelContact);
		labelContact.setValue("Contact:");
		Bandbox bandboxContact = new Bandbox();
		toolbarContact.add(bandboxContact);
		bandboxContact.setAutodrop(true);
		bandboxContact.setWidth("350px");
		
		Bandpopup bandpopupContact = new Bandpopup();
		bandboxContact.add(bandpopupContact);		
		
		bandpopupContact.setWidth("320px");
		Grid gridContact = new Grid();
		bandpopupContact.add(gridContact);

		Columns columnsContact = new Columns();
		gridContact.add(columnsContact);
		Column columnDetail = new Column();
		columnsContact.add(columnDetail);
		columnDetail.setWidth("25px");
		
		Column columnName = new Column();
		columnsContact.add(columnName);
		columnName.setLabel("Name");
		
		Column columnPhone = new Column();
		columnsContact.add(columnPhone);
		columnPhone.setLabel("Phone");
		Rows rowsContact = new Rows();
		gridContact.add(rowsContact);

		Group groupColleague = new Group();
		rowsContact.add(groupColleague);
		Label labelColleague = new Label();
		groupColleague.add(labelColleague);
		labelColleague.setValue("Colleague");
		
		Row rowTom = new Row();
		rowsContact.add(rowTom);
		Contact tom = new Contact("Tom","0001","/test2/img/icon_users.png","ZK","coding");
		addContact(rowTom, tom);
		
		
		Group groupFamily = new Group();
		rowsContact.add(groupFamily);
		Label labelFamily = new Label();
		groupFamily.add(labelFamily);
		labelFamily.setValue("Family");
		
		Row rowFather = new Row();
		rowsContact.add(rowFather);
		Contact father = new Contact("Father","8888","/test2/img/icon_browser.png","home","car");
		addContact(rowFather, father);
				
		Row rowMother = new Row();
		rowsContact.add(rowMother);
		Contact mother = new Contact("Mother","8888","/test2/img/icon_calendar.png","me","cooking");
		addContact(rowMother, mother);
		
		return toolbarContact;
	}
	

	
	private Widget addPanelChildren(){
		Panelchildren panelchildren = new Panelchildren();
		Columnlayout columnlayout = new Columnlayout();
		panelchildren.add(columnlayout);
		
		
		Columnchildren columnchildrenDialog = new Columnchildren();
		columnlayout.add(columnchildrenDialog);
		columnchildrenDialog.setWidth("100%");
		Panel panelDialog = new Panel();
		columnchildrenDialog.add(panelDialog);
		panelDialog.setHeight("260px");
		Panelchildren panelchildrenDialog = new Panelchildren();
		panelDialog.add(panelchildrenDialog);
		Borderlayout borderlayoutDialog = new Borderlayout();
		panelchildrenDialog.add(borderlayoutDialog);
		
		Center centerReponse = new Center();
		borderlayoutDialog.add(centerReponse);
		centerReponse.setFlex(true);
		Div divResponse = new Div();
		centerReponse.add(divResponse);
		divResponse.setStyle("overflow:auto;");
		Label textboxResponse = new Label();
		divResponse.add(textboxResponse);
		textboxResponse.setValue("Welcome to ZK GWT");
		
		South southSend = new South();
		borderlayoutDialog.add(southSend);
		southSend.setFlex(true);
		southSend.setSize("25%");
		southSend.setSize("25%");
		southSend.setSplittable(true);
		Textbox textboxSend = new Textbox();
		southSend.add(textboxSend);
		textboxSend.setMultiline(true);
		textboxSend.setStyle("margin:0px");
		textboxSend.setValue("Hi, I am Jumper. (Please press the OK Button)",false);
		textboxSend.setWidth("98%");
		
		
		Columnchildren columnchildrenIcon = new Columnchildren();
		columnlayout.add(columnchildrenIcon);
		columnchildrenIcon.setWidth("130px");
		Panel panelIcon = new Panel();
		columnchildrenIcon.add(panelIcon);
		panelIcon.setHeight("260px");
		panelIcon.setWidth("100%");
		Panelchildren panelchildrenIcon = new Panelchildren();
		panelIcon.add(panelchildrenIcon);
		Borderlayout borderlayoutIcon = new Borderlayout();
		panelchildrenIcon.add(borderlayoutIcon);
		borderlayoutIcon.setStyle("background:transparent");
		borderlayoutIcon.setWidth("100%");
		
		North northIcon = new North();
		borderlayoutIcon.add(northIcon);
		northIcon.setBorder("none");
		northIcon.setSize("120px");
		northIcon.setSize("120px");
		northIcon.setStyle("background:transparent");
		Image imageIconTarget = new Image();
		northIcon.add(imageIconTarget);
		imageIconTarget.setSrc("/res/img/msn1.gif");
		
		South southIcon = new South();
		borderlayoutIcon.add(southIcon);
		southIcon.setBorder("none");
		southIcon.setSize("120px");
		southIcon.setSize("120px");
		southIcon.setStyle("background:transparent");
		Image imageIconMe = new Image();
		southIcon.add(imageIconMe);
		imageIconMe.setSrc("/res/img/msn2.gif");
		
		return panelchildren;
	}

	private Widget addMenuToolBar(){
		Toolbar result = new Toolbar();
		Menubar menubar = new Menubar();
		result.add(menubar);
		menubar.setWidth("200px");
	
		
		Menu menuProject = new Menu();
		menubar.add(menuProject);
		menuProject.setImage("/res/img/Centigrade-Widget-Icons/Briefcase-16x16.png");
		menuProject.setLabel("Project");		
		Menupopup menupopupProject = new Menupopup();
		menuProject.add(menupopupProject);
		Menuitem menuitemNew = new Menuitem();
		menupopupProject.add(menuitemNew);
		menuitemNew.setImage("/res/img/Centigrade-Widget-Icons/BriefcaseSpark-16x16.png");
		menuitemNew.setLabel("New");
		
		menuitemNew.addEventListener(Events.ON_CLICK, new EventListener() {
			@Override
			public void onEvent(Event event) {
				Window.alert("New Clicked");
			}
		});		

		Menuitem menuitemOpen = new Menuitem();
		menupopupProject.add(menuitemOpen);
		menuitemOpen.setImage("/res/img/Centigrade-Widget-Icons/BriefcaseOpen-16x16.png");
		menuitemOpen.setLabel("Open");
		Menuitem menuitemSave = new Menuitem();
		menupopupProject.add(menuitemSave);
		menuitemSave.setImage("/res/img/Centigrade-Widget-Icons/DisketteBlack-16x16.png");
		menuitemSave.setLabel("Save");
		Menuseparator menuseparator = new Menuseparator();
		menupopupProject.add(menuseparator);
		Menuitem menuitemExit = new Menuitem();
		menupopupProject.add(menuitemExit);
		menuitemExit.setImage("/res/img/Centigrade-Widget-Icons/DoorOpen-16x16.png");
		menuitemExit.setLabel("Exit");
		
		
		Menu menuHelp = new Menu();
		menubar.add(menuHelp);
		menuHelp.setImage("/res/img/Centigrade-Widget-Icons/QuestionmarkButton-16x16.png");
		menuHelp.setLabel("Help");
		Menupopup menupopupHelp = new Menupopup();
		menuHelp.add(menupopupHelp);
		Menuitem menuitemIndex = new Menuitem();
		menupopupHelp.add(menuitemIndex);
		menuitemIndex.setLabel("Index");
		
		
		Menu menuAbout = new Menu();
		menupopupHelp.add(menuAbout);
		menuAbout.setLabel("About");
		Menupopup menupopupAbout = new Menupopup();
		menuAbout.add(menupopupAbout);
		Menuitem menuitemAboutZK = new Menuitem();
		menupopupAbout.add(menuitemAboutZK);
		menuitemAboutZK.setLabel("About ZK");
		Menuitem menuitemAboutPotix = new Menuitem();
		menupopupAbout.add(menuitemAboutPotix);
		menuitemAboutPotix.setLabel("About Potix");
		
		
		
		Menu menuIconOnly = new Menu();
		menubar.add(menuIconOnly);
		menuIconOnly.setImage("/res/img/Centigrade-Widget-Icons/Spyglass-16x16.png");
		Menupopup menupopupIconOnly = new Menupopup();
		menuIconOnly.add(menupopupIconOnly);
		Menuitem menuitemIconOnly = new Menuitem();
		menupopupIconOnly.add(menuitemIconOnly);
		menuitemIconOnly.setLabel("Index");		
		return result;
	}
	
	private Widget addButtonToolBar(){
		Toolbar result = new Toolbar();
		result.setAlign("center");
		result.setMold("panel");
		
		Button btnOK = new Button();
		result.add(btnOK);
		btnOK.setLabel("OK");
		btnOK.setWidth("65px");
		
		btnOK.addEventListener(Events.ON_CLICK, new EventListener() {
			@Override
			public void onEvent(Event event) {
				Window.alert("OK Clicked");
			}
		});		
		
		
		Button btnCancel = new Button();
		result.add(btnCancel);
		btnCancel.setLabel("Cancel");
		btnCancel.setWidth("65px");
		
		
		return result;
	}
	
	
	private void addContact(Row parent, Contact target){
		Detail detail = new Detail();
		parent.add(detail);
		Grid grid = new Grid();
		detail.add(grid);
		Rows rows = new Rows();
		grid.add(rows);

		Row rowProduct = new Row();
		rows.add(rowProduct);
		Cell cell = new Cell();
		rowProduct.add(cell);
		cell.setRowspan(2);
		Image image = new Image();
		cell.add(image);
		image.setSrc(target.getIcon());		
		image.setWidth("90%");
		Label labelProduct = new Label();
		rowProduct.add(labelProduct);
		labelProduct.setValue("Product");
		Label labelProductValue = new Label();
		rowProduct.add(labelProductValue);
		labelProductValue.setValue(target.getProduct());
		
		Row rowHabit = new Row();
		rows.add(rowHabit);
		Label labelHabit = new Label();
		rowHabit.add(labelHabit);
		labelHabit.setValue("Habit");
		Label labelHabitValue = new Label();
		rowHabit.add(labelHabitValue);
		labelHabitValue.setValue(target.getHabit());
		
		Label labelName = new Label();
		parent.add(labelName);
		labelName.setValue(target.getName());
		
		Label labelPhone = new Label();
		parent.add(labelPhone);
		labelPhone.setValue(target.getPhone());	
	}
	
	private class Contact{

		private String name;
		private String phone;
		private String icon;		
		private String product;
		private String habit;
		
		Contact(String name, String phone, String icon, String product, String habit){
			this.name = name;
			this.phone = phone;
			this.icon = icon;
			this.product = product;
			this.habit = habit;			
		}
		
		public String getIcon() {
			return icon;
		}

		public String getName() {
			return name;
		}

		public String getPhone() {
			return phone;
		}

		public String getProduct() {
			return product;
		}

		public String getHabit() {
			return habit;
		}	
	}	
}

