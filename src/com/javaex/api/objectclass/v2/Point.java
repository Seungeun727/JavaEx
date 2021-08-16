package com.javaex.api.objectclass.v2;

// v1. 모든 클래스의 최상의 부모는 Object이다.
//		toString: 객체를 문자열로 출력할 때 호출되는 메서드
//public class Point extends java.lang.Object {
public class Point{
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		// 객체 출력 포맷을 리턴
		return String.format("Point(%d, %d)", x, y);
	}

	@Override  
	public boolean equals(Object obj) {  
		// 전달받은 object가 Point 클래스의 객체?
		if(obj instanceof Point) {
			// 캐스팅 가능
			Point other = (Point)obj;
			return x == other.x && y == other.y;
		}
		return super.equals(obj);
	}
}

/*
 *  // 해당파일 우클릭 >> source >> Override methods
 */