package lecture3;

public class Truck extends Vehicle{
	private int bedSize;
	
	public Truck(String color, int price, int seats, int bedSize) {
		super(color, price, seats);
		this.bedSize = bedSize;
	}

	/**
	 * @return the bedSize
	 */
	public int getBedSize() {
		return bedSize;
	}

	/**
	 * @param bedSize the bedSize to set
	 */
	public void setBedSize(int bedSize) {
		this.bedSize = bedSize;
	}
	
	
	
}
