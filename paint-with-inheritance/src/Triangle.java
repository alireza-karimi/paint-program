import java.util.ArrayList;
import java.util.Arrays;

/**
 * Triangle class represents a  triangle shape
 * @author alireza karimi
 * @version 1.0.0
 */
public class Triangle extends Polygon{
	
	/**
	 * creating a new triangle with specified side size
	 * @param a
	 * @param b
	 * @param c
	 */
	public Triangle(double a, double b, double c){
		super();
		ArrayList<Double> sides = super.getSides();
		sides.add(a);
		sides.add(b);
		sides.add(c);
	}
	
	/**
	 * checking whether a triangle is equilateral
	 * @return true if equilateral
	 */
	public boolean isEquilateral(){
		ArrayList<Double> sides = super.getSides();
		
		if(sides.get(0) == sides.get(1) && sides.get(0) == sides.get(2)){
			return true;
		}
		return false;
	}
	
	/**
	 * calculating triangle area
	 */
	@Override
	public double calculateArea(){
		
		ArrayList<Double> sides = super.getSides();
		
		//implementing heron formula
		double p = calculatePerimeter() / 2;
		double squaredArea = p * (p - sides.get(0)) * (p - sides.get(1)) * (p - sides.get(2));
		return Math.sqrt(squaredArea);
	}
	
	/**
	 * drawing triangle (type and side size)
	 */
	@Override
	public void draw(){
		System.out.println("Triangle - Area: " + calculateArea() + " - Perimeter: " + calculatePerimeter());
	}
	
	/**
	 * checking whether a shape is equal to this triangle or not
	 */
	@Override
	public boolean equals(Object shape){
		if(shape == this){
			return true;
		}
		
		if(!(shape instanceof Triangle)){
			return false;
		}
		
		Triangle secondTriangle = (Triangle) shape;
		
		//having the sides sorted in arrays
		double[] triangle1 = {super.getSides().get(0), super.getSides().get(1), super.getSides().get(2)};
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
	 * performing toString on the triangle
	 */
	@Override
	public String toString(){
		String string = "Triangle:: ";
		return string.concat(super.toString());
	}
}
