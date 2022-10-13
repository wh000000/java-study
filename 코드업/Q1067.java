package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1067 {
	
	public static void main (String[] args) {

	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
	    String [] arr = input.split(" ");
	    
	    int a = Integer.parseInt(arr[0]);
	    
	    
	    if (a != 0) {
	    	
	    	if (a >0) {
	    		System.out.println("plus");
	    	} else {
	    		System.out.println("minus");
	    	}
	    	
	    	if (a%2 == 0) {
	    		System.out.println("even");
	    	} else {
	    		System.out.println("odd");
	    	}
	    
	    }
	 
	}	// main
}	// end class

