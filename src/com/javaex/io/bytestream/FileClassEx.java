package com.javaex.io.bytestream;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	public static void main(String[] args) {
		//  파일 객체 
		File root = new File(rootPath);
		// 파일이 실제 존재하는가?
		System.out.println(rootPath + ":" + root.exists()); 

		printInfo(root);
		if (!root.exists()) { // 경로가 존재하지 않으면
			// 디렉터리 생성
			root.mkdirs();
		}
		
		// 디렉터리 내부에 파일을 생성해 봅시다.
		File newFile = new File(rootPath + "myFile.text");
		if( !newFile.exists()) {   // myFile.txt가 없으면
			// 파일 생성
			try {
				newFile.createNewFile();  // 실제 생성
			} catch (IOException e) {
				System.err.println("파일을 만들지 못했어요");
			}
		}
		printInfo(root);
		
		// 파일을 지운다.
		newFile.delete();
		
		printInfo(root);
	}
	
	private static void printInfo(File f) {
		System.out.println("------------------");
		
		// 전달 받은 파일 객체가 디렉터리인가?
		if (f.isDirectory()) {  // 디렉터리
			// 디렉터리 내부의 파일 목록을 받아와서 출력
			System.out.println("Directory:" + f.getName());
			// 목록 불러오기
			File[] files = f.listFiles();
			
			// 리스트 출력
			for (File file: files) {
				System.out.print(file.isDirectory() ? "d " : "f ");
				System.out.printf("%s - %d%n", file.getName(), file.length());
			}
		} else { // 파일
			// 파일의 이름 출력
			System.out.println("File:" + f.getName());  // 파일의 이름 출력			
		}
	}
}