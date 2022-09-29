package com.baekjoon.conditional;

import java.util.Scanner;

public class Exam07 {
	// 2480: 주사위 세개[마지막 단계]<다른 방식도 꼭 찾고 읽어보기>
	// 조건: 같은 눈 3개 (ex: 2, 2, 2) => 10000 + (2) * 1000 = 12000
	//      같은 눈 2개 (ex: 3, 3, 6) => 1000 + (3) * 100 = 1300
	//      세 눈이 다르면 제일 큰 눈 x 100을 출력(ex: 6, 2, 5) => 6 * 100 = 600
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if (num1 == num2 && num2 == num3 && num3 == num1) {
			System.out.println(10000 + (num1 * 1000));
		} else if (num1 == num2 || num3 == num1) {
			System.out.println(1000 + (num1 * 100));
		} else if (num2 == num3) {
			System.out.println(1000 + (num2 * 100));
		} else {
			if (num1 > num2 && num1 > num3) {
				num1 *= 100;
				System.out.println(num1);
			} else if (num2 > num1 && num2 > num3) {
				num2 *= 100;
				System.out.println(num2);
			} else {
				System.out.println(num3 * 100);
			}
		}
	}
}