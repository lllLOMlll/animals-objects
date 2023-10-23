package lab5_2;

public class MyMainCalculator {

	public static void main(String[] args) {
		ViewCalculator view = new ViewCalculator();
		ModelCalculator model = new ModelCalculator();
		ControllerCalculator controller = new ControllerCalculator(model, view);

	}

}
