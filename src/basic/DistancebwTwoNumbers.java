package basic;

import java.util.Scanner;

public class DistancebwTwoNumbers {

	public static void main(String args[]) {
		
		double distance;
		int x1,x2,y1,y2,x,y;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter first point coordinates: ");
	    x1 = scan.nextInt();
	    y1 = scan.nextInt();
	    System.out.print("Enter second point coordinates: ");
	    x2 = scan.nextInt();
	    y2 = scan.nextInt();
	    
	    x=x2-x1;
	    y=y2-y1;
	    distance=Math.sqrt(x*x+y*y);
	    
		System.out.println("Distance between them: " +distance);
	}
	
	
}
