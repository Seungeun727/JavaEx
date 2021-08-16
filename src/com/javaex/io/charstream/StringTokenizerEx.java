package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String filename = rootPath +"thieves.txt";
	
	public static void main(String[] args) {
		// 스트림 열기
		Reader fr = null; // 주스트림
		BufferedReader br = null;  // 보조 스트림
		
		try {
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			
			String thief;
			
			while ((thief = br.readLine()) != null) {  // 넘어올 라인이 있으면 읽기
//				System.out.println(thief);
				// Tokenizing
				StringTokenizer st = new StringTokenizer(thief, " ");
				while(st.hasMoreTokens()) { // 뒤에 남아있는 토큰 있는가?
					String token = st.nextToken(); // 뒤쪽 토큰 받기
					System.out.print(token + "\t");
				}
				System.out.println();  // 개행
			} 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e){
				e.printStackTrace();
			}
		}
	}
}
