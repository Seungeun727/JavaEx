package com.baekjoon.array;

import java.util.Scanner;

public class Exam04 {
    // 백준 1546 문제 
	// 문제 본문 링크: https://www.acmicpc.net/problem/1546
	public static void main(String[] args) {
		avgEx01();
	}
	
	public static void avgEx01() {
		Scanner scan = new Scanner(System.in);
		
		int c = scan.nextInt();
		int[] scores = new int[c];
		
		double max = 0;
		double sum = 0;
		
		for(int i = 0; i < c; i++) {
			scores[i] = scan.nextInt();
			
			if(max < scores[i]) {
				max = scores[i];
			}
		}
		
		for(int j = 0; j < scores.length; j++) {
			sum += (scores[j] / max) * 100;
		}
		
		double average = sum / scores.length;
		System.out.print(average);
	}

}
