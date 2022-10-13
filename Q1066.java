package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1066 {

    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    String [] arr = input.split(" ");
    
    int a = Integer.parseInt(arr[0]);
    int b = Integer.parseInt(arr[1]);
    int c = Integer.parseInt(arr[2]);
    
    if (a%2 == 0) {
    	System.out.println("even");
    } else {
    	System.out.println("odd");
    }
    
    if (b%2 == 0) {
    	System.out.println("even");
    } else {
    	System.out.println("odd");
    }
    
    if (c%2 == 0) {
    	System.out.println("even");
    } else {
    	System.out.println("odd");
    }
    
	}	// main
}	// end class

