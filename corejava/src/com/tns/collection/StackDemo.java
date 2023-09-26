package com.tns.collection;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Stack<Integer> ob=new Stack<Integer>();
 ob.push(22);
 ob.push(20);
 ob.push(35);
 ob.push(32);
 System.out.println("stack elements are:"+ob);
 ob.pop();
 ob.pop();
 System.out.println("stack elements are:"+ob);
 //peek() is used to print last element of the stack
 System.out.println("last stack elements are:"+ob.peek());
//search the stack
 if(ob.isEmpty()) {
	 System.out.println("stack is empty");}
 else
	 System.out.println("stack is not empty");
 

	 System.out.println(ob.search(20));
	 
}
}