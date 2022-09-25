package com.baekjoon.conditional;

import java.util.Scanner;

public class Exam03 {
	// 2753: 윤년을 구해서 출력하는 예제
	// 조건: *윤년=> 연도 4의 배수이고 100의 배수는 아닐 때 혹은 400의 배수 일때 이다.
	// 윤년이 맞다면 1을 아니라면 0을 출력한다.
	public static void main(String[] args) {
		conditionEx01();
		conditionEx02();
	}
	private static void conditionEx01() {
		Scanner scan = new Scanner(System.in);
	      
	    int year = scan.nextInt();
	        
		if((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
		   System.out.print("1");
		} else {
		   System.out.print("0");
		}
		  scan.close(); 
	}
	
	// 다른 방식 찾기 
    private static void conditionEx02() {
		
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
		if(year % 4 == 0) {
			if((year % 100 != 0 || year % 400 == 0)) {
				System.out.print('1');
			} else {
				System.out.print('0');
			}
		} else {
			System.out.print('0');
		}
	}
}