package Lecture5;

import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame implements Runnable{

	private Ball balls[];
	Random r = new Random();
	
	public Frame(Ball balls[]) {
		this.balls = balls;
		this.setTitle("Running bals");
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		
		this.getContentPane().add(new Panell());
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class Panell extends JPanel {
		public void paintComponent(Graphics g) {
			for(int i = 0; i < balls.length; i++) {
				g.setColor(balls[i].getColor());
				g.fillOval(balls[i].getPosition().x,balls[i].getPosition().y, balls[i].getRadius(),balls[i].getRadius());
			}
		}
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				for(int i = 0; i < balls.length; i++) {
					int x = r.nextInt(10), y = r.nextInt(10);
					Point p = new Point(balls[i].getPosition().x+x, balls[i].getPosition().y+y);
					balls[i].setPosition(p);
				}
				Thread.sleep(10);
			}catch(Exception e) {}
			
			this.repaint();
			this.revalidate();
		}
		
	}

}
