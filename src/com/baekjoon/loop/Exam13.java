package com.baekjoon.loop;

import java.util.Scanner;

public class Exam13 {
	// 백준 1110 문제
	// 문제 본문 링크: https://www.acmicpc.net/problem/1110
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int cnt = 0;
		int cycle = n;
		
		while(true) {
			int first = cycle / 10;
			int second = cycle % 10;
			
			cycle = (second * 10) + ((first + second) % 10);
			cnt++;
			if(cycle == n)  {
				break;
			}
		}
		System.out.print(cnt);

	}
	// 문제에서 배운 내용
	// 총 10번을 풀었을 때 7번이 시간 초과였다.
	// 원인은 사이클의 길이로 19번행을 계산하지 않았다.
	// [ while문 유형 많이 풀어보기]
}
