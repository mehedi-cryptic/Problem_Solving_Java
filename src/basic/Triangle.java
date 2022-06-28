package basic;

import java.util.Scanner;

public class Triangle {
	public static void main(String args[]) {
		double base;
		double height;
		double area;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter height : ");
		height=scan.nextDouble();
		
		System.out.println("Enter base :");
		base=scan.nextDouble();
		
		area=0.5*base*height;
		
		System.out.println("Area of Triangle : " +area);
		scan.close();
	
	
	}
}
