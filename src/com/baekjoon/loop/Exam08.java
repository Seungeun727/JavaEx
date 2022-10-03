package com.baekjoon.loop;

import java.util.Scanner;

public class Exam08 {
	// 백준 2438 문제
	// 문제 본문 링크: https://www.acmicpc.net/problem/2438
	// 이후 BufferedReader를 이용해서 다시 풀어보기!!
	public static void main(String[] args) {
		loopStarEx01();
//		loopStarEx02();
	}
	
	private static void loopStarEx01() {
		Scanner scan = new Scanner(System.in);
        
        int star = scan.nextInt();
        
        for(int i = 1; i <= star; i++) {
            for(int j = 1; j <=i; j++) {
                System.out.print("*");
                if(i == j) {
                    System.out.println();
                }
            }
        }
	}
	
	private static void loopStarEx02() {
		Scanner scan = new Scanner(System.in);
        
        int star = scan.nextInt();
        
        for(int i = 1; i <= star; i++) {
            for(int j = 1; j <=i; j++) {
                System.out.print("*");
            }
        	System.out.println();
        }
	}
}	