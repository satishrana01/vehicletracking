package com.gid.vehicletracking.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the messagedetails database table.
 * 
 */
@Entity
@Table(name="messagedetails")
@NamedQuery(name="Messagedetail.findAll", query="SELECT m FROM Messagedetail m")
public class Messagedetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datetime;

	private String messageText;

	private int mobileNo;

	public Messagedetail() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDatetime() {
		return this.datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public String getMessageText() {
		return this.messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public int getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

}