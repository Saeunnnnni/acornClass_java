package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		//1. Car type 을 저장할수 있는 ArrayList 객체를 생성해서 
		//참조값을 List 인터페이스 type 지역변수 cars에 담아보세요
		ArrayList<Car> cars = new ArrayList<>();
		//2. Car 객체(3개)를 생성해서 List 객체에 저장해 보세요.
		cars.add(new Car("소나타"));
		cars.add(new Car("모닝"));
		cars.add(new Car("레이"));
		Car car1 = new Car("그랜저");
		cars.add(car1);
		
		//3. 일반 for문을 이용해서 List객체에 저장된 모든 Car 객체의 drive() 메소드를 
		//순서대로 호출해보세요
		for (int i =0; i < cars.size(); i++) {
			Car p = cars.get(i);
			p.drive();		
		}
		
		//4. 확장 for문을 이용해서 List 객체에 저장된 모든 Car객체의 drive() 메소드를 
		//순서대로 호출해보세요
		for(Car tmp : cars) {
			tmp.drive();
		}
		
		//5. Consumer 인터페이스를 활용해서 List 객체에 저장된 모든 Car 객체의 drive() 메소드를
		//순서대로 호출해보세요.
		cars.forEach((tmp)->{
			tmp.drive();
		});
		
		List<Car> cars2 = new ArrayList<>();
		cars2.add(new Car("제네시스"));
		cars2.add(new Car("모닝"));
		cars2.add(new Car("레이"));
		Car car3 = new Car("아반떼");
		cars2.add(car3);
		
		for(int i =0 ; i < cars2.size(); i++) {
			Car a  = cars2.get(i);
			a.drive();
		}
		
		for(Car b : cars2) {
			b.drive();;
		}
	}
	
}
