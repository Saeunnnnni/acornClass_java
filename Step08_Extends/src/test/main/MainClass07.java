package test.main;

import test.auto.Car;
import test.auto.Engine;

public class MainClass07 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Car 클래스는 default  생성자가 없고 
		 * Engine type의 참조값을 전달해야하지만 호출되느 생성자를 가지고 있기 때문에
		 * Car 객체를 생성하기 위해서는 반드지 Engine()
		 */
		
		Car car1 = new Car(new Engine());
		car1.drive();

	}

}
