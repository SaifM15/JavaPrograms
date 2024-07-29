package com.product.entity;

public class Login {

	private int uid;
	private String password;

	public Login() {
		super();
		
	}

	public Login(int uid, String password) {
		super();
		this.uid = uid;
		this.password = password;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [uid=" + uid + ", password=" + password + "]";
	}

}
