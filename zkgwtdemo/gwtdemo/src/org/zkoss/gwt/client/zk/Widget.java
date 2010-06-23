/* Widget.java

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.zkoss.gwt.client.Utils;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * This class is used to wrap {@link com.google.gwt.user.client.ui.Widget}. 
 * It's concealed the ZK Client-side Javascript with Google JSNI technology.
 * Please do not inherit this class directly, instead you should consider: 
 * {@link org.zkoss.gwt.client.zul.Widget}
 * 
 * @author Ian Tsai(Zanyking)
 * 
 */
public abstract class Widget extends com.google.gwt.user.client.ui.Widget {
	
	private JavaScriptObject widget;
	private Container parent;
	private boolean isElementSet = false;
	private Map<String, List< EventListener>> listeners;
	
	
	/**
	 * while constructing, zk widget will be created and $init() method will 
	 * be called.
	 */
	public Widget(){
		widget = create();
		Utils.setAttribute(widget, "__gwtIns", this);
	}
	
//***** SECTION: widget Methods. *****/
	
	

	/**
	 * 
	 * @param parent the parent of this widget, must be {@link Container}
	 */
	public void setParent(Container parent) {
		this.parent = parent;
	}
	
	public Container getParent() {
		return parent;
	}
	
	public void removeFromParent() {
		super.removeFromParent();
		if(parent!=null){
			parent.remove(this);
			parent = null;	
		}
	}
	/**
	 * wrapper method of ZK client widget.getId() method.
	 * @return id of this widget.
	 */
	public native String getId()/*-{
	    var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
	    return wgt.getId();
	}-*/;
	
	/**
	 * wrapper method of ZK client widget.getuuid() method.
	 * @return uuid of this widget
	 */
	public native String getUuid()/*-{
	    var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
	    return wgt.uuid;
	}-*/;
	
	
	
//***** SECTION: widget Event Listening Handlers. *****/
	
	/**
	 * add a event listener of this widget.
	 * @param eventName the name of this widget, please take a look at{@link Events}
	 *  for possible event name.
	 * @param eventListener the real event listener instance
	 * @return false if EventListener is null, or already been registered.  
	 */
	public boolean addEventListener(String eventName, EventListener eventListener){
		
		if(eventListener==null){
			return false;
		}
		
		if(listeners==null){
			listeners = new HashMap<String, List< EventListener>>();
		}
		
		List<EventListener> evtList = listeners.get(eventName);
		
		if(evtList == null){
			listeners.put(eventName, 
					evtList = new ArrayList<EventListener>());
			
			nativeListen(eventName);
		}
		
		if(evtList.contains(eventListener)){
			return false;
		}

		evtList.add(eventListener);
		return true;
	}
	
	private native void nativeListen(String evtName)/*-{ 
	    var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
	    var thz = this;
//	    $wnd.zk.log(thz);
    
	    var map={};
	    map[evtName] = function(evt){
//	    	for(var item in evt){
//	    		$wnd.zk.log(item,":",evt[item]);	    		
//	    	}
//	 	 		
//			$wnd.zk.log("      evt.data starts:");	 	 		
//	    	for(var item in evt.data){
//	    		$wnd.zk.log(item,":",evt.data[item]);	    		
//	    	}
//
//	    	$wnd.temppeter = evt;
	    	
	    	thz.@org.zkoss.gwt.client.zk.Widget::fireEvent(Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(evtName, evt);
	    	//var evt = {'one':'z1','two':'z2'};
	    	//jsonObjectEvt = @com.google.gwt.json.client.JSONObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(evt);	    	 
	    	//thz.@org.zkoss.gwt.client.zk.Widget::fireEvent(Ljava/lang/String;Lcom/google/gwt/json/client/JSONObject;)(evtName, jsonObjectEvt);
	    };
	    wgt.listen(  map, -1000);
	}-*/;

