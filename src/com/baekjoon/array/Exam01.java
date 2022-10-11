package com.baekjoon.array;

import java.util.Scanner;

public class Exam01 {
	// 백준 문제 10818
	// 문제 본문 링크: https://www.acmicpc.net/problem/10818
	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int max = -1000000;
        int min = 1000000;
        
        for(int i = 0; i < n; i++) {
            int number = scan.nextInt();
            if(number >= max) {
                max = number;
            }
            if(number <= min) {
                min = number;
            }
        }
        System.out.print(min + " " + max);
	}
}