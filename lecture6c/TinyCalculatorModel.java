package lecture6c;


/**
 * @author CPTN
 * Core Business Logic of your Application
 *The model should be able to run by itself
 */
public class TinyCalculatorModel {
	private float total;
	
	//Constructor
	public TinyCalculatorModel() {
		total = 0;
	}
	
	//Function to do the math
	public void multiplication(float num1, float num2) {
		this.total = num1 * num2;
	}

	/*Getter & Setter*/
	
	/**
	 * @return the total
	 */
	public float getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(float total) {
		this.total = total;
	}
	
	
	
}
