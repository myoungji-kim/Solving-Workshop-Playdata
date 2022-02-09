package com.dto;

public class MemberDTO {
	String userid;
	String passwd;
	String username;
	String address;
	String email;
	
	MemberDTO(){}
	
	MemberDTO(String userid, String passwd, String username, String address, String email){
		this.userid = userid;
		this.passwd = passwd;
		this.username = username;
		this.address = address;
		this.email = email;
	}

	public MemberDTO(String userid, String passwd) {
		this.userid = userid;
		this.passwd = passwd;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "MemberDTO [userid=" + userid + ", passwd=" + passwd + ", username=" + username + ", address=" + address
				+ ", email=" + email + "]";
	}
}
