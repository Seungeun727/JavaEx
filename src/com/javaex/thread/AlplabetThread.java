package com.javaex.thread;

// 	Multi Thread 작성 방법 2.
// 	Runnable 인터페이스 구현
public class AlplabetThread implements Runnable{

	@Override
	public void run() {
		// A ~ Z 까지 출력		
    
		for(char ch ='A'; ch <='Z'; ch++) {
			System.out.println("AlplabetThread:"+ ch);
			
			// 0.3초 대기
			try {
				Thread.sleep(300);  // 300ms = 0.3s
 			} catch (InterruptedException e) {
 				e.printStackTrace();
 			}
		} 
	}
}