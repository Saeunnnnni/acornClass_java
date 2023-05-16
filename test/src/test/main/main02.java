package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class main02 {
	
	static class seaWeapon extends Weapon{

		@Override
		public void attack() {
			System.out.println("바다를 공격해요!");
			
		}
		
	}

	public static void main(String[] args) {
		Weapon p1= new seaWeapon();
		
		p1.prepare();
		p1.attack();
		
		class spaceWeapon extends Weapon{

			@Override
			public void attack() {
				System.out.println("우주를 공격해여!");
				
			}
			
		}
		Weapon p2= new spaceWeapon();
		p2.attack();

	}

}
