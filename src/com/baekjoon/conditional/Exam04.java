package com.baekjoon.conditional;

import java.util.Scanner;

public class Exam04 {
	// 14681번: 사분면 고르기
	//   1사분면:A(12, 5),   2사분면:B(-12, 5)
	//   3사분면:C(-12, -5), 4사분면:D(12, -5)
	// 입력: 12, 5  => 출력: 1
	// 입력: 9, 13  => 출력: 3
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
        int y = scan.nextInt();
  
        if(x >= 0 && y>=0) {
            System.out.println("1");
        } else if(x < 0 && y >=0) {
            System.out.println("2");
        } else if(x < 0 && y < 0) {
            System.out.println("3");
        } else {
            System.out.println("4");
        } 
        scan.close();
	}
}