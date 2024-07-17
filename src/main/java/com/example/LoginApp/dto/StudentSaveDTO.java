package com.example.LoginApp.dto;


public class StudentSaveDTO {

	private String sName;

	private String address;

	private Integer mobile;

	private boolean active;

	public StudentSaveDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentSaveDTO(String sName, String address, Integer mobile, boolean active) {
		super();
		
		this.sName = sName;
		this.address = address;
		this.mobile = mobile;
		this.active = active;
	}

	

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getMobile() {
		return mobile;
	}

	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	

}
