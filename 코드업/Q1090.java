package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1090 {
	
	public static void main (String[] args) {

    	Scanner sc = new Scanner(System.in);
    	String input = sc.nextLine();
    	String [] arr = input.split(" ");
    	
    	long a = Integer.parseInt(arr[0]);
    	long b = Integer.parseInt(arr[1]);
    	long c = Integer.parseInt(arr[2]);
    	
    	int i = 1;
    	
    	while(i<c) {
    		a *= b;
    		i++;
    	}
    	System.out.println(a);

	}	// main
}	// end class

