/* EventListener.java

	Purpose:
		
	Description:
		
	History:
		2010/3/29, Created by Ian Tsai(Zanyking)

Copyright (C) 2010 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under Apache license version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package org.zkoss.gwt.client.zk;

/**
 * An listener that will be notified when an event occurs, if it is
 * registered to
 * {@link org.zkoss.gwt.client.zk.Widget#addEventListener(String, EventListener)}
 *   
 * <p>the {@link EventListener#onEvent(Event)}will be triggered while inside the 
 * ZK Widget's implementation such event name has recognized.  
 * 
 * 
 * @author Ian Tsai(Zanyking)
 *
 */
public interface EventListener {

	/**
	 * Triggered while 
	 * {@link Widget#fireEvent(String, com.google.gwt.core.client.JavaScriptObject)}
	 * has been called.
	 * 
	 * @param event 
	 */
	public void onEvent(Event event);
	
}
