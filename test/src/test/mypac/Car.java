package test.mypac;

public class Car {
	
	public String name;
	public int price;
	
	public void drive() {
		System.out.println(this.name + " 는 도로 위를 달려요!");
		
	}
	public void carPrice() {
		System.out.println(this.name + " 이는 " + this.price + "입니다!" );
	}
	
	public void carNum(int num) {
		System.out.println(num + "번째 자동차에요!");
	}
	public int num;
	public String CarName;
	public String CarColor;
	
	public Car(int num, String CarName, String CarColor) {
		this.CarName=CarName;
		this.CarColor=CarColor;
	}
	
	public void printCarList() {
		System.out.println("이 차는 " + num + "번째 자동차이고" + "이름은 " + CarName + "이며, 자동차의 색깔은" + CarColor +"이다.");
	}
}
