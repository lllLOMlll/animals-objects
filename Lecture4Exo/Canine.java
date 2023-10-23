package Lecture4Exo;
/**
 * @author CPTN Nimo
 * @date 2023-02-28
 */
public abstract class Canine extends Animal  {

	public Canine(String name, int age, String color, double weight) {
		super(name, age, color, weight);
	}
	
	@Override
	void migrate() {
		System.out.println("We migrate in packs!");
	}

}
