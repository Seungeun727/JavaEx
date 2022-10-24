package com.baekjoon.array;

import java.util.Scanner;

public class Exam09 {
	// 백준 문제 5597 
	// 문제 본문 출처: https://www.acmicpc.net/problem/5597
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] numbers = new int[31];
		
	    for(int i = 1; i <= 28; i++) {
	    	int number = scan.nextInt();
	    	numbers[number] = 1;
	    }
	    
	    for(int j = 1; j < numbers.length; j++) {
	    	if(numbers[j] == 0) {
	    		System.out.println(j);
	    	}
	    }
	}
}