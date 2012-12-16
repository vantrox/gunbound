package com.gunbound.shared.services;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.gunbound.shared.dto.UserDTO;

@RemoteServiceRelativePath("serv/userService")
public interface UserService extends RemoteService{
	
	UserDTO auth(String username, String password);
	boolean checkUsername(String name);
	String save(String usename, String password);
	
}
