package com.baekjoon.array;

import java.util.Arrays;
import java.util.Scanner;

public class Exam08 {
	// 백준 문제 10807
	// 문제 본문 출처: https://www.acmicpc.net/problem/10807
	public static void main(String[] args) {
		practice01();
	}
	private static void practice01() {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			int number = scan.nextInt();
			arr[i] = number;
		}
		int v = scan.nextInt();
		for(int num: arr) {
			if(num == v) {
				cnt++;
			}
		}
		System.out.print(cnt);
	}
}
