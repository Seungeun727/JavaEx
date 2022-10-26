package com.baekjoon.array;

import java.util.Scanner;

public class Exam11 {
	// 백준 문제 2566
	// 문제 본문 출처: https://www.acmicpc.net/problem/2566
	public static void main(String[] args) {
//		practice01();
		practice02();
	}
	
	private static void practice01() {
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
		
		int max = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int j = 0; j < arr.length; j++) {
			for(int k = 0; k < arr[j].length; k++) {
				if(max < arr[j][k]) {
					max = arr[j][k];
					firstIndex = j;
					secondIndex = k;
				}
			}
		}
		int r1 = firstIndex + 1;
		int r2 = secondIndex + 1;
		
		System.out.println(max);
		System.out.println(r1 + " " + r2);
	}
	
	private static void practice02() {
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
		
		int max = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				arr[i][j] = scan.nextInt();
				
				if(max < arr[i][j]) {
					max = arr[i][j];
					firstIndex = i;
					secondIndex = j;
				}
			}
		}
		
		int r1 = firstIndex + 1;
		int r2 = secondIndex + 1;
		System.out.println(max);
		System.out.println(r1 + " " + r2);
		
	}
}
