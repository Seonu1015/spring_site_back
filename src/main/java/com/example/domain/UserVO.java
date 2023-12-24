package com.example.domain;

import java.util.*;

public class UserVO {
	private String email;
	private String password;
	private String photo;
	private Date regdate;

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "UserVO [email=" + email + ", password=" + password + ", photo=" + photo + ", regdate=" + regdate + "]";
	}
}
