package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1071 {
	
	public static void main (String[] args) {

	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
	    String [] arr = input.split(" ");
	    
	    for (int i = 0; i<arr.length; i++) {
	    	if(Integer.parseInt(arr[i]) != 0) {
	    		System.out.println(Integer.parseInt(arr[i]));
	    	} else {
	    		return;
	    	}
	    }
	    
	}	// main
}	// end class

