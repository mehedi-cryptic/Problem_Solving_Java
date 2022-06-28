package basic;

import java.util.Scanner;

public class Rectangle {

	public static void main(String args[]) {
		double length;
		double width;
		double area;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter width : ");
		width=scan.nextDouble();
		
		System.out.println("Enter length :");
		length=scan.nextDouble();
		
		area=width*length;
		
		System.out.println("Area of Rectangle : " +area);
		scan.close();
		
		
		
	}
	
	
}
