package com.product.entity;

public class Student {
		
	private int studid;
	private String stunm;
	private double sper;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studid, String stunm, double sper) {
		super();
		this.studid = studid;
		this.stunm = stunm;
		this.sper = sper;
	}

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getStunm() {
		return stunm;
	}

	public void setStunm(String stunm) {
		this.stunm = stunm;
	}

	public double getSper() {
		return sper;
	}

	public void setSper(double sper) {
		this.sper = sper;
	}

	@Override
	public String toString() {
		return "Student [studid=" + studid + ", stunm=" + stunm + ", sper=" + sper + "]";
	}
	
	
	
}
