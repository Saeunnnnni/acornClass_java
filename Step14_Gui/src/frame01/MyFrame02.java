package frame01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame02 extends JFrame{
	
	//생성자 
	public MyFrame02(String title) {
		super(title);
		//setBounds(x, y, width,height) 창의 위치와 크기 설정
		this.setBounds(100, 100, 500, 500);
		//이프레임(MyFrame)의 x버튼 (close 버튼)을 눌렀을때 프로세스도 같이 종료 되도록 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//레이아웃 매니저사용
		setLayout(new FlowLayout(FlowLayout.LEFT));;
		
		JButton btn1= new JButton("버튼1");
		add(btn1); //프레임에 버튼 추가하기
		
		JButton btn2= new JButton("버튼2");
		add(btn2); //프레임에 버튼 추가하기
		
		JButton btn3= new JButton("버튼3");
		add(btn3); //프레임에 버튼 추가하기
		
		
		//프레임을 화면상에 실제 보이게 하기(false 하면 화면에 보이지 않는다.)
		setVisible(true);
	}
	
	public static void main(String[] args) {
		//MyFrame 객체 생성
		new MyFrame02("나의 프레임!");
		System.out.println("main메소드가 종료 됩니다");
	}
}
