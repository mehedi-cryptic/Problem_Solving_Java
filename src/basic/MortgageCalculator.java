package basic;

import java.util.Scanner;

public class MortgageCalculator {

   public static void main(String[] args) {
      // input
      Scanner scan = new Scanner(System.in);
      
      // variables
      double principle = 0.0;
      double rate = 0.0;
      double time = 0.0;
      double payment = 0.0;
      
      // take input values
      System.out.print("Enter Principal Amount: ");
      principle = scan.nextDouble();
      System.out.print("Enter Interest Rate: ");
      rate = scan.nextDouble();
      System.out.print("Enter Time (in years): ");
      time = scan.nextDouble();
      
      // calculate monthly payment
      payment = calculator(principle, rate, time);
      
      // display result
      System.out.println("Monthly Payment = " + payment);
      
      // close scan
      scan.close();

   }
   
   // method for Mortgage calculator
   public static double calculator(double principle, double rate, 
                                                    double time) {
      // convert rate for month format 
      rate = (rate/100)/12;
      
      // convert time in the terms of months
      time = time * 12;
      
      // M = P [{r*(1+r)^n}/{(1+r)^n – 1}]
      double payment = principle * (  (rate * Math.pow(1+rate, time))
                              / (Math.pow(1+rate, time) - 1) ); 
      return payment;
   }

}
