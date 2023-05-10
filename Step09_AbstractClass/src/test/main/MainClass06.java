package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass06 {

	public static void main(String[] args) {
		
		//아래 있는 useWeapon()메소드를 호출하려면 Weapon type의 참조값이 필요하다.
		//익명의 Local Inner Class 를 이용해서 W Peapon type 의 참조값을 얻어내서
		//Weapon w1 = new MyWeapon();	
		//useWeapon(w1);
		//이름이 있는 클래스를 따로 만들지 않고 추상클래스 Weapon type의 참조값을 얻어낼수 있을까 ?
		
		Weapon w1 = new Weapon() {

			@Override
			public void attack() {
				System.out.println("아무나 공격하자!!!");
				
			}
		
		};
		useWeapon(w1);
		
		
		//메소드를 호출할때 바로 익명 클래스를 이용해서 Weapon type의 참조값을 얻어내서 사용하기
		useWeapon(new Weapon() {

			@Override
			public void attack() {
				System.out.println("김구라를 공격해요!");
				
			}
		
		});
	}
	
	//Weapon type의 참조값을 전달 받아서 사용하는 static메소드
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		w.attack();
	}
}
