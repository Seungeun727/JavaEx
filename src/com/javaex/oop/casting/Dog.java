package com.javaex.oop.casting;

public class Dog extends Animal {
	//	생성자
	public Dog(String name) {
		super(name);
	}
	
	//	메서드
	public void bark() {
		System.out.println(name + ": 멍멍!");
	}
}