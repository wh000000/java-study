package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1079 {
	
	public static void main (String[] args) {

    	Scanner s = new Scanner(System.in);
    	String input = s.nextLine();
    	String [] arr = input.split(" " );
    	
    	for(int i = 0; i<arr.length; i++) {
    		if(arr[i].equals("q")) {
    			System.out.println(arr[i]);
    			break;
    		}
    		System.out.println(arr[i]);
    	}
    	
	}	// main
}	// end class

