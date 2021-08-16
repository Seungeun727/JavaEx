package com.javaex.api.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueEx {

   public static void main(String[] args) {
      // Queue: 선입선출(First Input First Output:FIFO)   
      Queue<Integer> queue = new LinkedList<>();
      
      // 데이터 제공하기 
      for (int i = 0; i < 5; i++) {
         queue.offer(i);  //ENQUEUE
         System.out.println("QUEUE:" + queue);  // ---> 입력방향은 오른쪽부터 추가
      }
      
      // 가장 먼저 입력된 데이터 확인: 삭제 하지 않는다.
      System.out.println("PEEK:" + queue.peek());
      System.out.println("QUEUE:" + queue);
      
      while(!queue.isEmpty()) {
//      while(true) {
         System.out.println("POLL:" + queue.poll()); // DEQUEUE
         System.out.println("QUEUE:" + queue);
      }
      
   }

}