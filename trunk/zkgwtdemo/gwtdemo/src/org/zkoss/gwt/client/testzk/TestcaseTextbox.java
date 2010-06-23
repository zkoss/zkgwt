package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zk.Event;
import org.zkoss.gwt.client.zk.EventListener;
import org.zkoss.gwt.client.zk.Events;
import org.zkoss.gwt.client.zul.inp.Textbox;
import org.zkoss.gwt.client.zul.wgt.Button;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;


public class TestcaseTextbox extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();

/*		
		<textbox value="secret" type="password" />
*/
		
		Textbox comp = new Textbox();
		comp.setValue("secret", true);
		//comp.setType("password");

		comp.addEventListener(Events.ON_CHANGE, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>textbox onChange");
				System.out.println("data : " + getJSONString(nEvent));				
				System.out.println("value : " + getValue(nEvent));
			}
		});		

		comp.addEventListener(Events.ON_CLICK, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>textbox onClick");
				System.out.println("data : " + getJSONString(nEvent));				
			}
		});		
		
		comp.addEventListener(Events.ON_DOUBLE_CLICK, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>textbox onDoubleClick");
				System.out.println("data : " + getJSONString(nEvent));				
			}
		});				

		comp.addEventListener(Events.ON_RIGHT_CLICK, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>textbox onRightClick");
				System.out.println("data : " + getJSONString(nEvent));				
			}
		});				

		comp.addEventListener(Events.ON_OK, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>textbox onOK");
				System.out.println("data : " + getJSONString(nEvent));				
			}
		});				

		comp.addEventListener(Events.ON_CANCEL, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>textbox onCancel");
				System.out.println("data : " + getJSONString(nEvent));				
			}
		});				

		//set control keys to "ctrl + a","alt + b","shift + c" 
		//comp.setCtrlKeys("^a@b$c");
		//$c will cause google plugin error
		comp.setCtrlKeys("^a@b");
		comp.addEventListener(Events.ON_CTRL_KEY, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>textbox onCtrlKey");
				System.out.println("data : " + getJSONString(nEvent));				
			}
		});				
		
		Button btn = new Button();
		win.add(btn);
		btn.setLabel("test");
		btn.setDraggable("true");
		comp.setDroppable("true");
		comp.addEventListener(Events.ON_DROP, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>textbox onDrop");
				System.out.println("data : " + getJSONString(nEvent));
				
				org.zkoss.gwt.client.zk.Widget gwtWidget = getDragged(nEvent);
				if(gwtWidget == null){
					System.out.println("damn the gwt Widget not get");
				}else{
					System.out.println("got the gwt Widget");
					System.out.println("gwt mapping class: "+gwtWidget.getZclass());					
				}
			}
		});				
		

		comp.addEventListener(Events.ON_CHANGING, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>textbox onChanging");
				System.out.println("data : " + getJSONString(nEvent));		
				System.out.println("value : " + getValue(nEvent));
			}
		});				

		comp.addEventListener(Events.ON_SELECTION, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>textbox onSelection");
				System.out.println("data : " + getJSONString(nEvent));		
				System.out.println("value : " + getSelected(nEvent));
			}
		});	
		
		//not shown the error, even the constraint check box does not show
		comp.setConstraint("no empty");
		comp.addEventListener(Events.ON_ERROR, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>textbox onError");
				System.out.println("data : " + getJSONString(nEvent));						
			}
		});	

		comp.addEventListener(Events.ON_FOCUS, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>textbox onFocus");
				System.out.println("data : " + getJSONString(nEvent));		
				
			}
		});	

		comp.addEventListener(Events.ON_BLUR, new EventListener() {
			public void onEvent(Event event) {				
				JavaScriptObject nEvent = event.getNativeEvent();				
				System.out.println(">>textbox onBlur");
				System.out.println("data : " + getJSONString(nEvent));		
				
			}
		});	

		win.add(comp);
		
		
		
		return win;
	}
	
	public static final native org.zkoss.gwt.client.zk.Widget getDragged(JavaScriptObject js) /*-{
//		$wnd.zk.log("dragged");
//		$wnd.zk.log(js.data.dragged);
//		$wnd.zk.log("__gwtIns");
		//uncaught exception: com.google.gwt.core.client.JavaScriptException: (null): null
		//can get the gwt widget, but can print it by zk.log
		//$wnd.zk.log(js.data.dragged.__gwtIns);
		
		return js.data.dragged.__gwtIns; 
	}-*/;
	
	
	public static final native String getSelected(JavaScriptObject js) /*-{
		return js.data.selected; 
	}-*/;
	
	
}
