package com.baekjoon.string;

import java.util.Scanner;

public class Ex08 {
	// 백준 문제 5622 [다이얼]
	// 문제 본문 출처: https://www.acmicpc.net/problem/5622
	// 다른 방식으로 꼭 풀어볼 것.
	public static void main(String[] args) {
		practice01();
	}
	
	private static void practice01() {
		Scanner scan = new Scanner(System.in);
        
		String str = scan.next();
        int sum = 0;
        
        for(int j = 0; j < str.length(); j++) {
            char inputData = str.charAt(j);

			if('A' <= inputData && inputData < 'D') {
				sum += 3;
			} else if('D' <= inputData && inputData < 'G') {
				sum += 4;
			} else if('G' <= inputData && inputData < 'J') {
				sum += 5;
			} else if('J' <= inputData && inputData < 'M') {
				sum += 6;    
			} else if('M' <= inputData && inputData < 'P') {
				sum += 7;
			} else if('P' <= inputData && inputData < 'T') {
				sum += 8;
			} else if('T' <= inputData && inputData < 'W') {
				sum += 9;
			} else if('W' <= inputData && inputData <= 'Z') {
				sum += 10;
			}
		}
        System.out.println(sum);
	}
}