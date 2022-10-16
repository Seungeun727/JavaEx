package com.baekjoon.array;

public class Exam07 {
	// 자바 15596 문제['함수'로 n개의 정수의 합]
	// 문제 본문 링크 : https://www.acmicpc.net/problem/15596
	
	// 메서드 정의 
	public static long sum(int[] a) {
        long result = 0;
        for(int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
	}
	
	// 메인 메서드
	public static void main(String[] args) {
		int[] a = { 1, 5, 10, 5, 20, 25};
		long totalSum = sum(a);   // 메서드 호출
		System.out.print(totalSum);
	}
	
	// 메서드 [자바에서 함수의 역할]
	// 1. 클래스에서 생성된 객체의 특정 동작 혹은 특정 기능을 수행함
	// 2. 리턴값이 없는 메서드는 void로 선언한다.
	// 3. 필요성: 클래스 내부/외부로 호출로 재사용하여 코드를 간결화/가독성 높임.
	
	// 헷갈리는 용어
	// 4. 메서드 오버로딩: 클래스 내 같은 이름을 여러 선언하는 것 
	// 5. 메서드 오버라이딩: 부모 클래스에서 정의된 메서드를 자식에서 다시 정의함
}
