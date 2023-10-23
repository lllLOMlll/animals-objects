package Lecture4Exo;
/**
 * @author CPTN Nimo
 * @date 2023-02-28
 */
public class Lion extends Feline{

	/**Constructor
	 * @param name
	 * @param age
	 * @param color
	 * @param weight
	 */
	public Lion(String name, int age, String color, double weight) {
		super(name, age, color, weight);
	}

	@Override
	void sound() {
		System.out.println("I Grooooooooowl!!!");		
	}

}
