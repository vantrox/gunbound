package com.gunbound.server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gunbound.server.GunboundContants;
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

	@Override
	public boolean checkUsername(String name) {
		return userDAO.findByUsername(name) == null;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	public String save(String username, String password) {
		System.out.println(123);
		String res = null;
		try{
			UserDTO user = new UserDTO(username, password, System.currentTimeMillis(), GunboundContants.NO);
			userDAO.persist(user);
		}catch(Exception e){
			res = e.getMessage();
		}
		return res;
	}

}
