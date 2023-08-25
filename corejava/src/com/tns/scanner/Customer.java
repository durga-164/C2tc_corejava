package com.tns.scanner;

public class Customer {
  private String customername;
  private int customerid;
  private String customercity;
  //default constructor
  public Customer()
  {
	  System.out.println("default constructor");
	  
  }
  //parameterized
  public Customer(String customername,int customerid,String customercity)
  {
	  this();
	  this.customername=customername;
	  this.customerid=customerid;
	  this.customercity=customercity;
	  
	  
  }
  public String getCustomername()
  {
	  return customername;
  }
@Override
public String toString() {
	return "Customer [customername=" + customername + ", customerid=" + customerid + ", customercity=" + customercity
			+ "]";
}
public void setCustomername(String customername) {
	this.customername = customername;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
public void setCustomercity(String customercity) {
	this.customercity = customercity;
}
public int getCustomerid() {
	return customerid;
}
public String getCustomercity() {
	return customercity;
}
  
}
