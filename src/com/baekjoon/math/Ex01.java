package com.baekjoon.math;

import java.util.Scanner;

public class Ex01 {
	// 백준 문제 1712 [손익분기점 계산]
	// 문제 본문 출처: https://www.acmicpc.net/problem/1712
	public static void main(String[] args) {
//		practice01();
		practice02();
	}
	
	private static void practice01() {
		Scanner scan = new Scanner(System.in);
	        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();        
        int n = 0;
        
        if(c-b == 0) {
            n = -1;
        } else {
            n = a / (c - b);
            if(n < 0) {
                n = -1;
            } else {
                n += 1;
            }
        }
        System.out.print(n);
	}
	
	private static void practice02() {
		Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();        
        int n = 0;
        
        if(b >= c) {
        	n = -1;
        } else {
        	n = a / (c - b) + 1;
        }
        System.out.print(n);
	}	
}