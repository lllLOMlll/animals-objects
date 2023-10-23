package lecture6c;

public class MyMain {

	public static void main(String[] args) {
		TinyCalculatorView view = new TinyCalculatorView();
		TinyCalculatorModel model = new TinyCalculatorModel();
		TinyCalculatorController controller = new TinyCalculatorController(model, view);
		
		/*
		 * model.multiplication(5, 2); System.out.println("Total: " + model.getTotal());
		 */
	}

}
