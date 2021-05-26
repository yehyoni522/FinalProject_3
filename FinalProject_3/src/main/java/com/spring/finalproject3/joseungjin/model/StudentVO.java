package com.spring.finalproject3.joseungjin.model;

public class StudentVO {
	private int stuno;
	private String pwd;
	private String fk_perno;
	
	private PersonVO perno;
	public StudentVO() {}
	
	public StudentVO(int stuno, String pwd,String fk_perno) {
		this.stuno = stuno;
		this.pwd = pwd;
		this.fk_perno=fk_perno;
	}
	
	public int getStuno() {
		return stuno;
	}
	public void setStuno(int stuno) {
		this.stuno = stuno;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getFk_perno() {
		return fk_perno;
	}
	public void setFk_perno(String fk_perno) {
		this.fk_perno = fk_perno;
	}

	public PersonVO getPerno() {
		return perno;
	}

	public void setPerno(PersonVO perno) {
		this.perno = perno;
	}
	
}
