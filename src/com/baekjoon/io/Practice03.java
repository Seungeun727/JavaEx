package com.baekjoon.io;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    
	    int [] chess;
	    chess = new int[]{1,1,2,2,2,8};
	    for (int i = 0; i<chess.length; i++) {
           System.out.println(chess[i]-scan.nextInt());
        }
	}
	
	// 다른 풀이 찾아보기
	private static void explanation01() {
		Scanner scan = new Scanner(System.in);
		
		int input_chess[] = new int[6];
		int compare_chess[] = {1,1,2,2,2,8};
		for (int i=0; i<input_chess.length; i++) {
			input_chess[i] = scan.nextInt();
		}
		for (int j=0; j<input_chess.length; j++) {
			System.out.print(compare_chess[j]-input_chess[j]);
		}
	}
}