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
		
	private Textbox textboxSend;
	private Textbox textboxResponse;
	
	@Override
	public void onModuleLoad() {
		panel.add(genWidget());		
		RootPanel.get().add(panel);		
	}
	
	public Widget genWidget(){
		
		Panel panelChat = new Panel(){{
			setBorder("normal");
			setCollapsible(true);
			setFramable(true);
			setHeight("400px");
			setTitle("Chat");
			setWidth("500px");			
		}};
		
		
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
		Label labelContact= new Label(){
			{
				setValue("Contact");
			}
		};
		toolbarContact.add(labelContact);

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

		Group groupColleagues = new Group();
		rowsContact.add(groupColleagues);
		Label labelColleague = new Label();
		groupColleagues.add(labelColleague);
		labelColleague.setValue("Colleagues");
		
		Row rowFred = new Row();
		rowsContact.add(rowFred);
		Contact fred = new Contact("Fred","408-307-5961","/res/img/demo2.PNG","3/29","coding");
		addContact(rowFred, fred);
		
		
		
		Group groupFriends = new Group();
		rowsContact.add(groupFriends);
		Label labelFamily = new Label();
		groupFriends.add(labelFamily);
		labelFamily.setValue("Friends");
		
		Row rowGed = new Row();
		rowsContact.add(rowGed);
		Contact ged = new Contact("Ged","213-329-6477","/res/img/demo3.PNG","10/10","car");
		addContact(rowGed, ged);
				
		Row rowMeg = new Row();
		rowsContact.add(rowMeg);
		Contact meg = new Contact("Meg","212-295-3229","/res/img/demo4.PNG","5/20","cooking");
		addContact(rowMeg, meg);
		
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
		textboxResponse = new Textbox(){{
			setMultiline(true);
			setStyle("border: none;");			
			setWidth("99%");			
			setHeight("98%");
		}};

		divResponse.add(textboxResponse);
		textboxResponse.setValue("Welcome to ZK GWT!",false);
		
		South southSend = new South(){{
			setFlex(true);
			setSize("25%");
			setSize("25%");
			setSplittable(true);			
		}};
		borderlayoutDialog.add(southSend);

		textboxSend = new Textbox(){{
			setMultiline(true);
			setStyle("border: none;");			
			setWidth("98%");			
			setHeight("98%");
		}};
		southSend.add(textboxSend);
		
		
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
		
		North northIcon = new North(){{
			setBorder("none");
			setSize("120px");
			setStyle("background:transparent");			
		}};
		borderlayoutIcon.add(northIcon);
		Image imageIconTarget = new Image();
		northIcon.add(imageIconTarget);
		imageIconTarget.setSrc("/res/img/msn.png");	
		South southIcon = new South(){{
			setBorder("none");
			setSize("120px");
			setStyle("background:transparent");			
		}};
		borderlayoutIcon.add(southIcon);
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
		Menuitem menuitemNew = new Menuitem(){{
			setImage("/res/img/Centigrade-Widget-Icons/BriefcaseSpark-16x16.png");
			setLabel("New");
			
			addEventListener(Events.ON_CLICK, new EventListener() {
				@Override
				public void onEvent(Event event) {
					Window.alert("New Clicked");
				}
			});					
		}};
		menupopupProject.add(menuitemNew);

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
		menuitemAboutPotix.setLabel("About ZK GWT");
		
		
		
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
		
		Button btnSend = new Button(){{
			setLabel("Send");
			setWidth("65px");
			
			addEventListener(Events.ON_CLICK, new EventListener() {
				@Override
				public void onEvent(Event event) {
					//Window.alert("Send Clicked.");
					textboxResponse.setValue(textboxSend.getValue(), false);
					textboxSend.setValue("", false);
				}
			});					
		}};
		result.add(btnSend);
		
		
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

		Row rowBirthdate = new Row();
		rows.add(rowBirthdate);
		Cell cell = new Cell();
		rowBirthdate.add(cell);
		cell.setRowspan(2);
		Image image = new Image();
		cell.add(image);
		image.setSrc(target.getIcon());		
		image.setWidth("90%");
		Label labelBirthdate = new Label();
		rowBirthdate.add(labelBirthdate);
		labelBirthdate.setValue("Birth Date");
		Label labelBirthdateValue = new Label();
		rowBirthdate.add(labelBirthdateValue);
		labelBirthdateValue.setValue(target.getBirthdate());
		
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
		private String birthdate;
		private String habit;
		
		Contact(String name, String phone, String icon, String birthdate, String habit){
			this.name = name;
			this.phone = phone;
			this.icon = icon;
			this.birthdate = birthdate;
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

		public String getBirthdate() {
			return birthdate;
		}

		public String getHabit() {
			return habit;
		}	
	}	
}

