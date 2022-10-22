package com.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex06 {
	// 백준 1152 문제 [단어의 개수 구하기]
	// 문제 본문 출처: https://www.acmicpc.net/problem/1152
	public static void main(String[] args) {
//		practice01();
		practice02();
	}
	
	// scanner 이용한 예제 01
	private static void practice01() {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		String[] strArr = s.trim().split(" ");
		if(s.equals("")) {
			System.out.print(0);
		} else {
			System.out.print(strArr.length);
		}
		scan.close();
	}
	
	// BufferedReader 이용한 예제 02
	public static void practice02() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr;
		try {
			strArr = br.readLine().trim().split(" ");
			int result = 0;
			
			for(String str: strArr) {
				if(str.equals("")) {
					result = 0;
				} else {
					result = strArr.length;
				}
			}			
			System.out.print(result);

		} catch (IOException e) {
			e.printStackTrace();
			System.out.print("");
		}
	}
}
