package com.javaex.oop.summary;

public abstract class Animal { // 추상 클래스 선언
	
	//  필드
	protected String name;  // 접근 제한자: protected
	protected int age;
	
	// 생성자 -> 생성자를 만들지 않으면 프로그램 자체에서 기본 생성자 생성.
	// 생성자는 여러개일 수도 있음
	public Animal(String name) {
		super();
		this.name = name;
	}
    
	public Animal(String name, int age) {
		// 자신의 다른 생성자 호출
		this(name);
		this.age = age;
	}
	
	// 일반 메서드
	public void eat() {
		System.out.printf("%s is eating...%n", name);
	}
	
	// 추상 메서드: 선언만 한다.
	// 자식 클래스에서 Override 해야한다.
	public abstract void say();
}


// privated < default(자기 자신) < protected < public