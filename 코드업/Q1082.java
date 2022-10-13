package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1082 {
	
	public static void main (String[] args) {

    	Scanner sc = new Scanner(System.in);
    	String input = sc.nextLine();
    	int a = Integer.parseInt(input,16);
    	
    	for(int i=1; i<=15; i++) {
    		System.out.printf("%X*%X=%X\n",a,i,a*i);
    	}
	 
	}	// main
}	// end class

