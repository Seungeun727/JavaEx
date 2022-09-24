package com.baekjoon.io;

import java.util.Scanner;

public class Practice06 {
	// 2588. 곱셈연산 출력 <다른 방식으로 풀어보기>
	// 조건: 사용자 입력으로 두 수 472, 385 
	// 세자리 각 연산의 결과와 최종 결과를 4개 출력한다.
	// 입력: 472, 385  / 출력: 2360, 3776, 1416, 181720
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        System.out.println(num1 * (num2 % 10));
        System.out.println(num1 * ((num2 % 100) / 10));
        System.out.println(num1 * (num2 / 100));
        System.out.println(num1 * num2);
        scan.close();
	}

}
