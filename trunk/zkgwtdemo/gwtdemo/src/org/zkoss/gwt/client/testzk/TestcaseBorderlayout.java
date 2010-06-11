package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.db.Calendar;
import org.zkoss.gwt.client.zul.layout.Borderlayout;
import org.zkoss.gwt.client.zul.layout.North;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.user.client.ui.Widget;


public class TestcaseBorderlayout {
	public static Widget getInstance() {
		
		Window win = new Window();

/*
	<borderlayout height="450px">
		<north title="North" maxsize="300" size="50%" splittable="true" collapsible="true">
		</north>
		<center border="0">
			<borderlayout>
				<west maxsize="600" size="30%" flex="true" border="0" splittable="true">
					<div style="background:#E6D92C">
						<label value="30%"
							style="color:white;font-size:50px" />
					</div>
				</west>
				<center>
					<label value="Here is a border"
						style="color:gray;font-size:30px" />
				</center>
				<east title="East" size="30%" flex="true" collapsible="true">
					<div style="background:#B8D335">
						<label value="30%"
							style="color:white;font-size:50px" />
					</div>
				</east>
			</borderlayout>
		</center>
	</borderlayout>	
*/
		
		Borderlayout comp = new Borderlayout();
		North north = new North();
		comp.add(north);
//		north.setTitle("North");
//		north.setMaxsize(300);
//		north.setSize("50%");
//		north.setSplittable(true);
//		north.setCollapsible(true);
//		
		
		
		win.add(comp);
				
		return win;
	}
}
