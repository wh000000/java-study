package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1076 {
	
	public static void main (String[] args) {

	    Scanner s = new Scanner(System.in);
	    char i = s.next().charAt(0);
	    char a = 97;
	    
	    if (i>= 95 && i <= 122) {
	    while (i > 96) {
	    	System.out.print(a+ " ");
	    	i -=1;
	    	a +=1;
	    }
	    }
	 
	}	// main
}	// end class

