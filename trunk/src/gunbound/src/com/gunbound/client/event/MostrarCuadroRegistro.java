package com.gunbound.client.event;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasAlignment;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;

public class MostrarCuadroRegistro implements ClickHandler {
	
	@Override
	public void onClick(ClickEvent event) {
		final DialogBox dialog = new DialogBox();
		dialog.setText("Register new user");
		FlexTable table = new FlexTable();
		FlexCellFormatter formatter = table.getFlexCellFormatter();
		TextBox username = new TextBox();
		PasswordTextBox password = new PasswordTextBox();
		PasswordTextBox repassword = new PasswordTextBox();
		Button ok = new Button("Ok");
		Button cancel = new Button("Cancel", new Cerrar(dialog));
		Image img1 = create("Name already used!");
		Image img2 = create("Your passwords does not match.");
		
		FlowPanel flow = new FlowPanel();
		flow.addStyleName("dialogButtons");
		flow.add(ok);
		flow.add(cancel);
		
		table.setText(0, 0, "Username:");
		table.setWidget(0, 1, username);
		table.setWidget(0, 2, img1);
		table.setText(1, 0, "Password:");
		table.setWidget(1, 1, password);
		table.setWidget(1, 2, img2);
		table.setWidget(2, 0, new HTML("Repeat<br> Password:",true));
		table.setWidget(2, 1, repassword);
		table.setWidget(3, 0, flow);
		
		formatter.setColSpan(3, 0, 2);
		formatter.setHorizontalAlignment(3, 0, HasAlignment.ALIGN_CENTER);
		DOM.setStyleAttribute(ok.getElement(), "margin", "0 25px");
		
		dialog.setWidget(table);
		dialog.setGlassEnabled(true);
		dialog.setAnimationEnabled(true);
		dialog.show();
		dialog.center();
		username.setFocus(true);
	}
	
	private static Image create(final String msg){
		final Image i = new Image("/img/3.png");
		i.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				if(i.getUrl().toString().endsWith("2.png"))
					Window.alert(msg);
			}
		});
		i.setVisible(false);
		return i;
	}

}
