package com.baekjoon.loop;

import java.util.Scanner;

public class Exam04 {
	// 25304: 반복문을 이용한 영수증 출력 예제
	// 입력 조건: 첫째 줄은 영수증 총 금액 x, 둘째 줄은 영수증 구매 물건종류 수 n
	//          각 n개의 줄은 물건의 가격 a와 개수 b의 사이에 공백이 있다.
	// 출력 조건: 구매 물건 가격, 개수를 계산한 총금액과 영수증 총 금액 일치 시 
	//           Yes 불일치 시 No를 출력
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int totalMoney = scan.nextInt();
		int totalCount = scan.nextInt();
		int sum = 0;
		
		for(int i = 0; i < totalCount; i++) {
            int price = scan.nextInt();
            int pCount = scan.nextInt();
	            
            sum += price * pCount;    
        }
		 if (totalMoney == sum) {
            System.out.println("Yes");
		 } else {
            System.out.println("No"); 
		 }
	}
}