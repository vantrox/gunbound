package com.gunbound.server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gunbound.server.dao.UserDAO;
import com.gunbound.shared.dto.UserDTO;
import com.gunbound.shared.services.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	public UserDAO userDAO;
	
	@Override
	public UserDTO auth(String username, String password) {
		return userDAO.authenticate(username, password);
	}

}
