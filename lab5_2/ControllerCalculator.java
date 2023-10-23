package lab5_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ControllerCalculator implements ActionListener {
	private ModelCalculator model;
	private ViewCalculator view;

	public ControllerCalculator(ModelCalculator model, ViewCalculator view) {
		this.model = model;
		this.view = view;

		// Asssign action to Buttons
		view.getB1().addActionListener(this);
		view.getB2().addActionListener(this);
		view.getB3().addActionListener(this);
		view.getB4().addActionListener(this);
		view.getB5().addActionListener(this);
		view.getB6().addActionListener(this);
		view.getB7().addActionListener(this);
		view.getB8().addActionListener(this);
		view.getB9().addActionListener(this);
		view.getB0().addActionListener(this);
		
	
		view.getBplus().addActionListener(this);
		view.getBminus().addActionListener(this);
		view.getBtimes().addActionListener(this);
		view.getBdivide().addActionListener(this);
		view.getBclear().addActionListener(this);
		view.getBmod().addActionListener(this);
		view.getBequals().addActionListener(this);
		view.getBdecimal().addActionListener(this);



	}

	@Override
	public void actionPerformed(ActionEvent e) {

		}
	
	
		}
		
	
		

	

