package test.main;

import java.util.Random;

public class QuizMain {
	public static void main(String[] args) {
		/*
		 * 1. run 햇을때 
		 * cherry, apple, banana,melon,7
		 * 5개의 문자열 중에서 1개가 랜덤하게 출력되게 해 보세요.
		 */
		String[] str= new String[5];
		str[0]="cherry";
		str[1]="apple";
		str[2]="banana";
		str[3]="melon";
		str[4]="7";
		Random ran = new Random();
		
		int ranNum = ran.nextInt(5);
		System.out.println(str[ranNum]);
	}
}