	/**
	 * 
	 * @param eventName
	 * @param nEvent
	 */
	public void fireEvent(String eventName, JavaScriptObject nEvent){
	//public void fireEvent(String eventName, JSONObject nEvent){
		List<EventListener> list = listeners.get(eventName);

		//error?
		//System.out.println(nEvent.toString());
		
		//JavaScriptObject temp =  nEvent.getJavaScriptObject();
		
		
//		Set<String> keys = nEvent.keySet();
//		for(String key: keys){
//			System.out.println(key);
//		}
//		
//		JSONValue data = nEvent.get("data");
//		JSONObject dataJson = data.isObject();
//		if(dataJson != null){
//			System.out.println("data not null!!!! should have its keys!!!");
//		}
//		Set<String> datakeys = dataJson.keySet();
//		for(String key: datakeys){
//			System.out.println(key);			
//		}
//		JSONValue items = dataJson.get("items");
//		System.out.println("before is array");
//		JSONArray itemarray = items.isArray();
//		System.out.println("after is array");
//		if(itemarray != null){
//			System.out.println("is array and not null");
//		}
//		
//		System.out.println("reference in data:"+dataJson.get("reference"));
//
//		
		
		//System.out.println("get json"+nEvent.get("one"));
		Event event = new Event(eventName, nEvent, this);
		
		//From Ian, should have extended Event  
		//Event event = EventFactory.newInstance(eventName);
		
		for(EventListener listener : list){
			listener.onEvent(event);
		}
	}
	
	/**
	 * to unregister an Event Listener.
	 * 
	 * @param eventName the name of the event listener, better get it through Events. 
	 * @param eventListener
	 * @return
	 */
	public boolean removeEventListener(String eventName, EventListener eventListener){
		
		if(listeners==null){
			return false;
		}
		List<EventListener> evtList = listeners.get(eventName);
		
		if(evtList == null || !evtList.contains(eventListener)){
			return false;
		}
		
		evtList.remove(eventListener);
		
		if(evtList.isEmpty()){//unregister this event name from this ZK Widget.  
			nativeUnlisten(eventName);
		}
		
		return true;
	}
	private native void nativeUnlisten(String evtName)/*-{
	    var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
	    var map={};
	    map[evtName] = this; 
	    wgt.unlisten(map);
	    $wnd.zk.log('unlisten successfully!!!');
	}-*/;

	
	public boolean isListen(String eventName){
		return false;
	}
	
	
	
	
//***** SECTION: widget Rendering. *****/
	

	/**
	 * this method should be implemented by Widget implementer, which will return a 
	 * ZK Widget instance.<br>
	 * 
	 * normally, this method should be implemented using JSNI technology, for example:
	 * 
	 * <i>return new $wnd.zul.wgt.Button();</i> 
	 *  
	 * @return the ZK Javascript Widget Instance 
	 */
    protected abstract JavaScriptObject create();

