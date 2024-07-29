package com.product.fileIO;

import java.io.Serializable;

public class Student implements Serializable {
	
	private int sid;
	private String studnm;
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", studnm=" + studnm + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String studnm) {
		super();
		this.sid = sid;
		this.studnm = studnm;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getStudnm() {
		return studnm;
	}
	public void setStudnm(String studnm) {
		this.studnm = studnm;
	}
	

}
