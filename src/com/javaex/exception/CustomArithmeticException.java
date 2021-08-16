package com.javaex.exception;

public class CustomArithmeticException extends ArithmeticException {
	// 필드: 예외 상황의 데이터 혹은 환경 정보
	private int num1;
	private int num2;
	
	// 생성자
	public CustomArithmeticException(String message, int num1, int num2) {
		super(message);
		this.num1 = num1;  // 부모 초기화
		this.num2 = num2;
	}
	
	public int getNum1() {
		return num1;
	}
	
	public int getNum2() {
		return num2;
	}
}