package com.tns.collection;

public class Genericdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  GenericClass<String>stringobj=new GenericClass<String>();
  stringobj.set("hellooo");
  System.out.println(stringobj.get());
  GenericClass<Integer>intobj=new GenericClass<Integer>();
  intobj.set(10);
  System.out.println(intobj.get());
  
  
	}

}
