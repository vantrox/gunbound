package com.gunbound.shared.services;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.gunbound.shared.dto.UserDTO;

public interface UserServiceAsync {
	void auth(String username, String password, AsyncCallback<UserDTO> callback);
}
