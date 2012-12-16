package com.gunbound.client.event;

import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.TextBox;
import com.gunbound.client.Gunbound;

public class CheckUsername implements KeyUpHandler  {

	private Image img1;
	private TextBox username;
	public CheckUsername(Image img1, TextBox username) {
		this.img1 = img1;
		this.username = username;
	}
	
	@Override
	public void onKeyUp(KeyUpEvent event) {
		String name = username.getText();
		
		Gunbound.userService.checkUsername(name, new AsyncCallback<Boolean>() {
			@Override
			public void onFailure(Throwable caught) {
				Window.alert("Error in the communication with the servidor");
			}

			@Override
			public void onSuccess(Boolean vale) {
				img1.setUrl("/img/"+(vale?3:2)+".png");
				img1.setVisible(true);
			}
		});
	}

}
