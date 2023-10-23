package lecture3;

public class MyMain {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Blue", 24000, 4);

		//System.out.println(v1.toString());
		Car c1 = new Car("Red", 35000, 5, 22);
		
		//System.out.println(c1.toString());
		
		SportsCar sc1 = new SportsCar("Black", 50000, 2, 5, true);
		
		//System.out.println(sc1.toString());
		
		Truck t1 = new Truck("White", 25000, 4, 100);
		
		System.out.println(t1.toString());
		System.out.println("BedSize: " + t1.getBedSize());
	}

}
