package com.practice01_2;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		boolean exit =true;
		
		int result = 0; // result =총합
		
		Scanner scanner = new Scanner(System.in);
		
		while(exit) {
			
			System.out.println("-------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------");
			System.out.println("선택>:");
			
			int cNum = scanner.nextInt();
			int state= 0; // message: 돈 상태
			
			switch(cNum) {
			case 1:
				System.out.println("예금액> ");
				state = scanner.nextInt();
				result = result + state;
				break;
			case 2:
				System.out.println("출금액> ");
				state = scanner.nextInt();
				result = result - state;
				
			case 3:
				System.out.println("잔고> " + result);
				break;
			case 4:
				exit = false;
					break;
				
			}
	
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}

}
