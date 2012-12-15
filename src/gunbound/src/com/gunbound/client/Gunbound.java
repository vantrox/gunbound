package com.gunbound.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.gunbound.client.manager.LoginManager;
import com.gunbound.shared.dto.UserDTO;
import com.gunbound.shared.services.UserService;
import com.gunbound.shared.services.UserServiceAsync;

public class Gunbound implements EntryPoint {
	
	public static final UserServiceAsync userService = GWT.create(UserService.class);
	public static VerticalPanel mainPanel = new VerticalPanel();
	public static UserDTO user;
	
	public void onModuleLoad() {
		mainPanel.setSize("100%", (Window.getClientHeight()-30)+"px");
		//mainPanel.add(new HTML("webo puta"));
		Window.addResizeHandler(new ResizeHandler() {
			@Override
			public void onResize(ResizeEvent event) {
				mainPanel.setSize("100%", (Window.getClientHeight()-30)+"px");
			}
		});
		RootPanel.get("mainContent").add(mainPanel);
		
		LoginManager.buildUI();
	}
}
