package com.baekjoon.loop;

import java.util.Scanner;

public class Exam10 {
	// 백준 10871 문제
	// 문제 본문 링크: https://www.acmicpc.net/problem/10871
	// 꼭 BufferedReader/writer 이용해서 다시 풀어보기 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int x = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			int a = scan.nextInt();
			if(a < x) {
				System.out.print(a + " ");
			}
		}
	}
}