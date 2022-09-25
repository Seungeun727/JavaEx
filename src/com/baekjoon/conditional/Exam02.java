package com.baekjoon.conditional;

import java.util.Scanner;

public class Exam02 {
	// 9498: 시험 성적 출력
	// 성적 90-100: 'A', 80-89: 'B',  70-79: 'C', 
	// 	   60-69: 'D', 그 외: 'F'
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        int grade = scan.nextInt();       
        
        if(grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        scan.close();
	}
}