package com.gunbound.shared.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "msggamestatus")
public class MsgGameStatusDTO implements Serializable{

	private static final long serialVersionUID = 4428342453055595171L;

	@Id
	@Column(name="msggamestatusid")
	@GeneratedValue
	private long msggamestatusid;
	
	@Column(name ="msggameid")
	private long msggameid; 
	
	@Column(name="userid")
	private long userid;
	
	@Column(name="status",columnDefinition = "TINYINT")
	private int status;
	
	public MsgGameStatusDTO(){}
	
	public MsgGameStatusDTO(long msggameid,long userid,int status){
		this.msggameid=msggameid;
		this.userid=userid;
		this.status=status;
	}

	public long getMsggamestatusid() {
		return msggamestatusid;
	}

	public void setMsggamestatusid(long msggamestatusid) {
		this.msggamestatusid = msggamestatusid;
	}

	public long getMsggameid() {
		return msggameid;
	}

	public void setMsggameid(long msggameid) {
		this.msggameid = msggameid;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
