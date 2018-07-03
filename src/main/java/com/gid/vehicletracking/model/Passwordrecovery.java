package com.gid.vehicletracking.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the passwordrecovery database table.
 * 
 */
@Entity
@NamedQuery(name="Passwordrecovery.findAll", query="SELECT p FROM Passwordrecovery p")
public class Passwordrecovery implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datetime;

	private BigInteger otp;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="userID")
	private User user;

	public Passwordrecovery() {
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

	public BigInteger getOtp() {
		return this.otp;
	}

	public void setOtp(BigInteger otp) {
		this.otp = otp;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}