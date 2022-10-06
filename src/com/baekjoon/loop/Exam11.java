package com.baekjoon.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Exam11 {
	// 백준 문제 10952
	// 문제 본문 링크: https://www.acmicpc.net/problem/10952
	// 문제를 풀었을 때 '런타임 에러'를 많이 봤음.
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  
        while(true){
            String[] strNum = br.readLine().split(" ");
            int a = Integer.parseInt(strNum[0]);
            int b = Integer.parseInt(strNum[1]);
            int sum = a + b;
            if (a == 0 && b == 0) {
                break;
            }
            bw.write(sum + "\n");
        }
            br.close();
            bw.flush();
            bw.close();
	} 
	// * 런타임 에러
	// 정의: 프로그램이 실행 중 발생하는 에러
	// 종류: 입출력이 범위 벗어남, 무한 루프, 정의되지 않은 변수와 인수 오류 등등
	// 해결: 예외처리코드 작성해야 예외가 발생했을 때 프로그램이 종료해야 한다. 	
	
	// * for문, while문
	// for문: '반복할 숫자를 이미 알고' 반복할 숫자만큼 for문 중괄호 내부를 반복한다.
	// while문: '특정 조건을 만족'할 때까지 while문 중괄호 내부를 반복한다.
} 