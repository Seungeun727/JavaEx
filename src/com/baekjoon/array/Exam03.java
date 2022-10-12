package com.baekjoon.array;

import java.util.Scanner;
import java.util.HashSet;

public class Exam03 {
	// 백준 문제 3052
	// 문제 본문 링크: https://www.acmicpc.net/problem/3052
	// 꼭 다른 방식으로 문제 풀어보기⭐⭐⭐
	public static void main(String[] args) {
		remainEx01(); 
	}
	
	private static void remainEx01() {
		Scanner scan  = new Scanner(System.in);
				
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			int a = scan.nextInt();
			set.add(a % 42);
		}
		System.out.print(set.size());
	}
	
	// 사용한 개념 다시 정리
	// * ArrayIndexOutofBoundsException
	// 1. 배열 인덱스 범위 초과(인덱스가 배열보다 크거나 음수인 경우)로 인한 실행 예외
    // 2. 해결: try/catch문으로 배열 길이 체크 혹은 for문/forEach문 정확한 범위 지정
	
	// * HashSet
	// 1. Set 컬렉션 중 Set 인터페이스 구현 클래스이다.
	// 2. 중복된 값을 허용하지 않고 하나의 null만 저장한다.
	// 3. 순서에 영향을 받지 않는다.
}
