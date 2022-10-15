package com.baekjoon.array;

import java.util.Scanner;
public class Exam06 {
	// 백준 문제 4534
	// 문제 본문 링크: https://www.acmicpc.net/problem/4344
	// 인덱스를 확인하지 않아서 (ArrayIndexOutOfBounds) 발생했음.
	public static void main(String[] args) {
		avgEx01();
	}
	private static void avgEx01() {
		Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();

		for(int i = 0; i < c; i++) {
			int n = scan.nextInt();
			int[] scores = new int[n];
			int cnt = 0; 
			double sum = 0;
			double avg = 0;
			double percent = 0;
			
			for(int j = 0; j < n; j++) {
				int grade = scan.nextInt();
				scores[j] = grade;
				sum += scores[j];
			}
			
			avg = (double)(sum / scores.length);
			
			for(int k = 0; k < n; k++) {
				if(avg < scores[k]) {
					cnt++;
                } 
			 }
			 percent = (double)(cnt * 100) / scores.length;
			 System.out.println(String.format("%.3f",  percent) + "%");
	    }
	}
}
