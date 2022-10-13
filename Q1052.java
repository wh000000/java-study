package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1052 {
	
	public static void main (String[] args) {

	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
	    String [] arr = input.split(" ");
	    
	    int a = Integer.parseInt(arr[0]);
	    int b = Integer.parseInt(arr[1]);
	   
	    if (a!=b) {
	    	System.out.println("1");
	    } else {
	    	System.out.println("0");
	    }
	 
	}	// main
}	// end class

