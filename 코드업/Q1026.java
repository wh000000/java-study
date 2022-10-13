package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1026 {
	

	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	char [] arr = str.toCharArray();
	
	for(int i =0; i<str.length(); i ++) {
		System.out.print("["+ arr[i]);
		for(int j = str.length()-1; j>i; j --) {
			System.out.print("0");
		}
		System.out.println("]");
	}
	 
	}	// main
}	// end class

