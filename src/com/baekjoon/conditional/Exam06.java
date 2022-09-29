package com.baekjoon.conditional;

import java.util.Scanner;

public class Exam06 {
	// 2525: 오븐 시계 구하기
	// 조건: 첫째 줄은 현재 시각으로 시 A(0 <= A <= 23), 분 B(0<=B<=59)
	//      둘째 줄은 요리하는데 필요한 시간 C가 분 단위로 주어진다.
	// ex) 입력: 14 30  20  출력: 14 50
    //     입력: 23 48  25  출력:  0 13	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int hour = scan.nextInt();   	// 시간
		int minute = scan.nextInt();    // 분
		int c = scan.nextInt();         // 필요 시간
		
		int plusTime = minute + c;      // 분을 더한 시간
		int calcHour = hour + (plusTime / 60); 
		
		if(plusTime >= 60) {
			// 분을 모두 더한 시간이 60보다 큰 경우
			minute = plusTime % 60;
			if (calcHour > 23) {
				hour = calcHour - 24;
				System.out.println(hour + " " + minute);
			} else {
				hour = calcHour;
				System.out.println(hour + " " + minute);
			}
		
		} else {
			// 분을 모두 더한 시간이 60보다 작은 경우
			System.out.println(hour + " " + plusTime);
		}
	}
}
