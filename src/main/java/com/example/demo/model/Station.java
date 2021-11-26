package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Station {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int stsId;
	private String stsName;
	private String password;
	private String address;
	private boolean isActive;
	private int vecQ;
	private double lon;
	private double lat;
	private int benzinQ;
	private int gasQ;
	private boolean verified;
	@ManyToMany
	private List<User> users;
	@OneToMany(mappedBy="station")
	private List<Service> services;
	@ManyToOne
	private Company company;
	
	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}


	public int getStsId() {
		return stsId;
	}

	public void setStsId(int stsId) {
		this.stsId = stsId;
	}

	public String getStsName() {
		return stsName;
	}

	public void setStsName(String stsName) {
		this.stsName = stsName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getVecQ() {
		return vecQ;
	}

	public void setVecQ(int vecQ) {
		this.vecQ = vecQ;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public int getBenzinQ() {
		return benzinQ;
	}

	public void setBenzinQ(int benzinQ) {
		this.benzinQ = benzinQ;
	}

	public int getGasQ() {
		return gasQ;
	}

	public void setGasQ(int gasQ) {
		this.gasQ = gasQ;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
}
