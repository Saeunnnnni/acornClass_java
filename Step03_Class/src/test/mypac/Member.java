package test.mypac;
/*
 * Member 객체 하나에 회원의 번호, 이름, 주소를 담기위해 Member 클래스를 설계 하려고 한다.
 */
public class Member {
	//필드
	public String name ;
	public int number ;
	public String addr ;
	
	//메소드
	public void call() {
		System.out.println("이름:"+ this.name + "번호:"+ this.number+"주소:"+ this.addr);
	};
}
