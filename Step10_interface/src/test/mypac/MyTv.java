package test.mypac;

public class MyTv implements Remocon{
	@Override
	public void down() {
		System.out.println("채널을 내려요2");
		
	}
	@Override
	public void up() {
		System.out.println("채널을 올려요2");
		
	}

//그런데.. 나는 내가 사용할 편리한 메소드를 하나 더 만들고 싶다..
	public void reserve() {
		System.out.println("전원 off를 예약합니다.");
	}
}