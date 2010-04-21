package org.zkoss.gwt.client.zk;

import org.zkoss.gwt.client.zul.Widget;
import java.util.*;
import com.google.gwt.core.client.JavaScriptObject;

public class RefWidget extends org.zkoss.gwt.client.zk.Widget{
	protected native JavaScriptObject create() /*-{
		return new $wnd.zk.RefWidget();
	}-*/;

}
