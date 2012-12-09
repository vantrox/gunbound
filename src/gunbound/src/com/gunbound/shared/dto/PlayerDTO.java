package com.gunbound.shared.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="player")
public class PlayerDTO implements Serializable{

	private static final long serialVersionUID = -4522432508788599269L;
	
	@Id
	@Column(name="playerid")
	@GeneratedValue
	private long playerid;
	
	@Column(name="userid")
	private long userid;
	
	@Column(name="gameid")
	private long gameid;
	
	@Column(name="x")
	private int x;
	
	@Column(name="y")
	private int y;
	
	@Column(name="displacement")
	private int displacement;
	
	@Column(name="live")
	private int live;
	
	@Column(name="team")
	private int team;
	
	public PlayerDTO(){}
	
	public PlayerDTO(long userid, long gameid, int x, int y, int displacement, int live, int team){
		this.userid = userid;
		this.gameid = gameid;
		this.x = x;
		this.y = y;
		this.displacement = displacement;
		this.live = live;
		this.team = team;
	}

	public long getPlayerid() {
		return playerid;
	}

	public void setPlayerid(long playerid) {
		this.playerid = playerid;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public long getGameid() {
		return gameid;
	}

	public void setGameid(long gameid) {
		this.gameid = gameid;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	public int getLive() {
		return live;
	}

	public void setLive(int live) {
		this.live = live;
	}

	public int getTeam() {
		return team;
	}

	public void setTeam(int team) {
		this.team = team;
	}
	
}
