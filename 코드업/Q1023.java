package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1023 {
	
	public static void main (String[] args) {
	    
		Scanner sc = new Scanner(System.in);
        
		String str = sc.nextLine() ;
        
		String [] arr = str.split("\\.");
        
		int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        
        System.out.println(a+"\n"+b);
        
	}	// main
}	// end class

