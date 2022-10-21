package com.baekjoon.string;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05 {
	// 백준 문제 1157
	// 문제 본문 출처: https://www.acmicpc.net/problem/1157
	public static void main(String[] args) {
//		practice01();
		arrayEx01();
	}
	// 'b'-'A' = 33, size 배열의 인덱스 초과(ArrayIndexOutOfBounds)가 발생했음
	private static void practice01() {
		Scanner scan = new Scanner(System.in);
        
        String str = scan.next().toUpperCase();
        int[] size = new int[27];
        int index, max = 0;
        char c = 0;
        for(int i = 0; i < str.length(); i++) {
            index = str.charAt(i) - 'A';
            size[index]++;
               if(size[index] > max) {
                   max = size[index];
                   c = str.charAt(i);
//                   System.out.print(max);
               } else if (max == size[index]){
                   c = '?';
               }
            }
        System.out.print(c);
	}
	// 배열의 값을 확인해서 출력
	private static void arrayEx01() {
    	int[]oldArr = { 10, 20, 30 };  
    	int[]newArr = new int[oldArr.length];
    	
    	System.out.println(oldArr); // [I@11758f2a: oldArr배열의 시작 주소가 출력된다.
    	
    	for(int i = 0; i < newArr.length; i++) {
    		newArr[i] = oldArr[i];
    	}
    	
    	System.out.println(Arrays.toString(newArr));  // result: [10, 20, 30]
    	
    	for(int g: newArr) {
    		System.out.println(g);  // 배열의 개수만큼 배열 요소를 순회함. result: 10 20 30
    	}
    }
}
