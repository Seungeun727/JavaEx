package com.baekjoon.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;
import java.util.Scanner;
public class Ex07 {
	// 백준 문제 2908 [문자열 상수 비교 큰 수 출력]
	// 문제 본문 출처: https://www.acmicpc.net/problem/2908
	public static void main(String[] args) {
//		practice01();
		practice02();
	}
	
	// 01: 실행 시간도 크고, 반복되는 부분이 크므로 다른 방법 찾아볼 것.
	private static void practice01() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] str = br.readLine().trim().split(" ");
			String a = str[0];
			String b = str[1];
			int index = 0;
			int cnt = 0;
			
			char[] arr = new char[3];
			char[] arr2 = new char[3];
			
			for(int i = 2; i < a.length(); i--) {
				if(i >= 0) {
					arr[index] = a.charAt(i); 
					index++;
				}
			}
			
			for(int i = 2; i < b.length(); i--) {
				if(i >= 0) {
					arr2[cnt] = b.charAt(i); 
					cnt++;
				}
			}
			
			String r1 = String.valueOf(arr);
			String r2 = String.valueOf(arr2);
			if(Integer.parseInt(r1) < Integer.parseInt(r2)) {
				System.out.print(r2);
			} else {
				System.out.print(r1);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	// 02: 01의 실행시간은 2000ms, 02의 실행 시간: 204ms
	private static void practice02() {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		StringBuffer sb = new StringBuffer(str);
		String str2 = sb.reverse().toString();
		String[] arr = str2.trim().split(" ");
		
		if(Integer.parseInt(arr[0]) < Integer.parseInt(arr[1])) {
			System.out.print(Integer.parseInt(arr[1]));
		} else {
			System.out.print(Integer.parseInt(arr[0]));
		}
	}
}