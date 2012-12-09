package com.gunbound.shared.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="point")
public class PointDTO implements Serializable{

	private static final long serialVersionUID = -1303473500878135872L;

	@Id
	@Column(name="pointid")
	@GeneratedValue
	private long pointid;
	
	@Column(name="polygonid")
	private long polygonid;
	
	@Column(name="x")
	private int x;
	
	@Column(name="y")
	private int y;
	
	public PointDTO(){}
	
	public PointDTO(long polygonid, int x, int y){
		this.polygonid = polygonid;
		this.x = x;
		this.y = y;
	}

	public long getPointid() {
		return pointid;
	}

	public void setPointid(long pointid) {
		this.pointid = pointid;
	}

	public long getPolygonid() {
		return polygonid;
	}

	public void setPolygonid(long polygonid) {
		this.polygonid = polygonid;
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
