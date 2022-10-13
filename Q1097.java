package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1097 {
	
	public static void main (String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	int [][] arr = new int [19][19];
    	for(int i = 0; i<arr.length; i++) {
    		String str = sc.nextLine();
    		String [] a = str.split(" ");
    		for(int j = 0; j <arr.length; j++) {
    			arr[i][j] = Integer.parseInt(a[j]);
    		}
    	}
    	
    	int a = sc.nextInt();
    	
    	for (int i = 0; i<a; i++) {
    		
    		int x = sc.nextInt();
    		int y = sc.nextInt();
    		
    		for(int j =0; j<arr.length; j++) {
    			if(arr[x-1][j] == 0) {
    				arr[x-1][j] = 1;
    			} else {
    				arr[x-1][j] = 0;
    			}
    			
    			if(arr[j][y-1] == 0) {
    				arr[j][y-1] = 1;
    			} else {
    				arr[j][y-1] = 0;
    			}
    		}
    	}
    	
    	
    	for(int i =0; i<arr.length; i++) {
    		for (int j =0; j<arr.length; j++) {
    			System.out.print(arr[i][j]+ " ");
    		}
    		System.out.println();
    	}
	 
	}	// main
}	// end class

