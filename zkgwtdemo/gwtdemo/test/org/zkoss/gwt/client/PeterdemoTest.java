package org.zkoss.gwt.client;


import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.ui.VerticalPanel;
import org.zkoss.gwt.client.zul.wgt.Label;

public class PeterdemoTest extends GWTTestCase {

	  /**
	   * Must refer to a valid module that sources this class.
	   */
	  public String getModuleName() {                                         
	    return "org.zkoss.gwt.peterdemo";
	  }

		//TODO: Can we set $wnd.zul??
//		public void gwtSetUp () {
//			System.out.println("gwtSetUp()");
//			System.out.println(getZUL());
//		}

		//TODO: does busy waiting block here?
		protected native JavaScriptObject attachZul() /*-{
			//var waitFor = function(){
				//while(true){
					
				//	if(typeof(zul) != "undefined"){
							
						//return;
					//}
				//}								
			//};
			//waitFor();
			return zul;
		}-*/;

		protected native JavaScriptObject getZUL() /*-{
		return $wnd.zul;
	}-*/;
		
		
		public void testGetZUL() {
			System.out.println(getZUL());
		}
		
	  /**
	   * Add as many tests as you like.
	   */
	  public void testNewZKElement() {
		  System.out.println("testNewZKElement");
		//Label label = new Label();
		VerticalPanel mainPanel = new VerticalPanel();
		
		
		
		//Label comp = new Label();
		

	    assertTrue(true);
//		label.setValue("my first label in zk gwt aaaddd");
//
//	    assertTrue("my first label in zk gwt aaaddd".equals(label.getValue()));
//	    assertFalse("non sense".equals(label.getValue()));
	  }

	  /**
	   * Add as many tests as you like.
	   */
	  public void testSimple2() {                                              
	    assertTrue(true);
	  }
}
