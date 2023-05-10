package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass03 {

	public static void main(String[] args) {
		//HandPhoe 객체를 생성해서 나온 참조값을 HandPhone type 지역변수 p1에 담기
		HandPhone p1=new HandPhone();
		//p1 안에 있는 참조값을 p2라는 Phone type 지역변수에 대입하기
		Phone p2 = p1;
		
		//p1 안에 있는 참조값을 p3라는 Object type 지역변수에 대입하기		
		Object p3 = p1;
		//자식 객체의 참조값은 부모 type 변수나 필드에 자연스럽게 담긴다.
		
		//동일한 참조값이지만 그 참조값이 담긴 타입에 따라서 메소드 사용권한? 이 달라진다.
	}

}
