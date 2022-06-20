package basic;

import java.util.Scanner;

public class Average {
	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number 01: " );
		int num1=scan.nextInt();
		
		System.out.println("Enter number 02: " );
		int num2=scan.nextInt();
		
		int sum=num1+num2;
		System.out.println("Sum of the two number :" +sum);
		
	    double average=sum/2;
	    System.out.println("Average calculation:" +average);
		
		
	}

}
