package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Member;

public class MainClass05 {
	public static void main(String[] args) {
		//1. Member 객체를 담을 수 있는 ArrayList 객체를 생성해서 참조값을 members라는 지역변수에 담아보세요.
		List<Member> members = new ArrayList<>();
		//2. 3명의 회원정보를 Member 객체에 각각 담아 보세요. (Member 객체가 3개 생성되어야 함)
		Member m1=new Member(1, "김구라","노량진");
		Member m2=new Member(2, "해골","행신동");
		//객체를 넣어주지 않아도 기본값이 들어간다. 
		Member m3=new Member();
		//필드를 직접 참조해서 값을 넣어 주어야 한다.
		m3.num=3;
		m3.name="원숭이";
		m3.addr="동물원";
		
		//3.  위에서 생성된 Member 객체의 참조값을 members List 객체에 모두 담아 보세요.
		members.add(m1);
		members.add(m2);
		members.add(m3);
		
		/*		 * 
		 * 4. member List 객체에 담긴 내용을 이용해서 회원 목록을 아래와 같은 형식으로 반복문 돌면서 출력해보세요
		 * 
		 * 번호 : 1, 이름: 김구라 , 주소 : 노량진
		 * 번호 : 2, 이름: 해골,  주소: 행신동 
		 * 
		 */
		
		//기본 for문
		for(int i=0; i < members.size();i++) {
			Member tmp = members.get(i);
			System.out.println("번호 :" + tmp.num + " 이름 : " + tmp.name + "주소 : " + tmp.addr );
		}// member의 필드가 public이기떄문에 .으로 접근 가능! 
		//확장 for문
		for(Member tmp : members) {
			System.out.println("번호 :" + tmp.num + " 이름 : " + tmp.name + "주소 : " + tmp.addr );
		}
		
	}
}
