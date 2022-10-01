package com.baekjoon.loop;

import java.util.Scanner;

public class Exam01 {
	// 2739: 구구단 출력
	public static void main(String[] args) {
//		loopEx01();
		loopEx02();
	}
	
	private static void loopEx01() {
		Scanner scan = new Scanner(System.in);
	      
		int num = scan.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
	}
	
	private static void loopEx02() {
		Scanner scan = new Scanner(System.in);
	      
		int num = scan.nextInt();
        for (int i = num; i < 10; i++) {
        	for(int j = 1; i < 10; i++) {        		
        		System.out.println(num + " * " + i + " = " + (num * i));
        	}
        }
	}
}
