package com.jlcindia.beans;

public class Customer {
	private int cid;
	private String cname;
	private String email;
	private long phone;
	private Account account;
	public Customer(){}
	public Customer(int cid, String cname, String email, long phone, Account account) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.account = account;
	}
	public int getCid() {
		return cid;
	}
	public String getCname() {
		return cname;
	}
	public String getEmail() {
		return email;
	}
	public long getPhone() {
		return phone;
	}
	public Account getAccount() {
		return account;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
}
