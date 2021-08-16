package com.javaex.basics.reftypes;

public class MainArgs {

	public static void main(String[] args) {
		// args: 커멘드 라인에서 인자값으로 들어온 값
		//		-> 배열로 전달
		
		System.out.printf("%d개의 인자가 전달%n",
				args.length);
		
		for(int i = 0; i < args.length; i++) {
			System.out.printf("인수 %d, %s%n",
					i, args[i]);
		}

	}

}
