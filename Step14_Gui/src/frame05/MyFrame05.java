package frame05;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame05 extends JFrame implements ActionListener{
	
	//생성자 
	public MyFrame05(String title) {
		super(title);
		//setBounds(x, y, width,height) 창의 위치와 크기 설정
		this.setBounds(100, 100, 500, 500);
		//이프레임(MyFrame)의 x버튼 (close 버튼)을 눌렀을때 프로세스도 같이 종료 되도록 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//borderLayout 매니저사용
		setLayout(new FlowLayout());;
		
		JButton sendBtn= new JButton("전송");
		add(sendBtn);//프레임에 버튼 추가하기
		//여기서 this는 프레임의 참조값 : MyFrame은 Component 타입을 상속받았기때문에 ! 
		//Component a = this; 
		
		//ActionListener 인터페이스 type 의 참조값을 얻어내서 
		ActionListener listener1 = new ActionListener() {
			//이 리스너를 등록한 UI에 어떤 액션이 발생하면 호출되는 메소드
			@Override
			public void actionPerformed(ActionEvent e) {
				ActionListener b= this;
				//여기서 this는 actionListener
				System.out.println("전송버튼 클릭!!");
				//JOptionPane.showMessageDialog(프레임의 참조값, "띄울메세지");
				//JOptionPane.showMessageDialog(this, "전송합니다");
				//여기서 this를 하면 프레임의 참조값이 아니기 때문에 오류가 난다.
				
				//클래스명.this 하면 바깥에 있는 클래스로 생성한 객체의 참조값을 가리킬수 있다.
				JOptionPane.showMessageDialog(MyFrame05.this , "전송합니다");
				//프레임의 참조값을 변수에 담아서 전달 ! 
				
			}
		};
		
		sendBtn.addActionListener(listener1);
		
		JButton deleleBtn=new JButton("삭제");
		add(deleleBtn);
		
		/*deleleBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("삭제버튼을 눌렀네!");
				
			}
		});*/
		//ActionListener 인터페이스 type의 참조값을 함수 형태로 전달도 가능 
		deleleBtn.addActionListener((e)->{
			System.out.println("삭제버튼을 눌렀네!");
			//함수 형태의 매소드에서 this는 바깥 클래스로 생성한 객체의 참조값을 가리킬수 있다.
			JOptionPane.showMessageDialog(this , "삭제합니다");
		});
		
		JButton updateBtn=new JButton("수정");
		add(updateBtn);
		
		//MyFrame 을 ActionListener인터페이스 type으로 만들수는 없을까 ? 
		//implements ActionListener -> 프레임 자체를 액션리스너 했기때문에 아래쪽 override 로 가서 실행
		updateBtn.addActionListener(this);
		
		//프레임을 화면상에 실제 보이게 하기(false 하면 화면에 보이지 않는다.)
		setVisible(true);
	}
	
	public static void main(String[] args) {
		//MyFrame 객체 생성
		new MyFrame05("나의 프레임5!");
		System.out.println("main메소드가 종료 됩니다");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this , "수정할꺼야 ?");
		
	}
}
