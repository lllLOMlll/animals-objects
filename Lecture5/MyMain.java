package Lecture5;

import java.awt.Color;
import java.awt.Point;

public class MyMain {

	public static void main(String[] args) {
		/*
		 * SingletonClass s1 = SingletonClass.getInstance(); SingletonClass s2 =
		 * SingletonClass.getInstance(); SingletonClass s3 =
		 * SingletonClass.getInstance();
		 * 
		 * System.out.println("S1: " + s1); System.out.println("S1: " + s2);
		 * System.out.println("S1: " + s3);
		 */
		
		/*
		 * MyThread t1 = new MyThread("T1"); MyThread t2 = new MyThread("T2", t1);
		 */
		
		 BankAccount ba = new BankAccount(1000);
		  
		 Thread merry = new Thread( new Banking(ba, "Merry")); Thread jack = new
		 Thread( new Banking(ba, "Jack"));
		 
		 System.out.println("Initial Balance $" + ba.getBalance());
		  
		 merry.start(); jack.start();
		 
		
		
		
//		//Declare an array of Ball
//		Ball balls[] = new Ball[3];
//		
//		//initialize
//		balls[0] = new Ball(40, new Point(50,50), Color.BLUE);
//		balls[1] = new Ball(50, new Point(150,250), Color.RED);
//		balls[2] = new Ball(30, new Point(350,50), Color.GREEN);
//		
//		//Create a frame passing the array of balls to it
//		Frame f = new Frame(balls);
//		//Create a thread and pass the instance of the Frame to it
//		Thread t = new Thread(f);
//		//Start the Thread
//		t.start();
		
	}

}
