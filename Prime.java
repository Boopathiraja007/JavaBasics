package JavaBasics;

import java.util.Scanner;

public class Prime {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int flag = 0;
		if(n==0 || n==1) {
			System.out.println(n+" is not a prime Number");
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i == 0) {
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println(n+" is a prime Number");
		}else {
			System.out.println(n+" is not a prime Number");
		}
	}

}
