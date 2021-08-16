package com.javaex.api.generic;


// Generic 이용
// T -> Type

// 파라미터 갯수는 제한이 없다.
// 많이 사용되는 파라미터 관례:
// T: Type
// R: Return Type
// K: Key
// V: Value

public class GenericBox<T> {
	
	// 필드
	T content; // 타입 미정 상태

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
}
