import java.util.ArrayList;
import java.util.Arrays;

/**
 * Rectangle class represents a rectangle shape
 * @author alireza karimi
 * @version 1.0.0
 */
public class Rectangle extends Polygon{
	
	/**
	 * creating a new rectangle with specified side size
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 */
	public Rectangle(double a, double b, double c, double d){
		super();
		ArrayList<Double> sides = super.getSides();
		sides.add(a);
		sides.add(b);
		sides.add(c);
		sides.add(d);
	}
	
	/**
	 * checking whether the rectangle is also a square too or not
	 * @return true if is square
	 */
	public boolean isSquare(){
		ArrayList<Double> sides = super.getSides();
		if(sides.get(0) == sides.get(1) && sides.get(0) == sides.get(2) && sides.get(0) == sides.get(3)){
			return true;
		}
		return false;
	}
	
	/**
	 * calculating area of rectangle
	 */
	@Override
	public double calculateArea(){
		
		ArrayList<Double> sides = super.getSides();
		
		double firstSide = sides.get(0);
		double secondSide;
		if(firstSide != sides.get(1)){
			secondSide = sides.get(1);
		}
		else if(firstSide != sides.get(2)){
			secondSide = sides.get(2);
		}
		else{
			secondSide = sides.get(3);
		}
		
		return firstSide * secondSide;
	}
	
	/**
	 * drawing rectangle (type, area and perimeter)
	 */
	@Override
	public void draw(){
		System.out.println("Rectangle - Area: " + calculateArea() + " - Perimeter: " + calculatePerimeter());
	}
	
	/**
	 * checking whether a shape is equal to this rectangle or not
	 */
	@Override
	public boolean equals(Object shape){
		
		if(shape == this){
			return true;
		}
		
		if(!(shape instanceof Rectangle)){
			return false;
		}
		
		Rectangle secondRectangle = (Rectangle) shape;
		
		//having the sides sorted in arrays
		double[] rectangle1 = {super.getSides().get(0), super.getSides().get(1), super.getSides().get(2), super.getSides().get(3)};
		Arrays.sort(rectangle1);
		double[] rectangle2 = {secondRectangle.getSides().get(0), secondRectangle.getSides().get(1), secondRectangle.getSides().get(2), secondRectangle.getSides().get(3)};
		Arrays.sort(rectangle2);
		
		//checking the equality
		if(rectangle1[0] == rectangle2[0] && rectangle1[1] == rectangle2[1] && rectangle1[2] == rectangle2[2] && rectangle1[3] == rectangle2[3]){
			return true;
		}
		return false;
	}
	
	/**
	 * performing toString on the rectangle
	 */
	@Override
	public String toString(){
		String string = "Rectangle:: ";
		return string.concat(super.toString());
	}
}
