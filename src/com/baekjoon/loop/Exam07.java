package com.baekjoon.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Exam07 {
	// 백준 11022 문제
	// 문제 본문 링크: https://www.acmicpc.net/problem/11022
	// 11021(loop/Exam06파일)의 출력만 다를뿐 형태는 비슷함.
	public static void main(String[] args) throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        
       int t = Integer.parseInt(br.readLine());
	        
       for(int i = 0; i < t; i++) {
    	   String[] strNum = br.readLine().split(" ");
    	   int a = Integer.parseInt(strNum[0]);
    	   int b = Integer.parseInt(strNum[1]);
    	   int c = a + b;
	            
	   		bw.write("Case #" + (i + 1) + ": " + a + " + " + b + " = " + c + "\n");
       }
            br.close();
            bw.flush();
            bw.close();
	}

}
