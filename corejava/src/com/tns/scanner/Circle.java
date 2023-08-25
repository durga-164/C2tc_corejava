
//task 2

/*Define a class Circle with the following data members: (i) Radius (ii) Colour
Create these member methods for this class: (i) getInput() that accepts the details of the circle  (ii) calcArea that calculates the area of the circle using the radius and displays the same.
*/
package com.tns.scanner;
import java.util.Scanner;


	public class Circle //defining a class circle
	{
	    private double radius;
	    private String colour;

	    public void getInput() {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the radius of the circle: ");//getting inputs about the circle details
	        radius = scanner.nextDouble();
	        
	        System.out.print("Enter the color of the circle: ");
	        colour = scanner.next();
	        
	        scanner.close();
	    }

	    public void calcArea() {
	        double area = Math.PI * radius * radius;//calculating the area of circle
	        System.out.println("Area of the circle: " + area);
	        System.out.println("Colour of the circle: " + colour);
	    }
	    
	}

	

