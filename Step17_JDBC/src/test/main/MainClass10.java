package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass10 {
	
	public static void main(String[] args) {
		int num =1; 
		String name="호빵";
		String addr="독산동";
		
		
		MemberDto dto1= new MemberDto();
		dto1.setName("호빵");
		dto1.setAddr("독산동");
		dto1.setNum(1);
		
		update(dto1);
	}
	
	public static void update (MemberDto dto) {
		 //sql문을 대신 실행해줄 객체의 참조값을 담을 지역변수 미리 만들기 
	      Connection conn= null;
	      //sql 문을 대신 실행해줄 객체의 참조값을 담을 지역변수 미리 만들기
	      PreparedStatement pstmt=null;
	      try {
	    	  //Connection 객체의 참조값 얻어오기 
	    	  conn = new DBConnect().getConn();
	         //실행할 미완성의 sql 문
	         String sql="UPDATE member"
	        		 + " SET name=?, addr=? "
					 + " WHERE num=?";
	         //미완성의 sql 문을 전달하면서 PreparedStatement 객체의 참조값 얻어내기
	         pstmt=conn.prepareStatement(sql);
	         //PreparedStatement 객체의 메소드를 이용해서 미완성인 sql 문을 완성시키기(? 에 값 바인딩하기)
	          //1번째 ? 에 문자열 바인딩
	         pstmt.setString(1, dto.getName()); 
	         pstmt.setString(2, dto.getAddr());
	         pstmt.setInt(3, dto.getNum());
	         //sql 문 실행하기
	         pstmt.executeUpdate();
	         System.out.println("회원 정보를 수정했습니다.");
	      }catch(Exception e) {
	         e.printStackTrace();
	      }
	}
	}

