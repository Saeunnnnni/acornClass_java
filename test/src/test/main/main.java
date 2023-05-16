package test.main;

import test.mypac.CPU;
import test.mypac.HardDisk;
import test.mypac.MacBook;
import test.mypac.Memory;

public class main {

	public static void main(String[] args) {
			MacBook mac=new MacBook(new CPU(), new Memory(), new HardDisk()) ;
			
			CPU c= new CPU();
			Memory m = new Memory();
			HardDisk h = new HardDisk();
			
			MacBook mac1 = new MacBook(c, m, h);
			
			MacBook mac2 = new MacBook(null, m, h);
			
			mac1.goGame();
			mac2.goGame();
			
			
		
	}

}
