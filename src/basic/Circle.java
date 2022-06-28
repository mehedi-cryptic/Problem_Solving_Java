package basic;

import java.util.Scanner;

public class Circle {

	public static void main (String args[]) {
		double radius;
		double area;
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter value of radius:");
		radius=scan.nextDouble();
		
		area=Math.PI*radius*radius;
		
		System.out.println("Area of Circle: " +area);
		scan.close();
		
	}
}
