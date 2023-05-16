package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dao.MemberDao;
import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass14 {

	public static void main(String[] args) {
		
		//수정할 회원의 정보 
		int num=1;
		String name="김구라";
		String addr="독산동";
		
		//위의 정보르르 이용해서 1번 회원의 정보를 수정하고 성공이면 "수정했습니다"가 출력되도록 해 보세요
		//수정할 회원의 정보를 MemberDto ㄱㄱ체에 담고
		/*MemberDto dto = new MemberDto();
		dto.setNum(num);
		dto.setName(name);
		dto.setAddr(addr);*/
		
		//MemberDao 객체를 이용해서 회원 정보를 저장하고 성공여부를 리턴 받는다.
		//인자를 한번에 전달 받는 방법 ! 이렇게도 가능! 
		 MemberDto dto = new MemberDto(num, name, addr);
		 boolean isSuccess=new MemberDao().update(dto);
		 if(isSuccess) {
			 System.out.println("수정했습니다");
		 }

	}

}
