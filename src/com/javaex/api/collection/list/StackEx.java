package com.javaex.api.collection.list;

import java.util.Stack;

public class StackEx {

   public static void main(String[] args) {
      // 스택 생성
      // LIFO (가장 먼저 작성한게 출력된다.)
      Stack<Integer> stack = new Stack<>();
      
      for(int i = 0; i < 5; i++) {
         stack.push(i);
         System.out.println("STACK:" + stack);
         
      }
      
      // 가장 위쪽의 데이터 확인
      System.out.println("PEEK:" + stack.peek());  // 데이터를 확인만 하고 지우지 않음 
      
//      while(true) { // 에러 발생
      while(!stack.isEmpty()) {
         System.out.println("POP:" + stack.pop());
         // 가장 마지막 입력 데이터 추출
         System.out.println("Stack:" + stack);
      }
   }

}