package com.myhome.dto;

public class MemberDto {
	private int no;
	private String id;
	private String password;
	private String nickname;
	private String email;
	private String regdate;

	public int getNo() {
		return no;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getNickname() {
		return nickname;
	}

	public String getEmail() {
		return email;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
}
