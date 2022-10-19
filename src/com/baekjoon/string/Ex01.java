package com.baekjoon.string;

import java.util.Scanner;

public class Ex01 {
    // 백준 문제 11654
	// 문제 본문 링크: https://www.acmicpc.net/problem/11654
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String input = scan.next();
		int result = (int) input.charAt(0);
		System.out.print(result);
	}
}
