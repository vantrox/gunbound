package com.gunbound.client.event;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.DialogBox;

public class Cerrar implements ClickHandler{

	private DialogBox dialog;
	public Cerrar(DialogBox dialog) {
		this.dialog = dialog;
	}

	@Override
	public void onClick(ClickEvent event) {
		dialog.hide();
	}

}
