package com.tns.collection;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<String> l=new ArrayList<String>();
   //l.add(2);
   l.add("hello");
   //  for(Object ob:l)
   //  {
   // 	 String str=(String)ob;
  //  	 System.out.println(str);
    // }
   for(String str:l)
   {System.out.println(str);
	   
   }
     
	}

}
