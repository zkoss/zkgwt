/**
 * 
 */
package org.zkoss.gwt.client;

import org.zkoss.gwt.client.testzk.TestcaseGridFull;
import org.zkoss.gwt.client.testzk.TestcaseGridFullGened;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author Peter
 *
 */
public class Peterdemo implements EntryPoint {

	
	private VerticalPanel panel = new VerticalPanel();
	

	
	@Override
	public void onModuleLoad() {
		
		Widget widget = TestcaseGridFullGened.getInstance();
		
		panel.add(widget);		
		RootPanel.get().add(panel);		
	}
}
