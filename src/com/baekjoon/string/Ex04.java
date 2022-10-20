package com.baekjoon.string;

import java.util.Scanner;
import java.io.IOException;
public class Ex04 {
	// 백준 문제 2675
	// 문제 본문 출처: https://www.acmicpc.net/problem/2675
	public static void main(String[] args)  throws IOException {
//		error();
//		practice01();
		practice02();
	}
	// [실패]: 값도 출력되었지만 런타임 에러 (NoSuchElement) 출력되었음.
	private static void error() {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		while(true) {
			int r = scan.nextInt();
			String s = scan.next();
			String[] strArr = s.split("");
			for(int i = 0; i < strArr.length; i++) {
				for(int j = 0; j < r; j++) {
					System.out.print(strArr[i]);
				}
			}
			System.out.print("\n");
		}
	}
	
	// 틀린 이유: while문의 조건식을 지정 안했음. 
	// * 찾아본 결과 '-->'은 (t > 0)과 (t--)참일 때만, 반복 실행한다.
	// * 참고한 출처: https://java119.tistory.com/105
	private static void practice01() {
		Scanner scan = new Scanner(System.in);
				
		int t = scan.nextInt();
		    
			while(t --> 0) {
			int r = scan.nextInt();
			String s = scan.next();
			String[] strArr = s.split("");
			for(int i = 0; i < strArr.length; i++) {
				for(int j = 0; j < r; j++) {
					System.out.print(strArr[i]);
				}
			}
			System.out.print("\n");
		}
	}
	private static void practice02() {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			int r = scan.nextInt();
			String s = scan.next();
			String[] strArr = s.split("");
			for(int j = 0; j < strArr.length; j++) {
				for(int k = 0; k < r; k++) {
					System.out.print(strArr[j]);
				}
			}
			System.out.print("\n");
		}
	}
}
