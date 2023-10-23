package lecture3;

public class SportsCar extends Car{
	//Additional Attributes
	private boolean spoiler;
	
	//Constructor
	public SportsCar(String color, int price, int seats, int TrunkSize, boolean soiler ) {
		super(color, price, seats, TrunkSize);
		this.spoiler = spoiler;
	}

	/*
	 * Getter & setter
	 */
	
	/**
	 * @return the spoiler
	 */
	public boolean isSpoiler() {
		return spoiler;
	}

	/**
	 * @param spoiler the spoiler to set
	 */
	public void setSpoiler(boolean spoiler) {
		this.spoiler = spoiler;
	}
		
}
