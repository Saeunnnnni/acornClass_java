package frame09;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Myframe extends JFrame implements ActionListener{
	JTextField inputMsg, inputMsg2;
	JButton plusBtn, minusBtn, mutiBtn, divBtn;
	JLabel label, label2;
	
	public Myframe(String title) {
		super();
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		inputMsg= new JTextField(10);
		plusBtn = new JButton("+");
		minusBtn = new JButton("-");
		mutiBtn = new JButton("*");
		divBtn = new JButton("/");
		inputMsg2= new JTextField(10);
		label=new JLabel("=");
		label2=new JLabel("");
		
		
		
		add(inputMsg);
		add(plusBtn);
		add(minusBtn);
		add(mutiBtn);
		add(divBtn);
		add(inputMsg2);
		add(label);
		add(label2);
		
		setVisible(true);
		
		//버튼에 액션 리스너 등록하기 
		plusBtn.addActionListener(this);
		minusBtn.addActionListener(this);
		mutiBtn.addActionListener(this);
		divBtn.addActionListener(this);
		//버튼에 action command 설정하기 : 설정한하면 위에서 입력한 텍스트값으로 설정됨
		plusBtn.setActionCommand("plus");
		minusBtn.setActionCommand("minus");
		mutiBtn.setActionCommand("multi");
		divBtn.setActionCommand("divide");
		
		
	}

	public static void main(String[] args) {
		new Myframe("계산기");
		
	}
	
	//ActionListener 인터페이스를 구현했기 때문에 강제 오버라이드된 ㅁ소드 
	@Override
	public void actionPerformed(ActionEvent e) {
		String strNum1 = inputMsg.getText();
		String strNum2 = inputMsg2.getText();
	try {
		//입력한 문자열을 실수(double)로 변경하기
		Double num1 = Double.parseDouble(strNum1);
		Double num2 = Double.parseDouble(strNum2);
		
		//눌러진 버튼의 command 읽어오기		
		String cmd=e.getActionCommand();
		//연산의 결과값을 담을 변수를 미리 선언하고 초기값 대입하기(왜 미리 선언해야 하나 ?를 알아야함)
		double result=0;
		//command 가 무엇이냐를 확인해서 분기하기 
		if(cmd.equals("plus")) {
		 result=num1+num2;
		}else if (cmd.equals("minus")) {
			result=num1-num2;
		}else if (cmd.equals("multi")) {
			 result=num1*num2;
		}else if (cmd.equals("divide")) {
			if(num2==0) {
				JOptionPane.showMessageDialog(this, "어떤수를 0으로 나눌수는 없어요!");
				return;
			}
			 result=num1/num2;
		}
		//숫자를 (double) 문자열 (String)로 바꾸기
				String resultText = Double.toString(result);
				//결과값을 JLabel에 출력하기 
				label2.setText(resultText);
			
		} catch (NumberFormatException nef) {
			JOptionPane.showMessageDialog(this,"숫자로 입력해 주세요 ! ");
		}	
		
		
	
	}
		
}
