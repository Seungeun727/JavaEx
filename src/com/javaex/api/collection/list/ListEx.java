package com.javaex.api.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx {

   public static void main(String[] args) {
      // 다형성
//      List<String> lst = new LinkedList<>();
        List<String> lst = new ArrayList<>();
        
        // 객체 추가: add - 맨 뒤에 새 요소 추가
        lst.add("Java");
        lst.add("C");
        lst.add("C++");
        lst.add("Python");
        
        System.out.println("lst" + lst); 
        
        lst.add("Java");   // Append
        
        System.out.println("Append" + lst);
        // List는 순서가 있고, 중복 요소 허용
        
        lst.add(3, "C#");  // Insert : 3번 인덱스에 C# 추가
        System.out.println("Insert:" + lst);
        
        //   요소의 갯수
        System.out.println("size:" + lst.size());   // capacity는 없다.
        lst.remove(3);   // 인덱스로 삭제
        System.out.println("remove:" + lst);  // ---> C# 삭제된 것을 확인할 수 있음.
        lst.remove("Python");
        System.out.println("객체삭제, remove:" + lst);  // ---> Phyton 삭제된 것을 확인할 수 있음
        
        // 반복자: List에서는 Iterator 허용
        Iterator<String> iter = lst.iterator();
        while(iter.hasNext()) {    // 뒤에 남아 있는 요소가 있는가?
           String item = iter.next();   // 요소를 받아오고 다음으로 이동
           System.out.println(item + " ");
        }
        System.out.println();
        
        // 리스트 비우기
        lst.clear();
        System.out.println(lst);
     }
  }