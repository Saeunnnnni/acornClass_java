package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass05 {

	public static void main(String[] args) {
		PrintStream ps=System.out;
		//학습을 위해서 PrintStream 객체를 부모 type OutputStream 으로 받아보기
		//OutputStream 도 1byte 처리 스트림이다.
		OutputStream os=ps;
		OutputStreamWriter osw = new OutputStreamWriter(os);
		try {
			osw.write(48148);
			osw.write(48372);
			osw.write(44032);
			osw.write("아니야"); //write는 출력할 준비 !
			osw.flush();// flush될때 실제로 출력이 된다 !
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
