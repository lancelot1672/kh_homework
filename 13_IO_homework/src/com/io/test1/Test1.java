package com.io.test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
	public static void main(String[] args) throws IOException{
		Test1 t1 = new Test1();
		//t1.fileSave();
		t1.fileRead();
	}
	
	public void fileSave() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		// 키보드로 사용할 파일 명을 입력받음
		String fileName = br.readLine();
		
		//파일 출력용 스트림 객체 생성
		FileWriter fw = new FileWriter(fileName);
		
		//화면에파일에 저장할 내용을 입력하시오 출력
		System.out.print("파일에 저장할 내용을 입력하시오.");
		while(true) {
			input = br.readLine();
			
			if(input.equals("exit")) {
				break;
			}
			fw.write(input);
			fw.flush();
		}
		
		System.out.println("파일에 성공적으로 저장되었습니다.");
		
		fw.close();
	}
	public void fileRead() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		// 키보드로 사용할 파일 명을 입력받음
		String fileName = br.readLine();
		
		//파일 출력용 스트림 객체 생성
		BufferedReader fr = new BufferedReader(new FileReader(fileName));
		StringBuilder  stringBuilder = new StringBuilder();
		String line;
		try {
	        while((line = fr.readLine()) != null) {
	            stringBuilder.append(line);
	            stringBuilder.append("\n");
	        }

	        System.out.println(stringBuilder.toString());
	    } finally {
	        fr.close();
	    }
	}
}
