package test.main;

import java.util.ArrayList;
import java.util.List;

/*
 * java에 배열은 크기를 조절할수 없는 고정 배열이다.
 * 
 * 따라서 동적으로 item을 추가하고 삭제하고 하는 작업을 하려면 일반배열은 사용할수 없다.
 * 
 * 그래서 해당 작업을 하려면 ArrayList객체를 사용하면 된다.
 */

public class MainClass01 {
	public static void main(String[] args) {
		//String type을 저장할 수 있는 ArrayList 객체 생성해서 참조값을 names에 담아보세요.
		ArrayList<String> names = new ArrayList<>();
		//"김구라","해골", "원숭이" 3개의 String type을 저장해보세요.
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		//0번방의 아이템을 불러와서 item 이라는 변수에 담아보세요
		String item = names.get(0);
		//1번 방의 아이템을 삭제하려면 ?
		names.remove(1);
		//0번 방에 "에이콘을 넣고 싶으면 ?
		names.add(0, "아이콘");
		//저장된 아이템의 갯수(size)를 size라는 지역 변수에 담아보세요.
		int size = names.size();
		//저장된 모든 아이템 전체 삭제
		names.clear();
		
		List<String> friends = new ArrayList<>();
		
		friends.add("영심");
		friends.add("새은");
		friends.add("윤정");
		System.out.println(friends);
		
		int size2 = friends.size();
		System.out.println(size2);
		
		
		
		
		
	}
}
