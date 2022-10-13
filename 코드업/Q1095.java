package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1095 {
	
	public static void main (String[] args) {

    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	sc.nextLine();
    	
    	String str = sc.nextLine();
    	String[] arr = str.split(" ");
    	int min = 24;
    	
    	for(int i = 0 ; i<t; i++) {
    		
    			if(Integer.parseInt(arr[i])<min) {
    				min= Integer.parseInt(arr[i]);
    			} 
    		}
    	System.out.println(min);
	 
	}	// main
}	// end class

