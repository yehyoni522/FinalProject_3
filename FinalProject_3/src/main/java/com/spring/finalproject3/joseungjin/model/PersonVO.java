package com.spring.finalproject3.joseungjin.model;

public class PersonVO {
	private int perno;
	private String name;
	private String gender;
	private String birthday;
	private String email;
	private String address;
	private String mobile;
	private int fk_colno;
	
	public PersonVO() {}
	
	public PersonVO(int perno,String name,String gender,String birthday,String email,String address,String mobile,int fk_colno) {
		this.perno = perno;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.email = email;
		this.address = address;
		this.mobile = mobile;
		this.fk_colno = fk_colno;
	}
	
	public int getPerno() {
		return perno;
	}
	public void setPerno(int perno) {
		this.perno = perno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getFk_colno() {
		return fk_colno;
	}
	public void setFk_colno(int fk_colno) {
		this.fk_colno = fk_colno;
	}
	
	
	
}
