package com.javaex.thread;

public class MainThread {

	public static void main(String[] args) {
		// Working Thread 호출
		Thread thread = new DigitThread();
		thread.setName("DigitThread");
		// Thread 시작 : run 메서드 직접 호출하지 말것
		// thread.run(); 
		thread.start();
		
		// Main Thread 로직
		// A ~ Z 까지 출력
		/*
		for(char ch ='A'; ch <='Z'; ch++) {
			System.out.println("Main Thread:"+ ch);
			
			// 0.3초 대기
			try {
				Thread.sleep(300);  // 300ms = 0.3s
 			} catch (InterruptedException e) {
 				e.printStackTrace();
 			}
		}
		*/
		
		Thread thread2 = new Thread(new AlplabetThread());  // --> Runnable 대입
		thread2.start();
		
		// MainThread의 흐름에 WorkingThread들의 흐름을 합류
		try {
			thread.join();
			thread2.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		System.out.println("End of MainThread!"); 
		// -> Working Thread는 Main Thread가 종료되기전까지 종료x	
	}
}
