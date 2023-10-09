package com.java.lamdaprograms;
import java.util.ArrayList;
public class LamdaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>li=new ArrayList<>();
li.add(10);
li.add(34);
li.add(58);
	//traversing list using for each loop
for(Integer ele:li)
	{System.out.println(ele);
	
	}
//traversing using lamda expression
li.forEach(null);
	}

}
