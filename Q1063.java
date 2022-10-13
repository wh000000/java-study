package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1063 {
	
	public static void main (String[] args) {

	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
	    String [] arr = input.split(" ");
	    
	    int a = Integer.parseInt(arr[0]);
	    int b = Integer.parseInt(arr[1]);
	    
	    System.out.printf("%d", a>b ? a:b);
	    
	}	// main
}	// end class

