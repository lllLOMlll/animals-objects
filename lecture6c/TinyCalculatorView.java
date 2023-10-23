package lecture6c;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author CPTN
 * The View is used to display stuff for/from the user
 *** NO ACTION LISTENERS IN THE VIEW
 */
public class TinyCalculatorView extends JFrame{
	// two text fields
	private JTextField num1Tf = new JTextField();
	private JTextField num2Tf = new JTextField();
	private JLabel resultLbl;
	
	//Buttons
	JButton equal = new JButton(" = ");
	JButton clear = new JButton(" C ");
	
	//Constructor
	public TinyCalculatorView() {
		this.setTitle("Tiny Calculator");
		this.setSize(350,130);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//Panel to hold the TextFields and Buttons
		JPanel midPan = new JPanel(new GridLayout(1,5,5,5));
		midPan.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		
		//Times Label
		Font f = new Font("Consolas", Font.BOLD, 22);
		JLabel times = new JLabel(" X ");
		times.setLayout(new FlowLayout());
		times.setHorizontalAlignment(JLabel.CENTER);
		times.setFont(f);
		
		//Result label
		resultLbl = new JLabel("0.0");
		resultLbl.setLayout(new FlowLayout());
		resultLbl.setHorizontalAlignment(JLabel.CENTER);
		resultLbl.setFont(f);
		
		//Add components in the Panel
		midPan.add(num1Tf);
		midPan.add(times);
		midPan.add(num2Tf);
		midPan.add(equal);
		midPan.add(clear);
		
		//Add Panel in the Frame (center)
		this.getContentPane().add(midPan, BorderLayout.CENTER);
		this.getContentPane().add(resultLbl, BorderLayout.SOUTH);
		this.setVisible(true);		
	}
	
	//Display error
	public void displayError(String title, String msg) {
		JOptionPane.showMessageDialog(null, msg, title, JOptionPane.ERROR_MESSAGE);
	}
	
	/*Getters & setters*/

	/**
	 * @return the num1Tf
	 */
	public JTextField getNum1Tf() {
		return num1Tf;
	}

	/**
	 * @param num1Tf the num1Tf to set
	 */
	public void setNum1Tf(JTextField num1Tf) {
		this.num1Tf = num1Tf;
	}

	/**
	 * @return the num2Tf
	 */
	public JTextField getNum2Tf() {
		return num2Tf;
	}

	/**
	 * @param num2Tf the num2Tf to set
	 */
	public void setNum2Tf(JTextField num2Tf) {
		this.num2Tf = num2Tf;
	}

	/**
	 * @return the resultLbl
	 */
	public JLabel getResultLbl() {
		return resultLbl;
	}

	/**
	 * @param resultLbl the resultLbl to set
	 */
	public void setResultLbl(JLabel resultLbl) {
		this.resultLbl = resultLbl;
	}

	/**
	 * @return the equal
	 */
	public JButton getEqual() {
		return equal;
	}

	/**
	 * @param equal the equal to set
	 */
	public void setEqual(JButton equal) {
		this.equal = equal;
	}

	/**
	 * @return the clear
	 */
	public JButton getClear() {
		return clear;
	}

	/**
	 * @param clear the clear to set
	 */
	public void setClear(JButton clear) {
		this.clear = clear;
	}


}
