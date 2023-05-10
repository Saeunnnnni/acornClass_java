package test.main;

import test.mypac.MyRemocon;
import test.mypac.MyTv;
import test.mypac.Remocon;

public class MainClass02 {
	public static void main(String[] args) {
		//다향성 확인 
		MyRemocon r1 = new MyRemocon();
		Remocon r2=r1;
		Object r3=r1;
		
		
		//직접 클래스를 test.mypac 패키지에 파일로 만들어서 useRemocon() 메소드를 여기서 호출해 보세요.
		MyTv r4= new MyTv();
		useRemocon(r4);
		//나만의 기능도 호출해보기
		r4.reserve();
	}
	
	

	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
		
		/*여기서는 reserve() 메소드를 사용할 수 없음 -> 왜냐면 Remocon에 대한 설명서이기 때문임
		만일 여기서 reserve()메소드를 활용하고 싶으면 방법이 없을까 ?
		r을 MyTv에 담긴다면 reserve할 수 있음 / 단, r에 담긴 값이 My Tv에 담기는게 확실하다면 
		캐스팅 해서 사용 할 수 있음 하지만 다른 메소드를 사용할 수 없게 된다 .		
		 자주 사용하지 않음 */
		
		/*
		 * MyTv r2 = (MyTv)r;
		 * r2.reserve();
		 */
		
	}
}
