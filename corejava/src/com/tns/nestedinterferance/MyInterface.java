package com.tns.nestedinterferance;

public interface MyInterface {
  void calc();
  interface MyInnerInterface
  {
	  int id=20;
	  void print();
  }
}
