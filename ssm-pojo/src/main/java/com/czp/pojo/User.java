package com.czp.pojo;

import java.io.Serializable;

public class User implements Serializable {
	private Integer userid;

	private String username;

	private String upwd;

	private Long utype;

	private String utel;

	private String uemail;

	private String uaddress;

	private String urealname;

//	private Long ucent;

//	private String usex;

//	private String upic;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd == null ? null : upwd.trim();
	}

	public Long getUtype() {
		return utype;
	}

	public void setUtype(Long utype) {
		this.utype = utype;
	}

	public String getUtel() {
		return utel;
	}

	public void setUtel(String utel) {
		this.utel = utel == null ? null : utel.trim();
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail == null ? null : uemail.trim();
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress == null ? null : uaddress.trim();
	}

	public String getUrealname() {
		return urealname;
	}

	public void setUrealname(String urealname) {
		this.urealname = urealname == null ? null : urealname.trim();
	}

//	public Long getUcent() {
//		return ucent;
//	}
//
//	public void setUcent(Long ucent) {
//		this.ucent = ucent;
//	}
//
//	public String getUsex() {
//		return usex;
//	}
//
//	public void setUsex(String usex) {
//		this.usex = usex == null ? null : usex.trim();
//	}
//
//	public String getUpic() {
//		return upic;
//	}
//
//	public void setUpic(String upic) {
//		this.upic = upic == null ? null : upic.trim();
//	}

//	@Override
//	public String toString() {
//		return "FoodUser [userid=" + userid + ", username=" + username + ", upwd=" + upwd + ", utype=" + utype
//				+ ", utel=" + utel + ", uemail=" + uemail + ", uaddress=" + uaddress + ", urealname=" + urealname
//				+ ", ucent=" + ucent + ", usex=" + usex + ", upic=" + upic + "]";
//	}

}