package com.gunbound.shared.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="msguser")
public class MsgUserDTO implements Serializable{
	

	private static final long serialVersionUID = -3365969837115421731L;

@Id
@Column(name="msguserid")
@GeneratedValue
private long msguserid;

@Column(name="userid")
private long userid;

@Column(name="text")
private String text;

public MsgUserDTO(){}

public MsgUserDTO(long userid, String text)
{
	this.userid=userid;
	this.text=text;
}

public long getMsguserid() {
	return msguserid;
}

public void setMsguserid(long msguserid) {
	this.msguserid = msguserid;
}

public long getUserid() {
	return userid;
}

public void setUserid(long userid) {
	this.userid = userid;
}

public String getText() {
	return text;
}

public void setText(String text) {
	this.text = text;
}


}
