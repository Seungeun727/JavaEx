package com.baekjoon.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Exm05 {
	// 백준 15552 문제[꼭 다시 생각해보기]
	// 문제 본문 내용: https://www.acmicpc.net/problem/15552
	// 문제 예상 시간 초과로 https://limdotori.tistory.com/86 참고해서 풀었다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());  // br에서 반환되는 데이터는 String 형태.
		
		for(int i = 0; i < t; i++) {
			String[] strNum = br.readLine().split(" ");
			int a = Integer.parseInt(strNum[0]);
			int b = Integer.parseInt(strNum[1]);
			int sum = a + b;
			
			bw.write(sum + "\n");  // bw.write()는 자동개행 기능이 없음 => 개행문자가 \n 필요함.  
		}
			br.close();	  // 시스템 자원이 필요없다면 반납하고 출력스트림 닫음. 
			bw.flush();   // 출력 데이터 없다면 버퍼에 잔류하는 모든 데이터 출력
			bw.close();   // 시스템 자원이 필요없다면 반납하고 출력스트림 닫음.
	}
}