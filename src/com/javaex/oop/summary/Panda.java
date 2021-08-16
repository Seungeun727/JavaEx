package com.javaex.oop.summary;

public class Panda extends Animal {
	
	// 생성자 
	public Panda(String name,int age) {
		super(name, age); // 부모 생성자 호출
	}

	@Override
	public void say() {
		System.out.printf("%s: zzzzzz%n.", name);
	}
}