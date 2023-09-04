package com.tns.inheritance;

public class Citizen {
  public Citizen(String name, long aadhaarno, String address, long phone) {
		super();
		this.name = name;
		this.aadhaarno = aadhaarno;
		this.address = address;
		this.phone = phone;
	}
private String name;
  private long aadhaarno;
  private String address;
  private long phone;
   
  public  Citizen()
  { super();
  
  }

public void setName(String name) {
	this.name = name;
}

public void setAadhaarno(long aadhaarno) {
	this.aadhaarno = aadhaarno;
}

public void setAddress(String address) {
	this.address = address;
}

public void setPhone(long phone) {
	this.phone = phone;
}

public String getName() {
	return name;
}

public long getAadhaarno() {
	return aadhaarno;
}

public String getAddress() {
	return address;
}

public long getPhone() {
	return phone;
}
}
