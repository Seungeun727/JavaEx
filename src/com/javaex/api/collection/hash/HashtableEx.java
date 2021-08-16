package com.javaex.api.collection.hash;

// ---> 2,3교시 수업
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashtableEx {

	public static void main(String[] args) {
		// HashTable 생성
		Map<String, ClassRoom> map = new Hashtable<>();
		
		// 맵에 데이터 넣기: put
		map.put("101", new ClassRoom("Java", "R101"));
		map.put("201", new ClassRoom("C", "R201"));
		map.put("301", new ClassRoom("Phthon", "R301"));
		map.put("201", new ClassRoom("Linux", "R201"));  // 데이터의변경

		System.out.println(map);
		
		// 데이터 가져오기: 키를 이용 저근
		System.out.println("301:" + map.get("301"));
		
		// 키가 있는지 확인
		System.out.println("301키 있음? " + map.containsKey("301"));
		System.out.println("501키 있음? " + map.containsKey("501"));

		// 값이 있는지?
		System.out.println(map.containsValue("Java"));
		System.out.println(map.containsValue(new ClassRoom("Java")));
		
		// Iterator
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {  // 뒤에 요소 남아있는가?
			ClassRoom room = map.get(it.next());
			System.out.println(room);
		}
		
		// 맵 비우기
		map.clear();
		System.out.println(map);
	}
}
