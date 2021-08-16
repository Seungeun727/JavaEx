package com.javaex.oop.casting;

public class Animal {
	// 필드
	protected String name;
	
	// 생성자
	public Animal(String name) {
		super();
		this.name = name;
		
	}
    // 메서드
	public void eat() {
		System.out.println(name + "is eating... ");
		
	}
	public void walk() {
		System.out.println(name + "is walkng... ");

	}
}
