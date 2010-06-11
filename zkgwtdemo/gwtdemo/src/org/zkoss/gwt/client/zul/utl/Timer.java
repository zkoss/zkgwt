package org.zkoss.gwt.client.zul.utl;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Timer extends org.zkoss.gwt.client.zk.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zul.utl.Timer();
	}-*/;

	
	public native void setRepeats(boolean repeats)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setRepeats(repeats);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/utl/Timer.js line:[32]
	
	public native boolean isRepeats()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isRepeats();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/utl/Timer.js line:[28]
	
	public native void setDelay(int delay)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setDelay(delay);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/utl/Timer.js line:[43]
	
	public native int getDelay()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.getDelay();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/utl/Timer.js line:[38]
	
	public native void setRunning(boolean running)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.setRunning(running);
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/utl/Timer.js line:[54]
	
	public native boolean isRunning()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.isRunning();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/utl/Timer.js line:[48]
	
	public native void play()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.play();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/utl/Timer.js line:[59]
	
	public native void stop()/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.stop();
	}-*/; //I:/svn/zk5_sf/zul/src/archive/web/js/zul/utl/Timer.js line:[64]
}
