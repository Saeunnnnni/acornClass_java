package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass04 {
	public static void main(String[] args) {
		//HandPhone 객체를 생성해서 나온 참조값을 Object type p3 라는 지역변수에 담아 보세요.
		Object p3 = new HandPhone();
		//Object type p3  변수에 담긴 값을 Phone type p2라는 변수에 담기 
		//Phone p2 = p3; //오류가 없으려면 모든 object가 phone타입이어야 성립이됨.. 
		Phone p2 = (Phone)p3;//casting 연산자를 이용하면 가능하다.
		
		
		//Object type p3 변수에 담긴 값을 HandPhone type p1이라는 변수에 담기 
		HandPhone p1 = (HandPhone)p3;
	}
}
