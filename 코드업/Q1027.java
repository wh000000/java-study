package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1027 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    
	    String [] arr = str.split("\\.");
	    
	    int yyyy = Integer.parseInt(arr[0]);
	    int mm = Integer.parseInt(arr[1]);
	    int dd = Integer.parseInt(arr[2]);
	    
	    System.out.printf("%02d-%02d-%04d",dd,mm,yyyy);
	 
	}	// main
}	// end class

