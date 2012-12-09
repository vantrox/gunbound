package com.gunbound.shared.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="game")
public class GameDTO implements Serializable{

	private static final long serialVersionUID = -7663942169036249839L;
	
	@Id
	@GeneratedValue
	@Column(name="gameid")
	private long gameid;
	
	@Column(name="creatorid")
	private long creatorid;
	
	@Column(name="mapid")
	private long mapaid;
	
	@Column(name="turn")
	private int turn;
	
	@Column(name="status", columnDefinition="TINYINT")
	private int status;
	
	public GameDTO(){}
	
	public GameDTO(long creatorid, long mapid, int turn, int status){
		this.creatorid = creatorid;
		this.mapaid = mapid;
		this.turn = turn;
		this.status = status;
	}

	public long getGameid() {
		return gameid;
	}

	public void setGameid(long gameid) {
		this.gameid = gameid;
	}

	public long getCreatorid() {
		return creatorid;
	}

	public void setCreatorid(long creatorid) {
		this.creatorid = creatorid;
	}

	public long getMapaid() {
		return mapaid;
	}

	public void setMapaid(long mapaid) {
		this.mapaid = mapaid;
	}

	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
}



