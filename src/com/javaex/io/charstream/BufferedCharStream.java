package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStream {

	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String source = rootPath + "last-leaf.txt";
	static String target = rootPath + "last-leaf.filtered.txt";
	
	public static void main(String[] args) {
		// 주스트림
		Reader fr = null;
		Writer fw = null;

		// 보조스트림
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			// 주스트림
			fr = new FileReader(source);
			fw = new FileWriter(target);
			
			// 보조스트림
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			String line = "";
			
			while((line = br.readLine()) != null) { // 한 줄씩 읽기
				// 해당 라인에 leaf 혹은 leaves가 포함된 라인만 따로 저장
				if (line.toLowerCase().contains("leaf") ||
				    line.toLowerCase().contains("leaces")) {
					// leaf, leaves 들어있는 문장만 출력
					System.out.println(line);
					bw.write(line);
					bw.write("\r\n");
				}
			}
			
			System.out.println("필터링 완료!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}