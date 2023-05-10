package test.main;

import test.mypac.AndroidPhone;

public class MainClass05 {
	public static void main(String[] args) {
		
		AndroidPhone p1= new AndroidPhone();
		//메소드 호출해보기 
		p1.call();  //phone 객체의 기능
		p1.mobileCall(); //handphone 객체의 기능
		p1.takePicture(); //Handphone 객체의 기능
		p1.doInternet(); //Androidphone 객체의 기능
		p1.showPlatform(); //Androidphone 객체의 기능
	}
}
