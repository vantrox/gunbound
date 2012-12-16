package com.gunbound.shared.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserDTO implements Serializable{

	private static final long serialVersionUID = -7843464196735397129L;
	
	@Id
	@Column(name="userid")
	@GeneratedValue
	private long userid;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="lastaccess")
	private long lastaccess;
	
	@Column(name="connected", columnDefinition="TINYINT")
	private int connected;
	
	public UserDTO(){}
	
	public UserDTO(String username, String password, long lastaccess, int connected){
		this.username = username;
		this.lastaccess = lastaccess;
		this.connected = connected;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getLastaccess() {
		return lastaccess;
	}

	public void setLastaccess(long lastaccess) {
		this.lastaccess = lastaccess;
	}

	public int getConnected() {
		return connected;
	}

	public void setConnected(int connected) {
		this.connected = connected;
	}
	

}
