package com.gunbound.shared.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="msggame")
public class MsgGameDTO implements Serializable{

	private static final long serialVersionUID = 2805427167137227418L;
	
	@Id
	@Column(name="msggameid")
	@GeneratedValue
	private long msggameid;
	
	@Column(name="gameid")
	private long gameid;
	
	@Column(name="text")
	private String text;

	public MsgGameDTO(){}
	
	public MsgGameDTO(long gameid, String text)
	{
		this.gameid=gameid;
	    this.text=text;
	}

	public long getMsggameid() {
		return msggameid;
	}

	public void setMsggameid(long msggameid) {
		this.msggameid = msggameid;
	}

	public long getGameid() {
		return gameid;
	}

	public void setGameid(long gameid) {
		this.gameid = gameid;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
