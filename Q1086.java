package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1086 {
	
	public static void main (String[] args) {
		
    	Scanner sc = new Scanner(System.in);
    	String input = sc.nextLine();
    	String [] arr = input.split(" ");
    	
    	float h = Integer.parseInt(arr[0]);
    	float b = Integer.parseInt(arr[1]);
    	float c = Integer.parseInt(arr[2]);
    	
    	float a = (h*b*c)/8/1024/1024;
    	
    	System.out.printf("%.2f MB", a );
	 
	}	// main
}	// end class

