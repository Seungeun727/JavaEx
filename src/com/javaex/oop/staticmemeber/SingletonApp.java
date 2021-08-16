package com.javaex.oop.staticmemeber;

public class SingletonApp {

	public static void main(String[] args) {
//		Singleton s = new Singleton(); // 생성자가 private
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println("s1=" + s1);
		System.out.println("s2=" + s2);

		// s1과 s2가 같은 객체?
		System.out.println("s1 == s2 ? " + (s1 == s2));
	}
}