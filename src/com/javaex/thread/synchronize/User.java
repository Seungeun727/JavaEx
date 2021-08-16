package com.javaex.thread.synchronize;

// 	Thread
public class User extends Thread {
	private SharedMemory memory;
	private int data;
	
	//  * 생성자 생성
	public User(String name, SharedMemory memory, int data) { 
		super(name); // Thread 생성자 
		this.memory = memory;
		this.data = data;
	}

	@Override
	public void run() {
		if(memory != null) {
			memory.setMemory(data);
		}
	}
}