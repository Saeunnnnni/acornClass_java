package test.main;

import util.MyUtil;

public class MainClass09 {
	public static void main(String[] args) {
		//상속 받은 BaseUtil 클래스에 정의된 static 매서드도 사용할 수 있다.
		MyUtil.clear();
		MyUtil.send();
		MyUtil.light();
		
	}
}
