package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1045 {
	
	public static void main (String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
	    
	    String [] arr = input.split(" ");
	    
	    long a = Long.parseLong(arr[0]);
	    long b = Long.parseLong(arr[1]);
	    
	    System.out.println(a+b);
	    System.out.println(a-b);
	    System.out.println(a*b);
	    System.out.println(a/b);
	    System.out.println(a%b);
	    System.out.printf("%.2f",(float)a/b);
	    
	}	// main
}	// end class

