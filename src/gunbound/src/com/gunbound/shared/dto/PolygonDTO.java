package com.gunbound.shared.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="polygon")
public class PolygonDTO implements Serializable{

	private static final long serialVersionUID = 3684090968811110194L;
	
	@Id
	@Column(name="polygonid")
	@GeneratedValue
	private long polygonid;
	
	@Column(name="mapaid")
	private long mapaid;
	
	public PolygonDTO(){}
	
	public PolygonDTO(long mapaid){
		this.mapaid = mapaid;
	}

	public long getPolygonid() {
		return polygonid;
	}

	public void setPolygonid(long polygonid) {
		this.polygonid = polygonid;
	}

	public long getMapaid() {
		return mapaid;
	}

	public void setMapaid(long mapaid) {
		this.mapaid = mapaid;
	}

}
