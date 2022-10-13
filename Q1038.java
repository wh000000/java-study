package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1038 {
	
	public static void main (String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    
	    String [] arr = str.split(" ");
	    
	    long result = Long.parseLong(arr[0]) + Long.parseLong(arr[1]);
	    System.out.println(result);
	    
	}	// main
}	// end class

