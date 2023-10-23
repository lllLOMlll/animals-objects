package Lecture4Exo;
/**
 * @author CPTN Nimo
 * @date 2023-02-28
 */
public class MyMain {

	public static void main(String[] args) {
		Dog dog = new Dog("Jack", 9, "Black", 112);
		System.out.println(dog);
		dog.eat("Bone");
		dog.drink("Water");
		dog.migrate();
		dog.sound();
		dog.fetch();
		dog.chaiseTail();
		dog.dig();
		dog.lick();
		
		System.out.println();
		
		Cat cat = new Cat("Katy", 5, "Gray", 7 );
		System.out.println(cat);
		cat.eat("Tuna");
		cat.drink("Milk");
		cat.migrate();
		cat.sound();
	}

}
