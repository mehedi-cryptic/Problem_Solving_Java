package basic;

import java.util.Scanner;

public class SimpleInterest {
	
	public static void main (String args[]) {
		
		double principle_amount;
		double rate;
		double time;
		double interest;
		Scanner scan =new Scanner(System.in);
		
		System.out.println(" Enter principle ammount: ");
		principle_amount=scan.nextDouble();
		System.out.println("Enter rate per year:");
		rate=scan.nextDouble();
		System.out.println("Enter time per month: ");
		time=scan.nextDouble();
		
		interest=rate*time*principle_amount/100;
		System.out.println("Simple Interest: " +interest);
		System.out.println("Total amount to pay : " +(principle_amount+interest));
		
	}
	

}
