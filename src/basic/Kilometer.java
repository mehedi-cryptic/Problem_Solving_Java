package basic;

import java.util.Scanner;

public class Kilometer {

	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter miles:");
		double miles=scan.nextDouble();
		double kilo=miles*1.6;
		System.out.println("kilometer:" +kilo);
	}
	
}
