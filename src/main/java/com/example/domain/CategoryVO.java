package com.example.domain;

import java.util.*;

public class CategoryVO {
	private int categoryId;
	private String user;
	private String categoryName;
	private Date regdate;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Date getRegDate() {
		return regdate;
	}

	public void setRegDate(Date regDate) {
		this.regdate = regDate;
	}

	@Override
	public String toString() {
		return "CategoryVO [categoryId=" + categoryId + ", user=" + user + ", categoryName=" + categoryName
				+ ", regdate=" + regdate + "]";
	}
}
