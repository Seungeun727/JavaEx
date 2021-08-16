package com.javaex.io.charstream;

import java.io.File;
import java.util.Scanner;

public class ScannerEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "thieves.txt";
	
	public static void main(String[] args) {
		File file = new File(filename);
		
		try {
			Scanner scanner = new Scanner(file);
			String name;
			float height;
			float weight;
			
			while(scanner.hasNextLine()) {  // 남은 라인이 있는가?
				name = scanner.next();   // 문자열 일기
				height = scanner.nextFloat(); // flaot 읽기
				weight = scanner.nextFloat(); // float 읽기
				
				System.out.printf("%s, 키:%.2f, 체중:%.2f%n", name, height, weight);
				
				scanner.nextLine();
			}
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}