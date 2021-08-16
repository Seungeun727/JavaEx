package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {

		Animal dog1 = new Dog("스누피");
		
		dog1.eat();
		dog1.walk();
//		dog1.bark();  //  못해요
		// 참조 타입에 설계도에 있는 것만 할 수 있다.
        
		Dog dog2 = new Dog("아지");
		
		dog2.eat();
		dog2.walk();
		dog2.bark(); //  실행할 수 있어요
	
	
         //다운캐스팅: 명시적으로 변환하거나 타입을 지정
	     Dog dog3 = (Dog)dog1;
		
		((Dog)dog1).bark();
		
		Animal pet = new Dog("아지");
		pet.eat();
		pet.walk();
		
//		pet = new Cat("야옹이");
//		pet.eat();
//		peXt.walk();
		
		// 다운 캐스팅시에는 항상
		// 어떤 클래스의 인스턴스인지 확인
		if (pet instanceof Dog) {
			// Dog로 캐스팅 가능
	        ((Dog)pet).bark();
		} else if  (pet instanceof Cat) {
			// cat으로 캐스팅 가능
			((Cat)pet).meow();
		}
	}

}
