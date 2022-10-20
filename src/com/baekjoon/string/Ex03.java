package com.baekjoon.string;

import java.util.Scanner;
public class Ex03 {
	// 백준 문제 10809
	// 문제 본문 링크: https://www.acmicpc.net/problem/10809
	public static void main(String[] args) {
//		practice01();
		practice02();
	}
	
	private static void practice01() {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
	    int[] alpha = new int [123];
		
		for(int i= 97; i <= 122; i++) {
			System.out.print(str.indexOf(i) + " ");
		}
	}
		
	private static void practice02() {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		String[] arr = str.split("");
		String[] size = new String[26];
		
		for(int i = 97; i <= 122; i++) {
			String ch = String.valueOf((char)i);
			if(str.contains(ch)) {
				System.out.print(str.indexOf(i) + " ");
			} else {
				System.out.print(str.indexOf(i) + " ");
			}
		}
    }
	
	// String.contains(): 특정 파라미터가 포함되면 true, 포함되지 않으면 false 반환함.
    // String.indexOf(): 특정 매개값(문자열)이 시작되는 인덱스를 반환, 포함되지 않으면 -1을 반환함.
	// String.valueOf(): 기본 타입의 값을 문자열로 변환함.
}