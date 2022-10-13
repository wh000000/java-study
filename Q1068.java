package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1068 {
	
	public static void main (String[] args) {

	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
	    String [] arr = input.split(" ");
	    
	    int a = Integer.parseInt(arr[0]);
	    
	    
	    if (a >= 0 && a <=100) {
	    	
	    	if (a>= 90) {
	    		System.out.println("A");
	    	} else if (a>=70) {
	    		System.out.println("B");
	    	} else if (a>=40) {
	    		System.out.println("C");
	    	} else{
	    		System.out.println("D");
	    	} 
	    }
	    
	}	// main
}	// end class

