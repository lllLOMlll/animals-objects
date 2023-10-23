package lecture2;

public class Rectangle {
	//Properties
	private float width = 0.0f;
	private float height = 0.0f;
	
	public static String unit = "CM";
	
	//Empty Constructor
	public Rectangle() {}
	
	//Overload Constructor
	public Rectangle(float width, float height) {
		this.height = height;
		this.width = width;
	}
	
	public String description() {
		String desc = "";
		desc += "Class: " + this.getClass().getSimpleName() + "\n";
		desc += "Width: " + this.width + unit + "\n";
		desc += "Height: " + this.height + unit + "\n";
		
		return desc;
	}
	
	public double premeter() {
		return this.height *  2 + this.width * 2;
	}
	
	public double area() {
		return this.height * this.width;
	}

	/*
	 * Getters & Setters
	 */
	
	/**
	 * @return the width
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(float width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(float height) {
		this.height = height;
	}

	/**
	 * @return the unit
	 */
	public static String getUnit() {
		return unit;
	}

	/**
	 * @param unit the unit to set
	 */
	public static void setUnit(String unit) {
		Rectangle.unit = unit;
	}
	
	
	
}
