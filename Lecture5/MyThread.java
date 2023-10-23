package Lecture5;

public class MyThread extends Thread {
	Thread t;
	
	public MyThread(String name) {
		super(name);
		startMe();
	}
	
	private void startMe() {
		//Before
		System.out.println(this.getName() + " b " + this.getState());
		this.start();
		//After
		System.out.println(this.getName() + " a " + this.getState());
	}
	
	public MyThread(String name, Thread t) {
		super(name);
		this.t = t;
		startMe();
	}
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("I-" + (i+1) + " " + this.getName() + " : " + this.getState());
			
			if(t != null) {
				for(int j = 0; j < 10; j++) {
					System.out.println("J-" + (j+1) + " " + this.getName() + " : " + this.getState() + " along with " + t.getName() + " -> " + t.getState());
					
					try {
						this.sleep(500);
					}catch (Exception e) {}
				}
			}
		}
	}
	
}
