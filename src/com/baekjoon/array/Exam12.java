package com.baekjoon.array;

import java.util.Scanner;
public class Exam12 {
	// 백준 문제 2563: 다차원 배열 색종이
	// 문제 본문 출처: https://www.acmicpc.net/problem/2563
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int totalX = 101;
		int totalY = 101;
		int[][] square = new int[totalX][totalY];
		int count = scan.nextInt();
		int sum = 0;
		
		for(int i = 0; i < count; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			for(int j = x; j < x+ 10; j++) {
				for(int k = y; k < y + 10; k++) {
					if(square[j][k] == 0) {
						square[j][k] = 1;
						sum+= 1;
					}
				}
			}
		}
		System.out.print(sum);
	}

}
