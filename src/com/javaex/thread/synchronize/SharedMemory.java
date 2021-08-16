package com.javaex.thread.synchronize;

// 여러 Thread가 공유할 객체
public class SharedMemory {
	// 필드
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	// 임계 영역 : 멀티 Thread에서 단 하나의 Thread만 접근할 수 있는 코드 영역
	// 임계 영역 설정 : 메서드 선언부에 synchronized
	public synchronized void setMemory(int memory ) {
		this.memory = memory;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		
	}
}