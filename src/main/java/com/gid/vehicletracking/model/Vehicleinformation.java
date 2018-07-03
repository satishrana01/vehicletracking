package com.gid.vehicletracking.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the vehicleinformation database table.
 * 
 */
@Entity
@NamedQuery(name="Vehicleinformation.findAll", query="SELECT v FROM Vehicleinformation v")
public class Vehicleinformation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datetime;

	private BigInteger inKM;

	private BigInteger outKM;

	private String vechicleNo;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;

	public Vehicleinformation() {
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

	public BigInteger getInKM() {
		return this.inKM;
	}

	public void setInKM(BigInteger inKM) {
		this.inKM = inKM;
	}

	public BigInteger getOutKM() {
		return this.outKM;
	}

	public void setOutKM(BigInteger outKM) {
		this.outKM = outKM;
	}

	public String getVechicleNo() {
		return this.vechicleNo;
	}

	public void setVechicleNo(String vechicleNo) {
		this.vechicleNo = vechicleNo;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}