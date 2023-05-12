package frame01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;




/*
 * 프레임에 JTextFied와 JButton을 배치해서 
 * JTextFied에 문자열을 입력하고 저장버튼을 누르면 
 * 입력한 문자열이 diary.txt 파일에 누적 기록이 되도록 프로그래밍 해보세요
 */

	public class myFrame extends JFrame {
		JTextField field;
		public myFrame(String title) {
			super(title);
			
			setBounds(100,100,500,500);			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
			setLayout(new BorderLayout());
			//borderLayout으로 생성 ! 
			
			
			//UI를 감쌀 패널
			JPanel p1 = new JPanel();
			
			JTextField field = new JTextField(20);
			JButton submitBtn = new JButton("저장");
			
			p1.add(field);
			p1.add(submitBtn);
			
			//패널을 프레임의 북쪽에 배치
			add(p1, BorderLayout.NORTH);
			//패널의 배경색 
			p1.setBackground(Color.YELLOW);
			
			
			
			/*
			 * 읽어오기 버튼을 누르면 diary.txt에 모든 문자열을 읽어와서 
			 * JTextArea 에 출력해보세요
			 * 
			 * hint
			 * FileReader 객체를 활용하면 파일에서 문자열으르 읽어 낼 수 있ㅇ습니다
			 */
			
			//textarea 생성 ! 
			JTextArea ta = new JTextArea();
			add(ta, BorderLayout.CENTER);
			
			JButton readBtn = new JButton("읽어오기");
			p1.add(readBtn);
					
			
			setVisible(true);
			
			//이벤트 두개에서 동일하게 사용해야하기 때문에 이벤트의 안쪽이 아닌 바깥쪽에 선언
			 File f = new File("c:\\acorn202304\\myFolder\\diary.txt");
			 
			 //입력한 문자를 메모장에 전달하는 이벤트
			 submitBtn.addActionListener((e2)->{
				 //입력한 문자열 읽어오기 
				 String msg=field.getText(); 
				 //File 객체 
				
				 try {
					if(!f.exists()) {
						f.createNewFile();
					}
					//파일에 문자열 읽어오기 
					FileWriter fw = new FileWriter(f, true);
					fw.write(msg); 
					fw.write("\r\n");  //개행기호
					fw.flush();
					fw.close();
					JOptionPane.showMessageDialog(this,"저장 했습니다." );
				} catch (Exception e) {
					e.printStackTrace();
				}
			 });
			 
			 //파일에 저장된 문자열을 읽어오는 이벤트
			 readBtn.addActionListener((e2)->{
				 //try블럭 안에서 사용할 변수에 null을 넣어서  미리 만들어 놓는다.
				 FileReader fr = null;
				 BufferedReader br =null;
				 try{
					 //참조값은 try 블럭 안에서 new해서 넣어준다. 
					 fr = new FileReader(f);
					 br = new BufferedReader(br);
					 //반복문 돌면서
					 while(true) {
						 //문자열을 한줄씩 읽어낸다.
						 String line=br.readLine();
						 //만일 더이상 읽을 문자열이 없다면 
						 if(line==null)break;//반복문 탈출!
						 //읽어낸 문자열을 JTextArea에 출력하기 
						 ta.append(line); //개행기호는 제외된 상태로 읽어내기 때문에 
						 ta.append("\r\n"); //개행기로를 따로 추가해준다.						 
					 }
					
				 }catch (IOException e) {
					e.printStackTrace();
				}finally {
					 //사용했던 스트림은 닫아주는 것이 좋다. (열렸던 순서의 역순으로..)
					try {
						//close()를 호출할때도 null에 주의해서 호출해야한다.!
						//여기서 널포인트오류가 발생하면 fr.close()가 호출 안될 가능성이 있기때문에 if문을 작성해주어야함 !
				
						if(br!=null)br.close();
						if(fr!=null)fr.close();
					
					}catch (Exception e) {
						
					}
				
				}
				
			 });
			 
			
	
		}
	public static void main(String[] args) {
	
		new myFrame("나의 프레임");
	}

}
