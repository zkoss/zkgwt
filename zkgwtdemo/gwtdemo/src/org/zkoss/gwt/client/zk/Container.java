/* Container.java

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

import java.util.Iterator;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.HasWidgets;

/**
 *  @author Ian Tsai(Zanyking)
 *
 */
public abstract class Container extends Widget implements HasWidgets{

/***** SECTION: widget tree node operation. *****/
    
//	private ArrayList<Widget> children = new ArrayList<Widget>();
	
	public void add(Widget zChild){
		this.add((com.google.gwt.user.client.ui.Widget)zChild);
	}
	
    @Override
    public void add(com.google.gwt.user.client.ui.Widget child) {
    	/** Validate */
    	if(!(child instanceof Widget)){
    		throw new RuntimeException("must be ZK Widget!");
    	}
    	Widget zChild = (Widget) child;
    	
    	/** adjust for Re Insertion */
    	
    	/** Detach Child */
    	if(zChild.isAttached()){
    		zChild.removeFromParent();
    	}
    	/** Logical Attach */
    	
    	/** Physical Attach */
    	appendChild((zChild).getZkWidget());
    	/** Adopt */
    	zChild.setParent(this);
    }
    
    private native boolean appendChild(JavaScriptObject childZWidget)/*-{
	    var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
	    return widget.appendChild(childZWidget);
	}-*/;
    
	@Override
	public boolean remove(com.google.gwt.user.client.ui.Widget child) {
		if(!(child instanceof Widget)){
			return false;	
    	}
		Widget zChild = (Widget) child;
		
		return this.removeChild(zChild.getZkWidget());
	}
	/**
	 * 
	 * @param childZWidget
	 * @return
	 */
    private native boolean removeChild(JavaScriptObject childZWidget)/*-{
	    var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
	    return widget.removeChild(childZWidget);
	}-*/;

	@Override
	public Iterator<com.google.gwt.user.client.ui.Widget> iterator() {
		
		return new Iterator<com.google.gwt.user.client.ui.Widget>(){
			private Widget currentChild = firstChild();
			@Override
			public boolean hasNext() {
				if(currentChild==null) return false;
				Widget next = currentChild.nextSibling();
				return next!=null;
			}

			@Override
			public com.google.gwt.user.client.ui.Widget next() {
				return currentChild = currentChild.nextSibling();
			}

			@Override
			public void remove() {
				
			}
		};
	}

    public native void clear()/*-{
	    var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
	    widget.clear();
	}-*/;

//******* wrapping method *******/
	/**
     * 
     * @param index
     * @return
     */
    public native Widget getChildAt(int index)/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		wgt = wgt.getChildAt(index);
	    return (wgt)? wgt.__gwtIns : null;
	}-*/;	
	
    /**
     * 
     * @return
     */
	protected native Widget firstChild()/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
	    wgt = wgt.firstChild;
	    return (wgt)? wgt.__gwtIns : null;
	}-*/;
	/**
	 * 
	 * @return
	 */
	protected native Widget lastChild()/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
	    wgt = wgt.lastChild;
	    return (wgt)? wgt.__gwtIns : null;
	}-*/;


		
}
