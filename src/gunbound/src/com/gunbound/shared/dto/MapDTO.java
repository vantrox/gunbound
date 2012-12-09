package com.gunbound.shared.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="map")
public class MapDTO implements Serializable{

	private static final long serialVersionUID = -2724314097193976353L;
	
	@Id
	@Column(name="mapid")
	@GeneratedValue
	private long mapid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="width")
	private int width;
	
	@Column(name="height")
	private int height;
	
	public MapDTO(){}
	
	public MapDTO(String name, int width, int height){
		this.name = name;
		this.width = width;
		this.height = height;
	}

	public long getMapid() {
		return mapid;
	}

	public void setMapid(long mapid) {
		this.mapid = mapid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
}
