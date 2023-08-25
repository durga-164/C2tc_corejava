/*
 * Todays task
Define a class Commission described as follows:
Data Members: Name, Address, Phone, Sales_amount 
Member methods:
(i) To accept details of the sales employee
(ii) to calculate the commission as follows: Sales_amount >= 100000, commission = 10%; 50000 <= Sales_amount < 100000, commission = 5%; 30000 <= Sales_amount < 50000, commission = 3%; Sales_amount < 30000, no commission.

Write the main method to create an object of a class and call the above member method.
 */

package com.tns.scanner;
import java.util.Scanner;


public class Commission//defining a class called Commission
{
   String Name;
String Address;
   Long Phone;
   int Sales_amount;
   
   public void getinput()
   {
	   Scanner sc= new Scanner(System.in);
	   System.out.println("enter the name of the sales employee");
	   Name=sc.nextLine();
	   System.out.println("enter the address of the sales employee");
	   Address=sc.nextLine();
	   System.out.println("enter the phone number of the sales employee");
	   Phone=sc.nextLong();
	   sc.nextLine();
	   System.out.println("enter the Sales amount");
	   Sales_amount=sc.nextInt();
	   
	   
   }
   public void calcamount()
   {if(Sales_amount >= 100000)
	   {
	   System.out.println("commission= 10%") ; 
	   }
   
   else if( Sales_amount>=50000 && Sales_amount < 100000)
   {
	   System.out.println(" commission = 5%");
   }
   
   else if(  Sales_amount>=30000 && Sales_amount < 50000)
  {
	   System.out.println("commission = 3%");
  }
   else if(  Sales_amount < 30000)
   {
	   System.out.println("no commission");	   
   }
   
   }
   @Override
   public String toString() {
   	return "Commission [Name=" + Name + ", Address=" + Address + ", Phone=" + Phone + ", Sales_amount=" + Sales_amount
   			+ "]";
   }
}
