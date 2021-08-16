package com.javaex.api.objectclass.v4;

public class LangClassTest {

	public static void main(String[] args) {
		Scoreboard  s1 = new Scoreboard(new int[] {10, 20, 30, 40});
		System.out.println("s1= " + s1);
		
		Scoreboard s2 = s1.getClone();
		System.out.println("s2= " + s2);
		
		s2.getScores()[0] = 50;
		
		System.out.println("s1= " + s1);
		System.out.println("s2= " + s2);
		
		// s1과 s2rk 별개의 객체?
		System.out.println("s1 == s2 ? " + (s1 == s2));
		// 내부 참조 데이터 확인
		System.out.println("s1.scores == s2.scores ? " + (s1.getScores() == s2.getScores()));

	}
}
