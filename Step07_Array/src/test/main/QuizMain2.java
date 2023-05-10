package test.main;

import java.util.Random;

public class QuizMain2 {

	public static void main(String[] args) {
		/*
		 * run 했을대
		 * 5개의 문자열 중에서 3개가 한줄에 한번에 랜덤하게 ㅜㄹ력되게 해보세요.
		 * ex) cherry | apple | cherry
		 * 		7| apple|melon
		 * 
		 */
		
		String[]items= {"cherry","apple","banana","melon","7"};
		
		Random ran=new Random();
		
		for(int i =0; i < 3;  i++) {	
			//0~4  사이의 랜덤한 숫자를 하나 얻어내서 
			int ranNum=ran.nextInt(5);
			//배열의 인덱스로 활용해서 문자열 출력하기 
			System.out.print(items[ranNum]);
			if(i<2) {
				System.out.print("|");
			}
			
		}
		
		
		
		
	}

}
