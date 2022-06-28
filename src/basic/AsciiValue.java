package basic;

import java.util.Scanner;

public class AsciiValue {
	
	public static void main (String args[]) {
		char ch;
		int value;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an Alphabet: ");
		ch=scan.next().charAt(0);
		value=ch;
		System.out.println("ASCII value of "+
                ch+" = "+ (int)ch );
		scan.close();

		
		
	}

}
