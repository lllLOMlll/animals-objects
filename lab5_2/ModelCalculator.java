package lab5_2;

public class ModelCalculator {
	private float total;
	
	//Constructor
	public ModelCalculator() {
		total = 0;
	}
		
	//Function to do the math
	public void multiplication(float num1, float num2) {
		this.total = num1 * num2;
	}

}
