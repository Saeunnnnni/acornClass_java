package test.main;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		
		//키보드로 부터 입력 받을수 있는 기능을 가진 객체 생성 -> 스캐너에게 전달 
		Scanner scan=new Scanner(System.in);
		//개행기호를 출력하지 않고 콘솔창에 문자열 출력하기 .print()메소드를 활용하면 된다.
		System.out.println("문자열 입력:");
		//문자열을 한줄 입력 받고 
		String str=scan.nextLine();		
		//키보드로터 입력받은 값이 없으면 그상태로 블로킹이 됨 그래서 입력을 해주어야지 다음 
		//코드가 실행됨
		
		//입력받은 문자열 콘솔에 출력해보기
		System.out.println(str);
		System.out.println("main 메소드가 종료 되었습니다.");
	}
}
