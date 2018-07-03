package com.gid.vehicletracking.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datetime;

	private String password;

	private String role;

	private int status;

	private String userId;

	//bi-directional many-to-one association to Passwordrecovery
	@OneToMany(mappedBy="user")
	private List<Passwordrecovery> passwordrecoveries;

	//bi-directional many-to-one association to Userprofile
	@OneToMany(mappedBy="user")
	private List<Userprofile> userprofiles;

	//bi-directional many-to-one association to Vehicleinformation
	@OneToMany(mappedBy="user")
	private List<Vehicleinformation> vehicleinformations;

	public User() {
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<Passwordrecovery> getPasswordrecoveries() {
		return this.passwordrecoveries;
	}

	public void setPasswordrecoveries(List<Passwordrecovery> passwordrecoveries) {
		this.passwordrecoveries = passwordrecoveries;
	}

	public Passwordrecovery addPasswordrecovery(Passwordrecovery passwordrecovery) {
		getPasswordrecoveries().add(passwordrecovery);
		passwordrecovery.setUser(this);

		return passwordrecovery;
	}

	public Passwordrecovery removePasswordrecovery(Passwordrecovery passwordrecovery) {
		getPasswordrecoveries().remove(passwordrecovery);
		passwordrecovery.setUser(null);

		return passwordrecovery;
	}

	public List<Userprofile> getUserprofiles() {
		return this.userprofiles;
	}

	public void setUserprofiles(List<Userprofile> userprofiles) {
		this.userprofiles = userprofiles;
	}

	public Userprofile addUserprofile(Userprofile userprofile) {
		getUserprofiles().add(userprofile);
		userprofile.setUser(this);

		return userprofile;
	}

	public Userprofile removeUserprofile(Userprofile userprofile) {
		getUserprofiles().remove(userprofile);
		userprofile.setUser(null);

		return userprofile;
	}

	public List<Vehicleinformation> getVehicleinformations() {
		return this.vehicleinformations;
	}

	public void setVehicleinformations(List<Vehicleinformation> vehicleinformations) {
		this.vehicleinformations = vehicleinformations;
	}

	public Vehicleinformation addVehicleinformation(Vehicleinformation vehicleinformation) {
		getVehicleinformations().add(vehicleinformation);
		vehicleinformation.setUser(this);

		return vehicleinformation;
	}

	public Vehicleinformation removeVehicleinformation(Vehicleinformation vehicleinformation) {
		getVehicleinformations().remove(vehicleinformation);
		vehicleinformation.setUser(null);

		return vehicleinformation;
	}

}