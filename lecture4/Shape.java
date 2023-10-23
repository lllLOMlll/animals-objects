package lecture4;
/**
 * @author CPTN Nimo
 * @date 2023-02-28
 */
public class Shape {
	protected String color;

	/**Constructor
	 * @param color
	 */
	public Shape(String color) {
		super();
		this.color = color;
	}
	
	
	/**
	 *toString - Return Description
	 */
	public String toString() {
		return "\nClass: " + this.getClass().getSimpleName() + "\nColor: " + this.color;
	}

	/*Getter & Setter*/

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
	
	
	
	
	
}
