package com.javaex.api.objectclass.v2;

public class Rectangle {
	// 필드 선언
	public int width;
	public int height;
	
	//생성자 선언
	public Rectangle(int height ,int width) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			// 캐스팅
			Rectangle other = (Rectangle)obj;
			return width * height == other.width * other.height;
		}
		return super.equals(obj);
	}
    
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
}