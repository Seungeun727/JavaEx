package com.baekjoon.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Exam06 {
	// 백준 11021 문제 
	// 문제 본문 링크: https://www.acmicpc.net/problem/11021
	// scanner 입력보다는 Buffer를 최대한 활용해본다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			String[] strNum = br.readLine().split(" ");
			int a = Integer.parseInt(strNum[0]);
			int b = Integer.parseInt(strNum[1]);
			int sum = a + b;
			
			bw.write("Case #" + (i + 1) + ": " + sum + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}