package com.javaex.oop.goods.v2;

public class GoodsApp {
	
	public static void main(String[] args) {
		Goods notebook = new Goods();
		//	setter를 이용한 우회 접근
		notebook.setName("LG Gram");
		notebook.setPrice(1700000);
		
		Goods smartphone = new Goods();
		smartphone.setName("iPhone 12");
		smartphone.setPrice(800000);
		
		//  출력
		System.out.printf("%s, %d원%n", notebook.getName(),
				notebook.getPrice());
		System.out.printf("%s, %d원%n", smartphone.getName(),
				smartphone.getPrice());
		
		notebook.showInfo();
		smartphone.showInfo();
	}
}