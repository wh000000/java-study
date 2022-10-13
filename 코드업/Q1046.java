package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1046 {
	
	public static void main (String[] args) {

	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
	    
	    String [] arr = input.split(" ");
	    
	    long a = Long.parseLong(arr[0]);
	    long b = Long.parseLong(arr[1]);
	    long c = Long.parseLong(arr[2]);
	    
	    System.out.println(a+b+c);
	    System.out.printf("%.1f",(float)(a+b+c)/3);
	    
	}	// main
}	// end class

