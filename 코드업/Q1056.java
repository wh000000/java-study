package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1056 {
	
	public static void main (String[] args) {

	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
	    String [] arr = input.split(" ");
	    
	    int a = Integer.parseInt(arr[0]);
	    int b = Integer.parseInt(arr[1]);
	    
	    if( a != 1 && a != 0) {
	    	return;
	    }
	    if( b != 1 && b != 0) {
	    	return;
	    }
	    
	    if (a!=b) {
	    	System.out.println("1");
	    } else {
	    	System.out.println("0");
	    }
	 
	}	// main
}	// end class

