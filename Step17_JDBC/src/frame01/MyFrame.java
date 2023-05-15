package frame01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import oracle.net.aso.l;

public class MyFrame extends JFrame implements ActionListener{
	JTextField inputMsg, inputMsg2, inputMsg3;
	
	public MyFrame(String title) {
		super(title);
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JPanel p1 = new JPanel();
		
		 inputMsg =new JTextField(10);
		 inputMsg2 =new JTextField(10);
		 inputMsg3 =new JTextField(10);
		 
		 JButton btn1 = new JButton("전송");
		 
	
		 p1.add(inputMsg);
		 p1.add(inputMsg2);
		 p1.add(inputMsg3);
		 p1.add(btn1);
		 
		 add(p1, BorderLayout.CENTER);
		 
		 setVisible(true);	
		 
		 btn1.addActionListener((e2)->{
			
	}
	
	public static void main(String[] args) {
		new MyFrame("나의 프레임");
		
		Connection conn = null;
		  try {
		         //오라클 드라이버 로딩
		         Class.forName("oracle.jdbc.driver.OracleDriver");
		         //접속할 DB 의 정보 @아이피주소:port번호:db이름
		         String url="jdbc:oracle:thin:@localhost:1521:xe";
		         //계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
		         conn=DriverManager.getConnection(url, "scott", "tiger");
		         //예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
		         System.out.println("Oracle DB 접속 성공");
		      } catch (Exception e) {
		         e.printStackTrace();
		      }
	      //sql문을 대신 실행해줄 객체의 참조값을 담을 지역변수 미리 만들기 
		  
		  int num  = ;
		String name = ;
		String addr = ;
	      PreparedStatement pstmt = null;
	      
	      
	      try {
			//실행할 미완성의 sql문
	    	  String sql = " INSERT INTO member "
	    			  	+ " (num, name, addr)"
	    			  	+ " VALUES(?, ?, ?)";
	    	  //미완성의 sql문을 전달하면서 PreparedStatement 객체의 참조값 얻어내기
	    	  pstmt = conn.prepareStatement(sql);
	    	  //prepareStatement 객체의 메소드를 이용해서 미완성인 sql문을 완성시키기(?에 값 바인딩하기)
	    	  pstmt.setInt(1, num); //1번째 ?에 숫자 바인딩 
	    	  pstmt.setString(2, name); //2번째 ? 에 문자열 바인딩
	    	  pstmt.setString(3, addr); //3번째 ?에 문자열 바인딩
	    	  //sql문 실행하기
	    	  pstmt.executeUpdate();
	    	  System.out.println("회원정보를 저장했습니다.");
	      } catch (Exception e) {
			  e.printStackTrace();
	      }
	 }
}
