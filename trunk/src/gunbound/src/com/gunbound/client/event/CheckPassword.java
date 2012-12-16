package com.gunbound.client.event;

import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.PasswordTextBox;

public class CheckPassword implements KeyUpHandler {

	private Image img2;
	private PasswordTextBox password, repassword;
	public CheckPassword(PasswordTextBox password, PasswordTextBox repassword, Image img2) {
		this.img2 = img2;
		this.password = password;
		this.repassword = repassword;
	}

	@Override
	public void onKeyUp(KeyUpEvent event) {
		boolean vale = password.getText().equals(repassword.getText());
		img2.setUrl("/img/"+(vale?3:2)+".png");
		img2.setVisible(true);
	}

}
