package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 * 세명의 회원정보를 HashMap(번호,이름,주소) 객체에 각각 담아서
		 * 
		 * ArrayList 객체에 누적 시켜보세요.
		 * 
		 * 반복문 돌면서 ArrayList 객체에 누적된 회원정보를 콘솔창에 순서대로 출력해 보세요.
		 */
		List<Map<String, Object>> members = new ArrayList<>();
		
		Map<String, Object> member1 = new HashMap<>();
		member1.put("num", 1);
		member1.put("name", "김구라");
		member1.put("addr", "노량진");
		
		Map<String, Object> member2 = new HashMap<>();
		member2.put("num", 2);
		member2.put("name", "원숭이");
		member2.put("addr", "행신동");
		
		Map<String, Object> member3 = new HashMap<>();
		member3.put("num", 3);
		member3.put("name", "해골");
		member3.put("addr", "면목동");
		
		System.out.println(member1);
		System.out.println(member2);
		System.out.println(member3);
		
		
		members.add(member1);
		members.add(member2);
		members.add(member3);
		System.out.println(members);
		
		
		for (Map<String, Object> tmp:members) {
		
			int num=(int)tmp.get("num");
			String name=(String)tmp.get("name");
			String addr=(String)tmp.get("addr");
			
			System.out.println("num:" + num + ", name: " + name +",addr:" + addr);
		}
		
		
		
	}
}
