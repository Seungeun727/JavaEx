package com.javaex.oop.point.v2;

public class Point {
	// 필드
	private int x;
	private int y;
	
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
	
	// 메서드
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n", x, y);
	}
}