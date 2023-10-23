package lecture3;

public class Car extends Vehicle{
	//Additional Attributes
	private int trunkSize;
	
	//Constructor
	public Car(String color, int price, int seats, int trunkSize) {
		super(color, price, seats);
		this.trunkSize = trunkSize;
	}

	/**
	 * @return the trunkSize
	 */
	public int getTrunkSize() {
		return trunkSize;
	}

	/**
	 * @param trunkSize the trunkSize to set
	 */
	public void setTrunkSize(int trunkSize) {
		this.trunkSize = trunkSize;
	}
	
	//Display (toString)
	public String toString() {
		return super.toString() + "TrunkSize: " + this.trunkSize + "Cf" + "\n";
	}
	
	
}
