package com.gunbound.client.event;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.gunbound.client.Gunbound;
import com.gunbound.client.manager.GamesManager;
import com.gunbound.shared.dto.UserDTO;

public class Ingresar implements ClickHandler, KeyUpHandler{

	private TextBox username;
	private PasswordTextBox password;
	public Ingresar(TextBox username, PasswordTextBox password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public void onClick(ClickEvent event) {
		Gunbound.userService.auth(username.getText(), password.getText(), new AsyncCallback<UserDTO>() {
			@Override
			public void onSuccess(UserDTO result) {
				Gunbound.user = result;
				GamesManager.buildUI();
			}
			
			@Override
			public void onFailure(Throwable caught) {
				Window.alert("Username or password are incorrect!!");
			}
		});
	}

	@Override
	public void onKeyUp(KeyUpEvent event) {
		if(event.getNativeKeyCode() == KeyCodes.KEY_ENTER) onClick(null);
	}

}