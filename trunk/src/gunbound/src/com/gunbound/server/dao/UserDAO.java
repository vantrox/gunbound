package com.gunbound.server.dao;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gunbound.shared.dto.UserDTO;

@SuppressWarnings("deprecation")
@Repository
public class UserDAO extends JpaDAO<Long, UserDTO>{
	@Autowired
	EntityManagerFactory entityManagerFactory;
	
	@PostConstruct
	public void init(){
		super.setEntityManagerFactory(entityManagerFactory);
	}
	
	public UserDTO findByUsername(final String username){
		return findEntity(getName()+" h WHERE h.username = ?1", username);
	}
	public UserDTO authenticate(final String username, final String password){
		return findEntity(getName()+" h WHERE h.username = ?1 AND h.password = ?2", username, password);
	}
}
