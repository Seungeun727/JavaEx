package com.baekjoon.array;

import java.util.Scanner;
public class Exam05 {
    // 백준 문제 8958
	// 문제 본문 링크: https://www.acmicpc.net/problem/8958
	public static void main(String[] args) {
		quizEx01();	
	}
	
	public static void quizEx01() {
		Scanner scan = new Scanner(System.in);
		
		int tc = scan.nextInt();
		String[] arr = new String[tc];
		int[] result = new int[tc];
		
		for(int i = 0; i < tc; i++) {
			arr[i] = scan.next();
		}
		
		for(int j = 0; j < tc; j++) {
			int cnt = 0;
			for(int k = 0; k < arr[j].length(); k++) {
				char value = arr[j].charAt(k);
				if(String.valueOf(value).equals("O")) {
					cnt++;
				} else {
					cnt = 0;
				}
				result[j] = result[j] + cnt;
			}
			System.out.println(result[j]);
		}
	}
	
	// 배운 내용 정리
	// String next(): 다음 토큰을 문자열로 반환함. 
    // String nextLine(): 개행문자 포함한 한 줄단위를 읽고 개행문자 제외한 문자열만 반환함.
	// charAt(): 문자열을 추출함. [기본 타입 비교 시 *동등연산자 사용한다.]
	// String.valueOf(): 기본 타입의 값을 문자열로 변환함. 파라미터가 null이라면 "null"로 반환한다.
	// String.equals(): 동일한 String 객체를 비교할 때 사용함.
	// * 동등연산자(==): 변수가 저장된 메모리 번지를 비교함.
}
