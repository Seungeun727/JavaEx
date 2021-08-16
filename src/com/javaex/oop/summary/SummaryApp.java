package com.javaex.oop.summary;

public class SummaryApp {

	public static void main(String[] args) {
		Human h1 = new Human("홍길동", 30);
		Human h2 = new TheOne("네오", 48);
		Panda p1 = new Panda("핑", 30);
		Panda p2 = new KungfuPanda("포", 15);

		
		h1.eat(); h1.say();
		fight(h1);  fly(h1);
		// h1.eat(); Animal 일반 메서드 
	    // h1.say(); Animal 추상 메서드 -> 자식 클래스에게 반드시 Override 함
		
		p1.eat();  p1.say();
		fight(p1); fly(p1);
		
		h2.eat();  h2.say();
		fight(h2); fly(h2);
		
		p2.eat();  p2.say();
		fight(p2); fly(p2);
	}
	
	private static void fly(Animal actor) {
		// actor가 Flyable 인터페이스를 구현?
		if(actor instanceof Flyable) {
			// Flyable로 캐스팅 가능
			((Flyable)actor).fly();
		} else {
			// 캐스팅 불가
			System.out.printf("%s: 하늘을 날 수 없어요~%n",actor.name);
		}
	}
	
	private static void fight(Animal actor) {
		// actor가 KungfuSkill 인터페이스를 구현?
		if(actor instanceof KungfuSkill) {
			// KungfuSkill로 다운스캐팅 가능
			((KungfuSkill)actor).kungfu();
		} else {
			// 캐스팅 불가
			System.out.printf("%s: 쿵후 못해요~%n",actor.name);
		}
	}
}