package com.baekjoon.loop;

import java.util.Scanner;
public class Exam12 {
	// 백준 1110 문제
	// 문제 본문 링크: https://www.acmicpc.net/problem/10951
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextInt()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int sum = a + b;
			System.out.println(sum);
		}

	}
	
	// 문제로 배운 내용 정리
	// * EOF: End of File의 약자로 읽을 데이터가 없는 파일의 끝.
	
	// * scanner.hasNext() [개행문자 무시]
	// 1. hasNext 뒤에는 double, int, boolean 자료형 타입이 붙음.
    // 2. 입력값과 일치하는 자료형 타입은 true, 일치하지 않는 경우 false를 반환한다.
	// 3. 입력 토큰이 있다면 true, 없다면 새로운 값이 들어올 때까지 기다림.
	
	// * scanner.hasNextLine() [개행문자까지 포함]
	// 1. 다음 줄에 입력 여부를 확인 후 true/false를 반환한다.(
	// 2. 다음 줄에 입력이 있다면 true, 없다면 false이다.
}
