package com.gunbound.client.event;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlexTable;
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
		Button guardar = new Button("Ok");
		Button cancelar = new Button("Cancel", new Cerrar(dialog));
	}

}
