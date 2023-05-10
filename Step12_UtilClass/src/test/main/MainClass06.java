package test.main;

import java.util.HashMap;

import test.mypac.Car;
import test.mypac.Member;
/*
 * java에서 어떤 데이터를 key : value의 쌍으로 관리하고 싶으면 
 * HashMap  객체를 사용하다/
 * key generic 도 마음대로 지정할수 ㅣㅇㅆ지만 보통 String typed으로 한다.
 * 
 * value의 generic은 그때그때 다르지만 value가 여러가지 type이면 object로 지정한다,
 */
public class MainClass06 {

	public static void main(String[] args) {
		HashMap<String, Object>  map1 =new HashMap<>();
		
		
		
		map1.put("num",1);   //Integer type 담기
		map1.put("name", "김구라"); //String type 담기
		map1.put("isMan", true); //Boolean type 담기
		map1.put("car", new Car("소나타"));  //Car type 담기
		map1.put("member", new Member(1, "에이콘", "강남"));
		System.out.println(map1);
		
		/*
		 * value의 generic 클래스가 object로 지정되어있기때문에 
		 * 리턴되는 object type을 원래 type으로 casting해야한다.
		 */
		
		
		int num = (int)map1.get("num");
		System.out.println(map1);
	    String name = (String)map1.get("name");
	    boolean isMan = (boolean)map1.get("isMan");
	    Car car = (Car)map1.get("car");
	    System.out.println(map1);
	 
	      
	      //동일한 key 값으로 다시 담으면 수정
	      map1.put("name", "에이콘");
	    
	      //특정 key 값으로 담긴 내용 삭제, 성공하면 true, 실패하면 false 리턴
	      map1.remove("isMan");
	    
	      //모두 삭제   
	      map1.clear();

		
		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(1, "사과");
		map2.put(2, "포도");
		map2.put(3, "딸기");
		
		
		
		HashMap<String, Object> map3 = new HashMap<>();
		map3.put("num", 1);
		map3.put("name", "새은");
		map3.put("isWomen", "true");
		map3.put("car", new Car("bmw"));
		System.out.println(map3);
		
		map3.put("num", 2);
		
		int num2 = (int)map3.get("num");
		System.out.println(map3);
		
		map3.remove("isWomen");
		System.out.println(map3);
		
		map3.clear();
		System.out.println(map3);
	}

}
