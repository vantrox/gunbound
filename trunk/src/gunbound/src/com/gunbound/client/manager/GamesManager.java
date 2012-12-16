package com.gunbound.client.manager;

import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasAlignment;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.gunbound.client.Gunbound;

public class GamesManager {
	
	private GamesManager(){}
	
	public static void buildUI() {
		VerticalPanel panel = Gunbound.mainPanel;
		panel.clear();
		FlexTable table = new FlexTable();
		table.addStyleName("login-container");
		table.setWidget(1, 0, new HTML("<b>User loged!!<br>Fuck Yeah!!</b>", true));
		DecoratorPanel dec = new DecoratorPanel();
		dec.setWidget(table);
		panel.setHorizontalAlignment(HasAlignment.ALIGN_CENTER);
		panel.setVerticalAlignment(HasAlignment.ALIGN_MIDDLE);
		panel.add(dec);
	}
}
