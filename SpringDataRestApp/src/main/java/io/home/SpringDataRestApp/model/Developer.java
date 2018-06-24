package io.home.SpringDataRestApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Developer {

	@Id
	@GeneratedValue
	private int devId;
	private String devName;
	private String tech;
	
	public Developer() {}
	
	@Override
	public String toString() {
		return "Developer [devId=" + devId + ", devName=" + devName + ", tech=" + tech + "]";
	}
	
	public int getDevId() {
		return devId;
	}
	public void setDevId(int devId) {
		this.devId = devId;
	}
	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
}
