package lecture6a;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//Not MVC pattern
public class TinyCalculator extends JFrame{
	// two text fields
	JTextField num1Tf = new JTextField();
	JTextField num2Tf = new JTextField();
	JLabel resultLbl;
	
	//Constructor
	public TinyCalculator() {
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
		
		//Buttons
		JButton equal = new JButton(" = ");
		JButton clear = new JButton(" C ");
		
		//Action
		equal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					float num1 = Float.parseFloat(num1Tf.getText());
					float num2 = Float.parseFloat(num2Tf.getText());
					float result = num1*num2;
					resultLbl.setText(result+"");
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Invalid Entry", "Entry", JOptionPane.ERROR_MESSAGE);
				}
				
			}
			
		});
		
		clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				num1Tf.setText("");
				num2Tf.setText("");
				resultLbl.setText("0.0");
			}
			
		});
		
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
	

	public static void main(String[] args) {
		new TinyCalculator();
		
	}

}
