package com.javaex.oop.goods.v4;

public class GoodsApp {

   public static void main(String[] args) {
//      Goods notebook = new Goods();  // 기본 생성자 없다.
	    Goods notebook = new Goods("LG gram", 1700000);
	    
		// setter를 이용한 우회 접근
//	    notebook.name ="LG gram";
//	    notebook.price = 1700000;
	    
	    // 출력
	    Goods smartphone = new Goods("iPhone 12", 80000);
//	    notebook.setName("iphone 12");
//	    notebook.setPrice(800000);
	    
	    // 출력
	    System.out.printf("%s,%d원%n", notebook.getName(),
	    		notebook.getPrice());
	    System.out.printf("%s,%d원%n", smartphone.getName(), 
	    		smartphone.getPrice());
	      
	    notebook.showInfo();
	    smartphone.showInfo();
	      
//	      notebook.setPrice(170); // price 필드는 Read only
//	      notebook.showInfo();
	   }

	}