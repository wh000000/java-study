package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1078 {

	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int sum = 0;
	
	if(a>=0 && a<=100 ) {
		for(int i = 0; i<=a; i++) {
			if(i%2 ==0) {
				sum += i;
			}
			
		}
		System.out.println(sum);
	}
	
	}	// main
}	// end class

