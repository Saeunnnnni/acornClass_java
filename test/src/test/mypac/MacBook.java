package test.mypac;

public class MacBook {
	private CPU cpu;
	private Memory memory;
	private HardDisk hardDisk;
	
	
	public MacBook(CPU cpu, Memory memory, HardDisk hardDisk) {
		this.cpu = cpu;
		this.memory = memory;
		this.hardDisk = hardDisk;
				
	}
	public void goGame() {
		if(this.cpu == null || memory == null || hardDisk == null) {
			System.out.println("부품부족 실행불가");
			return;
			
		}
		System.out.println("신나는 게임 ~ ");
	}
}
