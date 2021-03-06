package com.encore.spring.domain;

public class Member {
	private String id;
	private String pwd;
	private String name;
	private String addr;
	
	public Member() {}
	public Member(String id, String pwd, String name, String addr) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.addr = addr;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddress(String address) {
		this.addr = address;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + ", addr=" + addr + "]";
	}
}
