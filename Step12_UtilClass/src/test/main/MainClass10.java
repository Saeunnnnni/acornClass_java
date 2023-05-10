package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass10 {

	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		names.add("주뎅이");
		names.add("덩어리");
		
		//반복자(Iterator) 객체 얻어내기 (저장된 item을 일렬로 세웠다고 생각하면 됨)
		Iterator<String> it =names.iterator();
		while(it.hasNext()) {
			//cursor를 다음칸으로 이동해서 커서가 위치한 곳의 item을 가져오기 
			String item= it.next();
			System.out.println(item);
		}
		
		System.out.println("-------");
		
		names.forEach((item) -> {
			System.out.println(item);
		});
		
		//특정 item(데이터, 참조값 ) 존재 여부 알아내기 
		boolean isCountain=names.contains("김구라");
		//저장된 item의 갯수A
		int size=names.size();
		//특정 item 삭제
		names.remove("해골");
		//모든 아이템 삭제
		names.clear();
	}

}