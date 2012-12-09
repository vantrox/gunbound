package com.gunbound.shared.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="polygongame")
public class PolygonGameDTO implements Serializable{

	private static final long serialVersionUID = 8711340891978161227L;
	
	@Id
	@GeneratedValue
	@Column(name="polygongameid")
	private long polygongameid;
	
	@Column(name="gameid")
	private long gameid;
	
	public PolygonGameDTO(){}
	
	public PolygonGameDTO(long gameid){
		this.gameid = gameid;
	}

	public long getPolygongameid() {
		return polygongameid;
	}

	public void setPolygongameid(long polygongameid) {
		this.polygongameid = polygongameid;
	}

	public long getGameid() {
		return gameid;
	}

	public void setGameid(long gameid) {
		this.gameid = gameid;
	}

}
