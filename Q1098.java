package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1098 {
	
	public static void main (String[] args) {

    	Scanner sc = new Scanner(System.in);
    
    	int x = sc.nextInt();
    	int y = sc.nextInt();

    	int [][] arr = new int[x][y];
    	
    	for(int i =0; i<x; i++) {
    		for(int j =0; j<y; j++) {
    			arr[i][j] = 0;
    		}
    	}
    	
    	int z = sc.nextInt();
    	sc.nextLine();
    	for (int i=0; i<z; i ++) {
    		String st = sc.nextLine();
    		String [] crr = st.split(" ");
    		
    		int a = Integer.parseInt(crr[0]);
    		int b = Integer.parseInt(crr[1]);
    		int c = Integer.parseInt(crr[2]);
    		int d = Integer.parseInt(crr[3]);
    		
    		arr[c-1][d-1]= 1;
    		for (int e=1; e<a; e ++) {
    		if (b == 0) {
    			arr[c-1][d-1+e] = 1; 
    		} else {
    			arr[c-1+e][d-1] = 1;
    		}
    		
    		}
    	}
    	
    	
    	for(int i = 0; i <x; i ++) {
    		for(int j = 0; j< y; j++) {
    			System.out.print(arr[i][j]+" ");
    		}
    		System.out.println();
    	}
	 
	}	// main
}	// end class

