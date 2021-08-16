package com.javaex.basics.reftypes;

import java.util.Arrays;

public class EnumEx { // EnumEx 클래스 선언

	public static void main(String[] args) { 
		enumEx1();
	}
	
	public static void enumEx1() {
		Week today = Week.WENDSDAY;
		
		System.out.printf("오늘은 %s(%d) 입니다.", // str: %S로 week 순번: %d로 출력
		today.name(), // 열거 상수 -> 문자열
		today.ordinal()); // 열거 상수 내 순번
		
		Week obj = Week.valueOf("FRIDAY");
		
		System.out.printf("%s, %d", 
				obj.name(), obj.ordinal());
		
		System.out.printf("%s와 %s의 순번차: %d%n", 
				today.name(), obj.name(), today.compareTo(obj));
		
		Week[] days = Week.values();
		
		System.out.println(Arrays.toString(days));
	}

}
