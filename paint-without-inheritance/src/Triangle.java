import java.util.ArrayList;
import java.util.Arrays;

/**
 * a triangle representation
 * @author alireza karimi
 * @version 1.0.0
 */
public class Triangle {
	private ArrayList<Double> sides;
	
	/**
	 * creating a new triangle with three sides
	 * @param a
	 * @param b
	 * @param c
	 */
	public Triangle(double a, double b, double c){
		sides =  new ArrayList<>();
		sides.add(a);
		sides.add(b);
		sides.add(c);
	}
	
	/**
	 * getting sides of triangle
	 * @return sides of triangle
	 */
	public ArrayList<Double> getSides(){
		return sides;
	}
	
	/**
	 * checking whether a triangle is equilateral or not
	 * @return true if it is equilateral
	 */
	public boolean isEquilateral(){
		if(sides.get(0) == sides.get(1) && sides.get(0) == sides.get(2)){
			return true;
		}
		return false;
	}
	
	/**
	 * calculating the shape perimeter
	 * @return the shape perimeter
	 */
	public double calculatePerimeter(){
		return sides.get(0) + sides.get(1) + sides.get(2);
	}
	
	/**
	 * calculating the shape area
	 * @return the shape area
	 */
	public double calculateArea(){
		//implementing heron formula
		double p = calculatePerimeter() / 2;
		double squaredArea = p * (p - sides.get(0)) * (p - sides.get(1)) * (p - sides.get(2));
		return Math.sqrt(squaredArea);
	}
	
	/**
	 * drawing the object (type, perimeter and area)
	 */
	public void draw(){
		System.out.println("Triangle - Area: " + calculateArea() + " - Perimeter: " + calculatePerimeter());
	}
	
	/**
	 * checking whether two objects are equal or not
	 */
	@Override
	public boolean equals(Object triangle){
		if(triangle == this){
			return true;
		}
		
		if(!(triangle instanceof Triangle)){
			return false;
		}
		
		Triangle secondTriangle = (Triangle) triangle;
		
		//having the sides sorted in arrays
		double[] triangle1 = {sides.get(0), sides.get(1), sides.get(2)};
		Arrays.sort(triangle1);
		double[] triangle2 = {secondTriangle.getSides().get(0), secondTriangle.getSides().get(1), secondTriangle.getSides().get(2)};
		Arrays.sort(triangle2);
		
		//checking the equality
		if(triangle1[0] == triangle2[0] && triangle1[1] == triangle2[1] && triangle1[2] == triangle2[2]){
			return true;
		}
		return false;
	}
	
	/**
	 * return type and sides as an string 
	 */
	@Override
	public String toString(){
		String string = "Triangle";
		
		for(double side : sides){
			string = string.concat(" - " + side);
		}
		
		return string;
	}
	
}
