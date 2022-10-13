package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1093 {
	
	public static void main (String[] args) {

    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	sc.nextLine();
    	
    	int[] num = new int[23];
    	String str = sc.nextLine();
    	String [] arr = str.split(" ");
    	
    	for(int i = 0; i < t; i++) {
    		num[Integer.parseInt(arr[i])-1] += 1;
    	}
    	
    	for (int i = 0; i<num.length; i++) {
    		System.out.print(num[i]+" ");
    	}
    	
	}	// main
}	// end class

