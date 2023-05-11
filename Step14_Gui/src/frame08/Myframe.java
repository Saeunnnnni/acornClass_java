package frame08;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Myframe extends JFrame implements ActionListener{
	JTextField inputMsg;
	JLabel label;
	
	//생성자 
	public Myframe(String title) {
		super();
		//초기 위치와 크기 설정
		setBounds(100,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		//문자열을 한줄 입력할수 있는 JTextField객체 생성
		 inputMsg=new JTextField(10);
		JButton sendBtn = new JButton("전송");
		JButton sendBtn2 = new JButton("전송2");
		//문자열을 단순히 출력할수 있는 JLabel 객체 
		JLabel label=new JLabel("...");
		
		//MyFrame 을 액션 리스너로 등록을 한다!
		sendBtn.addActionListener(this);
		
		//함수 형태로 액션 리스너를 등록 할수도 있다.		
		sendBtn2.addActionListener((e)->{
			String msg=inputMsg.getText();
			JOptionPane.showMessageDialog(this, msg);
		});
		
		//프레임에 UI를 추가한다. (작성순서대로 배친된다) 
		add(inputMsg);
		add(sendBtn);
		add(sendBtn2);
		add(label);
		
		//UI를 모두 배치하고 나중에 호출하는 것이 원칙이다
		setVisible(true);	
		
	}
	
	public static void main(String[] args) {
		new Myframe("나의 프레임");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// JTextFidle에 입력한 문자열을 읽어온다.
		String msg=inputMsg.getText();
		// 문자열을 알림창으로 띄운다
		JOptionPane.showMessageDialog(this, msg);
		// 읽어온 문자열을 JLabel에 출력하기 
		label.setText(msg);
		
	}
}


