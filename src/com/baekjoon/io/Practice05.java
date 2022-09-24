package com.baekjoon.io;

import java.util.Scanner;
public class Practice05 {

	// 10430: 사용자 입력으로 나머지값을 순서대로 출력
	// 조건: 
	// 1. (A+B)%C는 ((A%C) + (B%C))%C) 같은지 확인
	// 2. (A+B)%C는 ((A%C) * (B%C))%C) 같은지 확인
	// 3. 입력은 5 8 4이고 출력은 1, 1, 0, 0
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	        int a = scan.nextInt();
	        int b = scan.nextInt();
	        int c = scan.nextInt();
	        
	        System.out.println((a + b) % c);
	        // (5 + 8) % 4 = 13 % 4 = 1   result: 1
	        System.out.println(((a % c) + (b % c)) % c);
	        // (1 + 0) % 4 = 1   		  result: 1
	        System.out.println((a * b) % c);
	        // (5 * 8) % 4 = 0            result: 0
	        System.out.println(((a % c) * (b % c)) % c);
	        // (1 * 0) % 4 = 0            result: 0
	        
	        scan.close();
	}
}