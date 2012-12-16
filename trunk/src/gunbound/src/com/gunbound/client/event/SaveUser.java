package com.gunbound.client.event;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.gunbound.client.Gunbound;

public class SaveUser implements ClickHandler{

	private TextBox username;
	private PasswordTextBox password, repassword;
	public SaveUser(TextBox username, PasswordTextBox password, PasswordTextBox repassword) {
		this.username = username;
		this.password = password;
		this.repassword = repassword;
	}

	@Override
	public void onClick(ClickEvent event) {
		String name = username.getText();
		String pass1 = password.getText();
		String pass2 = repassword.getText();
		if(pass1.equals(pass2)){
			Gunbound.userService.save(name, pass1, new AsyncCallback<String>() {

				@Override
				public void onFailure(Throwable caught) {
					Window.alert("Error on save user.");
				}

				@Override
				public void onSuccess(String result) {
					if(result == null){
						
					}else Window.alert(result);
				}
			});
		}else{
			Window.alert("Your passwords does not match.");
		}
	}

}
