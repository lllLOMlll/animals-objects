package lecture3;

public class Vehicle {
	//Attributes
	private String color;
	private int price;
	private int seat;
	
	//Constructor
	public Vehicle(String color, int price, int seats) {
		this.color = color;
		this.price = price;
		this.seat = seats;
	}

	/*
	 * Getters & setters
	 */
	
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the seat
	 */
	public int getSeat() {
		return seat;
	}

	/**
	 * @param seat the seat to set
	 */
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	//Display
	public String toString() {
		String desc = "";
		desc += "Color: " + this.color + "\n";
		desc += "Price: $" + this.price + "\n";
		desc += "Seats: " + this.seat + "\n";
		
		return desc;
	}
	
	
}
