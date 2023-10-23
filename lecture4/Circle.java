package lecture4;
/**
 * @author CPTN Nimo
 * @date 2023-02-28
 */
public class Circle extends Shape implements Functions{
	private int radius = 0;
	
	/**Constructor
	 * @param color
	 */
	public Circle(String color) {
		super(color);
	}

	/**Constructor overload
	 * @param color
	 * @param radius
	 */
	public Circle(String color, int radius) {
		super(color);
		this.radius = radius;
	}
	
	/**
	 *toString - Returns a Description 
	 */
	public String toString() {
		String str = super.toString();
		str += "\nRadius: " + this.radius;
		str += "\nPeremeter: " + this.premeter();
		str += "\nArea: " + this.area();
		 
		return str; 
	}
	
	@Override
	public float premeter() {
		return (float)Math.PI*this.radius*2;
	}

	@Override
	public float area() {
		return (float)(Math.PI*Math.pow(this.radius,2));
	}

}
