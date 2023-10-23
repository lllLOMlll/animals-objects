package Lecture4Exo;
/**
 * @author CPTN Nimo
 * @date 2023-02-28
 */
public abstract class Feline extends Animal {

	/**Constructor
	 * @param name
	 * @param age
	 * @param color
	 * @param weight
	 */
	public Feline(String name, int age, String color, double weight) {
		super(name, age, color, weight);
	}
	
	@Override
	void migrate() {
		System.out.println("We are lazy and hate migrating!");
	}

}
