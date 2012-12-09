package com.gunbound.shared.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="msgstatus")
public class MsgStatusDTO implements Serializable{

	private static final long serialVersionUID = -3614452073851878788L;

	@Id
	@Column(name="msgstatusid")
	@GeneratedValue
	private long msgstatusid;
	
	@Column(name="userid")
	private long userid;
	
	@Column(name="msguserid")
	private long msguserid;
	
	@Column(name="status", columnDefinition = "TINYINT")
	private int status;
	
	public MsgStatusDTO(){}
	
	public MsgStatusDTO(long userid, long msguserid,int status)
	{
		this.userid=userid;
		this.msguserid=msguserid;
		this.status=status;
	}

	public long getMsgstatusid() {
		return msgstatusid;
	}

	public void setMsgstatusid(long msgstatusid) {
		this.msgstatusid = msgstatusid;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public long getMsguserid() {
		return msguserid;
	}

	public void setMsguserid(long msguserid) {
		this.msguserid = msguserid;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
