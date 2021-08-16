package com.javaex.oop.shape.v1;

public class Circle extends Shape {
	// 필드
	protected double radius;  // 반지름
	
	//  생성자
	public Circle (int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	
	// 추상 메서드 구현
	@Override
	public void draw() {
		System.out.printf("원[x=%d, y=%d, r=%f, area=%f]을 그렸습니다.%n",
				x, y, radius, area());	
	}

	@Override
	public double area() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}
}