package lecture2;

public class MyMain {

	public static void main(String[] args) {
		/*
		 * Person p1 = new Person(); Person p2 = new Person("Max"); Person p3 = new
		 * Person("Alex"); //Person with all parameters Person p4 = new Person("July",
		 * (byte)20, 5.8f, 110f, "American");
		 * 
		 * //System.out.println(p4.description());
		 * System.out.println("Number of people created: " + Person.count);
		 * 
		 * p4.setAge((byte)25); System.out.println(p4.description());
		 * System.out.println(p4.getName());
		 */
		
		Rectangle.unit = "in";
		Rectangle r1 = new Rectangle(10, 15);
		Rectangle r2 = new Rectangle();
		
		System.out.println(r1.description());
		System.out.println();
		
		r2.setHeight(50);
		r2.setWidth(25);
		
		System.out.println(r2.description());
		System.out.println("Peremeter r1: " + r1.premeter() + Rectangle.unit);
		System.out.println("Peremeter r2: " + r2.premeter() + Rectangle.unit);
		System.out.println();
		System.out.println("Area r1: " + r1.area() + Rectangle.unit);
		System.out.println("Area r2: " + r2.area() + Rectangle.unit);
		
	}

}
