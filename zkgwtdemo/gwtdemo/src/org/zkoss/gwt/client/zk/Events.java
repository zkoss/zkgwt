/* Events.java

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

/*
import org.zkoss.zk.ui.event.BookmarkEvent;
import org.zkoss.zk.ui.event.CheckEvent;
import org.zkoss.zk.ui.event.ClientInfoEvent;
import org.zkoss.zk.ui.event.CreateEvent;
import org.zkoss.zk.ui.event.DropEvent;
import org.zkoss.zk.ui.event.ErrorEvent;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.FulfillEvent;
import org.zkoss.zk.ui.event.InputEvent;
import org.zkoss.zk.ui.event.KeyEvent;
import org.zkoss.zk.ui.event.MaximizeEvent;
import org.zkoss.zk.ui.event.MinimizeEvent;
import org.zkoss.zk.ui.event.MouseEvent;
import org.zkoss.zk.ui.event.MoveEvent;
import org.zkoss.zk.ui.event.OpenEvent;
import org.zkoss.zk.ui.event.ScrollEvent;
import org.zkoss.zk.ui.event.SelectEvent;
import org.zkoss.zk.ui.event.SelectionEvent;
import org.zkoss.zk.ui.event.SizeEvent;
import org.zkoss.zk.ui.event.URIEvent;
import org.zkoss.zk.ui.event.UploadEvent;
import org.zkoss.zk.ui.event.ZIndexEvent;
*/

/**
 * @author Ian Tsai(Zanyking)
 *
 */
public class Events {
	
	private Events() {} //prevent from creation

	/** The onClick event (used with {@link MouseEvent}).
	 */
	public static final String ON_CLICK = "onClick";
	/** The onRightClick event (used with {@link MouseEvent}).
	 */
	public static final String ON_RIGHT_CLICK = "onRightClick";
	/** The onDoubleClick event (used with {@link MouseEvent}).
	 */
	public static final String ON_DOUBLE_CLICK = "onDoubleClick";
	/** The onOK event (used with {@link KeyEvent}).
	 */
	public static final String ON_OK = "onOK";
	/** The onCancel event (used with {@link KeyEvent}).
	 */
	public static final String ON_CANCEL = "onCancel";
	/** The onCtrlKey event (used with {@link KeyEvent}).
	 */
	public static final String ON_CTRL_KEY = "onCtrlKey";
	/** The onChange event (used with {@link InputEvent}).
	 */
	public static final String ON_CHANGE = "onChange";
	/** The onChanging event (used with {@link InputEvent}).
	 */
	public static final String ON_CHANGING = "onChanging";
	/** The onError event (used with {@link ErrorEvent}).
	 */
	public static final String ON_ERROR = "onError";
	/** The onScroll event (used with {@link ScrollEvent}).
	 */
	public static final String ON_SCROLL = "onScroll";
	/** The onScrolling event (used with {@link ScrollEvent}).
	 */
	public static final String ON_SCROLLING = "onScrolling";
	/** The onSelect event (used with {@link SelectEvent}).
	 */
	public static final String ON_SELECT = "onSelect";
	/** The onSelection event (used with {@link SelectionEvent}).
	 */
	public static final String ON_SELECTION = "onSelection";
	/** The onCheck event (used with {@link CheckEvent}).
	 */
	public static final String ON_CHECK = "onCheck";
	/** The onMove event (used with {@link MoveEvent}).
	 */
	public static final String ON_MOVE = "onMove";
	/** The onSize event (used with {@link SizeEvent}).
	 */
	public static final String ON_SIZE = "onSize";
	/** The onZIndex event (used with {@link ZIndexEvent}).
	 */
	public static final String ON_Z_INDEX = "onZIndex";
	/** The onOpen event (used with {@link OpenEvent}).
	 */
	public static final String ON_OPEN = "onOpen";
	/** The onClose event (used with {@link Event})
	 * used to denote the close button is pressed.
	 */
	public static final String ON_CLOSE = "onClose";
	/** The onRender request.
	 * There is no event associated with this AU request.
	 */
	public static final String ON_RENDER = "onRender";
	/** The onTimer event (used with {@link Event}).
	 * Sent when a timer is up.
	 */
	public static final String ON_TIMER = "onTimer";
	/** The onFocus event (used with {@link Event}).
	 * Sent when a component gets a focus.
	 */
	public static final String ON_FOCUS = "onFocus";
	/** The onBlur event (used with {@link Event}).
	 * Sent when a component loses a focus.
	 */
	public static final String ON_BLUR = "onBlur";
	/** The onDrop event (used with {@link DropEvent}).
	 * Sent when a component is dragged and drop to another.
	 */
	public static final String ON_DROP = "onDrop";
	/** The onNotify event (used with {@link Event}).
	 * It is not used by any component, but it is, rather, designed to
	 * let users add customized events.
	 */
	public static final String ON_NOTIFY = "onNotify";
	/** The onSort event (used with {@link Event})
	 * to notify a request for sorting.
	 */
	public static final String ON_SORT = "onSort";
	/** The onGroup event (used with {@link Event})
	 * to notify a request for grouping.
	 * @since 5.0.0
	 */
	public static final String ON_GROUP = "onGroup";
	/** The onUpload event (used with {@link UploadEvent}.
	 */
	public static final String ON_UPLOAD = "onUpload";
	/** The onBookmarkChange event (used with {@link BookmarkEvent})
	 * to notify that user pressed BACK, FORWARD or specified URL directly
	 * that causes the bookmark is changed (but still in the same desktop).
	 * <p>All root components of all pages of the desktop will
	 * recieve this event.
	 * @since 3.0.8
	 */
	public static final String ON_BOOKMARK_CHANGE = "onBookmarkChange";
	/** The onURIChange event (used with {@link URIEvent})
	 * to notify that the associated URI of a component is changed.
	 * Currently only the iframe component supports this event.
	 * @since 3.5.0
	 */
	public static final String ON_URI_CHANGE = "onURIChange";
	/** The onClientInfo event (used with {@link ClientInfoEvent}).
	 */
	public static final String ON_CLIENT_INFO = "onClientInfo";

