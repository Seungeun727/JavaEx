package com.javaex.oop.point.v4;

public class Point {
	// 필드
	// protected -> 상속 받은 클래스에서도 접근 가능
	protected int x;
	protected int y;
	
	// 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Getters/Setters
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	// 메서드 오버로딩
	// 매개 변수의 타입, 갯수, 순서가 다르면 같은 이름의 메서드가 여러개 
	// 존재할 수 있다.
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n", x, y);
	}
	
	public void draw(boolean bShow) {
		String message = String.format("점[x=%d, y=%d]을 ", x, y);
		
//		if (bShow) {	//	== true
//			message += "그렸습니다.";
//		} else {
//			message += "지웠습니다.";
//		}
		message += bShow ? "그렸습니다.": "지웠습니다";
		
		System.out.println(message);
	}
}