package Lecture4Exo;
/**
 * @author CPTN Nimo
 * @date 2023-02-28
 */

public abstract class Animal {
	protected String name;
	protected int age;
	protected String Color;
	protected double weight;
	public static int count = 0;
	
	/**Constructor
	 * @param name
	 * @param age
	 * @param color
	 * @param weight
	 */
	public Animal(String name, int age, String color, double weight) {
		super();
		this.name = name;
		this.age = age;
		Color = color;
		this.weight = weight;
	}
	
	/**
	 *toString - return Description of Animal
	 */
	public String toString() {
		String str = "\nClass: " + this.getClass().getSimpleName();
		str += "\nName: "  + this.name;
		str += "\nAge: " + this.age + " Years old";
		str += "\nColor: " + this.Color;
		str += "\nWeight: " + this.weight + "kg";
		return str;
	}
	
	/**Eating Method
	 * @param arg
	 */
	public void eat(String arg) {
		System.out.println(this.name + " is eating " + arg);
	}
	
	public void drink(String arg) {
		System.out.println(this.name + " is drinking " + arg);
	}
	
	/**
	 * Abstract methods
	 */
	abstract void sound();
	abstract void migrate();

	/*Getters & Setters*/
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return Color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		Color = color;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return the count
	 */
	public static int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public static void setCount(int count) {
		Animal.count = count;
	}
	
	
}
