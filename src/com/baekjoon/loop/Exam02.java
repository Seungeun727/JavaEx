package com.baekjoon.loop;

import java.util.Scanner;

public class Exam02 {
    // 10950: A + B - 3
	// 조건: 두 정수 A, B 입력 받은 뒤 A + B를 출력한다.
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int count = scan.nextInt();
	        
	        for(int i= 0; i < count; i++) {
	            int a = scan.nextInt();
	            int b = scan.nextInt();
	            System.out.println(a + b);
	        }
	}
}