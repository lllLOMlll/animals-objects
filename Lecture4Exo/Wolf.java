package Lecture4Exo;
/**
 * @author CPTN Nimo
 * @date 2023-02-28
 */
public class Wolf extends Canine implements BehaviorAct{

	/**Constructor
	 * @param name
	 * @param age
	 * @param color
	 * @param weight
	 */
	public Wolf(String name, int age, String color, double weight) {
		super(name, age, color, weight);
		
	}

	@Override
	public void fetch() {
		System.out.println("I like to fetch big sticks");
		
	}

	@Override
	public void chaiseTail() {
		System.out.println("I sometimes chase my tail!");
		
	}

	@Override
	public void dig() {
		System.out.println("I like digging big stuff!");
		
	}

	@Override
	public void lick() {
		System.out.println("I like liking big stuff!");
		
	}

	@Override
	void sound() {
		System.out.println("I Hooooooowl!!!");
		
	}

}
