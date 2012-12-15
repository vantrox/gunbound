package com.gunbound.client.manager;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasAlignment;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.gunbound.client.Gunbound;
//import com.tresenraya.client.event.Ingresar;
//import com.tresenraya.client.event.MostrarCuadroRegistro;

public class LoginManager {
	
	private LoginManager(){}
	
	public static void buildUI() {
		VerticalPanel panel = Gunbound.mainPanel;
		FlexTable table = new FlexTable();
		FlowPanel flow = new FlowPanel();
		
		TextBox username = new TextBox();
		PasswordTextBox password = new PasswordTextBox();
		//Ingresar ingresar = new Ingresar(username, password);
		//password.addKeyUpHandler(ingresar);
		
		Button login = new Button("Ok");
		Button registrar = new Button("Register");
		
		flow.add(login);
		flow.add(registrar);
		
		HTML titulo = new HTML("<b>Login</b>",true);
		
		table.setWidget(0, 0, titulo);
		table.setWidget(1, 0, new HTML("&nbsp;", true));
		table.setText(2, 0, "Username:");
		table.setText(3, 0, "Password:");
		CheckBox checkBox = new CheckBox("Remember me");
		checkBox.ensureDebugId("checkBoxRemember");
		table.setWidget(2, 1, username);
		table.setWidget(3, 1, password);
		table.setWidget(4, 0, checkBox);
		table.setWidget(5, 0, new HTML("&nbsp;", true));
		table.setWidget(6, 0, flow);

		FlexCellFormatter formatter = table.getFlexCellFormatter();
		formatter.setColSpan(0, 0, 2);
		formatter.setColSpan(6, 0, 2);
		formatter.setHorizontalAlignment(0, 0, HasAlignment.ALIGN_CENTER);
		formatter.setHorizontalAlignment(6, 0, HasAlignment.ALIGN_CENTER);
		DOM.setStyleAttribute(login.getElement(), "margin", "0 25px");
		
		DecoratorPanel dec = new DecoratorPanel();
		dec.setWidget(table);
		panel.setHorizontalAlignment(HasAlignment.ALIGN_CENTER);
		panel.setVerticalAlignment(HasAlignment.ALIGN_MIDDLE);
		panel.add(dec);
		username.setFocus(true);
	}
}
