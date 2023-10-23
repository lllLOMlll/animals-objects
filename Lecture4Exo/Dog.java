package Lecture4Exo;
/**
 * @author CPTN Nimo
 * @date 2023-02-28
 */
public class Dog extends Canine implements BehaviorAct{

	/**Constructor
	 * @param name
	 * @param age
	 * @param color
	 * @param weight
	 */
	public Dog(String name, int age, String color, double weight) {
		super(name, age, color, weight);
	}

	@Override
	void sound() {
		System.out.println("Woof Woof Woof!!!");
		
	}

	@Override
	public void fetch() {
		System.out.println("I like to fetch sticks");
		
	}

	@Override
	public void chaiseTail() {
		System.out.println("I like to chaise my tail");
		
	}

	@Override
	public void dig() {
		System.out.println("I like digging stuff!");
		
	}

	@Override
	public void lick() {
		System.out.println("I like licking stuff!");
		
	}

}
