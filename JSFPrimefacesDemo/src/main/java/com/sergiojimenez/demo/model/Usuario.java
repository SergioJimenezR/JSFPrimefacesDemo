package com.sergiojimenez.demo.model;

public class Usuario {

	private String username;
	private String hashPassword;

	public Usuario() {

	}

	public Usuario(String username, String hashPassword) {
		this.username = username;
		this.hashPassword = hashPassword;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getHashPassword() {
		return hashPassword;
	}

	public void setHashPassword(String hashPassword) {
		this.hashPassword = hashPassword;
	}

}
