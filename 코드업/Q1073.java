package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1073 {
	
	public static void main (String[] args) {

	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
	    String [] arr = input.split(" ");
	    
	    int i = 0;
	    while(i<arr.length) {
	    	if (Integer.parseInt(arr[i]) !=0) {
	    		System.out.println(arr[i]);
	    		i += 1;
	    		
	    	} else {
	    		break;
	    	}
	    }
	    	
	}	// main
}	// end class

