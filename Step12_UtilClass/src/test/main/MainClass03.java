package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MainClass03 {
	public static void main(String[] args) {
		
		//ArrrayList  객체를 생성해서 참조값을 List 인터페이스 type 변수에 대입하기
		List<String> greets = new ArrayList<>();
		greets.add("hello");
		greets.add("hi");
		greets.add("good night");
		
		//consumer 인터페이스 타입의 참조값 얻어내기 
		//내부 익명 클래스 
		Consumer<String> con = new Consumer<>() {

			@Override
			public void accept(String t) {
				System.out.println("오잉 : " +  t  );				
			}		
		};		
		greets.forEach(con);
		
		System.out.println("--------");
		greets.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("오잉2 : " +  t  );	
				
			}
		});
		
		//오버라이딩할 메소드가 하나일때 이렇게 표현 가능 
		System.out.println("--------");
		greets.forEach((t) -> {
			System.out.println("오잉2 : " +  t  );	
			
		});
	}
	
}
