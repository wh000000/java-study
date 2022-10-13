package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1061 {
	
	public static void main (String[] args) {

	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
	    String [] arr = input.split(" ");
	    
	    int a = Integer.parseInt(arr[0]);
	    int b = Integer.parseInt(arr[1]);
	    int c = a | b;
	    System.out.printf("%d",c);
	    
	}	// main
}	// end class

