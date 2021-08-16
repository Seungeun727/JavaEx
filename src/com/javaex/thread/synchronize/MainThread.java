package com.javaex.thread.synchronize;

public class MainThread {

	public static void main(String[] args) {
		SharedMemory memory = new SharedMemory(); // 공유 객체
		
		User user1 = new User("철수", memory, 100); // 첫 번째 Thread
		User user2 = new User("영희", memory, 50);  // 두 번째 Thread
	
		//Thread 시작
		user1.start();
		user2.start();
	}
}