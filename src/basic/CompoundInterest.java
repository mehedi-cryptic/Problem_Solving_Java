/*Compound interest is calculated by multiplying the initial
  principal amount by one plus the annual interest rate raised to the 
  number of compound periods minus one. After that, the total initial amount
   of the loan is then subtracted from the resulting value.
So, to calculate the annual compound interest, multiply the
 original amount of your investment or loan, or principal, by the annual interest rate.
  Add that amount to the principal, then multiply by the interest rate again to get the 
  second year’s compounding interest. */

package basic;

import java.util.Scanner;

public class CompoundInterest {
	public static void main(String args[]) {

		// declare variables

		double principal = 0.0, rate = 0.0, time = 0.0;
		int number = 0;
		double totalamount = 0.0, cinterest = 0.0;

		// create object of scanner class
		Scanner scan = new Scanner(System.in);

		// read inputs
		System.out.println("Enter Principal Amount:");
		principal = scan.nextDouble();

		System.out.print("Enter the annual compound " + "interest rate:: ");
		rate = scan.nextDouble();

		rate = rate/100;
		System.out.print("Enter time (in years):: ");
	       time = scan.nextDouble();
	       System.out.print("Enter the number of times that interest is compounded per year:: ");
	       number = scan.nextInt();

	       // calculate total amount
	       totalamount = principal * 
	                 Math.pow( 1+(rate/number), number*time);

	       // calculate compound interest
	       cinterest = totalamount - principal;

	       // display results
	       System.out.println("Compound interest = "+ cinterest);
	       System.out.println("Total amount = "+ totalamount);

	       // close Scanner class object
	       scan.close();
	   }
	
	}


