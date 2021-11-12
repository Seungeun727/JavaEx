package com.practice02;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int []userNum = new int[5];
		int total =0;
		double avr=0.0;
		
		for(int i = 0; i < userNum.length; i++) {
	    	userNum[i] = scanner.nextInt();
	    	total += userNum[i];
	    	
		}
		  avr= (double)total / userNum.length;
		//System.out.println("평균은=" +(double)sum/cnt);
		  System.out.printf("평균:%f%n", avr);
	}
	
}
	/*	
		/*int[] userNum = new int[5];
		int toatl = 0;
		double avr= 0.0;
		
		System.out.print("");
	    for(int i = 0; i < userNum.length; i++) {
	    	userNum[i] = scanner.nextInt();
	    	total += userNum[i];
	    }
	    
	     avr= (double)total / userNum.length;
	     System.out.printf("평균:%f%n", avr);
	     */
		
