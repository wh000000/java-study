package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1089 {
	
	public static void main (String[] args) {
		
    	Scanner sc = new Scanner(System.in);
    	String input = sc.nextLine();
    	String [] arr = input.split(" ");
    	
    	int a = Integer.parseInt(arr[0]);
    	int b = Integer.parseInt(arr[1]);
    	int c = Integer.parseInt(arr[2]);
    	
    	System.out.printf("%d", a+b*(c-1));

	}	// main
}	// end class

