package com.sweethome.bookingservice.model;

public class JwtResposnse {

private String token;
	
	

	public JwtResposnse() {
		super();
	}

	public JwtResposnse(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
}
