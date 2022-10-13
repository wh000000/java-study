package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1087 {
	
	public static void main (String[] args) {

    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int sum = 0;
    	for (int i = 0; i <100000000; i ++) {
    		sum += i;
    		if (sum>=a) {
    			System.out.println(sum);
    			break;
    		}
    	}
	 
	}	// main
}	// end class

