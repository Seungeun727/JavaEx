package com.practice01_2;
import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.print("숫자를 입력 하세요 : ");

			int userNum = scanner.nextInt();
			int result = 0;

			for(int i = 0; i <= userNum; i++) {
				if(userNum % 2 == 0 && i % 2 == 0 || userNum % 2 != 0 && i % 2 != 0) {
					result += i;
				}
			}

			System.out.println("결과값: " + result);
			if(result == 0) {
				System.out.println("프로그램 종료");
			}
			break;
		} 
	}
}