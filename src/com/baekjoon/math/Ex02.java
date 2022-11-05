package com.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {
	// 백준 문제: 2292 [벌집의 위치 구하기]
	// 백준 문제 출처: https://www.acmicpc.net/problem/2292
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); 
		
		int sum = 1;
		int r = 1;
		
		while(n > r) {
			r += 6 * sum;
			sum++;
		}
		System.out.print(sum);
	}
}