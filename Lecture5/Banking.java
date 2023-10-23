package Lecture5;

import java.util.Random;

public class Banking implements Runnable{
	private BankAccount ba;
	private String name;
	private int totalWithdrawn = 0;
	private Random r = new Random();
	
	public Banking(BankAccount ba, String name) {
		this.ba = ba;
		this.name = name;
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
			//synchronized(this.ba) {
				int amount = r.nextInt(100);
				this.totalWithdrawn += amount;
						System.out.println((i+1) + ": " + this.name + " Withdraw $" + amount);
						this.ba.withdraw(amount);
						System.out.println();
			//}
			Thread.sleep(1000);
			}catch (Exception e) {}
		}
		System.out.println(this.name + "spent $" + this.totalWithdrawn);
		
	}
	
	
}
