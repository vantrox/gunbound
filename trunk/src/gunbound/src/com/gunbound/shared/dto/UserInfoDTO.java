package com.gunbound.shared.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userinfo")
public class UserInfoDTO implements Serializable{

	private static final long serialVersionUID = -4060597956631410099L;
	
	@Id
	@Column(name="userinfoid")
	@GeneratedValue
	private long userinfoid;
	
	@Id
	@Column (name="userid")
	private long userid;
	
	@Column (name="won")
	private int won;
	
	@Column (name="lost")
	private int lost;
	
	@Column (name="draw")
	private int draw;
	
	public UserInfoDTO(){}
	
	public UserInfoDTO(long userid, int won, int lost, int draw){
		
		this.userid = userid;
		this.won = won;
		this.lost = lost;
		this.draw = draw;
	}

	public long getUserinfoid() {
		return userinfoid;
	}

	public void setUserinfoid(long userinfoid) {
		this.userinfoid = userinfoid;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public int getWon() {
		return won;
	}

	public void setWon(int won) {
		this.won = won;
	}

	public int getLost() {
		return lost;
	}

	public void setLost(int lost) {
		this.lost = lost;
	}

	public int getDraw() {
		return draw;
	}

	public void setDraw(int draw) {
		this.draw = draw;
	}
}
