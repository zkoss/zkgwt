package org.zkoss.gwt.client.testzk;

import org.zkoss.gwt.client.zul.wgt.Label;

public class LabelTest {

	public static Label getInstance() {

		Label label = new Label();
		label.setValue("my first label in zk gwt aaaddd");		
		System.out.println(label.getValue());
		return label;
	}
}
