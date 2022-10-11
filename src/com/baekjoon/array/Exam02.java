package com.baekjoon.array;

import java.util.Scanner;

public class Exam02 {
	// 백준 2562 문제
	// 문제 본문 링크: https://www.acmicpc.net/problem/2562
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	        
        int[] arr = new int[9];
        int max = 0;
        int index = 0;
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            if (max < arr[i]) {
                max = arr[i];
                index = i+1;
            }
        }
        
        System.out.println(max);
        System.out.println(index);
	}
}
