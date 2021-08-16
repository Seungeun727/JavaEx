package com.javaex.oop.summary;

public class TheOne extends Human implements KungfuSkill, Flyable {

	// 생성자
	public TheOne(String name, int age) {
		super(name, age);
	}
	@Override
	public void fly() {
		System.out.printf("%s: I can fly%n", name);
	}

	@Override
	public void kungfu() {
		System.out.printf("%s: I know kungfu!%n", name);
	}
}