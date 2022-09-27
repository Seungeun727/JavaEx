package com.baekjoon.conditional;

import java.util.Scanner;
public class Exam05 {
	// 2884: 알람시계 구하기
	// 조건: 첫 째줄은 정수 시간과 분을 입력(0<= H <= 23, 0 <= M <= 59)
	// 	    설정한 시간보다 45분 전을 출력할 것.(불필요한 0은 출력하지 않음).
	// 시간이 걸렸고, 다른 방식으로 꼭 풀어보기.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int hour = scan.nextInt();
		int minute = scan.nextInt();
		int compareHour = hour == 0 ? 23 : hour-1;
		if (minute < 45) {
			minute = (60-45) + minute;
			hour = compareHour;
			System.out.println(hour + " " + minute);
		} else {
			minute = (60- 45) + minute;
			hour = compareHour;
			System.out.println(hour + " " + minute);
		}
		scan.close();
	}
}