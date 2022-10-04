package com.baekjoon.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Exam09 {
	public static void main(String[] args) throws IOException {
//		starEx01();
		starEx02();
	}
	// 백준 2439 문제
    // 문제 본문 링크: https://www.acmicpc.net/problem/2439
	// 오류가 많았고 시간이 걸렸음.
	private static void starEx01() {
		Scanner scan = new Scanner(System.in);
		
		int star = scan.nextInt();
		
		 for(int i=0; i < star; i++) {
	          for(int j=star-1; j >= 0; j--) {
	                 if(i < j) {
	                     System.out.print(" ");
	                 } else {
	                     System.out.print("*");
	                 }
	          }
	          System.out.println();
	      }
	}
	
	// 별찍기 다른 방식(2)
	private static void starEx02() {
		Scanner scan = new Scanner(System.in);
		int star = scan.nextInt();
		
		for(int i = 1; i <= star; i++) {
			for(int j = 5; j >= 0; j--) {
				if(i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}