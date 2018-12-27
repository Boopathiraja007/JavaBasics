package JavaBasics;

import java.util.Scanner;

public class Factorial{
 public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  int n = scan.nextInt();
		  System.out.println("Factorial of the given number is : "+fact(n));
	}

	private static long fact(int n) {
		long fact = 1;
		for(int i=n;i>0;i--) {
			fact = fact * i;
		}
		return fact;
	}	  
}
 
