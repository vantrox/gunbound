package com.gunbound.shared.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pointgame")
public class PointGameDTO implements Serializable{

	private static final long serialVersionUID = -2098680239714823306L;
	
	@Id
	@Column(name="pointgameid")
	@GeneratedValue
	private long pointgameid;
	
	@Column(name="polygongameid")
	private long polygongameid;
	
	@Column(name="x")
	private int x;
	
	@Column(name="x")
	private int y;
	
	public PointGameDTO(){}
	
	public PointGameDTO(long polygongameid, int x, int y){
		this.polygongameid = polygongameid;
		this.x = x;
		this.y = y;
	}

	public long getPointgameid() {
		return pointgameid;
	}

	public void setPointgameid(long pointgameid) {
		this.pointgameid = pointgameid;
	}

	public long getPolygongameid() {
		return polygongameid;
	}

	public void setPolygongameid(long polygongameid) {
		this.polygongameid = polygongameid;
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
	
}