    /**
     * GWT required method, need to override.
     */
    protected void setElement(Element elem) {
        super.setElement(elem);
        isElementSet = true;
        
    }
    /**
     * GWT required method, need to override.
     */
    public  Element getElement(){
		if(!isElementSet) {
            JavaScriptObject jsObj = getZkWidget();
            if (!isRendered()) {

            	if (getParent() != null && getParent().getElement() != null) {
                    render(getParent().getElement());
                } else {
                    render(RootPanel.getBodyElement());
                }
            }
            setElement(getElement(jsObj));
		}
		return super.getElement();
    }
    private native void render(Element parent) /*-{
        var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
        
        $wnd.jq(parent).append('<div id="zk-qwt-temp"/>');
		wgt.replaceHTML($wnd.jq('#zk-qwt-temp')[0]);
        
    }-*/;
    /**
     * @return true if component has been rendered
     */
    public native boolean isRendered() /*-{
        var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
        return wgt != null && wgt.$n()!=null;
    }-*/;
    private native Element getElement(JavaScriptObject jsObj) /*-{
	    return jsObj.$n();

	}-*/;
	/**
	 * the getter method of this widget's ZK side Javascript Object.
	 * @return native ZK Javascript widget object. 
	 */
    public JavaScriptObject getZkWidget() {
        return widget;
    }
    
    
    
//***** SECTION: Wrapping Methods *****/
	/**
	 * 
	 * @return
	 */
	protected native Widget previousSibling()/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
	    wgt = wgt.previousSibling;
	    return (wgt)? wgt.__gwtIns : null;
	}-*/;
	/**
	 * 
	 * @return
	 */
	protected native Widget nextSibling()/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
	    wgt = wgt.nextSibling;
	    return (wgt)? wgt.__gwtIns : null;
	}-*/;
    /**
     * 
     * @param timeout
     * @return
     */
    public native boolean focus(int timeout)/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
	    return wgt.focus(timeout);
	}-*/;	
    /**
     * 
     * @return
     */
    public native String getDraggable()/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
	    return wgt.getDraggable();
	}-*/;
    
    /**
     * 
     * @param draggable
     * @return
     */
    public native Widget setDraggable(String draggable)/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		wgt = wgt.setDraggable(draggable);
	    return (wgt)? wgt.__gwtIns : null;
	}-*/;	
    /**
     * 
     * @return
     */
    public native String getDroppable()/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
	    return wgt.getDroppable();
	}-*/;
    /**
     * 
     * @param droppable
     * @return
     */
    public native Widget setDroppable(String droppable)/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		wgt = wgt.setDroppable(droppable);
	    return (wgt)? wgt.__gwtIns : null;
	}-*/;
    /**
     * 
     * @return
     */
    public native String getMold()/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
	    return wgt.getMold();
	}-*/;
    /**
     * 
     * @param mold
     * @return
     */
    public native Widget setMold(String mold)/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		wgt = wgt.setMold(mold);
	    return (wgt)? wgt.__gwtIns : null;
	}-*/;
    
    /**
     * 
     * @return
     */
    public native String getSclass()/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
	    return wgt.getSclass();
	}-*/;
    /**
     * 
     * @param sclass
     * @return
     */
    public native Widget setSclass(String sclass)/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		wgt = wgt.setSclass(sclass);
	    return (wgt)? wgt.__gwtIns : null;
	}-*/;
    /**
     * 
     * @return
     */
    public native String getZclass()/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
	    return wgt.getZclass();
	}-*/;
    /**
     * 
     * @param zclass
     * @return
     */
    public native Widget setSzlass(String zclass)/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		wgt = wgt.setZclass(zclass);
	    return (wgt)? wgt.__gwtIns : null;
	}-*/;
    
    /**
     * 
     * @return
     */
    public native String getStyle()/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
	    return wgt.getStyle();
	}-*/;
    /**
     * 
     * @param style
     * @return
     */
    public native Widget setStyle(String style)/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		wgt = wgt.setStyle(style);
	    return (wgt)? wgt.__gwtIns : null;
	}-*/;
    /**
     * 
     * @return
     */
    public native String getVflex()/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
	    return wgt.getVflex();
	}-*/;
    /**
     * 
     * @param value
     * @return
     */
    public native Widget setVflex(String value)/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		wgt = wgt.setVflex(value);
	    return (wgt)? wgt.__gwtIns : null;
	}-*/;
    /**
     * 
     * @return
     */
    public native String getHflex()/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
	    return wgt.getHflex();
	}-*/;
    /**
     * 
     * @param value
     * @return
     */
    public native Widget setHflex(String value)/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		wgt = wgt.setHflex(value);
	    return (wgt)? wgt.__gwtIns : null;
	}-*/;
    /**
     * 
     * @return
     */
    public native String getWidth()/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
	    return wgt.getWidth();
	}-*/;

    /**
     * peter, //TODO: 
     * @return
     */
    public native void setWidth(String width)/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
	    wgt.setWidth(width);
	}-*/;

    /**
     * peter, //TODO: 
     * @return
     */
    public native void setHeight(String height)/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
	    wgt.setHeight(height);
	}-*/;

    /**
     * 
     * @return
     */
    public native int getZIndex()/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
	    return wgt.getZIndex();
	}-*/;
    /**
     * 
     * @return
     */
    public native Widget hide()/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		wgt = wgt.hide();
	    return (wgt)? wgt.__gwtIns : null;
	}-*/;
    /**
     * 
     * @return
     */
    public native Widget show()/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		wgt = wgt.show();
	    return (wgt)? wgt.__gwtIns : null;
	}-*/;
    /**
     * 
     * @return
     */
    public native String get()/*-{
		var wgt = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
	    return wgt.get();
	}-*/;
}
