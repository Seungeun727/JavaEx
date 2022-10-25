package com.baekjoon.array;

import java.util.Arrays;
import java.util.Scanner;
public class Exam10 {
	// 백준 문제 2738
	// 문제 본문 출처: https://www.acmicpc.net/problem/2738
	public static void main(String[] args) {
//		practice01();
//		arrayEx01();
		arrayEx02();
	}
	
	private static void practice01() {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] a = new int[n][m];
		int[][] b = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				a[i][j] = a[i][j] + scan.nextInt();
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				b[i][j] = b[i][j] + scan.nextInt();
			}
		}
		
		for(int j = 0; j < a.length; j++) {
			for(int k = 0; k < a[j].length; k++) {
				System.out.print(a[j][k] + b[j][k] + " ");
			}
			System.out.println();
		}
		scan.close();
	}
	
	// 2차원 배열의 개념
	private static void arrayEx01() {
		int[][] numbers =  {{ 60, 53, 25}, {32, 75, 40, 50}};
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		// result
		// 1줄: numbers[0]의 값 목록: 60, 53, 25
		// 2줄: numbers[1]의 값 목록: 32, 75, 40, 50
		
		// * 2차원 배열: 행과 열로 구성된 배열(행 * 열) 
		// 배열 총 길이: numbers.length
		// 일차원 배열 길이: numbers[0].length
		// 이차원 배열 길이: numbers[1].length
	}
	
	// 2차원 배열의 인덱스 확인
	private static void arrayEx02() {
		int[][] arr = {{10, 20}, {39, 50, 92, 58, 72}};
				
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j <arr[i].length; j++) {
				System.out.print("["+i+"]["+j+"]" + "=" + arr[i][j] + "\n");
			}
			System.out.println();
		}
		
		// result
		// numbers[0]의 인덱스: [0][0]=10, [0][1]=20
		// numbers[1]의 인덱스: [1][0]=39, [1][1]=50, [1][2]=92, [1][3]=58, [1][4]=72
	}
}
