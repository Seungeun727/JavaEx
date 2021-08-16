package com.javaex.api.objectclass.v3;

public class Circle {
	// 필드 선언
	private int x;
	private int y;
	private int radius;
	

	// 생성자 선언
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			// 캐스팅
			Circle other = (Circle)obj;
			return radius == other.radius;
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", radius=" + radius + "]";
	}
}
