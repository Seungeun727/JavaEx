package com.javaex.network.echoserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Socket socket = null;

		try {
			//	소켓 생성: 데이터 통신용
			socket = new Socket();
			
			//	시작 메시지
			System.out.println("<클라이인트 시작>");
			System.out.println("[연결 요청]");
			
			//	접속 시도
			InetSocketAddress server = new InetSocketAddress("192.168.0.16", 
													10000);
			socket.connect(server);
			System.out.println("[서버에 연결되었습니다.]");
			
			//	스트림 열기
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			//	키보드에서 메시지 입력
			Scanner scanner = new Scanner(System.in);
			//	scanner에 /q 입력하면 종료
			while(true) {
				String message = scanner.nextLine(); //	한 줄 입력
				
				if (message.equals("/q")) {
					System.out.println("접속을 종료합니다.");
					break;
				}
				
				//	서버로 메시지 전송
				bw.write(message);
				bw.newLine();
				bw.flush();
				System.out.println("서버로 전송한 메시지:" + message);
				
				String echoMsg = br.readLine();	//	한 줄 읽기
				System.out.println("서버로부터 Echo 된 메시지:" + echoMsg);
			}
			
			scanner.close();
			br.close();
			bw.close();
			
			//	종료
			System.out.println("<클라이언트 종료>");
		} catch (ConnectException e) {
			System.err.println("[접속이 거부되었습니다.]");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}