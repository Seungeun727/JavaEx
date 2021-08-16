package com.javaex.basics.reftypes;

public class StringEx {

	public static void main(String[] args) {
//		stringType();
		stringFormatEX();
	}
	
	private static void stringFormatEX() {
		// &d(정수), %s(문자열), %n(개행), %%(%), %f(실수)
		String food = "사과";
		int total= 10, eat =3;
	    
		// total 개의 food 중에서 eat 개를 먹었다.
		System.out.println(total + " 개의 " + food + " 중에서 " + eat + "개를 먹었다.");
		
		// 템플릿
		String fmt = "%d 개의 %s 중에서 %d 개를 먹었다.";
		System.out.printf(fmt, total, food, eat);
		
	    String message = String.format(fmt, 5, "버거", 2);
	    System.out.println(message);
	    
	    // 부가 정보를 가지기도 한다.
	    float rate = 1.234f;
	    // 햔재 이자율은  ____% 미만입니다.
	    fmt = "현재 이자율운  %f%% 입니다.";
	    System.out.printf(fmt, rate);  // 소수 2자리까지 표기
	    
	    
	    }
	private static void stringType() {
		// 문자열 선언
		String str; // 선언
		str= "Java"; // 리터럴(소스에 직접 입력된 값)
		String str2 = "Java"; // 리터럴
		String str3 = new String("java");
		
		// 참조 타입에서 == 은  참조 주소가 같은지 (같은 객체인지) 판별
		System.out.println("str == str2 ? " + (str == str2));
		System.out.println("str == str3 ? " + (str == str3));
		
		// 값의 비교는? .equals()
		System.out.println("str, str2 내용이 같은가? " + str.equals(str2)); // 값: Java
		System.out.println("str, str3 내용이 같은가? " + str.equals(str));  
		// 값 : Java  참조하는 주소는 다르지만 .equals()를 통해 Java값을 가짐. 
        
       String str4; // 선언 했으나 할당되지 않음
       str.equals(str); // null 상태에서의 객체의 메서드를 이용하고자 하면 에러 발생
       //NullPointerException 주의
	}

}
