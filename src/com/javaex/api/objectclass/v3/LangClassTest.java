package com.javaex.api.objectclass.v3;

public class LangClassTest {

	public static void main(String[] args) {
		// 객체 복제 테스트
		Point p = new Point(10, 20);  
	    // 참조 복제는 같은 객체 참조
		// Point p2 = p; // 참조 복제
		Point p2 = p.getClone();	
		System.out.println("p = " + p);
		System.out.println("p2 = " + p2);
		
		// p2를 변경
		//p2.x = 100;
		System.out.println("p2= " + p2);	
		System.out.println("p = " + p);
		
		// Rectangle 클론 테스
		Rectangle r1 = new Rectangle(100, 200);
		System.out.println("r1 = " + r1);
		Rectangle r2 = r1.getClone();
		System.out.println("r2 = " + r2);
		
		r2.width = 300;
		System.out.println("r1= " + r1);
		System.out.println("r2 = " + r2);
		
		System.out.println("r1 == r2 ? " + (r1 == r2));
	}
}