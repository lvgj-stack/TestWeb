package com.domain;

public class code {
	private String usercode;
	private int isuse;
	public String getUsercode() {
		return usercode;
	}
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}
	public int getIsuse() {
		return isuse;
	}
	public void setIsuse(int isuse) {
		this.isuse = isuse;
	}
	@Override
	public String toString() {
		return "code [usercode=" + usercode + ", isuse=" + isuse + "]";
	}
	
}
