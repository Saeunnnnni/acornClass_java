package test.main;

import java.util.Random;

import test.mypac.Car;
import test.mypac.Memory;

public class main1 {

	public static void main(String[] args) {
		Car car = new Car(0, null, null);
		Car car2 = car;
		
		car.name="붕붕";
		car.price=100;
		
		car.drive();
		car.carPrice();
		
		car2.drive();		
		car.carNum(1);
		
		Car car3= new Car(1, "모닝", "파랑");
		car3.printCarList();
		
		Memory[] memory = new Memory[3];
		
		memory[0] = new Memory();
		memory[1] = new Memory();
		memory[2] = new Memory();
		
		for(int i =0; i < memory.length; i++) {
			Memory tmp = memory[i];
			
			tmp.read();
		}
		
	
		String[]items= {"Cherry" ,"Orange", "banana", "pear"};
		
		Random ran= new Random();
		
		int[] nums= new int[3];
		
		for(int i = 0; i <3; i ++) {
			int ranNum = ran.nextInt(5);
			
			
		}
		
		
		
		
	}

}
