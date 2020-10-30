/**
 * a circle representation
 * @author alireza karimi
 * @version 1.0.0
 */
public class Circle {
	private double radius;
	
	/**
	 * creating a new circle
	 * @param radius
	 */
	public Circle(double radius){
		this.radius = radius;
	}
	
	/**
	 * get circle radius
	 * @return circle radius
	 */
	public double getRadius(){
		return radius;
	}
	
	/**
	 * calculating the shape perimeter
	 * @return the shape perimeter
	 */
	public double calculatePerimeter(){
		return 2 * radius * Math.PI;
	}
	
	/**
	 * calculating the shape area
	 * @return the shape area
	 */
	public double calculateArea(){
		return radius * radius * Math.PI;
	}
	
	/**
	 * drawing the object (type, perimeter and area)
	 */
	public void draw(){
		System.out.println("Circle - Area: " + calculateArea() + " - Perimeter: " + calculatePerimeter());
	}
	
	/**
	 * checking whether two objects are equal or not
	 */
	@Override
	public boolean equals(Object circle){
		if(circle == this){
			return true;
		}
		
		if(!(circle instanceof Circle)){
			return false;
		}
		
		Circle secondCircle = (Circle) circle;
		
		if(radius == secondCircle.getRadius()){
			return true;
		}
		return false;
		
	}
	
	/**
	 * return type and radius as an string 
	 */
	@Override
	public String toString(){
		String string = "Circle - " + radius;

		return string;
	}
	
}
