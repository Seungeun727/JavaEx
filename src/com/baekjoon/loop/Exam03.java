package com.baekjoon.loop;

import java.util.Scanner;

public class Exam03 {
	 // 8339: 반복문을 이용한 합을 구하기
	 // 조건: 숫자 n이 주어질 때 1부터 n까지의 합을 출력한다.
	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        
		 int num = scan.nextInt();
		 int sum = 0;
		 for(int i = 0; i <= num; i++) {
        	sum += i;
		 }
         System.out.println(sum);
	 }
}
