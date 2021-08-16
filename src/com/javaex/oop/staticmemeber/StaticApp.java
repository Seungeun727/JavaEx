package com.javaex.oop.staticmemeber;

public class StaticApp {

	public static void main(String[] args) {
		StaticEx s1 = new StaticEx();   // 인스턴스 생성
		System.out.println("참조 카운트:" + StaticEx.refCount);
		// static  멤버는 new로 인스턴스를 생성한지 않아도 접근 가능
		
		StaticEx s2 = new StaticEx();
		System.out.println("참조 카운트:" + s2.refCount);
		
		// 객체가 제거됨
	    s1 = null; // 참조를 해제함
	    System.out.println("s1 해제");
	    System.out.println("참조 카운트:" + StaticEx.refCount);
	    
	    System.gc(); // 가비지 콜렉터 수행
	    try {
			// 잠시 대기
			Thread.sleep(3000);
			System.out.println("참조 카운트:" + StaticEx.refCount);
		} catch (Exception e) {
			
		}
	}
}