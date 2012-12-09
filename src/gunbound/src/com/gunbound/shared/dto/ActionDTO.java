package com.gunbound.shared.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="action")
public class ActionDTO implements Serializable{

	private static final long serialVersionUID = 5533209505998310905L;

	@Id
	@Column(name="actionid")
	@GeneratedValue
	private long actionid;
	
	@Column(name="playerid")
	private long playerid;
	
	@Column(name="gameid")
	private long gameid;
	
	@Column(name="angle")
	private double angle;
	
	@Column(name="powershot")
	private int powershot;
	
	@Column(name="posx")
	private int posx;
	
	@Column(name="posy")
	private int posy;
	
	public ActionDTO(){}
	
	public ActionDTO(long playerid, long gameid, double angle, int powershot, int posx, int posy)
	{
		this.playerid=playerid;
		this.gameid=gameid;
		this.angle=angle;
		this.powershot=powershot;
		this.posx=posx;
		this.posy=posy;
	}

	public long getActionid() {
		return actionid;
	}

	public void setActionid(long actionid) {
		this.actionid = actionid;
	}

	public long getPlayerid() {
		return playerid;
	}

	public void setPlayerid(long playerid) {
		this.playerid = playerid;
	}

	public long getGameid() {
		return gameid;
	}

	public void setGameid(long gameid) {
		this.gameid = gameid;
	}

	public double getAngle() {
		return angle;
	}

	public void setAngle(double angle) {
		this.angle = angle;
	}

	public int getPowershot() {
		return powershot;
	}

	public void setPowershot(int powershot) {
		this.powershot = powershot;
	}

	public int getPosx() {
		return posx;
	}

	public void setPosx(int posx) {
		this.posx = posx;
	}

	public int getPosy() {
		return posy;
	}

	public void setPosy(int posy) {
		this.posy = posy;
	}
}
