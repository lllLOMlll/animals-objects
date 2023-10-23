package lab5_2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewCalculator extends JFrame {
	// Variables
	private static JLabel display = new JLabel();
	private JPanel dPan = new JPanel();

	private JButton b1 = new JButton("1");
	private JButton b2 = new JButton("2");
	private JButton b3 = new JButton("3");
	private JButton b4 = new JButton("4");
	private JButton b5 = new JButton("5");
	private JButton b6 = new JButton("6");
	private JButton b7 = new JButton("7");
	private JButton b8 = new JButton("8");
	private JButton b9 = new JButton("9");
	private JButton b0 = new JButton("0");
	private JButton bplus = new JButton("+");
	private JButton bminus = new JButton("-");
	private JButton btimes = new JButton("X");
	private JButton bdivide = new JButton("/");
	private JButton bmod = new JButton("M");
	private JButton bclear = new JButton("C");
	private JButton bequals = new JButton("=");
	private JButton bdecimal = new JButton(".");
	
	private int displaie = 0;
	private static float num1 = 0;
	private static boolean equals = false;
	private static String lastOp = "";

	// Constructor
	public ViewCalculator() {
		this.setTitle("Calculator");
		this.setSize(295, 310);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setResizable(false);
		this.setBackground(Color.ORANGE);

		bclear.setForeground(Color.RED);
		bequals.setPreferredSize(new Dimension(50, 110));
		b0.setPreferredSize(new Dimension(110, 50));

		display.setBounds(5, 5, 270, 40);

		display.setFont(new Font("OCR A Std", 1, 20));
		display.setForeground(Color.GREEN);
		display.setBackground(Color.BLACK);
		display.setText("0");
		display.setOpaque(true);
		this.add(display);
		display.setHorizontalAlignment(JLabel.RIGHT);

		// Set buttons using absolute positionning
		b0.setBounds(5, 215, 105, 50);
		b1.setBounds(5, 160, 50, 50);
		b2.setBounds(60, 160, 50, 50);
		b3.setBounds(115, 160, 50, 50);
		btimes.setBounds(170, 160, 50, 50);
		bequals.setBounds(225, 160, 50, 105);
		bdecimal.setBounds(115, 215, 50, 50);
		bdivide.setBounds(170, 215, 50, 50);
		b4.setBounds(5, 105, 50, 50);
		b5.setBounds(60, 105, 50, 50);
		b6.setBounds(115, 105, 50, 50);
		bminus.setBounds(170, 105, 50, 50);
		bmod.setBounds(225, 105, 50, 50);
		b7.setBounds(5, 50, 50, 50);
		b8.setBounds(60, 50, 50, 50);
		b9.setBounds(115, 50, 50, 50);
		bplus.setBounds(170, 50, 50, 50);
		bclear.setBounds(225, 50, 50, 50);
		
		this.add(b0);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(btimes);
		this.add(bequals);
		this.add(bdecimal);
		this.add(bdivide);
		this.add(b4);
		this.add(b5);
		this.add(b6);
		this.add(bminus);
		this.add(bmod);
		this.add(b7);
		this.add(b8);
		this.add(b9);
		this.add(bplus);
		this.add(bclear);
		this.add(display);
		this.setVisible(true);
		
		
	}

	/**
	 * @return the display
	 */
	public static JLabel getDisplay() {
		return display;
	}

	/**
	 * @param display the display to set
	 */
	public static void setDisplay(JLabel display) {
		ViewCalculator.display = display;
	}

	/**
	 * @return the dPan
	 */
	public JPanel getdPan() {
		return dPan;
	}

	/**
	 * @param dPan the dPan to set
	 */
	public void setdPan(JPanel dPan) {
		this.dPan = dPan;
	}

	/**
	 * @return the b1
	 */
	public JButton getB1() {
		return b1;
	}

	/**
	 * @param b1 the b1 to set
	 */
	public void setB1(JButton b1) {
		this.b1 = b1;
	}

	/**
	 * @return the b2
	 */
	public JButton getB2() {
		return b2;
	}

	/**
	 * @param b2 the b2 to set
	 */
	public void setB2(JButton b2) {
		this.b2 = b2;
	}

	/**
	 * @return the b3
	 */
	public JButton getB3() {
		return b3;
	}

	/**
	 * @param b3 the b3 to set
	 */
	public void setB3(JButton b3) {
		this.b3 = b3;
	}

	/**
	 * @return the b4
	 */
	public JButton getB4() {
		return b4;
	}

	/**
	 * @param b4 the b4 to set
	 */
	public void setB4(JButton b4) {
		this.b4 = b4;
	}

	/**
	 * @return the b5
	 */
	public JButton getB5() {
		return b5;
	}

	/**
	 * @param b5 the b5 to set
	 */
	public void setB5(JButton b5) {
		this.b5 = b5;
	}

	/**
	 * @return the b6
	 */
	public JButton getB6() {
		return b6;
	}

	/**
	 * @param b6 the b6 to set
	 */
	public void setB6(JButton b6) {
		this.b6 = b6;
	}

	/**
	 * @return the b7
	 */
	public JButton getB7() {
		return b7;
	}

	/**
	 * @param b7 the b7 to set
	 */
	public void setB7(JButton b7) {
		this.b7 = b7;
	}

	/**
	 * @return the b8
	 */
	public JButton getB8() {
		return b8;
	}

	/**
	 * @param b8 the b8 to set
	 */
	public void setB8(JButton b8) {
		this.b8 = b8;
	}

	/**
	 * @return the b9
	 */
	public JButton getB9() {
		return b9;
	}

	/**
	 * @param b9 the b9 to set
	 */
	public void setB9(JButton b9) {
		this.b9 = b9;
	}

	/**
	 * @return the b0
	 */
	public JButton getB0() {
		return b0;
	}

	/**
	 * @param b0 the b0 to set
	 */
	public void setB0(JButton b0) {
		this.b0 = b0;
	}

	/**
	 * @return the bplus
	 */
	public JButton getBplus() {
		return bplus;
	}

	/**
	 * @param bplus the bplus to set
	 */
	public void setBplus(JButton bplus) {
		this.bplus = bplus;
	}

	/**
	 * @return the bminus
	 */
	public JButton getBminus() {
		return bminus;
	}

	/**
	 * @param bminus the bminus to set
	 */
	public void setBminus(JButton bminus) {
		this.bminus = bminus;
	}

	/**
	 * @return the btimes
	 */
	public JButton getBtimes() {
		return btimes;
	}

	/**
	 * @param btimes the btimes to set
	 */
	public void setBtimes(JButton btimes) {
		this.btimes = btimes;
	}

	/**
	 * @return the bdivide
	 */
	public JButton getBdivide() {
		return bdivide;
	}

	/**
	 * @param bdivide the bdivide to set
	 */
	public void setBdivide(JButton bdivide) {
		this.bdivide = bdivide;
	}

	/**
	 * @return the bmod
	 */
	public JButton getBmod() {
		return bmod;
	}

	/**
	 * @param bmod the bmod to set
	 */
	public void setBmod(JButton bmod) {
		this.bmod = bmod;
	}

	/**
	 * @return the bclear
	 */
	public JButton getBclear() {
		return bclear;
	}

	/**
	 * @param bclear the bclear to set
	 */
	public void setBclear(JButton bclear) {
		this.bclear = bclear;
	}

	/**
	 * @return the bequals
	 */
	public JButton getBequals() {
		return bequals;
	}

	/**
	 * @param bequals the bequals to set
	 */
	public void setBequals(JButton bequals) {
		this.bequals = bequals;
	}

	/**
	 * @return the bdecimal
	 */
	public JButton getBdecimal() {
		return bdecimal;
	}

	/**
	 * @param bdecimal the bdecimal to set
	 */
	public void setBdecimal(JButton bdecimal) {
		this.bdecimal = bdecimal;
	}
}
