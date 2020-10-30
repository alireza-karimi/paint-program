import java.util.ArrayList;
import java.util.Arrays;

/**
 * a rectangle representation
 * @author alireza karimi
 * @version 1.0.0
 */
public class Rectangle {
	private ArrayList<Double> sides;
	
	/**
	 * creating a new rectangle with four sides
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 */
	public Rectangle(double a, double b, double c, double d){
		sides =  new ArrayList<>();
		sides.add(a);
		sides.add(b);
		sides.add(c);
		sides.add(d);
	}
	
	/**
	 * getting sides of rectangle
	 * @return sides of rectangle
	 */
	public ArrayList<Double> getSides(){
		return sides;
	}
	
	/**
	 * checking whether a rectangle is square or not
	 * @return true if it is square
	 */
	public boolean isSquare(){
		if(sides.get(0) == sides.get(1) && sides.get(0) == sides.get(2) && sides.get(0) == sides.get(3)){
			return true;
		}
		return false;
	}
	
	/**
	 * calculating the shape perimeter
	 * @return the shape perimeter
	 */
	public double calculatePerimeter(){
		return sides.get(0) + sides.get(1) + sides.get(2) + sides.get(3);
	}
	
	/**
	 * calculating the shape area
	 * @return the shape area
	 */
	public double calculateArea(){
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
	 * drawing the object (type, perimeter and area)
	 */
	public void draw(){
		System.out.println("Rectangle - Area: " + calculateArea() + " - Perimeter: " + calculatePerimeter());
	}
	
	/**
	 * checking whether two objects are equal or not
	 */
	@Override
	public boolean equals(Object rectangle){
		if(rectangle == this){
			return true;
		}
		
		if(!(rectangle instanceof Rectangle)){
			return false;
		}
		
		Rectangle secondRectangle = (Rectangle) rectangle;
		
		//having the sides sorted in arrays
		double[] rectangle1 = {sides.get(0), sides.get(1), sides.get(2), sides.get(3)};
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
	 * return type and sides as an string 
	 */
	@Override
	public String toString(){
		String string = "Rectangle";
		
		for(double side : sides){
			string = string.concat(" - " + side);
		}
		
		return string;
	}
	
	
}
