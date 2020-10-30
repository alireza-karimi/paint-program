/**
 * representing a circle
 * @author alireza karimi
 * @version 1.0.0
 */
public class Circle extends Shape{
	//radius of circle
	private double radius;
	
	/**
	 * creating a new circle
	 * @param radius circle radius
	 */
	public Circle(double radius){
		super();
		this.radius = radius;
	}
	
	
	/**
	 * getting circle radius
	 * @return
	 */
	public double getRadius(){
		return radius;
	}
	
	/**
	 * calculating circle perimeter
	 */
	@Override
	public double calculatePerimeter(){
		return 2 * radius * Math.PI;
	}
	
	/**
	 * calculating circle area
	 */
	@Override
	public double calculateArea(){
		return radius * radius * Math.PI;
	}
	
	/**
	 * drawing circle (type, area and perimeter)
	 */
	@Override
	public void draw(){
		System.out.println("Circle - Area: " + calculateArea() + " - Perimeter: " + calculatePerimeter());
	}
	
	/**
	 * checking whether a shape is equal to this circle or not
	 */
	@Override
	public boolean equals(Object shape){
		if(shape == this){
			return true;
		}
		
		if(!(shape instanceof Circle)){
			return false;
		}
		
		Circle secondCircle = (Circle) shape;
		
		if(radius == secondCircle.getRadius()){
			return true;
		}
		return false;
	}
	
	/**
	 * performing toString on the circle
	 */
	@Override
	public String toString(){
		return "Circle:: radius:" + radius;	
	}
}
