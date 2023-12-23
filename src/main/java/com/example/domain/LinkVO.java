package com.example.domain;

import java.util.Date;

public class LinkVO {
	private int linkId;
	private int categoryId;
	private String user;
	private String linkName;
	private String link;
	private Date regdate;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public int getLinkId() {
		return linkId;
	}

	public void setLinkId(int linkId) {
		this.linkId = linkId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getLinkName() {
		return linkName;
	}

	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return "LinkVO [linkId=" + linkId + ", categoryId=" + categoryId + ", user=" + user + ", linkName=" + linkName
				+ ", link=" + link + ", regdate=" + regdate + "]";
	}
}
