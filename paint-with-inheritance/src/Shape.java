/**
 * shape class represents a single shape
 * @author alireza karimi
 * @version 1.0.0
 */
public class Shape {
	
	/**
	 * creating a new shape with double arguments
	 * @param args radius of circle or size of polygon sides
	 */
	public Shape(double... args){
		//nothing yet
	}
	
	/**
	 * calculating shape perimeter
	 * @return -1 if the shape is not specified with subclasses
	 */
	public double calculatePerimeter(){
		return -1;
	}

	/**
	 * calculating shape area
	 * @return -1 if the shape is not specified with subclasses
	 */
	public double calculateArea(){
		return -1;
	}
	
	/**
	 * drawing the shape (its type, perimeter and area)
	 */
	public void draw(){
		
	}
	
	/**
	 * checking whether two objects are the same or not
	 * @return returns false as a default (if declared correctly, returns true if equal and false if not equal)
	 */
	@Override
	public boolean equals(Object shape){
		return false;
	}

	/**
	 * string containing shape type, its radius or sides size
	 * @return null as a default
	 */
	@Override
	public String toString(){
		return null;
	}
}
