package com.javaex.api.collection.hash;

public class Student {
	// 필드
	// ---> 접근제한자: defualt
	String name; 
	int id;
	
	// 생성자
	Student(String name, int id){
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	 //	hashCode(), equals() 메서드 오버라이드
	
	@Override
	public int hashCode() {
		return id;	 // 학번을 hashCode로 활용한다.
	}

	@Override
	public boolean equals(Object obj) { 
		if (obj instanceof Student) {
			// 캐스팅
			Student other = (Student)obj;
			return name.equals(other.name) && id == other.id; 
		}
		return super.equals(obj);
	}
}