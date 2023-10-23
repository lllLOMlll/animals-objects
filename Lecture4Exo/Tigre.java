package Lecture4Exo;
/**
 * @author CPTN Nimo
 * @date 2023-02-28
 */
public class Tigre extends Feline{

	/**Costuctor
	 * @param name
	 * @param age
	 * @param color
	 * @param weight
	 */
	public Tigre(String name, int age, String color, double weight) {
		super(name, age, color, weight);
	}

	@Override
	void sound() {
		System.out.println("I Rooooooaaaaaaarrrr!!!");
		
	}

}
