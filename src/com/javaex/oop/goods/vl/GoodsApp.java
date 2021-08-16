package com.javaex.oop.goods.vl;

public class GoodsApp {

   public static void main(String[] args) {
      Goods notebook = new Goods();
      // 필드에 접근
      notebook.name ="LG gram";
      notebook.price = 1700000;
      
      Goods smartphone = new Goods();
      smartphone.name = "iphon 12";
      smartphone.price = 800000;
      
      // 출력
      System.out.printf("%s, %d원%n", notebook.name, notebook.price);
      System.out.printf("%s, %d원%n", smartphone.name, smartphone.price);
   }
}