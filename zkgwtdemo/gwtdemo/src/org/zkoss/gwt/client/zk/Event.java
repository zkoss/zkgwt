/* Event.java

	Purpose:
		
	Description:
		
	History:
		Mon March 29 11:28   2010, Created by Ian Tsai(Zanyking)

Copyright (C) 2010 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under Apache license version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package org.zkoss.gwt.client.zk;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Event Object that brings necessary information of ZK Event.   
 * 
 * 
 * 
 * @author Ian Tsai(Zanyking)
 *
 */
public class Event {

	private final String eventName;
	private final JavaScriptObject nativeEvent;
	private final Widget target;
	/**
	 * 
	 * @param eventName
	 * @param nativeEvent
	 * @param target
	 */
	public Event(String eventName, JavaScriptObject nativeEvent, Widget target) {
		super();
		this.eventName = eventName;
		this.nativeEvent = nativeEvent;
		this.target = target;
	}
	/**
	 * 
	 * @return
	 */
	public String getEventName() {
		return eventName;
	}
	/**
	 * 
	 * @return the native Javascript Object of this Event
	 */
	public JavaScriptObject getNativeEvent() {
		return nativeEvent;
	}
	/**
	 * 
	 * @return
	 */
	public Widget getTarget() {
		return target;
	}
	
	
}
