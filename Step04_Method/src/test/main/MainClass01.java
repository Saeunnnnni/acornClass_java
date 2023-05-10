package test.main;

import java.io.File;

import test.mypac.Airplane;
import test.mypac.Test;

public class MainClass01 {
	public static void main(String[] args) {
		Test t=new Test();
		//return type이 void 인 메소드 호출
		t.walk();
		//return type이 int인 메소드 호출하고 리턴되는 값 a라는 int type 지역변수에 담기 
		int a = t.getNumber();
		//return type이 String 인 메소드 호출하고 리턴되는 값을 라는 String type 지역변수에 담기 
		String b = t.getGreeting();
		//return type이 Airplane 인 메소드 호출하고 리턴되는 값을 c라는 Airplane type 지역변수에 담기 
		Airplane c =t.getPlane();
		c.fly();
		System.out.println("main메소드가 종료됩니다.");
		//위에서 생성한 객체의 setNum() 메소드를 호출해보세요.
			t.setNum(0); 
			//int num = 100
			//객체의 메소드를 호출할때 안에 들어갈 값이 생각나지 않는다면 
			//변수 안에 넣는 값을 떠올리고 그 값을 넣어라 !
			
		//위에서 생성한 객체의 setName() 메소드를 호출해보세요.
			t.setName("saeun");
			//String name = 100
		//위에서 생성한 객체의 setPlane() 메소드를 호출해보세요.
			t.setPlane(new Airplane());
			// Airplane plane = new Airplane()
			
			new File("C:XXX/XXX/XXX.TXT").delete();
			//원하는 파일의 경로를 지워준다 DELETE는 blooen타입이기 때문에 
			// 삭제에 성공하면 true/ 실패하면 false 
			
		
			t.doSomething(100, "cheese" , new Airplane());
			
			t.send();
			t.send(10);
			t.send("수박");
			t.send(new Airplane());
			
	}
}
