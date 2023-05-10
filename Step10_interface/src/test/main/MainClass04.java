package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		useDrill(new Drill() {
			
			@Override
			public void hole() {
				System.out.println("바닥에 구멍을 뚫어요");
			}
		});
		
		/* 
		 * 위에 코드의
		 * 간략한 표현식(줄인표현) 추상 메소드가 오직 1개(=오버라이드 할게 1개뿐일때)인
		 * 인터페이스만 가능하다.
		 * 
		useDrill(()->{
			System.out.println("천장");
		});*/
	}
	public static void useDrill(Drill d) {
		d.hole();
		d.hole();
	}
}
