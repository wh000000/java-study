package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1065 {
	
	public static void main (String[] args) {

	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
	    String [] arr = input.split(" ");
	    
	    int a = Integer.parseInt(arr[0]);
	    int b = Integer.parseInt(arr[1]);
	    int c = Integer.parseInt(arr[2]);
	    
	    if (a%2 == 0) {
	    	System.out.println(a);
	    }
	    if (b%2 == 0) {
	    	System.out.println(b);
	    }
	    if (c%2 == 0) {
	    	System.out.println(c);
	    }
	    
	}	// main
}	// end class

