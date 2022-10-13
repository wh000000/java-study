package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1019 {
	
	public static void main (String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		String date = sc.nextLine();
		
		String [] str = date.split("\\.");
		
		int [] arr = new int [str.length];
		
		for (int i = 0; i < str.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		System.out.printf("%04d.%02d.%02d",arr[0], arr[1],arr[2]);
	 
	}	// main
}	// end class

