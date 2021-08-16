package com.javaex.oop.summary;

public class Human extends Animal { //Human이 Animal의 필드, 메서드를 모두 받는다.
    
	// 생성자 
	public Human(String name, int age) {
		// 명시적으로 부모 생성자 호출
		super(name, age);
	}
	@Override
	public void say() {
		// Animal 클래스의 추상 메서드
		// 반드시 자식 클래스에서 Override 해야 함
		System.out.printf("안녕 나는 %s입니다%n.", name);
	}
}

// 부모 생성자를 명시적으로 선언했는데, 
// Human에서 부모 생성자를 선언을 안했기 때문에 오류남.