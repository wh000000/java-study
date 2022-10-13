package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1094 {
	
	public static void main (String[] args) {

    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	sc.nextLine();
    	
    	String str = sc.nextLine();
    	String[] arr = str.split(" ");
    	
    	for(int i = t-1; i >=0; i--) {
    		System.out.print(arr[i]+" ");
    	}
	 
	}	// main
}	// end class

