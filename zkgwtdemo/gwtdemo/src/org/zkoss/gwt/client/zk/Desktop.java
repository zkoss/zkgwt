package org.zkoss.gwt.client.zk;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class Desktop extends org.zkoss.gwt.client.zk.Widget{
	
	
	protected native JavaScriptObject create() /*-{
		return new $wnd.zk.Desktop();
	}-*/;

	
	public native void $init(String dtid, String contextURI, String updateURI, String reqURI, boolean stateless)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		widget.$init(dtid, contextURI, updateURI, reqURI, stateless);
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zk/src/archive/web/js/zk//widget.js line:[3845]
	
	public native org.zkoss.gwt.client.zk.Widget setId(String id)/*-{
		var widget = this.@org.zkoss.gwt.client.zk.Widget::getZkWidget()();
		return widget.setId(id);
	}-*/; //D:/svn_workingcopy/zk1/branches/5.0/zk/src/archive/web/js/zk//widget.js line:[3882]
}
