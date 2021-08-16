package com.javaex.oop.shape.v1;

// 추상 클래스를 상속받은 클래스는
// 반드시 추상 메서드를 구현해야
public class Rectangle extends Shape {
	// 필드
	protected int width;
	protected int height;
	
	// 생성자
	public Rectangle(int x, int y, 
			int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	// 추상 메서드 오버라이드 구햔(필수)
	@Override
	public double area() {
		return width * height;
	}
	
	@Override
	public void draw() {
		System.out.printf("사각형 [x=%d, y=%d, w=%d ,h=%d, area=%f]을 그렸어요%n", x, y, width, height, area());
	}
}