	/** The onCreate event (used with {@link CreateEvent}) to notify a compoent
	 * that it (and its children) has been created by ZK's evaluating a ZUML page.
	 */
	public static final String ON_CREATE = "onCreate";
	/** The onModal event (used with {@link Event}) to notify a component
	 * shall become modal. Currently, only ZUL's window components support it.
	 */
	public static final String ON_MODAL = "onModal";
	/** The onPiggyback event (used with {@link Event}) used to notify
	 * a root component that the client has sent a request to the server.
	 * It is meaningful only if it is registered to the root component.
	 * Once registered, it is called
	 * each time the client sends a request to the server.
	 * The onPiggyback's event listener is processed after all other
	 * events are processed.
	 *
	 * <p>The onPiggyback event is designed to let developers piggyback
	 * the least-emergent UI updates to the client.
	 *
	 * @since 2.4.0
	 */
	public static final String ON_PIGGYBACK = "onPiggyback";

	/** The onUser event. It is a generic event that an application developer
	 * might send from the client. ZK doesn't use this event.
	 */
	public static final String ON_USER = "onUser";

	/** The onMinimize event (used with {@link MinimizeEvent}).
	 * @since 3.5.0
	 */
	public static final String ON_MINIMIZE = "onMinimize";

	/** The onMaximize event (used with {@link MaximizeEvent}).
	 * @since 3.5.0
	 */
	public static final String ON_MAXIMIZE = "onMaximize";

	/** The onFulfill event (used with {@link FulfillEvent})
	 * to denote a fulfill condition has been applied.
	 * Developer usually listens to this event to process the
	 * new created children. For example, you might invoke
	 * {@link org.zkoss.zk.ui.Components#wireFellows} to process these new components.
	 * @since 3.0.8
	 */
	public static final String ON_FULFILL = "onFulfill";

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
