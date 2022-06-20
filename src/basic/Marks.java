package basic;

import java.util.Scanner;

public class Marks {
	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter marks for subject 01: " );
		int sub1=scan.nextInt();
		
		System.out.println("Enter Marks for subject 02: " );
		int sub2=scan.nextInt();
		
		System.out.println("Enter Marks for subject 03: " );
		int sub3=scan.nextInt();
		
		int total_marks=sub1+sub2+sub3;
		System.out.println("Total marks of 3 subjects :" +total_marks);
		
	    double average=total_marks/3;
	    System.out.println("Average marks:" +average);
		
		
	}

}