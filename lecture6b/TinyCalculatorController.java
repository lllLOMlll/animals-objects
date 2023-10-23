package lecture6b;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * @author CPTN
 * The Job of the COntoller is to get the user action from the View & send it to the Model
 * Get results/Data from the Model & sends it to the View
 *
 */
public class TinyCalculatorController implements ActionListener{
	private TinyCalculatorModel model;
	private TinyCalculatorView view;
	
	public TinyCalculatorController(TinyCalculatorModel model, TinyCalculatorView view) {
		this.model = model;
		this.view = view;
	
		//Asssign action to Buttons
		view.getEqual().addActionListener(this);
		view.getClear().addActionListener(this);
	}
	
	
	/*
	 * Add actionListener to the Button 
	 * 1. Button clicked from the view
	 * 2. Controller will get the value from the 22 fields in the view
	 * 3. Controller will send the values to the model
	 * 4. Controller will take the results from the Model
	 * 5. Controller will set the results in the view
	 * 6. if there are any errors, the controller will send the errors to the view
	 * */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if((JButton)e.getSource() == view.getEqual()) {
			try {
				float num1 = Float.parseFloat(view.getNum1Tf().getText());
				float num2 = Float.parseFloat(view.getNum2Tf().getText());
				
				model.multiplication(num1, num2);
				float result = model.getTotal();
				
				view.getResultLbl().setText(result+"");
			}catch (Exception ex) {
				view.displayError("Error", "Invalid Input");
			}
		}else if((JButton)e.getSource() == view.getClear()) {
			view.getNum1Tf().setText("");
			view.getNum2Tf().setText("");
			view.getResultLbl().setText("0.0");
			model.setTotal(0);
		}
		
	}
	

}
