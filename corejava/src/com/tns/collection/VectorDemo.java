package com.tns.collection;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Vector<String>v=new Vector<String>();
  
 // System.out.println("size of the vector is"+size);
  //adding the elements
  v.add("red");
  v.add("black");
  v.add("blue");
  v.add("pink");

  System.out.println("vector elements"+v);
  int size=v.size();
  System.out.println("size of the vector is"+size);
  int cap=v.capacity();
  System.out.println("default capacity is"+cap);
  v.addElement(null);//null elements are also allowed
  v.add(5,"pink");
  v.add("white");//duplicate elements are also allowed
  
  int newsize=v.size();
  System.out.println("size of the vector is"+newsize);
  System.out.println("vector elements"+v);
  
  //create an arraylist with initial capacity 10
  ArrayList<String>al =new ArrayList<String>();
  al.add("black");
  al.add("red");
  //call addall() to add collection of elements into vector
  v.addAll(al);
  System.out.println("vector elements"+v);
  int ncap=v.capacity();
  System.out.println("default capacity is"+ncap);
  
	}

}
