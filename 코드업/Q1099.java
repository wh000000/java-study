package ÄÚµå¾÷;

import java.util.Scanner;

public class Q1099 {
	
	public static void main (String[] args) {

    	Scanner sc = new Scanner(System.in);
    	int [][] box = new int[10][10];
    	
    	for(int i =0; i<10; i++ ) {
    		
    		String []arr = sc.nextLine().split(" ");
    		for(int j =0; j<box.length; j++) {
    			box[i][j] = Integer.parseInt(arr[j]);
    		}
    	}
    	
    	int block = 1;
    	int space = 0;
    	for(int i = 1; i<box.length; i++) {
    		if(space != 1) {
    			for(int j=block; j<box[i].length; j++) {
    				if(box[i][j]==0) {
    					box[i][j]= 9;
    				} else if(box[i][j]==2) {
    					box[i][j] = 9;
    					space=1;
    					break;
    				}else {
    					block = j-1;
    					break;
    				}
    			}
    		}else {
    			break;
    		}
    	}
    	
    	for(int i =0; i<box.length; i++) {
    		for(int j =0; j<box[i].length; j++) {
    			System.out.print(box[i][j]+" ");
    		}
    		System.out.println();
    	}
	}	// main
}	// end class

