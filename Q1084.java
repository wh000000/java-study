package ÄÚµå¾÷;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Q1084 {
	
	public static void main (String[] args) throws IOException {

    	Scanner sc = new Scanner(System.in);
    	String input = sc.nextLine();
    	String [] arr = input.split(" ");
    	
    	int a = Integer.parseInt(arr[0]);
    	int b = Integer.parseInt(arr[1]);
    	int c = Integer.parseInt(arr[2]);
    	int sum = 0;
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	for (int i = 0; i <a; i++) {
    		for (int j = 0; j <b; j++) {
    			for (int k = 0; k <c; k++) {
    				String result = i + " " + j + " " + k;
    				bw.write(result);
    				bw.newLine();
    				sum ++;
    			}
    		}
    	}
    	bw.write(Integer.toString(sum));
    	bw.flush();
    	bw.close();

    }	// main
}	// end class

