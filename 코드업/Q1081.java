package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1081 {
	
	public static void main (String[] args) {
		
    	Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();
    	String [] arr = str.split(" ");
    	
    	int a = Integer.parseInt(arr[0]);
    	int b = Integer.parseInt(arr[1]);
    	for(int i = 1; i<a+1; i++) {
    		for (int j = 1; j <b+1; j++) {
    			System.out.println(i+" "+j);
    		}
    	}
    	
	}	// main
}	// end class

