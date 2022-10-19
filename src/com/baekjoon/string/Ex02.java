package com.baekjoon.string;

import java.util.Scanner;

public class Ex02 {
	// 백준 문제 11720
	// 문제 본문 링크: https://www.acmicpc.net/problem/11720
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		String[] str = scan.next().split("");
		
		int sum = 0;
		for(String st: str) {
			sum += Integer.parseInt(st);
		}
		System.out.print(sum);
	}
	// for-each문
	// 1. 향상된 for문으로, Array, List 컬렉션 등의 요소를 순회한다.
	// 2. 저장된 객체(반복할 객체)크기만큼 반복하여 객체를 순차적으로 변수에 대입하여 for문 수행함.
	// 3. 장점: 코드가 불필요한 코드 제거하여 직관적, 가독성 높인다.
	// 4. 단점: for문과 달리 사용자가 '임의로 반복횟수를 지정하지 못함'.
}
